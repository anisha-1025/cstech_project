Feature: Verify Registered/Non_registered user Purchase workflow

Scenario: Registered user buying an item first time

Given Launch compclinic website
When user clicks on Login link
When user enters Email password "anisha.prasoon@gmail.com" and "Pass@123" value
And user clicks on Login button
And enter "Dell" in searchbar
And click on search button
And click on the item you want to purchase
And click on Add to Cart button
And Enter the fields in shipping address 
|Phone_No|Address_Line1|Address_Line2|City|State/Province|Zip|
|4165581307|2560 Matheson Boulevard|Suite 225|Mississauga|Ontario|50563|
And click on Continue button
And Click on Make Payment button
Then Verify user lands on Payment page
When close site

Scenario: Registered user buying an item using valid coupon first time

Given Launch compclinic website
When user clicks on Login link
When user enters Emaild and Password like "anisha.prasoon@clientservertech.ca" and "Pass@123" value
And user clicks on Login button
And enter "Dell" in searchbar
And click on search button
And click on the item you want to purchase
And click on Add to Cart button
And Enter the fields in shipping address 
|Phone_No|Address_Line1|Address_Line2|City|State/Province|Zip|
|4165581307|2560 Matheson Boulevard|Suite 225|Mississauga|Ontario|50563|
And click on Continue button
And user enters coupon code "2345"
And click on ApplyCoupon button after entering text
Then Verify Coupon code successfully applied message with "Coupon Code Successfully Applied"
And Click on Make Payment button
Then Verify user lands on Payment page
When close site


Scenario: Registered user buying an item using invalid coupon
Given Launch compclinic website
When user clicks on Login link
When user enters Emaild and Password like "anisha.prasoon@gmail.com" and "Pass@123" value
And user clicks on Login button
And enter "Dell" in searchbar
And click on search button
And click on the item you want to purchase
And click on Add to Cart button
And select from existing shipping address
And user enters coupon code "123456789"
And click on ApplyCoupon button after entering text
Then Verify Coupon code successfully applied message with "Invalid Coupon Code"
And Click on Make Payment button
Then Verify user lands on Payment page
When close site

Scenario: Registered user buying an item using existing address
Given Launch compclinic website
When user clicks on Login link
When user enters Emaild and Password like "anisha.prasoon@gmail.com" and "Pass@123" value
And user clicks on Login button
And enter "Dell" in searchbar
And click on search button
And click on the item you want to purchase
And click on Add to Cart button
And select from existing shipping address
And Click on Make Payment button
Then Verify user lands on Payment page
When close site
 
Scenario: Registered user buying an item by editing existing address
Given Launch compclinic website
When user clicks on Login link
When user enters Emaild and Password like "anisha.prasoon@gmail.com" and "Pass@123" value
And user clicks on Login button
And enter "Dell" in searchbar
And click on search button
And click on the item you want to purchase
And click on Add to Cart button
And select the existing shipping address to edit
And Edit the fields in shipping address 
|Full_Name|Phone_No|
|Anisha P|4156243838|
And click on Update button
And select from existing shipping address
And Click on Make Payment button
Then Verify user lands on Payment page
When close site

Scenario: Registered user buying an item by deleting existing address
Given Launch compclinic website
When user clicks on Login link
When user enters Emaild and Password like "anisha.prasoon@gmail.com" and "Pass@123" value
And user clicks on Login button
And enter "Dell" in searchbar
And click on search button
And click on the item you want to purchase
And click on Add to Cart button
And click on shipping address to delete 
And Enter the fields in shipping address
|Phone_No|Address_Line1|Address_Line2|City|State/Province|Zip|
|4165581307|2560 Matheson Boulevard|Suite 225|Mississauga|Ontario|50563|
And click on Continue button
And Click on Make Payment button
Then Verify user lands on Payment page
When close site

Scenario: Registered user buying an item and selects Pickup From this Address
Given Launch compclinic website
When user clicks on Login link
When user enters Emaild and Password like "anisha.prasoon@gmail.com" and "Pass@123" value
And user clicks on Login button
And enter "Dell" in searchbar
And click on search button
And click on the item you want to purchase
And click on Add to Cart button
And click on Pickup from this Address button
And Click on Make Payment button
Then Verify user lands on Payment page
When close site

Scenario Outline: Access links after loggin in
Given Launch compclinic website
When user clicks on Login link
When user enters Emaild and Password like "anisha.prasoon@gmail.com" and "Pass@123" value
And user clicks on Login button
And user clicks on "<links>"
Then verify the "<links>" url with "<expected output>"
When close site
Examples: 
|links|expected output|
|Homelink|Comp Clinic - Index|
|Aboutuslink|Comp Clinic - About|
|Transaction_link|Comp Clinic - Dashboard|
|ServicesDropdown|Comp Clinic - Index|
|Contactlink|Comp Clinic - Contact|

