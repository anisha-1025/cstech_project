Feature: Verify Dashboard feature 
Scenario: Verify Employee box
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Employee box
Then Verify user lands on page having title "V Care - Employees"
When Close Website

Scenario: Verify Child Box
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Child box
Then Verify user lands on page having title "V Care - Index"
When Close Website

Scenario: Verify Classes Box
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Classes box
Then Verify user lands on page having title "V Care - Classes"
When Close Website

Scenario: Verify Wailist Box
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Waitlist box
Then Verify user lands on page having title "V Care - Waitlist"
When Close Website

Scenario: Verify User lands on Dashboard settings
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Settings dropdown
And select Dashboard settings
And Click on Edit button
And Click on Update button
Then Verify the alert success message with "Updated Successfully"
When Close Website
 
Scenario: Verify Changes password by passing Invalid input 
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Settings dropdown
And Click on Change Password link
And Enter below fields
|Old_Password|New_Password|Confirm_Password|
|Pass@123|Pass@121|Pass@122|
And Click on Change Password Submit button 
Then Verify the alert message with "New Password and Confirm Password should be same!!"
When Close Website


Scenario: Verify Changes password by passing Invalid OldPassword
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Settings dropdown
And Click on Change Password link
And Enter below fields
|Old_Password|New_Password|Confirm_Password|
|Pass@1234|Pass@121|Pass@121|
And Click on Change Password Submit button 
Then Verify the alert message with "Old password is Incorrect!" 
When Close Website

Scenario: Verify Changes password by passing Invalid OldPassword
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Settings dropdown
And Click on Change Password link
And Enter below fields
|Old_Password|New_Password|Confirm_Password|
|Pass@123|Pass@123|Pass@1234|
And Click on Change Password Submit button 
Then Verify the alert message with "Old and New password should not be same!!" 
When Close Website
 
Scenario: Verify Changes password by passing Valid data 
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Settings dropdown
And Click on Change Password link
And Enter below fields
|Old_Password|New_Password|Confirm_Password|
|Pass@123|Pass@121|Pass@121|
And Click on Change Password Submit button 
Then Verify the successfully password change message with "Change Password Confirmation"
Then Click on Login link
Then Verify user lands on Login page
When Close Website

Scenario: Reset Password 
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@121" 
And Click on SignIn button
And Click on Settings dropdown
And Click on Change Password link
And Enter below fields
|Old_Password|New_Password|Confirm_Password|
|Pass@121|Pass@123|Pass@123|
And Click on Change Password Submit button
When Close Website

Scenario: Verify user logouts successfully 
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Settings dropdown
And Click on SignOut link
When Close Website