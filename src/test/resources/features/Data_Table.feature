Feature: Search Items

  @MultipleSrarch
  Scenario: Multiple items
    Given user on google page
    Then user search multiple items
      | Honda accord |
      | Honda civic  |
      | lexus is     |


