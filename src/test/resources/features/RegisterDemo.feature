Feature: Register form
  @DemoForm
  Scenario: user fill the form
    Given user on register form page demo
    Then user enter  data
      | Firs Name      | Bob             |
      | Last Name      | McGregor        |
      | Phone          | 123456789       |
      | Email          | McGreenmail.com |
      | Address        | 343 Aurus st    |
      | City           | Taurus          |
      | State Province | GunJou          |
      | Postal Code    | 3233344         |
    Then user select country
    Then user fill form
      | User Name        | BobMC       |
      | Password         | bobcat12345 |
      | Confirm Password | bobcat12345 |
    Then user click on submit
    Then  verify if user is created "Dear Bob McGregor,"