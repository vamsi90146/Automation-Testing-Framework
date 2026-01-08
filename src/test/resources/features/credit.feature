Feature: Credit Card Module

  Background:
    Given user opens credit module

  Scenario: Apply for new credit card
    When user applies for a credit card
    Then credit module operation should succeed

  Scenario: Upgrade credit card limit
    When user upgrades credit limit
    Then credit module operation should succeed

  Scenario: Download credit card statement
    When user downloads credit card statement
    Then credit module operation should succeed

  Scenario: Convert transaction to EMI
    When user converts transaction to EMI
    Then credit module operation should succeed

  Scenario: Update credit card address
    When user updates credit card address
    Then credit module operation should succeed

  Scenario: Raise dispute on credit card transaction
    When user raises credit card dispute
    Then credit module operation should succeed

  Scenario: Check credit card reward points
    When user checks credit rewards
    Then credit module operation should succeed

  Scenario: Close a credit card
    When user closes credit card
    Then credit module operation should succeed
