Feature: Testing scenarios on Products list page 

Scenario Outline: Verify user performes search functionality 
Given Launch Compclinic Admin Website
And Enter Email "hr@clientservertech.com" value
And Enter Password "pass@123" value
And click on Login button
And Click on Productslist page
And click on Select option 
And choose one option "<dropdownoption>"
And Enter value in SearchbyProduct field "<text>"
And Click on search button
Then Verify the sorted list
Then Close browser
Examples:
|dropdownoption|text|
|Product Name|Dell|
|Price|600|
|Category|Laptops|
|Brand|Motorola|

Scenario: Verify Admin user create new product
Given Launch Compclinic Admin Website
And Enter Email "hr@clientservertech.com" value
And Enter Password "pass@123" value
And click on Login button
And Click on Productslist page
And Click on CreateNew button
And Enter value in fields
|Product_Name|Full_Name|Price|Old_Price|Features1|Features2|Warranty|ImagePath|Category|Brand|
|testproduct|This is a test product 007|777|555|Testing1|Testing2|2 years|C:\Users\PC\Downloads\Delli7.jpg|Laptops|Motorola|
Then Click on create button
Then verify user lands on Productslist page

Scenario: Verify Admin user updates existing product
Given Launch Compclinic Admin Website
And Enter Email "hr@clientservertech.com" value
And Enter Password "pass@123" value
And click on Login button
And Click on Productslist page
And Click on Edit link
And Update the fields
|Price|Warranty|
|999|3 years|
Then Click on Update button
Then verify user lands on Productslist page