Feature: fill the form
 @fillForm
  Scenario: user fill the form
    Given user on main page
    Then user click Round Trip
    Then user select passengers "3"
    Then user select departing "Seattle"
    Then user select dates on "May" for "3"
    And  select arrivals "Portland"
    And  select Returning "December" for "8"
    Then user select class Business class
    And user select airline "Pangea Airlines"
    Then user click continue


