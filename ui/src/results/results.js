import React, { useState } from 'react';
import { Container, Col, Nav, Row } from 'rsuite';

import AbilityResults from './ability';
import BuffResults from './buffs';
import DamageTypeResults from './damagetype';
import ResourceUsage from './resource';
import ResourceUsageByAbility from './resource_by_ability';

import { toFixed, toFixedPct } from './formatters';

export default function({ character, results }) {
  const [activeTab, setActiveTab] = useState(0)

  const { ability, buff, debuff, damageType, resourceUsage, resourceUsageByAbility, dps } = results

  if(!ability || !buff || !debuff || !damageType || !resourceUsage || !dps) {
    return null;
  }

  function renderDps() {
    const subjectDps = dps.get_35('subject')
    const subjectPetDps = dps.get_35('subjectPet')

    function petSuffix(type) {
      if(subjectPetDps) {
        const subjectValue = subjectDps[type]
        const petValue = subjectPetDps[type]
        const totalValue = subjectValue + petValue
        const petPct = petValue / totalValue * 100.0

        return <span> | PET: {toFixed()(petValue)}{type !== 'sd' ? <> ({toFixedPct()(petPct)}) | TOTAL: {toFixed()(totalValue)}</> : null }</span>
      }

      return null
    }

    return (
      <Row>
        <h4><b>AVERAGE DPS: {toFixed()(subjectDps.mean)}{petSuffix('mean')}</b></h4>
        <p>MEDIAN DPS: {toFixed()(subjectDps.median)}{petSuffix('median')}</p>
        <p>STDDEV DPS: {toFixed()(subjectDps.sd)}{petSuffix('sd')}</p>
      </Row>
    );
  }

  function renderTab() {
    // TODO: This will need to be smarter for full raid sims
    let characterTab = character;
    if(activeTab == 1) {
      characterTab = character.pet
    }

    return (
      <>
        <Row style={{ marginTop: '20px', marginBottom: '20px' }}>
          <Col>
            <AbilityResults data={ability[activeTab]} />
          </Col>
        </Row>
        <Row>
          <Col xs={12}>
            <BuffResults title={'Buff Breakdown'} data={buff[activeTab]} />
            <Container style={{ marginTop: '20px', marginBottom: '20px' }}>
              <BuffResults title={'Debuff Breakdown'} data={debuff[activeTab]} />
            </Container>
          </Col>
          <Col xs={12}>
            <DamageTypeResults data={damageType[activeTab]} />
            <Container style={{ marginTop: '20px', marginBottom: '20px' }}>
              <ResourceUsageByAbility data={resourceUsageByAbility[activeTab]} />
            </Container>
            <ResourceUsage character={characterTab} data={resourceUsage[activeTab]} />
          </Col>
        </Row>
      </>
    );
  }

  function onSelect(evt) {
    setActiveTab(evt)
  }

  const titles = ['You', 'Pet']

  return (
    <Container style={{ marginTop: '20px', marginBottom: '20px' }}>
      {renderDps()}
      <Nav appearance='subtle' activeKey={activeTab} onSelect={onSelect}>
        {ability.map((_, idx) => {
          return (
            <Nav.Item key={idx} eventKey={idx}>{titles[idx]}</Nav.Item>
          );
        })}
      </Nav>
      {renderTab()}
    </Container>
  )
}
