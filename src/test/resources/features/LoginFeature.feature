Feature: Liogin to Docuport
    Background:
      Given User on login page
  @task
  Scenario: Login as a client
    When user enter username
    And  used enter password
    And  user click login button
    Then user on home page


