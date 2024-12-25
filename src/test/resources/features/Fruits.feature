Feature: Product  table


  @Fruit
  Scenario: verify each item
    Given user on homePage
    Then User extract date from product
      | Category  | Product                            | Price  |
      | In Season | Taste the Tropics Fruit Box        | 99.00  |
      | Build     | Create Your Own Tropical Fruit Box | 119.00 |
      | Hot       | Passion Fruit Box                  | 89.00  |
      | Pink      | Taste the Tropics Fruit Box        | 99.00  |
      | Ideas     | TropiBirthday Fruit Box            | 129.00 |