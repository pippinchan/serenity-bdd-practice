@AddToCart @UI @Smoke
Feature: Add to cart

  Background:
    Given James goes to automation practice home page

  @TEST-1
  Scenario: Add items by add to cart button
    When James adds 2 items into cart
    And James proceeds to checkout
    Then James should see the checkout page

# TODO: this will fail (no such element)
# because "SHOP NOW" will lead to a different site with no products or carts. Need to clarify the requirement
  @TEST-2
  Scenario: Add items by shop now button
    When James clicks shop now button
    And James adds an item into cart
