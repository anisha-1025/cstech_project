Feature: Verify Billing-Discount Charges tab
Scenario: 1.Add an Active Discount
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Billing tab
And Click on Discount tab
And Click on Add Discount button
And Enter Discount value in below fields
|DiscountName|Description|DiscountValue|
|AutomationActiveDiscount|This is automation created Discount|10|
And Select Active option
And Click on Discount_ADD button
Then Verify the successful alert message as "Added Successfully"

Scenario: 2.Add a Limited Period Discount
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Billing tab
And Click on Discount tab
And Click on Add Discount button
And Select Active option
And Enter Discount value in below fields
|DiscountName|Description|DiscountValue|
|AutomationLimitedPeriodDiscount|This is automation created Discount|5|
And Select Limited Period offer
And Enter Start Date and End Date
|Start_Date|End_Date|
|2020-05-15|2020-09-10|
And Click on Discount_ADD button
Then Verify the successful alert message as "Added Successfully"

Scenario: 3.Edit a Discount
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Billing tab
And Click on Discount tab
And Search a Discount "AutomationActiveDiscount"
And Click on Edit link for respective discount
And Update Discount value in below fields
|Description|DiscountValue|
|Updated Discount|15|
And Click on Discount_Update button
Then Verify the successful alert message as "Updated Successfully"
#
Scenario: 4. Delete a Discount
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Billing tab
And Click on Discount tab
And Search a Discount "AutomationActiveDiscount"
And Click on Delete link for respective discount
And Click on Discount_Delete_YES button
Then Verify the successful alert message as "Deleted Successfully"

Scenario: 5. Create a Discount by selecting all options on Discount
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Billing tab
And Click on Discount tab
And Click on Add Discount button
And Enter Discount value in below fields
|DiscountName|Description|DiscountValue|
|AutomationSelectALLDiscount|This is automation created Discount|20|
And Select Active option
And Select AllOptions under Applicable On sections
And Click on Discount_ADD button
Then Verify the successful alert message as "Added Successfully"