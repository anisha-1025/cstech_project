Feature: Testing scenarios on Services list page 

Scenario Outline: Verify user performes search functionality 
Given Launch Compclinic Admin Website
And Enter Email "hr@clientservertech.com" value
And Enter Password "pass@123" value
And click on Login button
And click on Services list page
And select value from services Dropdwon "Service Name"
And Enter value in SearchbyService field "<Service Name>"
And click on service search button
Then Verify Service page after search with "<Service Name>"
Then Close browser
Examples:
|Service Name|
|Data Recovery Services|
|Desktop / Laptop Repairs	|
|IPad / IMac Services	|

Scenario: Create new Services 
Given Launch Compclinic Admin Website
And Enter Email "hr@clientservertech.com" value
And Enter Password "pass@123" value
And click on Login button
And click on Services list page
And click on Service Create New button
And Enter value in fields on service page
|Services_Name|Description|Full_Description|Image_Path|
|test|This is a test service name|a. Test Service name b. This is for test purpose|C:\Users\PC\Documents\servicename_test_image.png|
And click on create services button 
Then verify user lands on Services list page

Scenario: Edit existing service name
Given Launch Compclinic Admin Website
And Enter Email "hr@clientservertech.com" value
And Enter Password "pass@123" value
And click on Login button
And click on Services list page
And select value from Dropdwon "Service Name"
And Enter value in SearchbyService field "test"
And click on service search button
And click on Services Edit link
And Update the fields on service page
|Description|
|This is updated test service|
And click on service Update button
Then verify user lands on Services list page

Scenario: Delete existing service name
Given Launch Compclinic Admin Website
And Enter Email "hr@clientservertech.com" value
And Enter Password "pass@123" value
And click on Login button
And click on Services list page
And select value from Dropdwon "Service Name"
And Enter value in SearchbyService field "test"
And click on service search button
And click on Services Delete link
And click on services delete OK button
Then verify user lands on Services list page