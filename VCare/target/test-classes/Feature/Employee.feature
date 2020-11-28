@Funtional
Feature: Verify Employee tab
@Smoke
Scenario: 1.Add an Employee by entering values in all fields 
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Employee tab
And Click on Employee List tab
And Click on Add Employee button
And Enter the values on Primary Info page
|empfirstname|emplastname|gender|profilepic|DOB|Designation|SecurityProfile|Shift|DateofJoining|DateofLeaving|SSN|
|Tejas|Desai|male|C:\Users\PC\Downloads\babypics.jpg|1990-02-05|DayCare Director|Admin|Morning|2020-01-01|2021-01-01|567|
And Click on Next buton
And Enter the values on Contact Details page
|Street|City|State|Zip|Phone_Home|Email|
|Clara Dr|Mississauga|Ontario|50563|7863456789|tejas.desai@gmail.com|
And Click on Next button
And Enter values on Emergency Contacts page
|Person|Relationship|EmergencyPhone1|
|John|Father|5678904567|
And Click on Next button
And Enter Values on Login Details page
|username|password|confpassword|
|tejasdesai|Pass@123|Pass@123|
And Click on Employee submit page
Then Verify the successful alert message as "Inserted Successfully"

Scenario: 2. Verify password and Confirm pwd alert 
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Employee tab
And Click on Employee List tab
And Click on Add Employee button
And Enter the values on Primary Info page
|empfirstname|emplastname|gender|profilepic|DOB|Designation|SecurityProfile|Shift|DateofJoining|DateofLeaving|SSN|
|Shikha|Desai|male|C:\Users\PC\Downloads\babypics.jpg|1990-02-05|DayCare Director|Admin|Morning|2020-01-01|2021-01-01|567|
And Click on Next buton
And Enter the values on Contact Details page
|Street|City|State|Zip|Phone_Home|Email|
|Clara Dr|Mississauga|Ontario|50563|7863456789|Shikha.desai@gmail.com|
And Click on Next button
And Enter values on Emergency Contacts page
|Person|Relationship|EmergencyPhone1|
|John|Father|5678904567|
And Click on Next button
And Enter Values on Login Details page
|username|password|confpassword|
|shikhadesai|Pass@123|Pass@1234|
And Click on Employee submit page
Then Verify the alert popup message as "Password and Confirm Password should be same"

Scenario: 3.Update an Employee details 
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Employee tab
And Click on Employee List tab
And Search for an employee "Saloni"
And click on Edit link for respective employee
And Update the values on Primary Info page
|Designation|SecurityProfile|Shift|
|Administrative Assistant|Employee|Afternoon|
And Click on Next buton
And Click on Next button
And Click on Next button
And Click on Employee Update button
Then Verify the successful alert message as "Updated Successfully"

Scenario: 4.Delete an Employee details 
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Employee tab
And Click on Employee List tab
And Search for an employee "Tejas"
And Click on Delete link
And Click on Delete YES button
Then Verify the successful alert message as "Deleted Successfully"

Scenario: 5.Verify Employee Check-IN/Check-OUT 
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "annamary" "Pass@123" 
And Click on SignIn button
And Click on Employee tab
And Click on Employee Attendance tab
And Click on CheckIn button
And Click on CheckIn YES button
Then Verify the successful alert message as "Checked in Successfully"

Scenario: 6.Verify Employee Check-IN/Check-OUT 
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "annamary" "Pass@123" 
And Click on SignIn button
And Click on Employee tab
And Click on Employee Attendance tab
And Click on CheckOut button
And Click on CheckOut YES button
Then Verify the successful alert message as "Checked out Successfully"

Scenario: 7.Verify Adding a Shift 
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Employee tab
And Click on Employee Shift tab
And Click on AddNewShift button
And Enter Value in below fields to add shift
|ShiftName|StartTime|EndTime|
|WEEKENDShift|0800AM|0500PM|
And Click on ADD button
Then Verify the successful alert message as "Inserted Successfully"

Scenario: 8.Verify Updating a Shift 
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Employee tab
And Click on Employee Shift tab
And Search a shift "WEEKENDShift"
And Click on ShiftEdit link
And update Value for ShiftName as "WEEKEND"
And Click on UPDATE button
Then Verify the successful alert message as "Updated Successfully"

Scenario: 9.Verify Deleting a Shift 
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Employee tab
And Click on Employee Shift tab
And Search a shift "WEEKEND"
And Click on ShiftDelete link
And Click on Shift_Delete Yes button
Then Verify the successful alert message as "Deleted Successfully"

Scenario: 10.Verify Deleting a Shift which is in use
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Employee tab
And Click on Employee Shift tab
And Search a shift "Morning"
And Click on ShiftDelete link
And Click on Shift_Delete Yes button
Then Verify the alert message as "Shift is in use"

