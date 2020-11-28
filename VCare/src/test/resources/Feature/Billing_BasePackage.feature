Feature: Verify Billing tabs
Scenario: 1.Add a Inactive BasePackage
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Billing tab
And Click on BasePackage tab
And Click on AddBasePackage button
And Enter value in below fields
|Package_Name|Applicable_Class|Amount|Tax|Description|
|TestAutomation|Toddler|500|GST|This is automation created Base Package|
And Click on Package_ADD button
Then Verify the successful alert message as "Added Successfully"

Scenario: 2.Add a Active BasePackage
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Billing tab
And Click on BasePackage tab
And Click on AddBasePackage button
And Enter value in below fields
|Package_Name|Applicable_Class|Amount|Tax|Description|
|ActiveTestAutomation|Infant|500|GST|This is automation created Active Base Package|
And Click on Active checkbox
And Click on Package_ADD button
Then Verify the successful alert message as "Added Successfully"

Scenario: 3.Edit a Active BasePackage
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Billing tab
And Click on BasePackage tab
And Search a Package "ActiveTestAutomation"
And Click on Edit link for respective package
And Update value in below fields
|Applicable_Class|Tax|
|Pre-schOOl|IGST|
And Click on Package_Update button
Then Verify the successful alert message as "Updated Successfully"

Scenario: 4.Delete a Active BasePackage
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Billing tab
And Click on BasePackage tab
And Search a Package "ActiveTestAutomation"
And Click on Delete link for respective package
And Click on Package_Delete Yes button
Then Verify the successful alert message as "Deleted Successfully"

Scenario: 5.Delete a BasePackage which is in use
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Billing tab
And Click on BasePackage tab
And Search a Package "5 days a week Toddler package"
And Click on Delete link for respective package
And Click on Package_Delete Yes button
Then Verify the alert message as "Package is in use for one of child"