#language:en
#author: Italo Cabral
#encoding: utf-8

Feature: Finish a purchase

  Background: Login

    Given the user is on the login page
    When they enter valid credentials "standard_user" and "secret_sauce"
    And submit the form


  Scenario Outline: Finish a purchase

    Given the user added a product to the cart
    And the user open the cart page
    And they click on the checkout button
    And they fill the checkout form with "<firstName>", "<lastName>", "<zipCode>"
    When the user clicks on the continue button
    Then they should see the order confirmation message "Your order has been dispatched, and will arrive just as fast as the pony can get there!"

    Examples:
      | firstName | lastName | zipCode |
      | Italo     | Cabral   | 12345   |