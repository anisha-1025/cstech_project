Feature: Verify Billing-Additional Charges tab
Scenario: 1.Add an Additional Charge
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Billing tab
And Click on Additional Charge tab
And Click on AddAdditionalCharge button
And Enter value in below Additional Charges fields
|ChargeName|Date|Applicable_on|ApplicableRef|Description|Amount|Tax|
|EasterEvent|2020-05-31|Class|Toddler|This is automation created Additionalcharges|100|8.00|
And Click on Additionalcharge_ADD button
Then Verify the successful alert message as "Added Successfully"


Scenario: 2.Edit an Additional Charge
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Billing tab
And Click on Additional Charge tab
And Search an AdditionalCharge "EasterEvent"
And Click on Additional Charge Edit link
And Update value in below Additional Charges fields
|Applicable_on|ApplicableRef|
|Class|Infant|
And Click on AdditionalCharges_UPDATE button
Then Verify the successful alert message as "Updated Successfully"

Scenario: 3.Delete an Additional Charge
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Billing tab
And Click on Additional Charge tab
And Search an AdditionalCharge "EasterEvent"
And Click on Additional Charge Delete link
And Click on Additional Charge YES buton
Then Verify the successful alert message as "Deleted Successfully"
