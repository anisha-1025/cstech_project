Feature: Verify the various options listed under NavigationDropdown like ChangePassword, My Account Details and Logout feature

Scenario Outline: Testing Change password scenario using valid inputs
Given Launch compclinic website
When user clicks on Login link
When user enters Email password "anisha.prasoon@gmail.com" and "Pass@123" value
And user clicks on Login button 
And user clicks on NavigationDropdown
And user clicks on ChangePassword link
And user Enters OldPassowrd"<OldPassword>"
And user Enters NewPassword"<NewPassword>"
And user Enters Confirm New Password"<ConfirmPassword>"
Then user Clicks on ChangePassword button
Then user verifies the message getting displayed with "<scenario>"

Examples:
|OldPassword|NewPassword|ConfirmPassword|scenario|
|Pass@1231|Pass@1234|Pass@1234|invalidOldpassword|
|Pass@123|Pass@111|Pass@131|The new password and confirmation password do not match.|
|Pass@123|Pass@1234|Pass@1234|Change Password Successfully!|


Scenario: Testing MyAccount 
Given Launch compclinic website
When user clicks on Login link
When user enters Email password "anisha.prasoon@clientservertech.ca" and "Pass@123" value
And user clicks on Login button
And user clicks on NavigationDropdown
And user clicks on MyAccount link
Then verify the page title after landing on Account page

Scenario: Testing Logout feature
Given Launch compclinic website
When user clicks on Login link
When user enters Email password "anisha.prasoon@clientservertech.ca" and "Pass@123" value
And user clicks on Login button 
And user clicks on NavigationDropdown
And user clicks on Logout link
Then verify the page_title after logout