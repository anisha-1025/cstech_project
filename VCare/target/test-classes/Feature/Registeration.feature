Feature: Verify Registeration feature with different scenarios
Scenario Outline: Register a new user
Given Launch Vcare application
When Click on Register Now link
Then Enter Values in below fields "<First_Name>","<Last_Name>","<Email_address>","<Phone_No>","<Password>","<ReEnter_Password>"
And Click on Sign up button
Then Verify the Message with "<scenario>" and "<expected_output>"
When Close Website
Examples: 
|First_Name|Last_Name|Email_address|Phone_No|Password|ReEnter_Password|scenario|expected_output|
|Mary|Kom|anisha.prasoon9@clientservertech.ca|4374378909|Pass@123|Pass@123|Valid|Registration successfully done. Account activation link has been sent to your email id:|
|Mary@2|Kom|anisha.prasoon@clientservertech.ca|4374378909|Pass@123|Pass@123|Invalid|Number and Special Character not allowed in First Name |
|Mary|Kom@2|anisha.prasoon@clientservertech.ca|4374378909|Pass@123|Pass@123|Invalid|Number and Special Character not allowed in Last Name |
|Mary|Kom|anisha.prasoon@gmail.com|4374378909|Pass@123|Pass@123|Invalid|Email already Registered|
|Mary|Kom|anisha.prasoon@gmail.com|437437|Pass@123|Pass@123|Invalid|Invalid Mobile no|
|Mary|Kom|anisha.prasoon@clientservertech.ca|4374378909|pass|pass|Invalid|Password should have Minimum Six characters and At least one uppercase letter, one lowercase letter and one special character |
|Mary|Kom|anisha.prasoon@clientservertech.ca|4374378909|pass@123|pass@123|Invalid|Password should have Minimum Six characters and At least one uppercase letter, one lowercase letter and one special character |
|Mary|Kom|anisha.prasoon@clientservertech.ca|4374378909|Pass123|Pass123|Invalid|Password should have Minimum Six characters and At least one uppercase letter, one lowercase letter and one special character |
|Mary|Kom|anisha.prasoon@clientservertech.ca|4374378909|Pass@123|Pass@223|Invalid|Password and Confirm Password Should Match|


Scenario: Verify user already have a membership
Given Launch Vcare application
When Click on Register Now link
Then Click on You already have a membership link
Then Verify user lands on Login page
When Close Website