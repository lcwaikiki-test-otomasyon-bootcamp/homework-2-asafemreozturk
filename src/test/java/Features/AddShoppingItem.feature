Feature: Add shopping item
@cart
  Scenario: Add shopping item
    Given Navigate to the Amazon website
    And Search for product
    And Click search button
    And Select the first product from list
    When Add product to the cart
    Then Control that the product has been successfully added to cart
    And Return to cart
