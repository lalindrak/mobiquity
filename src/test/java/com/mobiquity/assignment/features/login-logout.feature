# new feature
# Tags: optional
Feature: Login and Logout functionality of the system

  @testing
  Scenario Outline: Verify the user is successfully logged into the system on Login button click
    Given User logs into the system with "<username>" and "<password>"
    When User clicks on "Submit" to login to the system
    Then User is successfully logged into the system
    Examples:
      | username | password  |
      | Luke     | Skywalker |


  Scenario Outline: Verify the user is successfully logged into the system on Enter key press
    Given User logs into the system with "<username>" and "<password>"
    When User clicks on "Enter" to login to the system
    Then User is successfully logged into the system
    Examples:
      | username | password  |
      | Luke     | Skywalker |


  Scenario Outline: Verify the error message is displayed and user remains in the login page for invalid inputs
    Given User logs into the system with "<username>" and "<password>"
    When User clicks on "Submit" to login to the system
    Then An error message is displayed to the user
    Examples:
      | username | password  |
      | Invalid     | Skywalker |
      | Invalid     | Invalid   |


  Scenario Outline: Verify the user is successfully logout from the system
    Given User logs into the system with "<username>" and "<password>"
    When User clicks on "Submit" to login to the system
    Then User is successfully logged into the system
    And User clicks on Logout button
    Then User should be successfully logged out from the system


    Examples:
      | username | password  |
      | Luke     | Skywalker |