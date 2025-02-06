Feature: New Scenario Outline

  @Multithread
  Scenario Outline:
    Given user on google page
    When user search cars "<Brand>"
    Then user shouls see cat "<Company>" in the result
    Examples:
      | Brand  | Company             |
      | Honda  | Honda Motor Company |
      | Toyota | Toyota              |
      | Volvo  | Volvo Cars          |