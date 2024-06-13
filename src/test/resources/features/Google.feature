Feature: Google search
  Scenario: senging data
    Given user on google page
    When user type honda Accord in the google search box
    Then user should see  honda accord in title


  @Honda
  Scenario: senging data
    Given user on google page
    When user type "honda civic" in the google search box
    Then user should see  "honda civic - Google Search" in title