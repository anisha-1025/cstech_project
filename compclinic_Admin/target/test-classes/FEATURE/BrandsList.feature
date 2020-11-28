Feature: Testing scenarios on Brands list page
Scenario Outline: Verify Admin user searches Brands using Brands Name
Given Launch Compclinic Admin Website
And Enter Email "hr@clientservertech.com" value
And Enter Password "pass@123" value
And click on Login button
And click on BrandsList page
And select value from Dropdwon "Brand Name"
And Enter value in SearchbyCategory field "<brand>"
And Click on search button
Then Verify Brands page after search with "<brand>"
Examples: 
|brand|
|Apple|
|Lenovo|

Scenario: Verify Admin user creates a New Category
Given Launch Compclinic Admin Website
And Enter Email "hr@clientservertech.com" value
And Enter Password "pass@123" value
And click on Login button
And click on BrandsList page
And Click on CreateNew Brand button
And Enter BrandName "Brandtest"
Then click on CreateBrand button
Then Verify user lands on Brands page

Scenario: Verify Admin user Edits existing Category
Given Launch Compclinic Admin Website
And Enter Email "hr@clientservertech.com" value
And Enter Password "pass@123" value
And click on Login button
And click on BrandsList page
And Enter value in SearchbyCategory field "Brandtest"
And Click on search button
And Click on Brand Edit link under Actions tab
And Enter New Brand Value "Brandtesting"
And click on Update Brand button
Then Verify user lands on Brands page

Scenario: Verify Admin user Edits existing Category
Given Launch Compclinic Admin Website
And Enter Email "hr@clientservertech.com" value
And Enter Password "pass@123" value
And click on Login button
And click on BrandsList page
And Enter value in SearchbyCategory field "Brandtesting"
And Click on search button
And Click on Brand Delete link under Actions tab
And click on Brand Delete OK button
Then Verify user lands on Brands page