Feature: Debit Card Module

  Background:
    Given user opens debit module

  Scenario: Apply for new debit card
    When user applies for a debit card
    Then debit module operation should succeed

  Scenario: Block debit card
    When user blocks debit card
    Then debit module operation should succeed

  Scenario: Unblock debit card
    When user unblocks debit card
    Then debit module operation should succeed

  Scenario: Change debit card PIN
    When user changes debit pin
    Then debit module operation should succeed

  Scenario: Check ATM withdrawal limit
    When user checks ATM withdrawal limit
    Then debit module operation should succeed

  Scenario: Perform POS transaction
    When user performs POS transaction
    Then debit module operation should succeed

  Scenario: Perform online transaction
    When user performs online transaction
    Then debit module operation should succeed

  Scenario: Upgrade debit card variant
    When user upgrades debit card
    Then debit module operation should succeed
