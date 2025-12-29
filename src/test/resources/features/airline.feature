Feature: Airline Industry Module

  Background:
    Given user opens airline module

  Scenario: Search for flights
    When user searches flights
    Then airline module operation should succeed

  Scenario: Book a flight ticket
    When user books a ticket
    Then airline module operation should succeed

  Scenario: Cancel a booked ticket
    When user cancels a ticket
    Then airline module operation should succeed

  Scenario: Modify ticket travel date
    When user modifies ticket date
    Then airline module operation should succeed

  Scenario: Add baggage to booking
    When user adds baggage to booking
    Then airline module operation should succeed

  Scenario: Perform web check-in
    When user performs web check in
    Then airline module operation should succeed

  Scenario: Select a flight seat
    When user selects a seat
    Then airline module operation should succeed

  Scenario: Download boarding pass
    When user downloads boarding pass
    Then airline module operation should succeed
