@test
Feature: UI Automation

  Background:
    Given User navigates to tzoker webpage

  Scenario: User adds new coupon
    When User selects to Create slip
    Then User gets redirected to Play page
    When User clicks on Select numbers button
    And Users inputs the number 3 in section main
    And Users inputs the number 14 in section main
    And Users inputs the number 25 in section main
    And Users inputs the number 35 in section main
    And Users inputs the number 45 in section main
    And Users inputs the number 18 in section tzoker
    Then Total cost is equal to 0,50
    When User clicks on Add button
    Then Coupon with numbers 3,14,25,35,45,18 and cost 0,50 added in list