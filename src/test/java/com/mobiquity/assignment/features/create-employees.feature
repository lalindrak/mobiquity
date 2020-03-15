# new feature
# Tags: optional

Feature: Create a new employee functionality of the system

  Background:
    Given User logs into the system with "Luke" and "Skywalker"
    When User clicks on "Submit" to login to the system
    Then User is successfully logged into the system


  Scenario: Verify the user can add employee to the system
    Given User clicks on the Create button
    When User fills the employee information
      | FieldName | FieldValue          |
      | firstName | Luke                |
      | LastName  | Watson              |
      | StartDate | 2020-03-15          |
      | Email     | srilaleee@gmail.com |

    And User clicks on the Add button
    Then New employee record is added to the system

  Scenario: Verify the text field validations for creating a new employee
    Given User clicks on the Create button
    When User fills the employee information

      | FieldName | FieldValue |
      | firstName | S_pecial!* |
      | LastName  | &^Special  |
      | StartDate | 20205      |
      | Email     | abc        |

    And User clicks on the Add button
    Then User should get assertion errors

  Scenario: User cancels the adding employee operation by clicking on cancel button
    Given User clicks on the Create button
    When User fills the employee information

      | FieldName | FieldValue          |
      | firstName | Luke                |
      | LastName  | Watson              |
      | StartDate | 2020-03-15          |
      | Email     | srilaleee@gmail.com |

    And User click on Cancel button
    Then New employee record should should not be added the system

