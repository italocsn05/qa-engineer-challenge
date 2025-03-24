#language:en
#author: Italo Cabral
#encoding: utf-8

Feature: Login Functionality

  Scenario Outline: Successful login with valid credentials
    Given the user is on the login page
    When they enter valid credentials "<username>" and "<password>"
    And submit the form
    Then they should be logged in successfully

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |


  Scenario: Display error when username is missing
    Given the user is on the login page
    When they submit the form without filling in credentials
    Then they should see "Username is required"

  Scenario: Display error when password is missing
    Given the user is on the login page
    When they enter a username but leave the password blank
    And submit the form
    Then they should see "Password is required"

  Scenario: Display error for invalid credentials
    Given the user is on the login page
    When they enter an incorrect username or password
    And submit the form
    Then they should see "Username and password do not match any user in this service."

  Scenario: Display error for locked-out user
    Given the user is on the login page
    And they attempt to log in with a locked-out account
    When submit the form
    Then they should see "Sorry, this user has been locked out."