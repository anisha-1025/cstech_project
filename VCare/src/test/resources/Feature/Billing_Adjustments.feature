Feature: Verify Billing-Adjustments tab
Scenario: 1. Add an Adjustments Charge
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Billing tab
And Click on Adjustments tab
And Click on AddAdjustment button
And Enter value in below Adjsutment fields
|AdjustDate|AdjustType|ApplicableOn|Description|Amount|
|2020-06-10|Deposit|Ria|This is automation created Adjustmets|100|
And Click on Adjustment_ADD button
Then Verify the successful alert message as "Added Successfully"

Scenario: 2. Edit an Adjustments Charge
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Billing tab
And Click on Adjustments tab
And Seacrh an Adjustment "Ria"
And Click on Edit link for respective adjustment
And Update value in below Adjsutment fields
|AdjustDate|Description|
|2020-06-15|This is automation created updated Adjustment|
And Click on Adjustment_UPDATE button
Then Verify the successful alert message as "Updated Successfully"

Scenario: 3. Delete an Adjustments Charge
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Billing tab
And Click on Adjustments tab
And Seacrh an Adjustment "Ria"
And Click on Delete link for respective adjustment
And Click on Adjustment_Delete_YES confirmation button
Then Verify the successful alert message as "Deleted Successfully"
