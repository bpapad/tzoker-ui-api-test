@test
Feature: API Automation

  Scenario: Active draw API call returns correct 'active' status
    When A simple GET api call to https://api.opap.gr/draws/v3.0/1100/active is made
    Then Response status code is 200
    And Active draw status is active