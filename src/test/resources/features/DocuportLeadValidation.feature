Feature: Validation

  @test3
  Scenario: check box user
    Given User on login page
    Then user enter credentials
      | username | b1g3_advisor@gmail.com |
      | password | Group3                 |
    Then user click on "Leads"
    When  user click checkbox