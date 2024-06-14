Feature: New Scenario Outline

  @cars
  Scenario Outline:
    Given user on google page
    When user search cars "<Brand>"
    Then user shouls see cat "<Company>" in the result
    Examples:
      | Brand  | Company             |
      | Honda  | Honda Motor Company |
      | Toyota | Toyota              |
      | Vovlo  | Volvo Cars          |