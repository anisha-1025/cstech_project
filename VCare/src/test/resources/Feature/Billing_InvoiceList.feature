Feature: Verify User is able to view Child invoice
Scenario: 1.Generate Invoice for Individual child 
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Billing tab
And Click on InvoiceList tab
And Enter Child name "dhruvi soni"
And Click on View Details link
Then Verify user page title as "V Care - Invoice Details"
