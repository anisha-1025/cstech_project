Feature: Testing compclinic website

Scenario Outline: Testing New user Registerationfeature using examples

Given Launch compclinic website
When click on Register link 
When Enter firstname,lastname,contactnumber,Emailid, Password, Re_Password like "<fn>", "<ln>", "<cn>", "<em>", "<pwd>", "<re_pwd>" value
And Click on Register Button
Then verify message with "<expectedoutput>"
When close site

Examples:
|fn		 |ln		 |cn				|em						 |pwd		  |re_pwd	 |	case	|		expectedoutput	           |
|anisha|prasoon|4165581307|anisha02.prasoon@clientservertech.ca|Pass@123|Pass@123|Valid	|Registration successfully done| 
|1234!6|prasoon|4165581307|anisha.prasoon1@clientservertech.ca|Pass@123|Pass@123|invalid|Number and Special Character not allowed in First Name| 
|anisha|pra12!!|4165581307|anisha.prasoon1@clientservertech.ca|Pass@123|Pass@123|invalid|Number and Special Character not allowed in Last Name| 
|anisha|prasoon|416558|anisha.prasoon5@clientservertech.ca|Pass@123|Pass@123|invalid|Invalid Mobile no| 
|anisha|prasoon|4165581307|anisha.prasoon@clientservertech.ca|Pass@123|Pass@123|invalid|Email already Registred| 
|anisha|prasoon|4165581307|anisha.prasoon1@clientservertech.ca|Pass@134|Pass@123|invalid|Password and Confirm Password Should Be Match| 
|anisha|prasoon|4165581307|anisha42.prasoon1@clientservertech.ca|Pas@1|Pas@1|invalid|Password should Minimum Six characters, at least one uppercase letter, one lowercase letter and one special character | 

Scenario Outline: Testing login feature

Given Launch compclinic website
When user clicks on Login link
When user enters Emaild and Password like "<em>" and "<pwd>" value
And user clicks on Login button
Then verify login message with "<expectedoutput>" and "<type>"
When close site
Examples: 
|em						              |pwd		  |expectedoutput                |type|
|anisha.prasoon@gmail.com			  |Pass@123	  |Comp Clinic - Index           |valid|
|anihsa.prasoon@clientservertech999.ca|Pass@123456|Invalid Account               |invalid both|
|anisha.prasooon@gmail.com			  |Pass@123   |Invalid Account               |invalid em|
|anisha.prasoon@gmail.com			  |Passs@123  |Invalid User name or Password |invalid pwd|
|anisha4.prasoon@clientservertech.ca  |Pass@123	  |Please verify your email first|invalid|

Scenario Outline: verify Forgot password links on Login page
Given Launch compclinic website
When user clicks on Login link
When user clicks on Forgot password link
And User enters emailid "anisha.prasoon@clientservertech1.ca"
And user clicks on Submit button
Then verify the page title "<title>" getting displayed
When close site
Examples: 
|title|
|Comp Clinic - ForgotPasswordConfirmation|

Scenario Outline: verify Register link on Login page
Given Launch compclinic website
When user clicks on Login link
When user clicks on Register link
Then verify the page title "<title>" getting displayed
When close site
Examples: 
|title|
|Comp Clinic - Register|



