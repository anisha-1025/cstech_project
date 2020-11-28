Feature: Verify Login feature with different scenarios
#Scenario: 1.Add a child by entering values in all fields 
#Given Launch Vcare application
#Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
#And Click on SignIn button
#And Click on Children tab
#And Click on Children List tab
#And Click on Add Child button
#And Enter the values on Basic Info page
#|childcode|childfirstname|childlastname|profilepic|nickname|gender|DOB|SSN|Height|Weight|EyesColor|HairStyle|Religion|Meal|Notes|
#|66|Lawrence|Mathew|C:\Users\PC\Downloads\babypics.jpg|JA|male|002018-02-05|567|75cm|11kg|Brown|Side Partition|Hinduism|Veg|Child is little shy|
#And Expand Enrollment section 
#And Enter the values on Enrollment section
#|Enrollment_Date|Class|Package|Discount|Camp|
#|002020-05-01|Toddler|5 days a week Toddler package|Summer Discount|Spring Camp|
#And Click on Next button
#And Enter values on Primary Guardian section
#|ParentFirstName|ParentLastName|SSN|ProfilePic|RelationShip|P_Street|P_City|P_State|P_Zip|P_PhoneHome|EmailAddress|ParentCompanyName|Work_Street|Work_City|Work_State|Work_Zip|Occupation|Work_Phone|LoginName|Password|ConfPassword|
#|anisha|prasoon|678|C:\Users\PC\Downloads\babypics.jpg|Mother|CatalpaRd|Mississauga|Ontario|50563|4567829303|an30isha.prasoon@gmail.com|Cstech|MathesonBlvd|Mississauga|Ontario|50563|Bank Manager|3678909874|lawrence|Pass@123|Pass@123|
#And Expand Other Guardian section
#And Enter values on Other Guardian section
#|OGFirstName|OGLastName|OGSSN|OGProfilePic|OGRelationShip|OG_Street|OG_City|OG_State|OG_Zip|OG_Country|OG_PhoneHome|OG_EmailAddress|OG_CompanyName|OG_Work_Street|OG_Work_City|OG_Work_State|OG_Work_Zip|OG_Occupation|OG_Work_Phone|
#|ani|soni|128|C:\Users\PC\Downloads\babypics.jpg|Father|CatalpaRd|Mississauga|Ontario|50563|CA|4567829303|an0isha.prasoon@gmail.com|Cstech|MathesonBlvd|Mississauga|Ontario|50563|Business|3678909874|
#And Click on EmergencyContact
#And Click on AllowedToPickup
#And Click on Next button
#And Click on DoctorInsurance tab
#And Enter value in below doctorinsurance field
#|Doctor_Name|Phone|Address|HospitalPreferred|HealthInsurancePolicyCarrier|PolicyNumber|PhoneNumber|
#|Dr. Mehta|4567890456|Goreway Drive, ON, 50563|STAR HOSPITAL|LIC|A098909|4567890987|
#And Click on Next button
#And Click on DoNotUseTransportation checkbox
#And Click on AddChild_Submit button
#Then Verify the successful alert message as "Child Added Successfully"
#When Close Website
#
#Scenario: 2. Add a child of Age less than 18 months in Toddler class 
#Given Launch Vcare application
#Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
#And Click on SignIn button
#And Click on Children tab
#And Click on Children List tab
#And Click on Add Child button
#And Enter the values on Basic Info page
#|childcode|childfirstname|childlastname|profilepic|nickname|gender|DOB|SSN|Height|Weight|EyesColor|HairStyle|Religion|Meal|Notes|
#|200|Colin|George|C:\Users\PC\Downloads\babypics.jpg|JA|male|002019-03-05|567|75cm|11kg|Brown|Side Partition|Hinduism|Veg|Child is little shy|
#And Expand Enrollment section 
#And Enter the values on Enrollment section
#|Enrollment_Date|Class|Package|Discount|Camp|
#|002020-05-01|Toddler|5 days a week Toddler package|Summer Discount|Spring Camp|
#And Click on Next button
#And Enter values on Primary Guardian section
#|ParentFirstName|ParentLastName|SSN|ProfilePic|RelationShip|P_Street|P_City|P_State|P_Zip|P_PhoneHome|EmailAddress|ParentCompanyName|Work_Street|Work_City|Work_State|Work_Zip|Occupation|Work_Phone|LoginName|Password|ConfPassword|
#|nisha|shah|678|C:\Users\PC\Downloads\babypics.jpg|Mother|CatalpaRd|Mississauga|Ontario|50563|4567829303|anisha200.prasoon@gmail.com|Cstech|MathesonBlvd|Mississauga|Ontario|50563|Bank Manager|3678909874|colingeorge|Pass@123|Pass@123|
#And Expand Other Guardian section
#And Enter values on Other Guardian section
#|OGFirstName|OGLastName|OGSSN|OGProfilePic|OGRelationShip|OG_Street|OG_City|OG_State|OG_Zip|OG_Country|OG_PhoneHome|OG_EmailAddress|OG_CompanyName|OG_Work_Street|OG_Work_City|OG_Work_State|OG_Work_Zip|OG_Occupation|OG_Work_Phone|
#|ani|soni|128|C:\Users\PC\Downloads\babypics.jpg|Father|CatalpaRd|Mississauga|Ontario|50563|CA|4567829303|an3isha.prasoon@gmail.com|Cstech|MathesonBlvd|Mississauga|Ontario|50563|Business|3678909874|
#And Click on EmergencyContact
#And Click on AllowedToPickup
#And Click on Next button
#And Click on DoctorInsurance tab
#And Enter value in below doctorinsurance field
#|Doctor_Name|Phone|Address|HospitalPreferred|HealthInsurancePolicyCarrier|PolicyNumber|PhoneNumber|
#|Dr. Mehta|4567890456|Goreway Drive, ON, 50563|STAR HOSPITAL|LIC|A098909|4567890987|
#And Click on Next button
#And Click on DoNotUseTransportation checkbox
#And Click on AddChild_Submit button
#Then Verify the alert message as "Age limit should be in between 18 and 30 months"
##When Close Website
#
#Scenario: 3. Add a child of Age more 18 months in Infant class 
#Given Launch Vcare application
#Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
#And Click on SignIn button
#And Click on Children tab
#And Click on Children List tab
#And Click on Add Child button
#And Enter the values on Basic Info page
#|childcode|childfirstname|childlastname|profilepic|nickname|gender|DOB|SSN|Height|Weight|EyesColor|HairStyle|Religion|Meal|Notes|
#|200|Colin|George|C:\Users\PC\Downloads\babypics.jpg|JA|male|002018-03-05|567|75cm|11kg|Brown|Side Partition|Hinduism|Veg|Child is little shy|
#And Expand Enrollment section 
#And Enter the values on Enrollment section
#|Enrollment_Date|Class|Package|Discount|Camp|
#|002020-05-01|Infant|5 days a week Infant package|Summer Discount|Spring Camp|
#And Click on Next button
#And Enter values on Primary Guardian section
#|ParentFirstName|ParentLastName|SSN|ProfilePic|RelationShip|P_Street|P_City|P_State|P_Zip|P_PhoneHome|EmailAddress|ParentCompanyName|Work_Street|Work_City|Work_State|Work_Zip|Occupation|Work_Phone|LoginName|Password|ConfPassword|
#|nisha|shah|678|C:\Users\PC\Downloads\babypics.jpg|Mother|CatalpaRd|Mississauga|Ontario|50563|4567829303|anisha200.prasoon@gmail.com|Cstech|MathesonBlvd|Mississauga|Ontario|50563|Bank Manager|3678909874|colingeorge|Pass@123|Pass@123|
#And Expand Other Guardian section
#And Enter values on Other Guardian section
#|OGFirstName|OGLastName|OGSSN|OGProfilePic|OGRelationShip|OG_Street|OG_City|OG_State|OG_Zip|OG_Country|OG_PhoneHome|OG_EmailAddress|OG_CompanyName|OG_Work_Street|OG_Work_City|OG_Work_State|OG_Work_Zip|OG_Occupation|OG_Work_Phone|
#|ani|soni|128|C:\Users\PC\Downloads\babypics.jpg|Father|CatalpaRd|Mississauga|Ontario|50563|CA|4567829303|an3isha.prasoon@gmail.com|Cstech|MathesonBlvd|Mississauga|Ontario|50563|Business|3678909874|
#And Click on EmergencyContact
#And Click on AllowedToPickup
#And Click on Next button
#And Click on DoctorInsurance tab
#And Enter value in below doctorinsurance field
#|Doctor_Name|Phone|Address|HospitalPreferred|HealthInsurancePolicyCarrier|PolicyNumber|PhoneNumber|
#|Dr. Mehta|4567890456|Goreway Drive, ON, 50563|STAR HOSPITAL|LIC|A098909|4567890987|
#And Click on Next button
#And Click on DoNotUseTransportation checkbox
#And Click on AddChild_Submit button
#Then Verify the alert message as "Age limit should be in between 0 and 18 months"
##When Close Website
#
#Scenario: 4. Add a child of Age less 30 months in preschool class 
#Given Launch Vcare application
#Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
#And Click on SignIn button
#And Click on Children tab
#And Click on Children List tab
#And Click on Add Child button
#And Enter the values on Basic Info page
#|childcode|childfirstname|childlastname|profilepic|nickname|gender|DOB|SSN|Height|Weight|EyesColor|HairStyle|Religion|Meal|Notes|
#|200|Colin|George|C:\Users\PC\Downloads\babypics.jpg|JA|male|002019-03-05|567|75cm|11kg|Brown|Side Partition|Hinduism|Veg|Child is little shy|
#And Expand Enrollment section 
#And Enter the values on Enrollment section
#|Enrollment_Date|Class|Package|Discount|Camp|
#|002020-05-01|Pre-school|5 days of week Preschool package|Summer Discount|Spring Camp|
#And Click on Next button
#And Enter values on Primary Guardian section
#|ParentFirstName|ParentLastName|SSN|ProfilePic|RelationShip|P_Street|P_City|P_State|P_Zip|P_PhoneHome|EmailAddress|ParentCompanyName|Work_Street|Work_City|Work_State|Work_Zip|Occupation|Work_Phone|LoginName|Password|ConfPassword|
#|nisha|shah|678|C:\Users\PC\Downloads\babypics.jpg|Mother|CatalpaRd|Mississauga|Ontario|50563|4567829303|anisha200.prasoon@gmail.com|Cstech|MathesonBlvd|Mississauga|Ontario|50563|Bank Manager|3678909874|colingeorge|Pass@123|Pass@123|
#And Expand Other Guardian section
#And Enter values on Other Guardian section
#|OGFirstName|OGLastName|OGSSN|OGProfilePic|OGRelationShip|OG_Street|OG_City|OG_State|OG_Zip|OG_Country|OG_PhoneHome|OG_EmailAddress|OG_CompanyName|OG_Work_Street|OG_Work_City|OG_Work_State|OG_Work_Zip|OG_Occupation|OG_Work_Phone|
#|ani|soni|128|C:\Users\PC\Downloads\babypics.jpg|Father|CatalpaRd|Mississauga|Ontario|50563|CA|4567829303|an3isha.prasoon@gmail.com|Cstech|MathesonBlvd|Mississauga|Ontario|50563|Business|3678909874|
#And Click on EmergencyContact
#And Click on AllowedToPickup
#And Click on Next button
#And Click on DoctorInsurance tab
#And Enter value in below doctorinsurance field
#|Doctor_Name|Phone|Address|HospitalPreferred|HealthInsurancePolicyCarrier|PolicyNumber|PhoneNumber|
#|Dr. Mehta|4567890456|Goreway Drive, ON, 50563|STAR HOSPITAL|LIC|A098909|4567890987|
#And Click on Next button
#And Click on DoNotUseTransportation checkbox
#And Click on AddChild_Submit button
#Then Verify the alert message as "Age limit should be in between 31 and 48 months"
##When Close Website
#
#Scenario: 5. Add a child with existing UserName
#Given Launch Vcare application
#Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
#And Click on SignIn button
#And Click on Children tab
#And Click on Children List tab
#And Click on Add Child button
#And Enter the values on Basic Info page
#|childcode|childfirstname|childlastname|profilepic|nickname|gender|DOB|SSN|Height|Weight|EyesColor|HairStyle|Religion|Meal|Notes|
#|63|John|Abraham|C:\Users\PC\Downloads\babypics.jpg|JA|male|002018-03-05|567|75cm|11kg|Brown|Side Partition|Hinduism|Veg|Child is little shy|
#And Expand Enrollment section 
#And Enter the values on Enrollment section
#|Enrollment_Date|Class|Package|Discount|Camp|
#|002020-05-01|Toddler|5 days a week Toddler package|Summer Discount|Spring Camp|
#And Click on Next button
#And Enter values on Primary Guardian section
#|ParentFirstName|ParentLastName|SSN|ProfilePic|RelationShip|P_Street|P_City|P_State|P_Zip|P_PhoneHome|EmailAddress|ParentCompanyName|Work_Street|Work_City|Work_State|Work_Zip|Occupation|Work_Phone|LoginName|Password|ConfPassword|
#|anisha|prasoon|678|C:\Users\PC\Downloads\babypics.jpg|Mother|CatalpaRd|Mississauga|Ontario|50563|4567829303|an1isha.prasoon@gmail.com|Cstech|MathesonBlvd|Mississauga|Ontario|50563|Bank Manager|3678909874|JohnAbraham|Pass@123|Pass@123|
#And Expand Other Guardian section
#And Enter values on Other Guardian section
#|OGFirstName|OGLastName|OGSSN|OGProfilePic|OGRelationShip|OG_Street|OG_City|OG_State|OG_Zip|OG_Country|OG_PhoneHome|OG_EmailAddress|OG_CompanyName|OG_Work_Street|OG_Work_City|OG_Work_State|OG_Work_Zip|OG_Occupation|OG_Work_Phone|
#|ani|soni|128|C:\Users\PC\Downloads\babypics.jpg|Father|CatalpaRd|Mississauga|Ontario|50563|CA|4567829303|an1isha.prasoon@gmail.com|Cstech|MathesonBlvd|Mississauga|Ontario|50563|Business|3678909874|
#And Click on EmergencyContact
#And Click on AllowedToPickup
#And Click on Next button
#And Click on DoctorInsurance tab
#And Enter value in below doctorinsurance field
#|Doctor_Name|Phone|Address|HospitalPreferred|HealthInsurancePolicyCarrier|PolicyNumber|PhoneNumber|
#|Dr. Mehta|4567890456|Goreway Drive, ON, 50563|STAR HOSPITAL|LIC|A098909|4567890987|
#And Click on Next button
#And Click on DoNotUseTransportation checkbox
#And Click on AddChild_Submit button
#Then Verify the alert message as "User Name Already Exists"
#When Close Website
#
#Scenario: 6. Edit a child's Personal information
#Given Launch Vcare application
#Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
#And Click on SignIn button
#And Click on Children tab
#And Click on Children List tab
#And Search child "aaroh dandekar"
#And Click on Edit link for respective child
#Then Click on PersonalInformation Edit link
#And Update the values on Basic Info page
#|Height|Weight|Meal|
#|80cm|12kg|Non Veg|
#And Click on Child Personal info Edit page Update button
#Then Verify the successful alert message as "Updated Successfully"
#When Close Website
#
#Scenario: 7. Update the Guardian Info for an existing child
#Given Launch Vcare application
#Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
#And Click on SignIn button
#And Click on Children tab
#And Click on Children List tab
#And Search child "aaroh dandekar"
#And Click on Edit link for respective child
#Then Click on PrimaryGuardian Edit link
#And Update the values on Primary Guardian Info page
#|P_Street|P_Zip|P_PhoneHome|Work_Street|
#|Catalpa Road|50500|4567820000|2560 MathesonBlvd|
#And Click on Parent info Edit page Update button
#Then Verify the successful alert message as "Updated Successfully"
#When Close Website
#
#Scenario: 8.Delete an Enrolled Child with Payment dues and Invoice Generated
#Given Launch Vcare application
#Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
#And Click on SignIn button
#And Click on Children tab
#And Click on Children List tab
#And Search child "Alia Kumar"
#And Click on delete link for respective child
#And Click on YES button
#Then Verify the alert message as "Child need to pay balance amount: "
#When Close Website
 
#Scenario: 9. Delete Child with no Invoice Generated
#Given Launch Vcare application
#Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
#And Click on SignIn button
#And Click on Children tab
#And Click on Children List tab
#And Search child "aarohi shankar"
#And Click on delete link for respective child
#And Click on YES button
#Then Verify the alert message as "Pending Invoice Generation"
#When Close Website
#
#Scenario: 10. Delete Child with no Payment Dues
#Given Launch Vcare application
#Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
#And Click on SignIn button
#And Click on Children tab
#And Click on Children List tab
#And Search child "Alfred Edward"
#And Click on delete link for respective child
#And Click on YES button
#Then Verify the successful alert message as "Deleted Successfully"
#When Close Website
#
#Scenario: 11. Check-in a Child
#Given Launch Vcare application
#Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
#And Click on SignIn button
#And Click on Children tab
#And Click on Children List tab
#And Search child "Amy Farah"
#And Click on Check-in/out link for respective child
#And Click on Checkin-YES button
#Then Verify the successful alert message as "Checked in Successfully"
#When Close Website
#
#Scenario: 12. Check-out a Child
#Given Launch Vcare application
#Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
#And Click on SignIn button
#And Click on Children tab
#And Click on Children List tab
#And Search child "Amy Farah"
#And Click on Check-in/out link for respective child
#And Click on Checkout YES button
#Then Verify the successful alert message as "Checked out Successfully"
#When Close Website
#
#Scenario: 13. Search a Child
#Given Launch Vcare application
#Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
#And Click on SignIn button
#And Click on Children tab
#And Click on Children List tab
#And Search child "Alia Kumar"
#Then Verify the child name gets populated
#When Close Website
#
#Scenario: 14. Enroll a Child from Waitlist to a class whose space is full
#Given Launch Vcare application
#Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
#And Click on SignIn button
#And Click on Children tab
#And Click on Waitlist List tab
#And Click on Enroll button for child
#Then Verify the alert message as "Sorry Capacity of Class is full"
#
#Scenario: 15. Remove a Child from Waitlist 
#Given Launch Vcare application
#Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
#And Click on SignIn button
#And Click on Children tab
#And Click on Waitlist List tab
#And Click on Remove button for child
#Then Verify the successful alert message as "Child Removed Successfully"
#
#Scenario: 16. Enroll a Child from Waitlist to a class with Class having space
#Given Launch Vcare application
#Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
#And Click on SignIn button
#And Click on Children tab
#And Click on Waitlist List tab
#And Click on Enroll button for child
#Then Verify the successful alert message as "Updated Successfully"
#
#Scenario: 17. Enroll a child to class which is full, child should be added to Waitlist  
#Given Launch Vcare application
#Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
#And Click on SignIn button
#And Click on Children tab
#And Click on Children List tab
#And Click on Add Child button
#And Enter the values on Basic Info page
#|childcode|childfirstname|childlastname|profilepic|nickname|gender|DOB|SSN|Height|Weight|EyesColor|HairStyle|Religion|Meal|Notes|
#|69|Chris|Jonas|C:\Users\PC\Downloads\babypics.jpg|JA|male|002018-02-05|567|75cm|11kg|Brown|Side Partition|Hinduism|Veg|Child is little shy|
#And Expand Enrollment section 
#And Enter the values on Enrollment section
#|Enrollment_Date|Class|Package|
#|002020-05-01|Toddler|5 days a week Toddler package|
#And Click on Next button
#And Enter values on Primary Guardian section
#|ParentFirstName|ParentLastName|SSN|ProfilePic|RelationShip|P_Street|P_City|P_State|P_Zip|P_PhoneHome|EmailAddress|ParentCompanyName|Work_Street|Work_City|Work_State|Work_Zip|Occupation|Work_Phone|LoginName|Password|ConfPassword|
#|anisha|prasoon|128|C:\Users\PC\Downloads\babypics.jpg|Mother|CatalpaRd|Mississauga|Ontario|50563|4567829303|an31isha.prasoon@gmail.com|Cstech|MathesonBlvd|Mississauga|Ontario|50563|Bank Manager|3678909874|chrisjonas|Pass@123|Pass@123|
#And Click on Next button
#And Click on Next button
#And Click on AddChild_Submit button
#Then Verify the alert message as "Class is full, Child sent to waitlist"
#When Close Website

#Scenario: 18. 
#Given Launch Vcare application
#Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
#And Click on SignIn button
#Then Click on Dashboard tab
#Then Verify that child "Nani Shah" is displayed on Dashboard under Upcoming Birthday section


Scenario: 19.Verify Upcoming Birthday details of a child is shown on Dashboard  
Given Launch Vcare application
Then Enter Customerid, Username and Password like "21", "anisha.prasoon@gmail.com" "Pass@123" 
And Click on SignIn button
And Click on Children tab
And Click on Children List tab
#And Click on Add Child button
#And Enter the values on Basic Info page
#|childcode|childfirstname|childlastname|profilepic|nickname|gender|DOB|SSN|Height|Weight|EyesColor|HairStyle|Religion|Meal|Notes|
#|71|Harpratap|singh|C:\Users\PC\Downloads\babypics.jpg|JA|male|002018-05-24|567|75cm|11kg|Brown|Side Partition|Hinduism|Veg|Child is little shy|
#And Expand Enrollment section 
#And Enter the values on Enrollment section
#|Enrollment_Date|Class|Package|Camp|
#|002020-05-01|Toddler|5 days a week Toddler package|Spring Camp|
#And Click on Next button
#And Enter values on Primary Guardian section
#|ParentFirstName|ParentLastName|SSN|ProfilePic|RelationShip|P_Street|P_City|P_State|P_Zip|P_PhoneHome|EmailAddress|ParentCompanyName|Work_Street|Work_City|Work_State|Work_Zip|Occupation|Work_Phone|LoginName|Password|ConfPassword|
#|anisha|prasoon|128|C:\Users\PC\Downloads\babypics.jpg|Mother|CatalpaRd|Mississauga|Ontario|50563|4567829303|an33isha.prasoon@gmail.com|Cstech|MathesonBlvd|Mississauga|Ontario|50563|Bank Manager|3678909874|harprataps|Pass@123|Pass@123|
#And Click on Next button
#And Click on Next button
#And Click on AddChild_Submit button
And Search child "Harpratap singh"
And Click on Edit link for respective child
Then Click on Enrollment Edit link
Then Verify the value selected for Camps dropdown is "Spring Camp"
