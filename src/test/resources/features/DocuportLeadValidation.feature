Feature: Validation

  Scenario: check box user
    Given User on login page
    Then user enter credentials
      | username | b1g3_advisor@gmail.com |
      | password | Group3                 |
    Then user click on "Leads"
    When  user click checkbox


  @test2312
  Scenario: check box user
    Given User on login page
    Then user enter credentials
      | username | b1g3_advisor@gmail.com |
      | password | Group3                 |
    Then user click on "My uploads"
    Then  user click on share button
    Then send email "sergeiy.morgan@gmail.com"
    Then user click on " Share "
