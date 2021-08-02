$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/datatable.feature");
formatter.feature({
  "name": "To validate the Facebook login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionDataTable.user_is_in_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user change to English language",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionDataTable.user_change_to_English_language()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login using invalid 1D map credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user enter username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Greens@123",
        "greens"
      ]
    },
    {
      "cells": [
        "java@123",
        "java"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionDataTable.user_enter_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionDataTable.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is in reenter login page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionDataTable.user_is_in_reenter_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionDataTable.user_is_in_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user change to English language",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionDataTable.user_change_to_English_language()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate without passing credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user clicks login without data",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionDataTable.user_clicks_login_without_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user reenter to login page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionDataTable.user_reenter_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/flipkartlogin.feature");
formatter.feature({
  "name": "To validate Flipkart Login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate the invalid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to be in the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionFlipkart.user_has_to_be_in_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to close the window",
  "keyword": "But "
});
formatter.match({
  "location": "StepDefinitionFlipkart.user_has_to_close_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to give username and password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionFlipkart.user_has_to_give_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionFlipkart.user_has_to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to reenter to login page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionFlipkart.user_has_to_reenter_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/login.feature");
formatter.feature({
  "name": "To validate the Login functionality in facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate the login page without entering credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user clicks login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_clicks_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will be in invalid credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_will_be_in_invalid_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});