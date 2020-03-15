# new feature
# Tags: optional

Feature: Deleting an employee from the system
  Background:
    Given User logs into the system with "Luke" and "Skywalker"
    When User clicks on "Submit" to login to the system
    Then User is successfully logged into the system
    Given User clicks on the Create button
    When User fills the employee information
      | FieldName | FieldValue          |
      | firstName | Luke                |
      | LastName  | Watson              |
      | StartDate | 2020-03-15          |
      | Email     | srilaleee@gmail.com |

    And User clicks on the Add button
    Then New employee record is added to the system

  Scenario: Verify User should be able to delete an employee by clicking on the Delete button
    Given User clicks on the employee name from the employee list
    When User clicks on Delete button
    And User clicks "Accept" from the alert pop up
    Then Employee should be deleted from the employee list


  Scenario: Verify Employee should not be deleted when alert is cancelled
    Given User clicks on the employee name from the employee list
    When User clicks on Delete button
    And User clicks "Cancel" from the alert pop up
    Then Employe should not be deleted from the system