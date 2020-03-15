$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/mobiquity/assignment/features/login-logout.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# new feature"
    },
    {
      "line": 2,
      "value": "# Tags: optional"
    }
  ],
  "line": 3,
  "name": "Login and Logout functionality of the system",
  "description": "",
  "id": "login-and-logout-functionality-of-the-system",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Verify the user is successfully logged into the system on Login button click",
  "description": "",
  "id": "login-and-logout-functionality-of-the-system;verify-the-user-is-successfully-logged-into-the-system-on-login-button-click",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@testing"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User logs into the system with \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User clicks on \"Submit\" to login to the system",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User is successfully logged into the system",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "login-and-logout-functionality-of-the-system;verify-the-user-is-successfully-logged-into-the-system-on-login-button-click;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "login-and-logout-functionality-of-the-system;verify-the-user-is-successfully-logged-into-the-system-on-login-button-click;;1"
    },
    {
      "cells": [
        "Luke",
        "Skywalker"
      ],
      "line": 12,
      "id": "login-and-logout-functionality-of-the-system;verify-the-user-is-successfully-logged-into-the-system-on-login-button-click;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Verify the user is successfully logged into the system on Login button click",
  "description": "",
  "id": "login-and-logout-functionality-of-the-system;verify-the-user-is-successfully-logged-into-the-system-on-login-button-click;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@testing"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User logs into the system with \"Luke\" and \"Skywalker\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User clicks on \"Submit\" to login to the system",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User is successfully logged into the system",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Luke",
      "offset": 32
    },
    {
      "val": "Skywalker",
      "offset": 43
    }
  ],
  "location": "Login.user_logs_into_the_system_with_and(String,String)"
});
formatter.result({
  "duration": 408570841,
  "error_message": "java.lang.NullPointerException\n\tat com.mobiquity.assignment.pages.LoginPage.enterUsername(LoginPage.java:19)\n\tat com.mobiquity.assignment.definitions.Login.user_logs_into_the_system_with_and(Login.java:21)\n\tat ✽.Given User logs into the system with \"Luke\" and \"Skywalker\"(src/test/java/com/mobiquity/assignment/features/login-logout.feature:7)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 16
    }
  ],
  "location": "Login.userClicksOnButtonToLogIn(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EmployeeDetails.userIsSuccessfullyLoggedIntoTheSystem()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "Verify the user is successfully logged into the system on Enter key press",
  "description": "",
  "id": "login-and-logout-functionality-of-the-system;verify-the-user-is-successfully-logged-into-the-system-on-enter-key-press",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "User logs into the system with \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "User clicks on \"Enter\" to login to the system",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User is successfully logged into the system",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "login-and-logout-functionality-of-the-system;verify-the-user-is-successfully-logged-into-the-system-on-enter-key-press;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 20,
      "id": "login-and-logout-functionality-of-the-system;verify-the-user-is-successfully-logged-into-the-system-on-enter-key-press;;1"
    },
    {
      "cells": [
        "Luke",
        "Skywalker"
      ],
      "line": 21,
      "id": "login-and-logout-functionality-of-the-system;verify-the-user-is-successfully-logged-into-the-system-on-enter-key-press;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 21,
  "name": "Verify the user is successfully logged into the system on Enter key press",
  "description": "",
  "id": "login-and-logout-functionality-of-the-system;verify-the-user-is-successfully-logged-into-the-system-on-enter-key-press;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "User logs into the system with \"Luke\" and \"Skywalker\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "User clicks on \"Enter\" to login to the system",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User is successfully logged into the system",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Luke",
      "offset": 32
    },
    {
      "val": "Skywalker",
      "offset": 43
    }
  ],
  "location": "Login.user_logs_into_the_system_with_and(String,String)"
});
formatter.result({
  "duration": 873362,
  "error_message": "java.lang.NullPointerException\n\tat com.mobiquity.assignment.pages.LoginPage.enterUsername(LoginPage.java:19)\n\tat com.mobiquity.assignment.definitions.Login.user_logs_into_the_system_with_and(Login.java:21)\n\tat ✽.Given User logs into the system with \"Luke\" and \"Skywalker\"(src/test/java/com/mobiquity/assignment/features/login-logout.feature:16)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Enter",
      "offset": 16
    }
  ],
  "location": "Login.userClicksOnButtonToLogIn(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EmployeeDetails.userIsSuccessfullyLoggedIntoTheSystem()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "line": 24,
  "name": "Verify the error message is displayed and user remains in the login page for invalid inputs",
  "description": "",
  "id": "login-and-logout-functionality-of-the-system;verify-the-error-message-is-displayed-and-user-remains-in-the-login-page-for-invalid-inputs",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 25,
  "name": "User logs into the system with \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "User clicks on \"Submit\" to login to the system",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "An error message is displayed to the user",
  "keyword": "Then "
});
formatter.examples({
  "line": 28,
  "name": "",
  "description": "",
  "id": "login-and-logout-functionality-of-the-system;verify-the-error-message-is-displayed-and-user-remains-in-the-login-page-for-invalid-inputs;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 29,
      "id": "login-and-logout-functionality-of-the-system;verify-the-error-message-is-displayed-and-user-remains-in-the-login-page-for-invalid-inputs;;1"
    },
    {
      "cells": [
        "Invalid",
        "Skywalker"
      ],
      "line": 30,
      "id": "login-and-logout-functionality-of-the-system;verify-the-error-message-is-displayed-and-user-remains-in-the-login-page-for-invalid-inputs;;2"
    },
    {
      "cells": [
        "Invalid",
        "Invalid"
      ],
      "line": 31,
      "id": "login-and-logout-functionality-of-the-system;verify-the-error-message-is-displayed-and-user-remains-in-the-login-page-for-invalid-inputs;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 30,
  "name": "Verify the error message is displayed and user remains in the login page for invalid inputs",
  "description": "",
  "id": "login-and-logout-functionality-of-the-system;verify-the-error-message-is-displayed-and-user-remains-in-the-login-page-for-invalid-inputs;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 25,
  "name": "User logs into the system with \"Invalid\" and \"Skywalker\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "User clicks on \"Submit\" to login to the system",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "An error message is displayed to the user",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Invalid",
      "offset": 32
    },
    {
      "val": "Skywalker",
      "offset": 46
    }
  ],
  "location": "Login.user_logs_into_the_system_with_and(String,String)"
});
formatter.result({
  "duration": 1421055,
  "error_message": "java.lang.NullPointerException\n\tat com.mobiquity.assignment.pages.LoginPage.enterUsername(LoginPage.java:19)\n\tat com.mobiquity.assignment.definitions.Login.user_logs_into_the_system_with_and(Login.java:21)\n\tat ✽.Given User logs into the system with \"Invalid\" and \"Skywalker\"(src/test/java/com/mobiquity/assignment/features/login-logout.feature:25)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 16
    }
  ],
  "location": "Login.userClicksOnButtonToLogIn(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.anErrorMessageIsDisplayedToTheUser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 31,
  "name": "Verify the error message is displayed and user remains in the login page for invalid inputs",
  "description": "",
  "id": "login-and-logout-functionality-of-the-system;verify-the-error-message-is-displayed-and-user-remains-in-the-login-page-for-invalid-inputs;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 25,
  "name": "User logs into the system with \"Invalid\" and \"Invalid\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "User clicks on \"Submit\" to login to the system",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "An error message is displayed to the user",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Invalid",
      "offset": 32
    },
    {
      "val": "Invalid",
      "offset": 46
    }
  ],
  "location": "Login.user_logs_into_the_system_with_and(String,String)"
});
formatter.result({
  "duration": 877379,
  "error_message": "java.lang.NullPointerException\n\tat com.mobiquity.assignment.pages.LoginPage.enterUsername(LoginPage.java:19)\n\tat com.mobiquity.assignment.definitions.Login.user_logs_into_the_system_with_and(Login.java:21)\n\tat ✽.Given User logs into the system with \"Invalid\" and \"Invalid\"(src/test/java/com/mobiquity/assignment/features/login-logout.feature:25)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 16
    }
  ],
  "location": "Login.userClicksOnButtonToLogIn(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.anErrorMessageIsDisplayedToTheUser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "line": 34,
  "name": "Verify the user is successfully logout from the system",
  "description": "",
  "id": "login-and-logout-functionality-of-the-system;verify-the-user-is-successfully-logout-from-the-system",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 35,
  "name": "User logs into the system with \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "User clicks on \"Submit\" to login to the system",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "User is successfully logged into the system",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "User clicks on Logout button",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User should be successfully logged out from the system",
  "keyword": "Then "
});
formatter.examples({
  "line": 42,
  "name": "",
  "description": "",
  "id": "login-and-logout-functionality-of-the-system;verify-the-user-is-successfully-logout-from-the-system;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 43,
      "id": "login-and-logout-functionality-of-the-system;verify-the-user-is-successfully-logout-from-the-system;;1"
    },
    {
      "cells": [
        "Luke",
        "Skywalker"
      ],
      "line": 44,
      "id": "login-and-logout-functionality-of-the-system;verify-the-user-is-successfully-logout-from-the-system;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 44,
  "name": "Verify the user is successfully logout from the system",
  "description": "",
  "id": "login-and-logout-functionality-of-the-system;verify-the-user-is-successfully-logout-from-the-system;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 35,
  "name": "User logs into the system with \"Luke\" and \"Skywalker\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "User clicks on \"Submit\" to login to the system",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "User is successfully logged into the system",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "User clicks on Logout button",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User should be successfully logged out from the system",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Luke",
      "offset": 32
    },
    {
      "val": "Skywalker",
      "offset": 43
    }
  ],
  "location": "Login.user_logs_into_the_system_with_and(String,String)"
});
formatter.result({
  "duration": 802750,
  "error_message": "java.lang.NullPointerException\n\tat com.mobiquity.assignment.pages.LoginPage.enterUsername(LoginPage.java:19)\n\tat com.mobiquity.assignment.definitions.Login.user_logs_into_the_system_with_and(Login.java:21)\n\tat ✽.Given User logs into the system with \"Luke\" and \"Skywalker\"(src/test/java/com/mobiquity/assignment/features/login-logout.feature:35)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 16
    }
  ],
  "location": "Login.userClicksOnButtonToLogIn(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EmployeeDetails.userIsSuccessfullyLoggedIntoTheSystem()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EmployeeDetails.userClicksOnLogoutButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.userShouldBeSuccessfullyLoggedOutFromTheSystem()"
});
formatter.result({
  "status": "skipped"
});
});