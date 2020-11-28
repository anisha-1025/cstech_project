#Feature: Verify Login feature with different scenarios
#Scenario: 1.Generate Invoice for Individual child 
#Given Launch Vcare application
#Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
#And Click on SignIn button
#And Click on Billing tab
#And Click on GenerateInvoice tab
#And Select below 4 options
#|Class|Child|Month|Year|
#|Infant|ankit shah|May|2020|
#And Click on GenerateInvoice button
#Then Verify the successful alert message as "Successfully Invoice Generated"
#
#Scenario: 2.Generate Invoice for entire class 
#Given Launch Vcare application
#Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
#And Click on SignIn button
#And Click on Billing tab
#And Click on GenerateInvoice tab
#And Select below 3 options
#|Class|Month|Year|
#|Toddler|June|2020|
#And Click on GenerateInvoice button
#Then Verify the successful alert message as "Successfully all Invoices Generated!!!"
#
#Scenario: 3. Generate Invoice for entire class where Invoice is already generated for few childs.
#Given Launch Vcare application
#Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
#And Click on SignIn button
#And Click on Billing tab
#And Click on GenerateInvoice tab
#And Select below 3 options
#|Class|Month|Year|
#|Toddler|March|2020|
#And Click on GenerateInvoice button
#Then Verify the alert message as "Invoice for some of Child(s) in this Class has been already generated for the selected month. Please Generate Invoice Individually for other records"
#
#Scenario: 4. Generate Invoice for child whose invoice is  already generated
#Given Launch Vcare application
#Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
#And Click on SignIn button
#And Click on Billing tab
#And Click on GenerateInvoice tab
#And Select below 4 options
#|Class|Child|Month|Year|
#|Infant|Ria Soni|April|2020|
#And Click on GenerateInvoice button
#Then Verify the alert message as "Invoice for this Child has been already generated for the selected month"
#
#Scenario: 5. Generate Invoice for Next Month/Year
#Given Launch Vcare application
#Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
#And Click on SignIn button
#And Click on Billing tab
#And Click on GenerateInvoice tab
#And Select below 4 options
#|Class|Child|Month|Year|
#|Infant|Ria Soni|July|2020|
#And Click on GenerateInvoice button
#Then Verify the alert message as "You can't select future dates"
#
#Scenario: 6. Generate Invoice for Previous Month(Date is not within Enrollment date')
#Given Launch Vcare application
#Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
#And Click on SignIn button
#And Click on Billing tab
#And Click on GenerateInvoice tab
#And Select below 4 options
#|Class|Child|Month|Year|
#|Infant|Ria Soni|February|2020|
#And Click on GenerateInvoice button
#Then Verify the alert message as "Child Enrollment date"
#
#Scenario: 7. Email Invoice to Guardians, child whose invoice is not generated
#Given Launch Vcare application
#Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
#And Click on SignIn button
#And Click on Billing tab
#And Click on GenerateInvoice tab
#And Select below 4 options
#|Class|Child|Month|Year|
#|Pre-school|ashish soni|June|2020|
#And Click on EmailInvoiceToGuardians checkbox button
#And Click on GenerateInvoice button
#Then Verify the successful alert message as "Successfully Generated and sent to Primary Contact!!!"
#
#Scenario: 8. Email Invoice to Guardians, child whose invoice is already genearted
#Given Launch Vcare application
#Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
#And Click on SignIn button
#And Click on Billing tab
#And Click on GenerateInvoice tab
#And Select below 4 options
#|Class|Child|Month|Year|
#|Infant|Ria Soni|May|2020|
#And Click on EmailInvoiceToGuardians checkbox button
#And Click on GenerateInvoice button
#Then Verify the alert message as "Invoice for this Child has been already generated for the selected month"

