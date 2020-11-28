Feature: Itecy Website Testing

Scenario: To test create profile functionality

Given Launch Itecy Website
When Click on JobSeeker Sign In
And Enter Username as "anisha.prasoon@clientservertech.ca" value
And Enter Password like "Password-1" 
And Click on Login button
And Click on JobSeeker Dropdown 
And Click on Create Profile
And Fill the fields on Creation page
|Professional_Title|Select_Industry |About_Notes							 |
|Manual Tester		 |IT			 	 	  	|Having 3 yrs of experience|
And Click on ProfileCreation Next button 
And Fill fields in General information page 
|Select_Gender |Select_Marital_Status| Select_Nationality|Select_Country|Select_State|Select_City|Select_DOB  |Select_Language|Select_Preffered_Location|Experience|Select_Experience Level|Select_Work_Authorization|
|Female				 |	Married						 |			Indian			 |		INDIA			|		TELANGANA|	Hyderabad|001990-09-10|English				|Hyderabad,TELANGANA,INDIA|		6  |						 6-10 years|Permanent Resident       |
And Click on GeneralInformation NextButton
And Click on AddEducationbutton
And fill the fields in add education page
|Select_Degree|Select_Specialization|Passing_Year|University_Name	 |
|			B.B.A		|  Management       	|	2012			 |ShivajiUniversity|
And Click on SaveChanges button on EducationPage
And Click on EducationPage Nextbutton
And Click on AddExperience button 
And fill the fields of AddExperience page
|Select_Company |Select_Industry|Select_Functional_Area|Select_Designation |Select_JoiningDate|Select_MonthlySalary|
|Infosys			  |IT							|Automationtesting     |Automationtester   |2012-09-03			|30000						   |
And click on IsCurrentCompany checkbox 	
And Select Expected increments
And Select Notice period
And Click on SaveChanges button on Experience page
And Click on Experience NextButton
And Click on AddCertification pagebutton
And fill the fields of Certification page
|Select_CertificateName|Select_Date|Select_LicenseNo|Select_Institute_Name|
|SeleniumJava				   |002019-09-03 |AANJI10091990		|SunDevelopers        |
And Click on SaveChanges button on Certificaton page
And Click on Certification page Nextbutton
And Select Skills
And click on Next button on Skills page 
And fill the fields on Social Profile page
|Facebook  |GoogleLink    |TwitterLink    |InstagramLink    |
|www.fb.com|www.google.com|www.twitter.com|www.instagram.com|
And Click on SocialProfile Next button
And upload Resume
And Click on Submit your details
Then Observe the Update profile Successfully message should be displayed
When close site
