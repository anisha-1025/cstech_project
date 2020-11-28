Feature: Verify Billing-Additional Charges tab
Scenario: 1.Closeout child whose Invoice is generated but has payment dues
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@1234" 
And Click on SignIn button
And Click on Billing tab
And Click on Child_Closeout tab
And Select child details from dropdown
|Class|Child|
|Infant|Ria Soni|
And Click on CalculateDues_ReturnDeposit button
Then Verify the text message getting displayed "Child need to pay balance amount:"
And Click on Closeout_Payment_button
Then Verify User lands on Payment Page "V Care - Payments"


Scenario: 2.Closeout child whose Invoice is not generated
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@1234" 
And Click on SignIn button
And Click on Billing tab
And Click on Child_Closeout tab
And Select child details from dropdown
|Class|Child|
|Pre-school|discountone inactivetest|
And Click on CalculateDues_ReturnDeposit button
Then Verify the alert message as "Present month invoice is missing. Please generate it and then calculate."


Scenario: 3.Closeout child whose Payment is Clear
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@1234" 
And Click on SignIn button
And Click on Billing tab
And Click on Child_Closeout tab
And Select child details from dropdown
|Class|Child|
|Pre-school|discountone inactivetest|
And Click on CalculateDues_ReturnDeposit button
Then Verify the text message getting displayed "Payments are clear, you can closeout child"
#And Click on Closeout button