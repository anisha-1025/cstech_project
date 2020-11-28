Feature: Testing scenarios on Categories list page
Scenario Outline: Verify Admin user searches categories using Category Name
Given Launch Compclinic Admin Website
And Enter Email "hr@clientservertech.com" value
And Enter Password "pass@123" value
And click on Login button
And click on CategoriesList page
And Enter value in SearchbyCategory field "<category>"
And Click on search button
Then Verify Categories page after search "<category>"
Examples: 
|category|
|Computer/ PC|
|Laptops|
|Tablets|


Scenario: Verify Admin user creates a New Category
Given Launch Compclinic Admin Website
And Enter Email "hr@clientservertech.com" value
And Enter Password "pass@123" value
And click on Login button
And click on CategoriesList page
And Click on CreateNew button
And Enter CategoryName "test"
Then click on CreateCategory button
Then Verify user lands on Categories page

Scenario: Verify Admin user Edits existing Category
Given Launch Compclinic Admin Website
And Enter Email "hr@clientservertech.com" value
And Enter Password "pass@123" value
And click on Login button
And click on CategoriesList page
And Enter value in SearchbyCategory field "test"
And Click on search button
And Click on Edit link under Actions tab
And Enter New category Value "testing"
And click on Update Category button
Then Verify user lands on Categories page


Scenario: Verify Admin user deletes an existing Category
Given Launch Compclinic Admin Website
And Enter Email "hr@clientservertech.com" value
And Enter Password "pass@123" value
And click on Login button
And click on CategoriesList page
And Enter value in SearchbyCategory field "testing"
And Click on search button
And Click on Category Delete link under Actions tab
And click on Category Delete OK button
Then Verify user lands on Categories page