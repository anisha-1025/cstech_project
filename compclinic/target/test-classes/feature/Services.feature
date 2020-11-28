Feature: Verify links are accessible on Services Dropdown

Scenario Outline: User clicks on links displayed on Services dropdown

Given Launch compclinic website
When user clicks on Login link
When user enters Email password "anisha.prasoon@gmail.com" and "Pass@123" value
And user clicks on Login button
When user clicks on links"<Links>"
Then verify page title with "<ExpectedOutput>"
When close site

Examples: 
|Links|ExpectedOutput|
|Data_Recovery_Services|Data Recovery Services|
|Desktop/Laptop_Repairs|Desktop / Laptop Repairs|
|Ipad_Imac_services|IPad / IMac Services|
|NetworkingServices|Networking Services|
|MobileRepairing|Mobile Repairing|