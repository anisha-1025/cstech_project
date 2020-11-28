$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/AnishaWorkspace/compclinic/src/test/resources/feature/ChangePwd_Account_Logout.feature");
formatter.feature({
  "line": 1,
  "name": "Verify the various options listed under NavigationDropdown like ChangePassword, My Account Details and Logout feature",
  "description": "",
  "id": "verify-the-various-options-listed-under-navigationdropdown-like-changepassword,-my-account-details-and-logout-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Testing Change password scenario using valid inputs",
  "description": "",
  "id": "verify-the-various-options-listed-under-navigationdropdown-like-changepassword,-my-account-details-and-logout-feature;testing-change-password-scenario-using-valid-inputs",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Launch compclinic website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on Login link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters Email password \"anisha.prasoon@gmail.com\" and \"Pass@123\" value",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on NavigationDropdown",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user clicks on ChangePassword link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user Enters OldPassowrd\"\u003cOldPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user Enters NewPassword\"\u003cNewPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user Enters Confirm New Password\"\u003cConfirmPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user Clicks on ChangePassword button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user verifies the message getting displayed with \"\u003cscenario\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "verify-the-various-options-listed-under-navigationdropdown-like-changepassword,-my-account-details-and-logout-feature;testing-change-password-scenario-using-valid-inputs;",
  "rows": [
    {
      "cells": [
        "OldPassword",
        "NewPassword",
        "ConfirmPassword",
        "scenario"
      ],
      "line": 17,
      "id": "verify-the-various-options-listed-under-navigationdropdown-like-changepassword,-my-account-details-and-logout-feature;testing-change-password-scenario-using-valid-inputs;;1"
    },
    {
      "cells": [
        "Pass@1231",
        "Pass@1234",
        "Pass@1234",
        "invalidOldpassword"
      ],
      "line": 18,
      "id": "verify-the-various-options-listed-under-navigationdropdown-like-changepassword,-my-account-details-and-logout-feature;testing-change-password-scenario-using-valid-inputs;;2"
    },
    {
      "cells": [
        "Pass@123",
        "Pass@111",
        "Pass@131",
        "The new password and confirmation password do not match."
      ],
      "line": 19,
      "id": "verify-the-various-options-listed-under-navigationdropdown-like-changepassword,-my-account-details-and-logout-feature;testing-change-password-scenario-using-valid-inputs;;3"
    },
    {
      "cells": [
        "Pass@123",
        "Pass@1234",
        "Pass@1234",
        "Change Password Successfully!"
      ],
      "line": 20,
      "id": "verify-the-various-options-listed-under-navigationdropdown-like-changepassword,-my-account-details-and-logout-feature;testing-change-password-scenario-using-valid-inputs;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 924100,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Testing Change password scenario using valid inputs",
  "description": "",
  "id": "verify-the-various-options-listed-under-navigationdropdown-like-changepassword,-my-account-details-and-logout-feature;testing-change-password-scenario-using-valid-inputs;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Launch compclinic website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on Login link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters Email password \"anisha.prasoon@gmail.com\" and \"Pass@123\" value",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on NavigationDropdown",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user clicks on ChangePassword link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user Enters OldPassowrd\"Pass@1231\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user Enters NewPassword\"Pass@1234\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user Enters Confirm New Password\"Pass@1234\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user Clicks on ChangePassword button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user verifies the message getting displayed with \"invalidOldpassword\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "compclinicglue.LaunchCompclinicWebsite()"
});
formatter.result({
  "duration": 20033869700,
  "status": "passed"
});
formatter.match({
  "location": "compclinicglue.user_clicks_on_Login_link()"
});
formatter.result({
  "duration": 1830834500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "anisha.prasoon@gmail.com",
      "offset": 28
    },
    {
      "val": "Pass@123",
      "offset": 59
    }
  ],
  "location": "compclinicglue.user_enters_Emaild_and_Password_to_login_and_value(String,String)"
});
formatter.result({
  "duration": 655227200,
  "status": "passed"
});
formatter.match({
  "location": "compclinicglue.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 1020733300,
  "status": "passed"
});
formatter.match({
  "location": "compclinicglue.user_clicks_Navigationdropdown()"
});
formatter.result({
  "duration": 88174700,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[@href\u003d\u0027blog.html\u0027]\"}\n  (Session info: chrome\u003d80.0.3987.149)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.0\u0027, revision: \u00272ecb7d9a\u0027, time: \u00272018-10-31T20:09:30\u0027\nSystem info: host: \u0027DESKTOP-U6M5AKJ\u0027, ip: \u0027192.168.0.16\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.149, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\PC\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:59538}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 708d2f8d1028e40e51a209750ee81f3c\n*** Element info: {Using\u003dxpath, value\u003d//a[@href\u003d\u0027blog.html\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.click(Unknown Source)\r\n\tat PAGES.UserAccountInfoPage.Click_on_UserDropdown(UserAccountInfoPage.java:48)\r\n\tat CompclinicGLUE.compclinicglue.user_clicks_Navigationdropdown(compclinicglue.java:464)\r\n\tat ✽.And user clicks on NavigationDropdown(C:/AnishaWorkspace/compclinic/src/test/resources/feature/ChangePwd_Account_Logout.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "compclinicglue.user_clicks_ChangePasswordLink()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Pass@1231",
      "offset": 24
    }
  ],
  "location": "compclinicglue.user_Enters_Oldpassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Pass@1234",
      "offset": 24
    }
  ],
  "location": "compclinicglue.user_Enters_NewPassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Pass@1234",
      "offset": 33
    }
  ],
  "location": "compclinicglue.user_Enters_Confirm_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "compclinicglue.user_Clicks_ChangePasswordButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "invalidOldpassword",
      "offset": 50
    }
  ],
  "location": "compclinicglue.user_verifies_message_Getting_displayed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.before({
  "duration": 589900,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Testing Change password scenario using valid inputs",
  "description": "",
  "id": "verify-the-various-options-listed-under-navigationdropdown-like-changepassword,-my-account-details-and-logout-feature;testing-change-password-scenario-using-valid-inputs;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Launch compclinic website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on Login link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters Email password \"anisha.prasoon@gmail.com\" and \"Pass@123\" value",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on NavigationDropdown",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user clicks on ChangePassword link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user Enters OldPassowrd\"Pass@123\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user Enters NewPassword\"Pass@111\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user Enters Confirm New Password\"Pass@131\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user Clicks on ChangePassword button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user verifies the message getting displayed with \"The new password and confirmation password do not match.\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "compclinicglue.LaunchCompclinicWebsite()"
});
formatter.result({
  "duration": 15143714600,
  "status": "passed"
});
formatter.match({
  "location": "compclinicglue.user_clicks_on_Login_link()"
});
formatter.result({
  "duration": 1881704900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "anisha.prasoon@gmail.com",
      "offset": 28
    },
    {
      "val": "Pass@123",
      "offset": 59
    }
  ],
  "location": "compclinicglue.user_enters_Emaild_and_Password_to_login_and_value(String,String)"
});
formatter.result({
  "duration": 642659000,
  "status": "passed"
});
formatter.match({
  "location": "compclinicglue.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 984985200,
  "status": "passed"
});
formatter.match({
  "location": "compclinicglue.user_clicks_Navigationdropdown()"
});
formatter.result({
  "duration": 51457300,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[@href\u003d\u0027blog.html\u0027]\"}\n  (Session info: chrome\u003d80.0.3987.149)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.0\u0027, revision: \u00272ecb7d9a\u0027, time: \u00272018-10-31T20:09:30\u0027\nSystem info: host: \u0027DESKTOP-U6M5AKJ\u0027, ip: \u0027192.168.0.16\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.149, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\PC\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:59565}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 94be0347219338f24415981cc2b5dd08\n*** Element info: {Using\u003dxpath, value\u003d//a[@href\u003d\u0027blog.html\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.click(Unknown Source)\r\n\tat PAGES.UserAccountInfoPage.Click_on_UserDropdown(UserAccountInfoPage.java:48)\r\n\tat CompclinicGLUE.compclinicglue.user_clicks_Navigationdropdown(compclinicglue.java:464)\r\n\tat ✽.And user clicks on NavigationDropdown(C:/AnishaWorkspace/compclinic/src/test/resources/feature/ChangePwd_Account_Logout.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "compclinicglue.user_clicks_ChangePasswordLink()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Pass@123",
      "offset": 24
    }
  ],
  "location": "compclinicglue.user_Enters_Oldpassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Pass@111",
      "offset": 24
    }
  ],
  "location": "compclinicglue.user_Enters_NewPassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Pass@131",
      "offset": 33
    }
  ],
  "location": "compclinicglue.user_Enters_Confirm_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "compclinicglue.user_Clicks_ChangePasswordButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "The new password and confirmation password do not match.",
      "offset": 50
    }
  ],
  "location": "compclinicglue.user_verifies_message_Getting_displayed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.before({
  "duration": 537900,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Testing Change password scenario using valid inputs",
  "description": "",
  "id": "verify-the-various-options-listed-under-navigationdropdown-like-changepassword,-my-account-details-and-logout-feature;testing-change-password-scenario-using-valid-inputs;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Launch compclinic website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on Login link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters Email password \"anisha.prasoon@gmail.com\" and \"Pass@123\" value",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on NavigationDropdown",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user clicks on ChangePassword link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user Enters OldPassowrd\"Pass@123\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user Enters NewPassword\"Pass@1234\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user Enters Confirm New Password\"Pass@1234\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user Clicks on ChangePassword button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user verifies the message getting displayed with \"Change Password Successfully!\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "compclinicglue.LaunchCompclinicWebsite()"
});
formatter.result({
  "duration": 15367323400,
  "status": "passed"
});
formatter.match({
  "location": "compclinicglue.user_clicks_on_Login_link()"
});
formatter.result({
  "duration": 2118605400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "anisha.prasoon@gmail.com",
      "offset": 28
    },
    {
      "val": "Pass@123",
      "offset": 59
    }
  ],
  "location": "compclinicglue.user_enters_Emaild_and_Password_to_login_and_value(String,String)"
});
formatter.result({
  "duration": 567925900,
  "status": "passed"
});
formatter.match({
  "location": "compclinicglue.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 1040833200,
  "status": "passed"
});
formatter.match({
  "location": "compclinicglue.user_clicks_Navigationdropdown()"
});
formatter.result({
  "duration": 40492700,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[@href\u003d\u0027blog.html\u0027]\"}\n  (Session info: chrome\u003d80.0.3987.149)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.0\u0027, revision: \u00272ecb7d9a\u0027, time: \u00272018-10-31T20:09:30\u0027\nSystem info: host: \u0027DESKTOP-U6M5AKJ\u0027, ip: \u0027192.168.0.16\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.149, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\PC\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:59592}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: de1826b3b15f827af95fd76cb06c015f\n*** Element info: {Using\u003dxpath, value\u003d//a[@href\u003d\u0027blog.html\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.click(Unknown Source)\r\n\tat PAGES.UserAccountInfoPage.Click_on_UserDropdown(UserAccountInfoPage.java:48)\r\n\tat CompclinicGLUE.compclinicglue.user_clicks_Navigationdropdown(compclinicglue.java:464)\r\n\tat ✽.And user clicks on NavigationDropdown(C:/AnishaWorkspace/compclinic/src/test/resources/feature/ChangePwd_Account_Logout.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "compclinicglue.user_clicks_ChangePasswordLink()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Pass@123",
      "offset": 24
    }
  ],
  "location": "compclinicglue.user_Enters_Oldpassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Pass@1234",
      "offset": 24
    }
  ],
  "location": "compclinicglue.user_Enters_NewPassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Pass@1234",
      "offset": 33
    }
  ],
  "location": "compclinicglue.user_Enters_Confirm_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "compclinicglue.user_Clicks_ChangePasswordButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Change Password Successfully!",
      "offset": 50
    }
  ],
  "location": "compclinicglue.user_verifies_message_Getting_displayed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.before({
  "duration": 407700,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Testing MyAccount",
  "description": "",
  "id": "verify-the-various-options-listed-under-navigationdropdown-like-changepassword,-my-account-details-and-logout-feature;testing-myaccount",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "Launch compclinic website",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "user clicks on Login link",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user enters Email password \"anisha.prasoon@clientservertech.ca\" and \"Pass@123\" value",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user clicks on NavigationDropdown",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user clicks on MyAccount link",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "verify the page title after landing on Account page",
  "keyword": "Then "
});
formatter.match({
  "location": "compclinicglue.LaunchCompclinicWebsite()"
});
formatter.result({
  "duration": 15087460500,
  "status": "passed"
});
formatter.match({
  "location": "compclinicglue.user_clicks_on_Login_link()"
});
formatter.result({
  "duration": 2023738500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "anisha.prasoon@clientservertech.ca",
      "offset": 28
    },
    {
      "val": "Pass@123",
      "offset": 69
    }
  ],
  "location": "compclinicglue.user_enters_Emaild_and_Password_to_login_and_value(String,String)"
});
formatter.result({
  "duration": 695617700,
  "status": "passed"
});
formatter.match({
  "location": "compclinicglue.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 3515600500,
  "status": "passed"
});
formatter.match({
  "location": "compclinicglue.user_clicks_Navigationdropdown()"
});
formatter.result({
  "duration": 248592200,
  "status": "passed"
});
formatter.match({
  "location": "compclinicglue.user_clicks_MyAccount_link()"
});
formatter.result({
  "duration": 1195955600,
  "status": "passed"
});
formatter.match({
  "location": "compclinicglue.verify_page_title_on_Account_Page()"
});
formatter.result({
  "duration": 20968600,
  "status": "passed"
});
formatter.before({
  "duration": 434900,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Testing Logout feature",
  "description": "",
  "id": "verify-the-various-options-listed-under-navigationdropdown-like-changepassword,-my-account-details-and-logout-feature;testing-logout-feature",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 33,
  "name": "Launch compclinic website",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "user clicks on Login link",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "user enters Email password \"anisha.prasoon@clientservertech.ca\" and \"Pass@123\" value",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user clicks on NavigationDropdown",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user clicks on Logout link",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "verify the page_title after logout",
  "keyword": "Then "
});
formatter.match({
  "location": "compclinicglue.LaunchCompclinicWebsite()"
});
formatter.result({
  "duration": 14910035300,
  "status": "passed"
});
formatter.match({
  "location": "compclinicglue.user_clicks_on_Login_link()"
});
