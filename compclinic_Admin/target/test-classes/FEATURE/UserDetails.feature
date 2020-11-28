Feature: Testing scenarios on User list page 

Scenario Outline: Verify user performes search functionality 
Given Launch Compclinic Admin Website
And Enter Email "hr@clientservertech.com" value
And Enter Password "pass@123" value
And click on Login button
And click on User Details list page
And select value from Dropdwon "<dropdown_option>"
And Enter value in Search by users text "<value>"
And click on user search button
Then verify the user search with "<dropdown_option>" and "<value>"
Then Close browser
Examples:
|dropdown_option|value|
|Name|Admin|
|Email|hr@clientservertech.com|
|Phone|2|