$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/AnishaWorkspace/itecy/src/test/resources/feature/feature1.feature");
formatter.feature({
  "line": 1,
  "name": "Gmail Website Testing",
  "description": "",
  "id": "gmail-website-testing",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Validate UserId field",
  "description": "",
  "id": "gmail-website-testing;validate-userid-field",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Launch website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter userid like \"\u003cx\u003e\" value",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click on UserID Next button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Validate userid output for \"\u003cx\u003e\" with \"\u003cy\u003e\" with \"\u003cz\u003e\" criteria",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close site",
  "keyword": "When "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "gmail-website-testing;validate-userid-field;",
  "rows": [
    {
      "cells": [
        "x",
        "y",
        "z"
      ],
      "line": 10,
      "id": "gmail-website-testing;validate-userid-field;;1"
    },
    {
      "cells": [
        "",
        "Invalid",
        "test1"
      ],
      "line": 11,
      "id": "gmail-website-testing;validate-userid-field;;2"
    },
    {
      "cells": [
        "dfvesfggrrffvgg",
        "Invalid",
        "test2"
      ],
      "line": 12,
      "id": "gmail-website-testing;validate-userid-field;;3"
    },
    {
      "cells": [
        "anisha.prasoon@gmail.com",
        "Valid",
        "test3"
      ],
      "line": 13,
      "id": "gmail-website-testing;validate-userid-field;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 396900,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Validate UserId field",
  "description": "",
  "id": "gmail-website-testing;validate-userid-field;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Launch website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter userid like \"\" value",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click on UserID Next button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Validate userid output for \"\" with \"Invalid\" with \"test1\" criteria",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close site",
  "keyword": "When "
});
formatter.match({
  "location": "Gmailglue.launchWebsite()"
});
formatter.result({
  "duration": 12491320500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 19
    }
  ],
  "location": "Gmailglue.EnterUserid(String)"
});
formatter.result({
  "duration": 153301600,
  "status": "passed"
});
formatter.match({
  "location": "Gmailglue.useridNext()"
});
formatter.result({
  "duration": 2143819200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 28
    },
    {
      "val": "Invalid",
      "offset": 36
    },
    {
      "val": "test1",
      "offset": 51
    }
  ],
  "location": "Gmailglue.validate_userid_output(String,String,String)"
});
formatter.write("uid blank test is passed");
formatter.result({
  "duration": 5084373600,
  "status": "passed"
});
formatter.match({
  "location": "Gmailglue.close_site()"
});
formatter.result({
  "duration": 691976900,
  "status": "passed"
});
formatter.before({
  "duration": 510700,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Validate UserId field",
  "description": "",
  "id": "gmail-website-testing;validate-userid-field;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Launch website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter userid like \"dfvesfggrrffvgg\" value",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click on UserID Next button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Validate userid output for \"dfvesfggrrffvgg\" with \"Invalid\" with \"test2\" criteria",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close site",
  "keyword": "When "
});
formatter.match({
  "location": "Gmailglue.launchWebsite()"
});
formatter.result({
  "duration": 11525881000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dfvesfggrrffvgg",
      "offset": 19
    }
  ],
  "location": "Gmailglue.EnterUserid(String)"
});
formatter.result({
  "duration": 259678900,
  "status": "passed"
});
formatter.match({
  "location": "Gmailglue.useridNext()"
});
formatter.result({
  "duration": 2355211100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dfvesfggrrffvgg",
      "offset": 28
    },
    {
      "val": "Invalid",
      "offset": 51
    },
    {
      "val": "test2",
      "offset": 66
    }
  ],
  "location": "Gmailglue.validate_userid_output(String,String,String)"
});
formatter.write("Valid uid testcase failed");
formatter.result({
  "duration": 5377025300,
  "status": "passed"
});
formatter.match({
  "location": "Gmailglue.close_site()"
});
formatter.result({
  "duration": 701566700,
  "status": "passed"
});
formatter.before({
  "duration": 466100,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Validate UserId field",
  "description": "",
  "id": "gmail-website-testing;validate-userid-field;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Launch website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter userid like \"anisha.prasoon@gmail.com\" value",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click on UserID Next button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Validate userid output for \"anisha.prasoon@gmail.com\" with \"Valid\" with \"test3\" criteria",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close site",
  "keyword": "When "
});
formatter.match({
  "location": "Gmailglue.launchWebsite()"
});
formatter.result({
  "duration": 11043829500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "anisha.prasoon@gmail.com",
      "offset": 19
    }
  ],
  "location": "Gmailglue.EnterUserid(String)"
});
formatter.result({
  "duration": 360383100,
  "status": "passed"
});
formatter.match({
  "location": "Gmailglue.useridNext()"
});
formatter.result({
  "duration": 2462997300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "anisha.prasoon@gmail.com",
      "offset": 28
    },
    {
      "val": "Valid",
      "offset": 60
    },
    {
      "val": "test3",
      "offset": 73
    }
  ],
  "location": "Gmailglue.validate_userid_output(String,String,String)"
});
formatter.write("Valid uid testcase passed");
formatter.result({
  "duration": 5059520800,
  "status": "passed"
});
formatter.match({
  "location": "Gmailglue.close_site()"
});
formatter.result({
  "duration": 717570400,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "Validate password field",
  "description": "",
  "id": "gmail-website-testing;validate-password-field",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "Launch website",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Enter userid like \"anisha.prasoon@gmail.com\" value",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Click on UserID Next button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Enter password like \"\u003ca\u003e\" value",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "click on Password Next button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Validate password output with \"\u003cx\u003e\" with \"\u003cy\u003e\" criteria",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "gmail-website-testing;validate-password-field;",
  "rows": [
    {
      "cells": [
        "x",
        "y"
      ],
      "line": 23,
      "id": "gmail-website-testing;validate-password-field;;1"
    },
    {
      "cells": [
        "",
        "Invalid"
      ],
      "line": 24,
      "id": "gmail-website-testing;validate-password-field;;2"
    },
    {
      "cells": [
        "$cooby7890",
        "Invalid"
      ],
      "line": 25,
      "id": "gmail-website-testing;validate-password-field;;3"
    },
    {
      "cells": [
        "$cooby1025",
        "Valid"
      ],
      "line": 26,
      "id": "gmail-website-testing;validate-password-field;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 468900,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Validate password field",
  "description": "",
  "id": "gmail-website-testing;validate-password-field;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "Launch website",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Enter userid like \"anisha.prasoon@gmail.com\" value",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Click on UserID Next button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Enter password like \"\u003ca\u003e\" value",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "click on Password Next button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Validate password output with \"\" with \"Invalid\" criteria",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Gmailglue.launchWebsite()"
});
formatter.result({
  "duration": 10967632000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "anisha.prasoon@gmail.com",
      "offset": 19
    }
  ],
  "location": "Gmailglue.EnterUserid(String)"
});
formatter.result({
  "duration": 667362100,
  "status": "passed"
});
formatter.match({
  "location": "Gmailglue.useridNext()"
});
formatter.result({
  "duration": 2338807700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003ca\u003e",
      "offset": 21
    }
  ],
  "location": "Gmailglue.Enterpwd(String)"
});
formatter.result({
  "duration": 5120697900,
  "status": "passed"
});
formatter.match({
  "location": "Gmailglue.Pwdnext()"
});
formatter.result({
  "duration": 5351613000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 31
    },
    {
      "val": "Invalid",
      "offset": 39
    }
  ],
  "location": "Gmailglue.validate_pwd_output(String,String)"
});
formatter.write("no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[text()\u003d\u0027Enter a password\u0027]\"}\n  (Session info: chrome\u003d80.0.3987.116)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.0\u0027, revision: \u00272ecb7d9a\u0027, time: \u00272018-10-31T20:09:30\u0027\nSystem info: host: \u0027DESKTOP-U6M5AKJ\u0027, ip: \u0027192.168.2.204\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.116, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\PC\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:49588}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 4dcf0d8adf4ec9eb6b444cc06faf595d\n*** Element info: {Using\u003dxpath, value\u003d//*[text()\u003d\u0027Enter a password\u0027]}");
formatter.result({
  "duration": 94918500,
  "status": "passed"
});
formatter.before({
  "duration": 587300,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Validate password field",
  "description": "",
  "id": "gmail-website-testing;validate-password-field;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "Launch website",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Enter userid like \"anisha.prasoon@gmail.com\" value",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Click on UserID Next button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Enter password like \"\u003ca\u003e\" value",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "click on Password Next button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Validate password output with \"$cooby7890\" with \"Invalid\" criteria",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Gmailglue.launchWebsite()"
});
formatter.result({
  "duration": 11526984100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "anisha.prasoon@gmail.com",
      "offset": 19
    }
  ],
  "location": "Gmailglue.EnterUserid(String)"
});
formatter.result({
  "duration": 425430000,
  "status": "passed"
});
formatter.match({
  "location": "Gmailglue.useridNext()"
});
formatter.result({
  "duration": 2586554800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003ca\u003e",
      "offset": 21
    }
  ],
  "location": "Gmailglue.Enterpwd(String)"
});
formatter.result({
  "duration": 5231814600,
  "status": "passed"
});
formatter.match({
  "location": "Gmailglue.Pwdnext()"
});
formatter.result({
  "duration": 5337862300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$cooby7890",
      "offset": 31
    },
    {
      "val": "Invalid",
      "offset": 49
    }
  ],
  "location": "Gmailglue.validate_pwd_output(String,String)"
});
formatter.write("no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[contains(text(), \u0027Wrong password\u0027)]\"}\n  (Session info: chrome\u003d80.0.3987.116)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.0\u0027, revision: \u00272ecb7d9a\u0027, time: \u00272018-10-31T20:09:30\u0027\nSystem info: host: \u0027DESKTOP-U6M5AKJ\u0027, ip: \u0027192.168.2.204\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.116, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\PC\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:49619}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: ae1bfc1d0d54fd565fe715c837745aa7\n*** Element info: {Using\u003dxpath, value\u003d//*[contains(text(), \u0027Wrong password\u0027)]}");
formatter.result({
  "duration": 61163400,
  "status": "passed"
});
formatter.before({
  "duration": 423400,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Validate password field",
  "description": "",
  "id": "gmail-website-testing;validate-password-field;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "Launch website",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Enter userid like \"anisha.prasoon@gmail.com\" value",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Click on UserID Next button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Enter password like \"\u003ca\u003e\" value",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "click on Password Next button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Validate password output with \"$cooby1025\" with \"Valid\" criteria",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Gmailglue.launchWebsite()"
});
formatter.result({
  "duration": 11310167000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "anisha.prasoon@gmail.com",
      "offset": 19
    }
  ],
  "location": "Gmailglue.EnterUserid(String)"
});
formatter.result({
  "duration": 368962400,
  "status": "passed"
});
formatter.match({
  "location": "Gmailglue.useridNext()"
});
formatter.result({
  "duration": 2514403200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003ca\u003e",
      "offset": 21
    }
  ],
  "location": "Gmailglue.Enterpwd(String)"
});
formatter.result({
  "duration": 5189418100,
  "status": "passed"
});
formatter.match({
  "location": "Gmailglue.Pwdnext()"
});
formatter.result({
  "duration": 5307953300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$cooby1025",
      "offset": 31
    },
    {
      "val": "Valid",
      "offset": 49
    }
  ],
  "location": "Gmailglue.validate_pwd_output(String,String)"
});
formatter.write("no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027T-I J-J5-Ji T-I-KE L3\u0027]\"}\n  (Session info: chrome\u003d80.0.3987.116)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.0\u0027, revision: \u00272ecb7d9a\u0027, time: \u00272018-10-31T20:09:30\u0027\nSystem info: host: \u0027DESKTOP-U6M5AKJ\u0027, ip: \u0027192.168.2.204\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.116, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\PC\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:49646}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 73617496458db95469277746e1166854\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027T-I J-J5-Ji T-I-KE L3\u0027]}");
formatter.result({
  "duration": 18958600,
  "status": "passed"
});
});