Feature: Validation Items

  Background:
    Given User on login page

  @Docuport
  Scenario: User validate items
    When user enter credentials
      | username | b1g3_advisor@gmail.com |
      | password | Group3                 |
    Then user on home page
    Then user validate items
      | Home          |
      | Received docs |
      | Received kkk  |
    When user click hamburger button items is not present
      | Home            |
      | Clients         |
      | Reconciliations |
    Then user click on "Batch1 Group3"
    Then  user click on "Log out"


  Scenario: User change Name profile
    When user enter credentials
      | username | b1g3_advisor@gmail.com |
      | password | Group3                 |
    Then user on home page
    When user click on "Batch1 Group3"
    Then user click on "Profile"
    Then user click on "Edit"
    Then user enter First Name "Batch1"
    Then user enter Last Name "Group3"
    Then user enter Phone "1234321"
    Then user click on " Save "
    Then user validate items
      | Batch1 Group3 |

  @MatTest
  Scenario: User change Name profile With map
    When user enter credentials
      | username | b1g3_advisor@gmail.com |
      | password | Group3                 |
    Then user on home page
    When user click on "Batch1 Group3"
    Then user click on "Profile"
    Then user click on "Edit"
    When user enter credentials with map
      | First Name | Batch11111     |
      | Last Name  | Group311111111 |
      | Phone      | 987655678      |
    Then user click on " Save "


  Scenario: User check leads
    When user enter credentials
      | username | b1g3_advisor@gmail.com |
      | password | Group3                 |
    Then user on home page
    Then user click on "Leads"
    And user  lick checkbox with Email test@mgila.omc
    Then user logOut


  Scenario: user send  account number
    When user enter credentials
      | username | b1g3_advisor@gmail.com |
      | password | Group3                 |
    Then user on home page
    When user click on "Bookkeeping"
    Then user some date to "4" to account number field
    Then validate if is created


























