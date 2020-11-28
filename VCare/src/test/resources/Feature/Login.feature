Feature: Verify Login feature with different scenarios
Scenario: Login to application with email verified 
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
Then Verify the landing page title as "V Care - DASHBOARD"
When Close Website

Scenario Outline: Login to application with email not verified, invalid Customerid, invalid Username, invalid Password
Given Launch Vcare application
Then Enter Customerid, Username and Password like "<Customerid>", "<Username>" "<Password>"
And Click on SignIn button
Then Verify the error message with "<expectedoutput>"
When Close Website
Examples: 
|Customerid|Username|Password|expectedoutput|
|40|anisha007.prasoon@gmail.com|Pass@123|Please verify your email first|
|41|anisha007.prasoon@gmail.com|Pass@123|Invalid Account Details|
|40|anisha07.prasoon@gmail.com|Pass@123|Invalid Account Details|
|42|anisha007.prasoon@gmail.com|Pass@121|Invalid Account Details|

Scenario: Verify Register Now link
Given Launch Vcare application
And Click on RegisterNow link
Then Verify the page title
When Close Website

Scenario: Verify ForgotCustomerId/Password link
Given Launch Vcare application
And Click on ForgotCustomerId/Password link
And Enter EmailAddress as "anisha007.prasoon@gmail.com"
Then Click on Submit button
Then Verify the message getting displayed with "We had sent you a mail."
When Close Website

Scenario: Verify SignIn link on ForgotPassword page
Given Launch Vcare application
And Click on ForgotCustomerId/Password link
And Click on SignIn link
Then Verify user lands on Login page
When Close Website