$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/AnishaWorkspace/JobWebsite/src/test/resources/feature/feature.feature");
formatter.feature({
  "line": 1,
  "name": "Itecy Website Testing",
  "description": "",
  "id": "itecy-website-testing",
  "keyword": "Feature"
});
formatter.before({
  "duration": 331500,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "To test create profile functionality",
  "description": "",
  "id": "itecy-website-testing;to-test-create-profile-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Launch Itecy Website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click on JobSeeker Sign In",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Enter Username as \"anisha.prasoon@clientservertech.ca\" value",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Enter Password like \"Password-1\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click on JobSeeker Dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click on Create Profile",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Fill the fields on Creation page",
  "rows": [
    {
      "cells": [
        "Professional_Title",
        "Select_Industry",
        "About_Notes"
      ],
      "line": 13
    },
    {
      "cells": [
        "Manual Tester",
        "IT",
        "Having 3 yrs of experience"
      ],
      "line": 14
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Click on ProfileCreation Next button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Fill fields in General information page",
  "rows": [
    {
      "cells": [
        "Select_Gender",
        "Select_Marital_Status",
        "Select_Nationality",
        "Select_Country",
        "Select_State",
        "Select_City",
        "Select_DOB",
        "Select_Language",
        "Select_Preffered_Location",
        "Experience",
        "Select_Experience Level",
        "Select_Work_Authorization"
      ],
      "line": 17
    },
    {
      "cells": [
        "Female",
        "Married",
        "Indian",
        "INDIA",
        "TELANGANA",
        "Hyderabad",
        "001990-09-10",
        "English",
        "Hyderabad,TELANGANA,INDIA",
        "6",
        "6-10 years",
        "Permanent Resident"
      ],
      "line": 18
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Click on GeneralInformation NextButton",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Click on AddEducationbutton",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "fill the fields in add education page",
  "rows": [
    {
      "cells": [
        "Select_Degree",
        "Select_Specialization",
        "Passing_Year",
        "University_Name"
      ],
      "line": 22
    },
    {
      "cells": [
        "B.B.A",
        "Management",
        "2012",
        "ShivajiUniversity"
      ],
      "line": 23
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Click on SaveChanges button on EducationPage",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Click on EducationPage Nextbutton",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Click on AddExperience button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "fill the fields of AddExperience page",
  "rows": [
    {
      "cells": [
        "Select_Company",
        "Select_Industry",
        "Select_Functional_Area",
        "Select_Designation",
        "Select_JoiningDate",
        "Select_MonthlySalary"
      ],
      "line": 28
    },
    {
      "cells": [
        "Infosys",
        "IT",
        "Automationtesting",
        "Automationtester",
        "2012-09-03",
        "30000"
      ],
      "line": 29
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "click on IsCurrentCompany checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Select Expected increments",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Select Notice period",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Click on SaveChanges button on Experience page",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Click on Experience NextButton",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Click on AddCertification pagebutton",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "fill the fields of Certification page",
  "rows": [
    {
      "cells": [
        "Select_CertificateName",
        "Select_Date",
        "Select_LicenseNo",
        "Select_Institute_Name"
      ],
      "line": 37
    },
    {
      "cells": [
        "SeleniumJava",
        "002019-09-03",
        "AANJI10091990",
        "SunDevelopers"
      ],
      "line": 38
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Click on SaveChanges button on Certificaton page",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "Click on Certification page Nextbutton",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "Select Skills",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "click on Next button on Skills page",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "fill the fields on Social Profile page",
  "rows": [
    {
      "cells": [
        "Facebook",
        "GoogleLink",
        "TwitterLink",
        "InstagramLink"
      ],
      "line": 44
    },
    {
      "cells": [
        "www.fb.com",
        "www.google.com",
        "www.twitter.com",
        "www.instagram.com"
      ],
      "line": 45
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "Click on SocialProfile Next button",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "upload Resume",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "Click on Submit your details",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "Observe the Update profile Successfully message should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "close site",
  "keyword": "When "
});
formatter.match({
  "location": "ItecyGlue.itecy_launchwebsite()"
});
formatter.result({
  "duration": 24797714800,
  "status": "passed"
});
formatter.match({
  "location": "ItecyGlue.clickonjobseekerlink()"
});
formatter.result({
  "duration": 168397900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "anisha.prasoon@clientservertech.ca",
      "offset": 19
    }
  ],
  "location": "ItecyGlue.enter_username(String)"
});
formatter.result({
  "duration": 832038600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password-1",
      "offset": 21
    }
  ],
  "location": "ItecyGlue.enter_password(String)"
});
formatter.result({
  "duration": 119353000,
  "status": "passed"
});
formatter.match({
  "location": "ItecyGlue.click_login_button()"
});
formatter.result({
  "duration": 3491679500,
  "status": "passed"
});
formatter.match({
  "location": "ItecyGlue.click_on_JobSeeker_dropdown()"
});
formatter.result({
  "duration": 156114600,
  "status": "passed"
});
formatter.match({
  "location": "ItecyGlue.click_on_create_profile()"
});
formatter.result({
  "duration": 1308150800,
  "status": "passed"
});
formatter.match({
  "location": "ItecyGlue.fill_fields_in_creationpage(DataTable)"
});
formatter.result({
  "duration": 790846400,
  "status": "passed"
});
formatter.match({
  "location": "ItecyGlue.clickon_creationpage_nextButton()"
});
formatter.result({
  "duration": 8500259900,
  "status": "passed"
});
formatter.match({
  "location": "ItecyGlue.fill_in_generl_info_page(DataTable)"
});
formatter.result({
  "duration": 5967513100,
  "status": "passed"
});
formatter.match({
  "location": "ItecyGlue.clickonGeneralInformationNextButton()"
});
formatter.result({
  "duration": 7164331600,
  "status": "passed"
});
formatter.match({
  "location": "ItecyGlue.Add_education_details()"
});
formatter.result({
  "duration": 5238223700,
  "status": "passed"
});
formatter.match({
  "location": "ItecyGlue.fill_in_fields_in_education_page(DataTable)"
});
formatter.result({
  "duration": 1308221300,
  "status": "passed"
});
formatter.match({
  "location": "ItecyGlue.save_changes_on_educationpage()"
});
formatter.result({
  "duration": 686557200,
  "status": "passed"
});
formatter.match({
  "location": "ItecyGlue.click_nextbutton_on_educationpage()"
});
formatter.result({
  "duration": 5702606900,
  "status": "passed"
});
formatter.match({
  "location": "ItecyGlue.Click_on_AddExperience_button()"
});
formatter.result({
  "duration": 5163238800,
  "status": "passed"
});
formatter.match({
  "location": "ItecyGlue.fill_the_fields_of_AddExperience_page(DataTable)"
});
formatter.result({
  "duration": 2095011800,
  "status": "passed"
});
formatter.match({
  "location": "ItecyGlue.click_on_IsCurrentCompany_checkbox()"
});
formatter.result({
  "duration": 105842900,
  "status": "passed"
});
formatter.match({
  "location": "ItecyGlue.Select_Expected_increments()"
});
formatter.result({
  "duration": 284569900,
  "status": "passed"
});
formatter.match({
  "location": "ItecyGlue.Select_Notice_period()"
});
formatter.result({
  "duration": 231522100,
  "status": "passed"
});
formatter.match({
  "location": "ItecyGlue.Click_on_SaveChanges_button_on_Experience_page()"
});
formatter.result({
  "duration": 984241300,
  "status": "passed"
});
formatter.match({
  "location": "ItecyGlue.Click_AddExperience_NextButton()"
});
formatter.result({
  "duration": 5633769500,
  "status": "passed"
});
formatter.match({
  "location": "ItecyGlue.Click_on_AddCertification_pagebutton()"
});
formatter.result({
  "duration": 5196946200,
  "status": "passed"
});
formatter.match({
  "location": "ItecyGlue.fill_the_fields_of_Certification_page(DataTable)"
});
formatter.result({
  "duration": 1127406800,
  "status": "passed"
});
formatter.match({
  "location": "ItecyGlue.Click_on_SaveChanges_button_Certificatonpage()"
});
formatter.result({
  "duration": 882319900,
  "status": "passed"
});
formatter.match({
  "location": "ItecyGlue.Click_on_Next_button_Certificatonpage()"
});
formatter.result({
  "duration": 5824361400,
  "status": "passed"
});
formatter.match({
  "location": "ItecyGlue.Select_Skills()"
});
formatter.result({
  "duration": 5463214800,
  "status": "passed"
});
formatter.match({
  "location": "ItecyGlue.click_Next_button_Skills_page()"
});
formatter.result({
  "duration": 6164502300,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cinput type\u003d\"submit\" class\u003d\"next btn btn-primary\" value\u003d\"Next\"\u003e is not clickable at point (327, 651). Other element would receive the click: \u003cli class\u003d\"active-result\" data-option-array-index\u003d\"3\"\u003e...\u003c/li\u003e\n  (Session info: chrome\u003d80.0.3987.122)\nBuild info: version: \u00273.141.0\u0027, revision: \u00272ecb7d9a\u0027, time: \u00272018-10-31T20:09:30\u0027\nSystem info: host: \u0027DESKTOP-U6M5AKJ\u0027, ip: \u0027192.168.2.204\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.122, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\PC\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:61430}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 8f5b241932d1db952859098a90a2379c\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat sun.reflect.GeneratedMethodAccessor7.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat PAGES.AddSkillsPage.Click_AddSkillNextbutton(AddSkillsPage.java:55)\r\n\tat GLUE.ItecyGlue.click_Next_button_Skills_page(ItecyGlue.java:399)\r\n\tat ✽.And click on Next button on Skills page(C:/AnishaWorkspace/JobWebsite/src/test/resources/feature/feature.feature:42)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ItecyGlue.fill_fields_SocialProfilepage(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ItecyGlue.Click_SocialProfile_Next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ItecyGlue.upload_Resume()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ItecyGlue.Submit_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ItecyGlue.uploadProfileObservation()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ItecyGlue.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});