Feature: Testing scenarios on Coupons list page 

Scenario Outline: Verify user performes search functionality 
Given Launch Compclinic Admin Website
And Enter Email "hr@clientservertech.com" value
And Enter Password "pass@123" value
And click on Login button
And click on Coupons list page
And select value from Dropdwon "<dropdown_option>"
And Enter value in SearchbyCoupon field "<value>"
And click on coupon search button
Then Verify Coupons page after search done with "<dropdown_option>" and "<value>"
Then Close browser
Examples:
|dropdown_option|value|
|Product|Dell|
|Coupon Code|678910|
|Coupon Amt|100|

Scenario: Verify user creates new coupon
Given Launch Compclinic Admin Website
And Enter Email "hr@clientservertech.com" value
And Enter Password "pass@123" value
And click on Login button
And click on Coupons list page
And Click on CreateNew Coupon button
And Enter data in below fields
|Product|Coupon_Code|Coupon_Amount|Discount_Type|Usage_Limit|Expiry_Date|Description|
|Dell|testcoupon|100|Fixed|2|002020-01-31|this is test coupon|
Then click on Create Coupon button
Then Verify user lands on Coupons page
Then Close browser

Scenario: Verify user creates new coupon
Given Launch Compclinic Admin Website
And Enter Email "hr@clientservertech.com" value
And Enter Password "pass@123" value
And click on Login button
And click on Coupons list page
And select value from Dropdwon "Coupon Code"
And Enter value in SearchbyCoupon field "testcoupon"
And click on coupon search button
And click on coupon edit link 
And update fields with below values
|Coupon_Amount|Description|
|143|this is updated test coupon|
Then click on Update coupon button
Then Verify user lands on Coupons page
Then Close browser

Scenario: Verify user creates new coupon
Given Launch Compclinic Admin Website
And Enter Email "hr@clientservertech.com" value
And Enter Password "pass@123" value
And click on Login button
And click on Coupons list page
And select value from Dropdwon "Coupon Code"
And Enter value in SearchbyCoupon field "testcoupon"
And click on coupon search button
And click on coupon delete link
And click on Coupon_Delete_OK button
Then Verify user lands on Coupons page
Then Close browser