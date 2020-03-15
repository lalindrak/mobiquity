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
  "duration": 510052035,
  "error_message": "java.lang.NullPointerException\n\tat com.mobiquity.assignment.pages.LoginPage.enterUsername(LoginPage.java:19)\n\tat com.mobiquity.assignment.definitions.Login.user_logs_into_the_system_with_and(Login.java:20)\n\tat ✽.Given User logs into the system with \"Luke\" and \"Skywalker\"(src/test/java/com/mobiquity/assignment/features/login-logout.feature:7)\n",
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
});