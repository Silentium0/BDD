Feature: Liogin to Docuport
    Background:
      Given User on login page
  @task
  Scenario: Login as a client
    When user enter credentials
      | username | b1g3_advisor@gmail.com |
      | password | Group3                 |
    Then user on home page


