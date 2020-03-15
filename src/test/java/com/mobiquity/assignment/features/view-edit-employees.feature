# new feature
# Tags: optional

Feature: Viewing and editing of the employee details in the system

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

  Scenario: Verify User should be able to edit the employee by clicking on Edit button
    Given User clicks on the employee name from the employee list
    And User clicks on Edit button
    When User edits the employee information as below
      | FieldName | FieldValue                  |
      | firstName | David                       |
      | LastName  | Hugo                        |
      | StartDate | 2020-03-15                  |
      | Email     | lalindra.kawshika@gmail.com |
    And User clicks on Update button
    Then Updated information should be displayed in the system


  Scenario: Verify User should be able to edit the employee double clicking on Employee Name
    Given User double click on the employee name from the employee list
    When User edits the employee information as below
      | FieldName | FieldValue                  |
      | firstName | Josh                        |
      | LastName  | Hemman                      |
      | StartDate | 2020-03-15                  |
      | Email     | lalindra.kawshika@gmail.com |
    And User clicks on Update button
    Then Updated information should be displayed in the system
