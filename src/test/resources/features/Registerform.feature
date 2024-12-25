Feature: Register Form
  @register
  Scenario: user register form
    Given  user on register form page
    When user feel the form
      | First name   | Bob           |
      | Last Name    | Mcgregor      |
      | Username     | BMCqweqwercwe |
      | Email        | bob@mai.com   |
      | Password     | Bob12345      |
      | Phone Number | 123-456-8789  |
    Then user click on Female redio button
    Then user  put date of birthd "12/23/1233"
    Then user select Accounting Office
    Then user select job title Developer
    Then user click checkzbox C+
    Then user click  "Sign up"
    Then user validate items"Thanks for signing up!"


