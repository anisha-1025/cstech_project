package PAGES;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Children {
	
	@FindBy(xpath = "//div[@class='slimScrollDiv']/ul/li[3]/a/span")
	public WebElement ChildrenTab;
	
	@FindBy(xpath = "//a[text()='Children List']")
	public WebElement Children_List_link;
	
	@FindBy(xpath = "//a[text()='Wait List']")
	public WebElement WaitList_Link;
	
	@FindBy(xpath = "//a[text()=' Add New Child ']")
	public WebElement Add_New_Child_button;
	
	@FindBy(id = "ccode")
	public WebElement childcode;
	
	@FindBy(id="fnme")
	public WebElement firstname;

	@FindBy(id = "lnme")
	public WebElement lastname;

	@FindBy( id="files1")
	public WebElement childprofilepic ;

	@FindBy(id = "dnme")
	public WebElement displayname;

	@FindBy(name = "NickName")
	public WebElement child_Nickname;

	@FindBy(xpath = "//label[@for='male']")
	public WebElement male;

	@FindBy(xpath = "//label[@for='female']")
	public WebElement female;

	@FindBy(id="dob")
	public WebElement dateofbirth ;

	@FindBy(name="SSN")
	public WebElement child_SSN ;

	@FindBy(name = "C_Height")
	public WebElement child_height;

	@FindBy(name = "C_Weight")
	public WebElement child_weight;

	@FindBy(id = "EyeColor")
	public WebElement child_EyeColor;

	@FindBy(id = "HairStyle")
	public WebElement child_HairStyle;

	@FindBy(id = "Religion")
	public WebElement child_Religion;

	@FindBy(xpath = "//label[@for='Veg']")
	public WebElement menu_Veg;
	
	@FindBy(xpath = "//label[@for='NonVeg']")
	public WebElement menu_NonVeg;

	@FindBy(name = "Notes")
	public WebElement child_Notes;

	@FindBy(xpath = "//*[@id=\"headingOne_1\"]/h4/a")
	public WebElement child_Enrollments_link;

	@FindBy(id = "Enrolldate")
	public WebElement Enrolldate;
	
	@FindBy(id = "classid1")
	public WebElement select_class_dropdown;
	
	@FindBy(id = "pacid1")
	public WebElement child_PackageId ;
	
	@FindBy(id = "classid12")
	public WebElement child_discount;

	@FindBy(id = "classid2")
	public WebElement child_camps;
	
	@FindBy(xpath = "//a[text()='Next']")
	public WebElement Next_button;
	
	@FindBy(xpath = "//a[text()='Previous']")
	public WebElement Previous_button;

	@FindBy(id = "ParentFirst")
	public WebElement ParentFirstName;
	
	@FindBy(id = "ParentLast")
	public WebElement ParentLastName;
	
	@FindBy(name = "ParentSSN")
	public WebElement ParentSSN;
	
	@FindBy(name = "files2")
	public WebElement parent_Profile_Pic;
	
	@FindBy(id = "Relationship")
	public WebElement Relationship;
	
	@FindBy(name = "Street")
	public WebElement Address_Street;
	
	@FindBy(name = "City")
	public WebElement Address_City;
	
	@FindBy(name = "State")
	public WebElement Address_state;

	@FindBy(name="Zip")
	public WebElement Address_Zip ;
	
	@FindBy(name = "HomePhone")
	public WebElement HomeNumber ;
	
	@FindBy(id = "eml")
	public WebElement parent_email;

	@FindBy(name = "Work_Company")
	public WebElement Parent_Company_Name;

	@FindBy(name = "Work_Street")
	public WebElement Parent_Work_Street;
	
	@FindBy(name = "Work_City")
	public WebElement Parent_Work_City;
	
	@FindBy(name = "Work_State")
	public WebElement Parent_Work_State;
	
	@FindBy(name = "Work_Zip ")
	public WebElement Parent_Work_Zip;
	
	@FindBy(id = "Occupation")
	public WebElement Parent_Occupation;
	
	@FindBy(name = "Work_Phone")
	public WebElement Parent_Work_Phone;
	
	@FindBy(id = "logname")
	public WebElement login_name;
	
	@FindBy(id = "logpas")
	public WebElement Password;
	
	@FindBy(id = "logconpas")
	public WebElement ConfPassword;
	
	@FindBy(xpath = "//span[text()=' Other Guardian']")
	public WebElement OtherGuardianTab;
	
	@FindBy(name = "ParentFirstName2")
	public WebElement OG_FirstName;
	
	@FindBy(name = "ParentLastName2")
	public WebElement OG_LastName;
	
	@FindBy(name = "ParentSSN2")
	public WebElement OG_SSN;
	
	@FindBy(name = "files3")
	public WebElement OG_Profile_Pic;
	
	@FindBy(id = "Relationship1")
	public WebElement OG_Relationship;
	
	@FindBy(name = "Street2")
	public WebElement OG_Address_Street;
	
	@FindBy(name = "City2")
	public WebElement OG_Address_City;
	
	@FindBy(name = "State2")
	public WebElement OG_Address_state;

	@FindBy(name="Zip2")
	public WebElement OG_Address_Zip ;
	
	@FindBy(name = "Country2")
	public WebElement OG_Address_Country;
	
	@FindBy(name = "HomePhone2")
	public WebElement OG_HomeNumber;
	
	@FindBy(name = "Email2")
	public WebElement OG_email;

	@FindBy(name = "Work_Company2")
	public WebElement OG_Company_Name;

	@FindBy(name = "Work_Street2")
	public WebElement OG_Work_Street;
	
	@FindBy(name = "Work_City2")
	public WebElement OG_Work_City;
	
	@FindBy(name = "Work_State2")
	public WebElement OG_Work_State;
	
	@FindBy(name = "Work_Zip2")
	public WebElement OG_Work_Zip;
	
	@FindBy(id = "Occupation1")
	public WebElement OG_Occupation;
	
	@FindBy(name = "Work_Phone2")
	public WebElement OG_Work_Phone;
	
	@FindBy(xpath = "//label[@for='acceptTerms-64']")
	public WebElement OG_EmergencyContact;
	
	@FindBy(xpath = "//label[@for='acceptTerms-7']")
	public WebElement OG_AllowedToPickup;
	
	@FindBy(xpath = "//span[text()='Doctor Insurance']")
	public WebElement Doctor_Insurance_tab;
	
	@FindBy(name ="DoctorName")
	public WebElement DoctorName;

	@FindBy(name = "DoctorPhone")
	public WebElement DoctorPhone;
	
	@FindBy(name = "DoctorAddress")
	public WebElement DoctorAddress;
	
	@FindBy(name = "HospitalINEmergency")
	public WebElement HospitalINEmergency;
	
	@FindBy(id = "HealthInsurance")
	public WebElement HealthInsurance_dropdown;
	
	@FindBy(name = "HealthInsurance_Policy")
	public WebElement HealthInsurance_Policy_Number;
	
	@FindBy(name = "HealthInsurance_Phone")
	public WebElement HealthInsurance_PhoneNumber;
	
	@FindBy(xpath = "//label[@for='acceptTerms-8']")
	public WebElement DoNotUseTransport_checkboxButton;
	
	@FindBy(id = "btnsubmits")
	public WebElement add_child_Submit_button;
	
	
	@FindBy(xpath = "//i[text()='create']")
	public WebElement Child_Edit_link;
	
	@FindBy(xpath = "//i[text()='delete']")
	public WebElement Child_delete_link;

	@FindBy(xpath = "//i[text()='alarm']")
	public WebElement Children_Checkin_out_link;
	
	@FindBy(xpath = "//form[@action='/Child/checkin']/div[2]/button[1]")
	public WebElement Child_Checkin_YES_button;
	
	@FindBy(xpath = "//form[@action='/Child/Checkout']/div[2]/button[1]")
	public WebElement Child_Checkout_YES_button;
	
	@FindBy(xpath = "//button[@id='btndelete']")
	public WebElement Child_delete_YES_button;
	
	@FindBy(xpath = "//div[@class='alert alert-success']")
	public WebElement successfulalertmessage;
	
	@FindBy(xpath = "//div[@class='alert alert-danger']")
	public WebElement AlertMessage;
	
	/**Child Edit WebElements**/
	
	@FindBy(xpath = "//input[@type='search']")
	public WebElement searchchild;
	
	@FindBy(xpath = "//a[@href='/Child/Edit?id=49']")
	public WebElement ChildEditLink_aarohDandekar;
	
	@FindBy(xpath = "//a[@onclick='GetDetails(49)']")
	public WebElement PersonalInfoEditlink;
	
	@FindBy(xpath = "//a[@onclick='GetParentDetails(49)']")
	public WebElement ParentGuardianEditLink;
	
	@FindBy(xpath = "//a[@onclick='GetGuardianDetails(49)']")
	public WebElement SecondaryGuardianEditLink;
	
	@FindBy(xpath = "//a[@href='/Child/ClassDetails/?id=49']")
	public WebElement Enrollment_Classes_Packages_EditLink;
	
	@FindBy(xpath = "//a[@onclick='GetDiscountDetails(49)']")
	public WebElement Enrollment_Discount_edit_link;
	
	@FindBy(xpath = "//td[text()='Enrollments- Camps']/following-sibling::td/a")
	//@FindBy(xpath = "//a[@onclick='GetCampDetails(1137)']")
	public WebElement Camp_edit_Link;
	
	@FindBy(xpath = "//a[@onclick='GetDoctorDetails(49)']")
	public WebElement Doctor_Edit_link;
	
	@FindBy(xpath = "//a[@href='/Child/ChildMedicalCondition/?id=49']")
	public WebElement Child_MedicalCondition_Edit_link; 
	
	@FindBy(xpath = "//a[@href='/Child/ChildAllergy/?id=49']")
	public WebElement Child_Allergy_Edit_link;
	
	@FindBy(xpath = "//a[@href='/Child/ChildMedications/?id=49']")
	public WebElement Child_Medication_Edit_link;
	
	@FindBy(xpath = "//a[@href='/Child/ChildImmunizations/?id=49']")
	public WebElement Child_Immunization_Edit_link;
	
	@FindBy(xpath = "//a[@href='/Child/ChildTransportations/?id=49']")
	public WebElement Child_Transportation_Edit_link;
	
	@FindBy(xpath = "//a[@onclick='GetSpecialDetails(49)']")
	public WebElement SpecialNeeds_Edit_link;
	
	@FindBy(xpath = "//form[@action='/Child/Personalinfo']/div/button[1]")
	public WebElement ChildEditUPDATE_Button;
	
	@FindBy(xpath = "//form[@action='/Child/Parentinfo']/div/button[1]")
	public WebElement ParentEditUpdateButton;
	
	/***Child DELETE Webelements***/
	@FindBy(xpath = "//a[@onclick='DeleteDetails(53)']")
	public WebElement Alia_DeleteLink;
	
	
	/*****Search a child******/
	@FindBy(xpath = "//td[@class='sorting_1']")
	public WebElement FirstChildAfterSearch;
	
	/***Waitlist webelements****/
	@FindBy(xpath = "//a[@href='/Child/enroll?id=1133']")
	public WebElement EnrollWaitlistChildButton;
	
	@FindBy(xpath = "//a[@href='/Child/remove?id=1134']")
	public WebElement RemoveWaitlistChildButton;
	
	
	@FindBy(xpath = "//div[@class='custom-select4']/div[2]/text()")
	public WebElement Child_CampSelectedValue;
	
	
	
	
	
	
	
	
	
	
	
	
	/*******************************************************/
	public Children(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	} 
	
	public void Click_ChildrenTab()
	{
		ChildrenTab.click();
	}
	
	public void Click_Children_List_link()
	{
		Children_List_link.click();
	}
	
	public void Click_WaitList_Link()
	{
		WaitList_Link.click();
	}
	
	public void Click_Add_New_Child_button()
	{
		Add_New_Child_button.click();
	}
	
//	@FindBy(xpath = "//span[text()='Last Child Code: 63']")
//	public WebElement lastchildcode;
	public void Enter_childcode(String x)
	{
		childcode.sendKeys(x);
		//String a= lastchildcode.getText();
	}
	public void Enter_Child_firstname(String x)
	{
		firstname.sendKeys(x);
	}
	public void Enter_Child_lastname(String x)
	{
		lastname.sendKeys(x);
	}
	public void Upload_childprofilepic(String y)
	{
		childprofilepic.sendKeys(y);
	}
	public void Enter_displayname(String y)
	{
		displayname.sendKeys(y);
	}
	public void Enter_child_Nickname(String x)
	{
		child_Nickname.sendKeys(x);
	}
	
	public void select_gender(String userinput)
	{
		if(userinput.equalsIgnoreCase("male"))
		{
			male.click();
		}
		else if(userinput.equalsIgnoreCase("female"))
		{
			female.click();
		}
	}
	public void select_male_gender()
	{
		male.click();
	}
	public void select_female_gender()
	{
		female.click();
	}
	public void Enter_dateofbirth(String x)
	{
		dateofbirth.sendKeys(x);
	}
	public void Enter_child_SSN(String x)
	{
		child_SSN.sendKeys(x);
	}
	public void Enter_child_height(String x)
	{
		child_height.sendKeys(x);
	}
	public void Enter_child_weight(String w)
	{
		child_weight.sendKeys(w);
	}
	public void Select_child_EyeColor(String e)
	
	{
		Select s =new Select(child_EyeColor);
		List<WebElement> list= s.getOptions();
		for(int i=0;i< list.size();i++)
		{
			if(list.get(i).getText().equalsIgnoreCase(e))
			{
				list.get(i).click();
			}
				
		}
	}
	public void Select_child_HairStyle(String h)
	{
		Select s =new Select(child_HairStyle);
		List<WebElement> list= s.getOptions();
		for(int i=0;i< list.size();i++)
		{
			if(list.get(i).getText().equalsIgnoreCase(h))
			{
				list.get(i).click();
			}
				
		}
	}
	
	public void Select_child_Religion(String e)
	{
		Select s =new Select(child_Religion);
		List<WebElement> list= s.getOptions();
		for(int i=0;i< list.size();i++)
		{
			if(list.get(i).getText().equalsIgnoreCase(e))
			{
				list.get(i).click();
			}
				
		}
		
	}
	
	public void select_meal(String uo)
	{
		if(uo.equalsIgnoreCase("Veg")) {
			menu_Veg.click();	
		}
		else if(uo.equalsIgnoreCase("Non Veg"))
		{
		menu_NonVeg.click();
	    }
	}
	
	public void Enter_child_Notes(String x)
	{
		child_Notes.sendKeys(x);
	}
	
	public void Click_Enrollments()
	{
		child_Enrollments_link.click();
	}
	
	public void Enter_Enrollment_date(String x)
	{
		Enrolldate.sendKeys(x);
	}
	
	public void select_class(String c)
	{
		Select s =new Select(select_class_dropdown);
		List<WebElement> list= s.getOptions();
		for(int i=0;i< list.size();i++)
		{
			if(list.get(i).getText().equalsIgnoreCase(c))
			{
				list.get(i).click();
			}
				
		}
		
	}
	
	public void select_package(String p)
	{
		
		Select s =new Select(child_PackageId);
		List<WebElement> list= s.getOptions();
		for(int i=0;i< list.size();i++)
		{
			if(list.get(i).getText().equalsIgnoreCase(p))
			{
				list.get(i).click();
			}
				
		}
	}
	
	public void select_camps(String c)
	{
		Select s =new Select(child_camps);
		List<WebElement> list= s.getOptions();
		for(int i=0;i< list.size();i++)
		{
			if(list.get(i).getText().equalsIgnoreCase(c))
			{
				list.get(i).click();
			}
				
		}
		
	}
	
	public void select_discount(String d)
	{
		Select s =new Select(child_discount);
		List<WebElement> list= s.getOptions();
		for(int i=0;i< list.size();i++)
		{
			if(list.get(i).getText().equals(d))
			{
				list.get(i).click();
			}
				
		}
		
	}
	
	public void Click_Footer_Next_Link()
	{
		Next_button.click();
	}
	
	public void Enter_Parent_FirstName(String p)
	{
		ParentFirstName.sendKeys(p);
	}
	
	public void Enter_Parent_LastName(String p)
	{
		ParentLastName.sendKeys(p);
	}
	
	public void Enter_Parent_SSN(String p)
	{
		ParentSSN.sendKeys(p);
	}
	
	public void Upload_Parent_ProfilePic(String pic)
	{
		parent_Profile_Pic.sendKeys(pic);
	}
	
	public void Select_Parent_Relationship(String p)
	{
		Select s =new Select(Relationship);
		List<WebElement> list= s.getOptions();
		for(int i=0;i< list.size();i++)
		{
			if(list.get(i).getText().equals(p))
			{
				list.get(i).click();
			}
				
		}
	}
	
	public void Enter_Address_Street(String a)
	{
		Address_Street.sendKeys(a);
	}
	
	public void Enter_Address_city(String a)
	{
		Address_City.sendKeys(a);
	}
	
	public void Enter_Address_state(String a)
	{
		Address_state.sendKeys(a);
	}
	
	public void Enter_Address_zip(String a)
	{
		Address_Zip.sendKeys(a);
	}
	
	public void Enter_HomeNumber(String a)
	{
		HomeNumber.sendKeys(a);
	}
	
	public void Enter_parent_email(String x)
	{
		parent_email.sendKeys(x);
	}
	

	public void Enter_Parent_CompanyName(String c)
	{
		Parent_Company_Name.sendKeys(c);
	}
	
	
	public void Enter_parent_Workaddress_street(String x)
	{
		Parent_Work_Street.sendKeys(x);
	}
	
	public void Enter_parent_Workaddress_city(String x)
	{
		Parent_Work_City.sendKeys(x);
	}
	
	public void Enter_parent_Workaddress_state(String x)
	{
		Parent_Work_State.sendKeys(x);
	}
	
	public void Enter_parent_Workaddress_zip(String x)
	{
		Parent_Work_Zip.sendKeys(x);
	}
	
	public void Enter_Parent_Occupation(String o)
	{
		Parent_Occupation.sendKeys(o);
	}
	
	public void Enter_parent_Workaddress_phoneno(String x)
	{
		Parent_Work_Phone.sendKeys(x);
	}
	
	public void Enter_Parent_username(String x)
	{
		login_name.sendKeys(x);
	}
	
	public void Enter_password(String x)
	{
		Password.sendKeys(x);
	}
	
	public void Enter_Confirmpassword(String x)
	{
		ConfPassword.sendKeys(x);
	}
	
	public void Click_Other_Guardian()
	{
		OtherGuardianTab.click();
	}
	
	public void Enter_OG_FirstName(String p)
	{
		OG_FirstName.sendKeys(p);
	}
	
	public void Enter_OGLastName(String p)
	{
		OG_LastName.sendKeys(p);
	}
	
	public void Enter_OG_SSN(String p)
	{
		OG_SSN.sendKeys(p);
	}

	public void Upload_OG_ProfilePic(String pic)
	{
		OG_Profile_Pic.sendKeys(pic);
	}
	

	public void Select_OG_Relationship(String p)
	{
		Select s =new Select(OG_Relationship);
		List<WebElement> list= s.getOptions();
		for(int i=0;i< list.size();i++)
		{
			if(list.get(i).getText().equals(p))
			{
				list.get(i).click();
			}
				
		}
	}
	
	public void Enter_OG_Address_Street(String a)
	{
		OG_Address_Street.sendKeys(a);
	}
	
	public void Enter_OG_Address_city(String a)
	{
		OG_Address_City.sendKeys(a);
	}
	
	public void Enter_OG_Address_state(String a)
	{
		OG_Address_state.sendKeys(a);
	}
	
	public void Enter_OG_Address_zip(String a)
	{
		OG_Address_Zip.sendKeys(a);
	}
	
	public void Enter_OG_Address_Country(String a)
	{
		OG_Address_Country.sendKeys(a);
	}
	
	public void Enter_OG_HomeNumber(String a)
	{
		OG_HomeNumber.sendKeys(a);
	}
	
	public void Enter_OG_email(String x)
	{
		OG_email.sendKeys(x);
	}
	

	public void Enter_OG_CompanyName(String c)
	{
		OG_Company_Name.sendKeys(c);
	}
	
	
	public void Enter_OG_Workaddress_street(String x)
	{
		OG_Work_Street.sendKeys(x);
	}
	
	public void Enter_OG_Workaddress_city(String x)
	{
		OG_Work_City.sendKeys(x);
	}
	
	public void Enter_OG_Workaddress_state(String x)
	{
		OG_Work_State.sendKeys(x);
	}
	
	public void Enter_OG_Workaddress_zip(String x)
	{
		OG_Work_Zip.sendKeys(x);
	}
	
	public void Enter_OG_Occupation(String o)
	{
		OG_Occupation.sendKeys(o);
	}
	
	public void Enter_OG_Work_phoneno(String x)
	{
		OG_Work_Phone.sendKeys(x);
	}
	
	public void Click_EmergencyContact_Checkbox()
	{
		OG_EmergencyContact.click();
	}
	
	public void Click_Allowed_to_Pickup()
	{
		OG_AllowedToPickup.click();
	}
	
	
	public void Enter_DoctorName(String dn)
	{
		DoctorName.sendKeys(dn);
	}
	
	public void Enter_DoctorPhone(String dp)
	{
		DoctorPhone.sendKeys(dp);
	}
	
	public void Enter_DoctorAddress(String x)
	{
		DoctorAddress.sendKeys(x);
	}
	
	public void Enter_HospitalINEmergency(String a)
	{
		HospitalINEmergency.sendKeys(a);
	}
	
	public void Enter_HealthInsurance_dropdown(String x)
	{
		Select s= new Select(HealthInsurance_dropdown);
		List<WebElement> e=s.getOptions();
		for(int i=0;i<e.size();i++)
		{
			if(e.get(i).getText().equals(x))
			{
				e.get(i).click();
			}
		}
	}
	
	public void Enter_HealthInsurance_Policy(String x)
	{
		HealthInsurance_Policy_Number.sendKeys(x);
	}
	
	public void Enter_HealthInsurance_PhoneNumber(String p)
	{
		HealthInsurance_PhoneNumber.sendKeys(p);
	}
	public void Click_DoNotUseTransport_checkboxButton()
	{
		DoNotUseTransport_checkboxButton.click();
	}
	
	public void Click_add_child_Submit_button()
	{
		add_child_Submit_button.click();
	}
	
	public void Click_Child_Edit_link()
	{
		Child_Edit_link.click();
	}
	
	public void Click_Child_delete_link()
	{
		Child_delete_link.click();
	}
	
	public void click_Children_Checkin_out_link()
	{
		Children_Checkin_out_link.click();
	}
	
	public void Child_Checkin_YES_button()
	{
		Child_Checkin_YES_button.click();
	}
	
	public void Child_Checkout_YES_button()
	{
		Child_Checkout_YES_button.click();
	}
	
	public void Child_delete_YES_button()
	{
		Child_delete_YES_button.click();
	}
	
	public void Click_Doctor_Insurance_Tab()
	{
		Doctor_Insurance_tab.click();
	}
	
	public void search_child(String x)
	{
		searchchild.sendKeys(x);
	}
	
	public void Click_Edit_Link()
	{
		Child_Edit_link.click();
	}
	
	public void Child_Alia_Delete_link()
	{
		Alia_DeleteLink.click();
	}
	
	public void Click_PersonalInfo_Edit()
	{
		PersonalInfoEditlink.click();
	}
	
	public void Click_PrimaryGuardian_Edit_link()
	{
		ParentGuardianEditLink.click();
	}
	
	public void Click_Child_PersonalInfo_edit_Update_button() 
	{
		ChildEditUPDATE_Button.click();
	}
	
	public void Click_child_Enrollment_Camps_Edit_Link()
	{
		Camp_edit_Link.click();
	}
	
	public void Click_Edit_Parent_Update_button()
	{
		ParentEditUpdateButton.click();
	}
	
	public void Click_Waitlist_Enroll_child_Button()
	{
		EnrollWaitlistChildButton.click();
	}
	
	public void Click_waitlist_Remove_child_button()
	{
		RemoveWaitlistChildButton.click();
	}
	
	
	
	
}
