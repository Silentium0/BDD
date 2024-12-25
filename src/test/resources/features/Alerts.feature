Feature: jSAlerts

  Scenario: user handle alerts
    Given user on alerts page
    Then user click on "Click for JS Alert"
    Then  user Accept allert
    Then user validate alert