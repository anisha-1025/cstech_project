Feature: User buys product from ShopPage 

Scenario: User buys Computer/Pc
Given Launch compclinic website
When user clicks on Login link
When user enters Email password "anisha.prasoon@gmail.com" and "Pass@123" value
And user clicks on Login button
And user clicks on Computer/Pc link
And User clicks on Gaming pc
And click on Add to Cart button
And select from existing shipping address
And user enters coupon code "2345"
And click on ApplyCoupon button after entering text
Then Verify Coupon code successfully applied message with "Coupon Code Successfully Applied"
And Click on Make Payment button
Then Verify user lands on Payment page
#When close site

Scenario: User buys Laptop
Given Launch compclinic website
When user clicks on Login link
When user enters Email password "anisha.prasoon@gmail.com" and "Pass@123" value
And user clicks on Login button
And user clicks on Laptop link
And user clicks on Lenovo laptop
And click on Add to Cart button
And select from existing shipping address
And user enters coupon code "2345"
And click on ApplyCoupon button after entering text
Then Verify Coupon code successfully applied message with "Coupon Code Successfully Applied"
And Click on Make Payment button
Then Verify user lands on Payment page
#When close site


Scenario: User buys Tablet
Given Launch compclinic website
When user clicks on Login link
When user enters Email password "anisha.prasoon@gmail.com" and "Pass@123" value
And user clicks on Login button
And user clicks on Tablets link
And User clicks on Samsung Tablet
And click on Add to Cart button
And select from existing shipping address
And user enters coupon code "2345"
And click on ApplyCoupon button after entering text
Then Verify Coupon code successfully applied message with "Coupon Code Successfully Applied"
And Click on Make Payment button
Then Verify user lands on Payment page
#When close site

Scenario Outline: User clicks on links displayed on Services dropdown

Given Launch compclinic website
When user clicks on Login link
When user enters Email password "anisha.prasoon@gmail.com" and "Pass@123" value
And user clicks on Login button
When user clicks on links"<Links>"
Then verify page title with "<ExpectedOutput>"
#When close site

Examples: 
|Links|ExpectedOutput|
|Computer/PC|Computer/ PC|
|Laptops|Laptops|
|Tablets|Tablets|