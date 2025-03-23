#language:en
#author: Italo Cabral
#encoding: utf-8

Feature: Login Functionality

  Scenario Outline: Successful login
    Given the user is on the login page
    When they enter valid credentials "<username>" and "<password>"
    And submit the form
    Then they should be logged in successfully

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |

  @only
  Scenario: Missing username and password
    Given the user is on the login page
    When they submit the form without filling in credentials
    Then they should see "Username is required"

  Scenario: Missing password
    Given the user is on the login page
    When they enter a username but leave the password blank
    And submit the form
    Then they should see "Password is required"

  Scenario: Invalid credentials
    Given the user is on the login page
    When they enter an incorrect username or password
    And submit the form
    Then they should see "Username and password do not match any user in this service."

  Scenario: Locked-out user
    Given the user is on the login page
    When they attempt to log in with a locked-out account
    Then they should see "Sorry, this user has been locked out."