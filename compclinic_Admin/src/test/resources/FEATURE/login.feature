Feature: Testing Login Feature

Scenario Outline:Admin user logging in

Given Launch Compclinic Admin Website
And Enter Email "<Email>" value
And Enter Password "<Password>" value
And click on Login button
Then Verify user lands on Home page with "<expectedoutput>" and "<cases>"

Examples: 
|Email|Password|expectedoutput|cases|
|hr@clientservertech.com|pass@123|Index - Comp Clinic Admin|valid|
|hr@clientservertech.ca|pass@123|Invalid Account|invalid|
|hr@clientservertech.com|paaa@123|Invalid Password|invalid|

Scenario: Logout 
Given Launch Compclinic Admin Website
And Enter Email "hr@clientservertech.com" value
And Enter Password "pass@123" value
And click on Login button
Then click on Logout button
Then Click on Yes button
