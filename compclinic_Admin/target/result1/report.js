$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/AnishaWorkspace/compclinic_Admin/src/test/resources/FEATURE/UserDetails.feature");
formatter.feature({
  "line": 1,
  "name": "Testing scenarios on User list page",
  "description": "",
  "id": "testing-scenarios-on-user-list-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verify user performes search functionality",
  "description": "",
  "id": "testing-scenarios-on-user-list-page;verify-user-performes-search-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Launch Compclinic Admin Website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter Email \"hr@clientservertech.com\" value",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Enter Password \"pass@123\" value",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click on User Details list page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "select value from Dropdwon \"\u003cdropdown_option\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Enter value in Search by users text \"\u003cvalue\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click on user search button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "verify the user search with \"\u003cdropdown_option\u003e\" and \"\u003cvalue\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Close browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "testing-scenarios-on-user-list-page;verify-user-performes-search-functionality;",
  "rows": [
    {
      "cells": [
        "dropdown_option",
        "value"
      ],
      "line": 15,
      "id": "testing-scenarios-on-user-list-page;verify-user-performes-search-functionality;;1"
    },
    {
      "cells": [
        "Name",
        "Admin"
      ],
      "line": 16,
      "id": "testing-scenarios-on-user-list-page;verify-user-performes-search-functionality;;2"
    },
    {
      "cells": [
        "Email",
        "hr@clientservertech.com"
      ],
      "line": 17,
      "id": "testing-scenarios-on-user-list-page;verify-user-performes-search-functionality;;3"
    },
    {
      "cells": [
        "Phone",
        "2"
      ],
      "line": 18,
      "id": "testing-scenarios-on-user-list-page;verify-user-performes-search-functionality;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 479300,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Verify user performes search functionality",
  "description": "",
  "id": "testing-scenarios-on-user-list-page;verify-user-performes-search-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Launch Compclinic Admin Website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter Email \"hr@clientservertech.com\" value",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Enter Password \"pass@123\" value",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click on User Details list page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "select value from Dropdwon \"Name\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Enter value in Search by users text \"Admin\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click on user search button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "verify the user search with \"Name\" and \"Admin\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "compclinic_admin_glue.Launch_Compclinic_Admin_Url()"
});
formatter.result({
  "duration": 12263622100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hr@clientservertech.com",
      "offset": 13
    }
  ],
  "location": "compclinic_admin_glue.Enter_Email(String)"
});
formatter.result({
  "duration": 116459600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pass@123",
      "offset": 16
    }
  ],
  "location": "compclinic_admin_glue.Enter_Password(String)"
});
formatter.result({
  "duration": 80098500,
  "status": "passed"
});
formatter.match({
  "location": "compclinic_admin_glue.Click_Login_Button()"
});
formatter.result({
  "duration": 2724803600,
  "status": "passed"
});
formatter.match({
  "location": "compclinic_admin_glue.click_user_details_list_page()"
});
formatter.result({
  "duration": 774057400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name",
      "offset": 28
    }
  ],
  "location": "compclinic_admin_glue.select_value_from_dropdown(String)"
});
formatter.result({
  "duration": 268360100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 37
    }
  ],
  "location": "compclinic_admin_glue.Enter_value_search_by_user(String)"
});
formatter.result({
  "duration": 85287400,
  "status": "passed"
});
formatter.match({
  "location": "compclinic_admin_glue.click_on_user_search_button()"
});
formatter.result({
  "duration": 626587000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name",
      "offset": 29
    },
    {
      "val": "Admin",
      "offset": 40
    }
  ],
  "location": "compclinic_admin_glue.verify_user_search_with_values(String,String)"
});
formatter.result({
  "duration": 52639900,
  "status": "passed"
});
formatter.match({
  "location": "compclinic_admin_glue.close_browser()"
});
formatter.result({
  "duration": 67051300,
  "status": "passed"
});
formatter.before({
  "duration": 262800,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Verify user performes search functionality",
  "description": "",
  "id": "testing-scenarios-on-user-list-page;verify-user-performes-search-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Launch Compclinic Admin Website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter Email \"hr@clientservertech.com\" value",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Enter Password \"pass@123\" value",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click on User Details list page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "select value from Dropdwon \"Email\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Enter value in Search by users text \"hr@clientservertech.com\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click on user search button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "verify the user search with \"Email\" and \"hr@clientservertech.com\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "compclinic_admin_glue.Launch_Compclinic_Admin_Url()"
});
formatter.result({
  "duration": 11511381500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hr@clientservertech.com",
      "offset": 13
    }
  ],
  "location": "compclinic_admin_glue.Enter_Email(String)"
});
formatter.result({
  "duration": 136263300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pass@123",
      "offset": 16
    }
  ],
  "location": "compclinic_admin_glue.Enter_Password(String)"
});
formatter.result({
  "duration": 81596500,
  "status": "passed"
});
formatter.match({
  "location": "compclinic_admin_glue.Click_Login_Button()"
});
formatter.result({
  "duration": 2303895300,
  "status": "passed"
});
formatter.match({
  "location": "compclinic_admin_glue.click_user_details_list_page()"
});
formatter.result({
  "duration": 800793200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Email",
      "offset": 28
    }
  ],
  "location": "compclinic_admin_glue.select_value_from_dropdown(String)"
});
formatter.result({
  "duration": 191998700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hr@clientservertech.com",
      "offset": 37
    }
  ],
  "location": "compclinic_admin_glue.Enter_value_search_by_user(String)"
});
formatter.result({
  "duration": 135239600,
  "status": "passed"
});
formatter.match({
  "location": "compclinic_admin_glue.click_on_user_search_button()"
});
formatter.result({
  "duration": 694169100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Email",
      "offset": 29
    },
    {
      "val": "hr@clientservertech.com",
      "offset": 41
    }
  ],
  "location": "compclinic_admin_glue.verify_user_search_with_values(String,String)"
});
formatter.result({
  "duration": 36380100,
  "status": "passed"
});
formatter.match({
  "location": "compclinic_admin_glue.close_browser()"
});
formatter.result({
  "duration": 87215000,
  "status": "passed"
});
formatter.before({
  "duration": 1407900,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Verify user performes search functionality",
  "description": "",
  "id": "testing-scenarios-on-user-list-page;verify-user-performes-search-functionality;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Launch Compclinic Admin Website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter Email \"hr@clientservertech.com\" value",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Enter Password \"pass@123\" value",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click on User Details list page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "select value from Dropdwon \"Phone\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Enter value in Search by users text \"2\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click on user search button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "verify the user search with \"Phone\" and \"2\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "compclinic_admin_glue.Launch_Compclinic_Admin_Url()"
});
formatter.result({
  "duration": 10823478100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hr@clientservertech.com",
      "offset": 13
    }
  ],
  "location": "compclinic_admin_glue.Enter_Email(String)"
});
formatter.result({
  "duration": 171094900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pass@123",
      "offset": 16
    }
  ],
  "location": "compclinic_admin_glue.Enter_Password(String)"
});
formatter.result({
  "duration": 109224900,
  "status": "passed"
});
formatter.match({
  "location": "compclinic_admin_glue.Click_Login_Button()"
});
formatter.result({
  "duration": 1719712100,
  "status": "passed"
});
formatter.match({
  "location": "compclinic_admin_glue.click_user_details_list_page()"
});
formatter.result({
  "duration": 690610900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Phone",
      "offset": 28
    }
  ],
  "location": "compclinic_admin_glue.select_value_from_dropdown(String)"
});
formatter.result({
  "duration": 257110400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 37
    }
  ],
  "location": "compclinic_admin_glue.Enter_value_search_by_user(String)"
});
formatter.result({
  "duration": 97753000,
  "status": "passed"
});
formatter.match({
  "location": "compclinic_admin_glue.click_on_user_search_button()"
});
formatter.result({
  "duration": 626258400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Phone",
      "offset": 29
    },
    {
      "val": "2",
      "offset": 41
    }
  ],
  "location": "compclinic_admin_glue.verify_user_search_with_values(String,String)"
});
formatter.result({
  "duration": 64787200,
  "status": "passed"
});
formatter.match({
  "location": "compclinic_admin_glue.close_browser()"
});
formatter.result({
  "duration": 105292800,
  "status": "passed"
});
});