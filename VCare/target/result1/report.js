$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/AnishaWorkspace/VCare/src/test/resources/Feature/Billing_closeout.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Billing-Additional Charges tab",
  "description": "",
  "id": "verify-billing-additional-charges-tab",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3420600,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "1.Closeout child whose Invoice is generated but has payment dues",
  "description": "",
  "id": "verify-billing-additional-charges-tab;1.closeout-child-whose-invoice-is-generated-but-has-payment-dues",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Launch Vcare application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Enter Customerid, Username and Password like \"21\", \"anisha.prasoon@gmail.com\" \"Pass@1234\"",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "Click on SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Click on Billing tab",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on Child_Closeout tab",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Select child details from dropdown",
  "rows": [
    {
      "cells": [
        "Class",
        "Child"
      ],
      "line": 9
    },
    {
      "cells": [
        "Infant",
        "Ria Soni"
      ],
      "line": 10
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click on CalculateDues_ReturnDeposit button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Verify the text message getting displayed \"Child need to pay balance amount:\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Click on Closeout_Payment_button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Verify User lands on Payment Page \"V Care - Payments\"",
  "keyword": "Then "
});
formatter.match({
  "location": "vcareglue.launch_vcare_webapplication()"
});
formatter.result({
  "duration": 21496259800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "21",
      "offset": 46
    },
    {
      "val": "anisha.prasoon@gmail.com",
      "offset": 52
    },
    {
      "val": "Pass@1234",
      "offset": 79
    }
  ],
  "location": "vcareglue.Enter_Customerid_Username_Password(String,String,String)"
});
formatter.result({
  "duration": 2855033000,
  "status": "passed"
});
formatter.match({
  "location": "vcareglue.Click_SignIn_Button()"
});
formatter.result({
  "duration": 3720071900,
  "status": "passed"
});
formatter.match({
  "location": "vcareglue.Click_Billing_Tab()"
});
formatter.result({
  "duration": 836224500,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.before({
  "duration": 1415900,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "2.Closeout child whose Invoice is not generated",
  "description": "",
  "id": "verify-billing-additional-charges-tab;2.closeout-child-whose-invoice-is-not-generated",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "Launch Vcare application",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Enter Customerid, Username and Password like \"21\", \"anisha.prasoon@gmail.com\" \"Pass@1234\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Click on SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Click on Billing tab",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Click on Child_Closeout tab",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Select child details from dropdown",
  "rows": [
    {
      "cells": [
        "Class",
        "Child"
      ],
      "line": 24
    },
    {
      "cells": [
        "Pre-school",
        "discountone inactivetest"
      ],
      "line": 25
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Click on CalculateDues_ReturnDeposit button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Verify the alert message as \"Present month invoice is missing. Please generate it and then calculate.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "vcareglue.launch_vcare_webapplication()"
});
formatter.result({
  "duration": 10602773400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "21",
      "offset": 46
    },
    {
      "val": "anisha.prasoon@gmail.com",
      "offset": 52
    },
    {
      "val": "Pass@1234",
      "offset": 79
    }
  ],
  "location": "vcareglue.Enter_Customerid_Username_Password(String,String,String)"
});
formatter.result({
  "duration": 3187687900,
  "status": "passed"
});
formatter.match({
  "location": "vcareglue.Click_SignIn_Button()"
});
formatter.result({
  "duration": 3548143100,
  "status": "passed"
});
formatter.match({
  "location": "vcareglue.Click_Billing_Tab()"
});
formatter.result({
  "duration": 921042600,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "Present month invoice is missing. Please generate it and then calculate.",
      "offset": 29
    }
  ],
  "location": "vcareglue.Verify(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.before({
  "duration": 1123200,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "3.Closeout child whose Payment is Clear",
  "description": "",
  "id": "verify-billing-additional-charges-tab;3.closeout-child-whose-payment-is-clear",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "Launch Vcare application",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "Enter Customerid, Username and Password like \"21\", \"anisha.prasoon@gmail.com\" \"Pass@1234\"",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "Click on SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Click on Billing tab",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Click on Child_Closeout tab",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Select child details from dropdown",
  "rows": [
    {
      "cells": [
        "Class",
        "Child"
      ],
      "line": 37
    },
    {
      "cells": [
        "Pre-school",
        "discountone inactivetest"
      ],
      "line": 38
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Click on CalculateDues_ReturnDeposit button",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "Verify the text message getting displayed \"Payments are clear, you can closeout child\"",
  "keyword": "Then "
});
formatter.match({
  "location": "vcareglue.launch_vcare_webapplication()"
});
formatter.result({
  "duration": 10448453700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "21",
      "offset": 46
    },
    {
      "val": "anisha.prasoon@gmail.com",
      "offset": 52
    },
    {
      "val": "Pass@1234",
      "offset": 79
    }
  ],
  "location": "vcareglue.Enter_Customerid_Username_Password(String,String,String)"
});
formatter.result({
  "duration": 2421206000,
  "status": "passed"
});
formatter.match({
  "location": "vcareglue.Click_SignIn_Button()"
});
formatter.result({
  "duration": 4028942200,
  "status": "passed"
});
formatter.match({
  "location": "vcareglue.Click_Billing_Tab()"
});
formatter.result({
  "duration": 986473300,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});