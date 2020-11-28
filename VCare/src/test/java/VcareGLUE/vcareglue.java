package VcareGLUE;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.List;

import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PAGES.AdditionalChargesPage;
import PAGES.AdjustmentsPage;
import PAGES.BasePackagePage;
import PAGES.Children;
import PAGES.DashboardPage;
import PAGES.DiscountPage;
import PAGES.EmployeePage;
import PAGES.GenerateInvoicePage;
import PAGES.InvoiceList;
import PAGES.LoginPage;
import PAGES.Registeration;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.it.Date;
import junit.framework.Assert;


@SuppressWarnings("deprecation")
public class vcareglue {

	public Registeration r;
	public LoginPage lp;
	public DashboardPage dash;
	public Children c;
	public EmployeePage e;
	public BasePackagePage b;
	public AdditionalChargesPage a;
	public AdjustmentsPage ad;
	public DiscountPage d;
	public GenerateInvoicePage g;
	public InvoiceList i;
	public WebDriver driver;
	public Properties prop;
	public WebDriverWait wait; 
	public Scenario s;
	
	@Before
	public void method(Scenario s) throws IOException
	{
		this.s=s;
		FileInputStream fs= new FileInputStream("C:\\AnishaWorkspace\\VCare\\src\\test\\resources\\Repository\\file.properties");
		prop=new Properties();
		prop.load(fs);
	}
	@Given("^Launch Vcare application$")
	public void launch_vcare_webapplication()
	{
		System.setProperty("webdriver.chrome.driver", prop.getProperty("chromedriverpath"));
		driver= new ChromeDriver();
		lp=new LoginPage(driver);
		dash= new DashboardPage(driver);
		r= new Registeration(driver);
		c=new Children(driver);
		e=new EmployeePage(driver);
		b=new BasePackagePage(driver);
		a= new AdditionalChargesPage(driver);
		d= new DiscountPage(driver);
		ad=new AdjustmentsPage(driver);
		i=new InvoiceList(driver);
		g= new GenerateInvoicePage(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		wait= new WebDriverWait(driver, 10);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
	}
	
	@When("^Click on Register Now link$")
	public void Click_Register_Now_link()
	{
		lp.Click_RegisterNow_Link();
	}
	
	@Then("^Enter Values in below fields \"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\"$")
	public void enter_value_below_fields(String fn, String ln, String email, String Phoneno, String Password, String ReEnterPwd)
	{
		
		
		r.Enter_FirstName(fn);
		r.Enter_LastName(ln);
		r.Enter_EmailAddress(email);
		r.Enter_PhoneNo(Phoneno);
		r.Enter_Password(Password);
		r.Enter_Confirm_Password(ReEnterPwd);
	}
	
	@Then("^Click on Sign up button$")
	public void click_SignUp_Button()
	{
		r.Click_Signup_Button();
	}
	
	@SuppressWarnings("deprecation")
	@Then("^Verify the Message with \"(.*)\" and \"(.*)\"$")
	public void verify_the_message(String s, String eo)
	{
	if(s.equals("Valid"))
	{
		System.out.println(r.successmessage.getText());
		Assert.assertTrue(r.successmessage.getText().contains(eo));
	}
	else if(s.equals("Invalid"))
	{
		Assert.assertTrue(r.alertmessage.getText().contains(eo));
	}
	else
	{
		System.out.println("something is wrong with code");
	}
	}
	
	@Then("^Click on You already have a membership link$")
	public void Click_You_Already_Membership_link()
	{
		r.Click_Already_Membership_Link();
	}
	
	
	@SuppressWarnings("deprecation")
	@Then("^Verify user lands on Login page$")
	public void Verify_Page_Title() {
		Assert.assertEquals("V Care - Sign In", driver.getTitle());
	}
	
	@When("^Close Website$")
	public void Close_Website()
	{
		driver.close();
	}
	
	@Then("^Enter Customerid, Username and Password like \"(.*)\", \"(.*)\" \"(.*)\"$")
	public void Enter_Customerid_Username_Password(String c, String u, String p)
	{
		lp.Enter_CustomerId(c);
		lp.Enter_Username(u);
		lp.Enter_Login_Password(p);
	
	}
	
	@And("^Click on SignIn button$")
	public void Click_SignIn_Button()
	{
		lp.Click_SignIn_Button();
	}
	
	@SuppressWarnings("deprecation")
	@Then("^Verify the landing page title as \"(.*)\"$")
	public void Verify_landing_page_title(String s)
	{
		Assert.assertEquals(s, driver.getTitle());
	}
	
	@SuppressWarnings("deprecation")
	@Then("^Verify the error message with \"(.*)\"$")
	public void Verify_Error_Message(String eo)
	{
		Assert.assertTrue(lp.AlertMessage.getText().contains(eo));
	}
	
	@And("^Click on RegisterNow link$")
	public void Click_on_RegisterNow()
	{
		lp.Click_RegisterNow_Link();
	}
	@SuppressWarnings("deprecation")
	@Then("^Verify the page title$")
	public void Verify_Page_title()
	{
		Assert.assertEquals("V Care - Sign Up", driver.getTitle());
	}
	
	@And("^Click on ForgotCustomerId/Password link$")
	public void Click_ForgotCustomerIdPasswordLink()
	{
		lp.Click_ForgotCustId_Password();
	}
	
	@And("^Enter EmailAddress as \"(.*)\"$")
	public void Enter_EmailAddress(String m)
	{
		lp.Enter_ForgotPasswordPageEmailId(m);
	}
	
	@Then("^Click on Submit button$")
	public void Click_on_Submit_button()
	{
		lp.Click_ForgotPasswordSubmitbutton();
	}
	
	@SuppressWarnings("deprecation")
	@Then("^Verify the message getting displayed with \"(.*)\"$")
	public void Verify_message_getting_displayed(String s)
	{
		Assert.assertTrue(lp.sentemailmessage.getText().contains(s));
		
	}
	
	@And("^Click on SignIn link$")
	public void Click_Signin_link()
	{
		lp.Click_ForgotPasswordSignInButton();
	}
	
	@And("^Click on Employee box$")
	public void Click_on_Employee_box()
	{
	dash.Click_DashboardEmployeeTab();	
	}
	
	@SuppressWarnings("deprecation")
	@Then("^Verify user lands on page having title \"(.*)\"$")
	public void Verify_user_lands_on_respectivepage(String expectedtitle)
	{
		Assert.assertEquals(expectedtitle, driver.getTitle());
	}
	@And("^Click on Child box$")
	public void Click_on_Child_box()
	{
	dash.Click_DashboardChildTab();	
	}
	@And("^Click on Classes box$")
	public void Click_on_Classes_box()
	{
	dash.Click_DashboardClassesTab();	
	}
	@And("^Click on Waitlist box$")
	public void Click_on_Waitlist_box()
	{
	dash.Click_DashboardWaitlistTab();
	}
	
	@And("^Click on Settings dropdown$")
	public void Click_Settings_Dropdown()
	{
		dash.Click_settingsdropdown();
	}
	
	@And("^select Dashboard settings$")
	public void select_Dashboard_settings()
	{
		dash.Click_DashboardSettingsLink();
	}
	
	@And("^Click on Edit button$")
	public void Click_Edit_button()
	{
		dash.Click_DashboardEditButton();
	}
	@And("^Click on Update button$")
	public void Click_on_Update_button()
	{
		wait.until(ExpectedConditions.elementToBeClickable(dash.DashboardSettingsUpdateButton));
		dash.Click_DashboardSettingsUpdateButton();
	}
	
	@SuppressWarnings("deprecation")
	@Then("^Verify the alert success message with \"(.*)\"$")
	public void Verify_alert_success_message(String expectedoutput)
	{
		Assert.assertTrue(dash.Dashboardsettingsalertsuccessmessage.getText().contains(expectedoutput));	
	}
	
	@And("^Click on Change Password link$")
	public void Click_ChangePassword_link()
	{
		dash.Click_ChangePasswordLink();
	}
	
	@And("^Enter below fields$")
	public void Enter_Below_fields(DataTable dt)
	{
		List<Map<String,String>> data=dt.asMaps(String.class, String.class);
		String Old_Password=data.get(0).get("Old_Password");
		String New_Password= data.get(0).get("New_Password");
		String Confirm_Password= data.get(0).get("Confirm_Password");
		
		dash.Enter_OldPasswordfield(Old_Password);
		dash.Enter_NewPasswordfield(New_Password);
		dash.Enter_ConfirmPasswordfield(Confirm_Password);
				
	}
	
	@And("^Click on Change Password Submit button$")
	public void Click_Change_Password_Submit_button()
	{
		dash.Click_changepasswordsubmitbutton();
	}
	
	@SuppressWarnings("deprecation")
	@Then("^Verify the alert message with \"(.*)\"$")
	public void Verify_alert_message(String expectedmessage)
	{
		Assert.assertTrue(dash.DashboardPasswordChangeAlertMessage.getText().contains(expectedmessage));
	}
	
	@SuppressWarnings("deprecation")
	@Then("^Verify the successfully password change message with \"(.*)\"$")
	public void Verify_Successfully_Password_Change_Message(String expectedmessage)
	{
		Assert.assertTrue(dash.successfulpasswordchangemessage.getText().contains(expectedmessage));
	}
	
	@Then("^Click on Login link$")
	public void Click_on_Login_link()
	{
		dash.Click_ChangePasswordLoginLink();
	}
	
	@Then("^Click on SignOut link$")
	public void Click_SignOut_link()
	{
		dash.Click_SignOutlink();
	}
	
	@And("^Click on Children tab$")
	public void Click_children_tab()
	{
		wait.until(ExpectedConditions.elementToBeClickable(c.ChildrenTab));
		c.Click_ChildrenTab();
	}
	
	@And("^Click on Children List tab$")
	public void Click_Children_List_tab()
	{
		c.Click_Children_List_link();
	}
	
	@And("^Click on Add Child button$")
	public void Click_Add_Child_button()
	{
		c.Click_Add_New_Child_button();
	}
	
	@And("^Enter the values on Basic Info page$")
	public void Enter_Values_on_Basic_Info_page(DataTable dt)
	{
		List<Map<String,String>> data=dt.asMaps(String.class, String.class);
		String childcode= data.get(0).get("childcode");
		c.Enter_childcode(childcode);
		
		String childfirstname=data.get(0).get("childfirstname");
		c.Enter_Child_firstname(childfirstname);
		
		String childLastname=data.get(0).get("childlastname");
		c.Enter_Child_lastname(childLastname);
		
		String childprofilepic=data.get(0).get("profilepic");
		c.Upload_childprofilepic(childprofilepic);
		
		String nickname=data.get(0).get("nickname");
		c.Enter_child_Nickname(nickname);
		
		String gender=data.get(0).get("gender");
		c.select_gender(gender);
		
		String Child_DOB=data.get(0).get("DOB");
		c.Enter_dateofbirth(Child_DOB);
		
		String childSSN=data.get(0).get("SSN");
		c.Enter_child_SSN(childSSN);
		
		String childheight=data.get(0).get("Height");
		c.child_height.clear();
		c.Enter_child_height(childheight);
		
		String childweight=data.get(0).get("Weight");
		c.child_weight.clear();
		c.Enter_child_weight(childweight);
		
		String childeyescolor=data.get(0).get("EyesColor");
		c.Select_child_EyeColor(childeyescolor);
	
		String childHairStyle=data.get(0).get("HairStyle");
		c.Select_child_HairStyle(childHairStyle);
		
		String childReligion=data.get(0).get("Religion");
		c.Select_child_Religion(childReligion);
		
		String childmeal=data.get(0).get("Meal");
		c.select_meal(childmeal);
		
		String notes=data.get(0).get("Notes");
		c.Enter_child_Notes(notes);
		
//		
//		String childheight=data.get(0).get("");
//		
//		
//		String childweight=data.get(0).get("Weight");
//		
//		
//		String childeyescolor=data.get(0).get("EyesColor");
		
	}
	
	@And("^Expand Enrollment section$")
	public void Expand_Enrolment_section()
	{
		c.Click_Enrollments();
	}
	
	@And("^Enter the values on Enrollment section$")
	public void Enter_Values_Enrollment_section(DataTable dt)
	{
		List<Map<String,String>> data=dt.asMaps(String.class, String.class);
		String enrollmentdate=data.get(0).get("Enrollment_Date");
		wait.until(ExpectedConditions.visibilityOf(c.child_Enrollments_link));
		c.Enter_Enrollment_date(enrollmentdate);
		
		
		String Class=data.get(0).get("Class");
		c.select_class(Class);
		
		String Package=data.get(0).get("Package");
		c.select_package(Package);
		
		
		String Discount=data.get(0).get("Discount");
		c.select_discount(Discount);
		
		String Camp=data.get(0).get("Camp");
		c.select_camps(Camp);
	}
	
	@And("^Click on Next button$")
	public void Click_on_Next_button()
	{
		wait.until(ExpectedConditions.elementToBeClickable(c.Next_button));
		c.Click_Footer_Next_Link();
	}
	
	@And("^Enter values on Primary Guardian section$")
	public void Enter_Values_Primary_Guardian(DataTable dt)
	{
		List<Map<String,String>> data=dt.asMaps(String.class, String.class);
		String ParentFN=data.get(0).get("ParentFirstName");
		c.Enter_Parent_FirstName(ParentFN);
		String ParentLN= data.get(0).get("ParentLastName");
		c.Enter_Parent_LastName(ParentLN);
		String SSN=data.get(0).get("SSN");
		c.Enter_Parent_SSN(SSN);
		String ProfilePic=data.get(0).get("ProfilePic");
		c.Upload_Parent_ProfilePic(ProfilePic);
		String Relationship=data.get(0).get("RelationShip");
		c.Select_Parent_Relationship(Relationship);
		String PStreet=data.get(0).get("P_Street");
		c.Enter_Address_Street(PStreet);
		String PCity=data.get(0).get("P_City");
		c.Enter_Address_city(PCity);
		String PState=data.get(0).get("P_State");
		c.Enter_Address_state(PState);
		String PZip=data.get(0).get("P_Zip");
		c.Enter_Address_zip(PZip);
		String PPhoneHome= data.get(0).get("P_PhoneHome");
		c.Enter_HomeNumber(PPhoneHome);
		String EmailAddress= data.get(0).get("EmailAddress");
		c.Enter_parent_email(EmailAddress);
		String ParentCompany= data.get(0).get("ParentCompanyName");
		c.Enter_Parent_CompanyName(ParentCompany);
		String WorkStreet=data.get(0).get("Work_Street");
		c.Enter_parent_Workaddress_street(WorkStreet);
		String Work_City=data.get(0).get("Work_City");
		c.Enter_parent_Workaddress_city(Work_City);
		String Work_State=data.get(0).get("Work_State");
		c.Enter_parent_Workaddress_state(Work_State);
		String Work_Zip=data.get(0).get("Work_Zip");
		c.Enter_parent_Workaddress_zip(Work_Zip);
		String Occupation=data.get(0).get("Occupation");
		c.Enter_Parent_Occupation(Occupation);
		String Work_Phone= data.get(0).get("Work_Phone");
		c.Enter_parent_Workaddress_phoneno(Work_Phone);
		String LoginName= data.get(0).get("LoginName");
		c.Enter_Parent_username(LoginName);
		String Password= data.get(0).get("Password");
		c.Enter_password(Password);
		String confirmpassword= data.get(0).get("ConfPassword");
		c.Enter_Confirmpassword(confirmpassword);
		
		
	}

	@And("^Click on DoctorInsurance tab$")
	public void Click_on_DoctorInsurance_tab()
	{
		c.Click_Doctor_Insurance_Tab();
	}
	
	@And("^Enter value in below doctorinsurance field$")
	public void Enter_value_in_below_doctorinsurance_field(DataTable dt)
	{
		List<Map<String,String>> data=dt.asMaps(String.class, String.class);
		String DoctorName=data.get(0).get("Doctor_Name");
		wait.until(ExpectedConditions.visibilityOf(c.DoctorName));
		c.Enter_DoctorName(DoctorName);	
		String DoctorPhone=data.get(0).get("Phone");
		c.Enter_DoctorPhone(DoctorPhone);
		String DoctorAddress=data.get(0).get("Address");
		c.Enter_DoctorAddress(DoctorAddress);
		String HospitalPreferred=data.get(0).get("HospitalPreferred");
		c.Enter_HospitalINEmergency(HospitalPreferred);
		String HealthInsurancePolicyCarrier=data.get(0).get("HealthInsurancePolicyCarrier");
		c.Enter_HealthInsurance_dropdown(HealthInsurancePolicyCarrier);
		String PolicyNumber=data.get(0).get("PolicyNumber");
		c.Enter_HealthInsurance_Policy(PolicyNumber);
		String HealthInsurancePhoneNumber=data.get(0).get("PhoneNumber");
		c.Enter_HealthInsurance_PhoneNumber(HealthInsurancePhoneNumber);
	}
	
	@And("^Click on DoNotUseTransportation checkbox$")
	public void Click_DoNotUseTransportation_checkbox()
	{
		c.Click_DoNotUseTransport_checkboxButton();
	}
	
	@And("^Click on AddChild_Submit button$")
	public void Click_AddChild_Submit_Btton()
	{
		wait.until(ExpectedConditions.elementToBeClickable(c.add_child_Submit_button));
		c.Click_add_child_Submit_button();
	}
	
	@Then("^Verify the alert message as \"(.*)\"$")
	public void Verify(String expectedoutput)
	{
		
		Assert.assertTrue(c.AlertMessage.getText().contains(expectedoutput));
	}
	
	@Then("^Verify the successful alert message as \"(.*)\"$")
	public void Verify_success_AlertMessage(String eo)
	{
		Assert.assertTrue(c.successfulalertmessage.getText().contains(eo));
	}
	
	@And("^Expand Other Guardian section$")
	public void Expand_OG_section()
	{
		c.Click_Other_Guardian();
	}
	
	@And("^Enter values on Other Guardian section$")
	public void Enter_Values_OG_Section(DataTable dt)
	{
		List<Map<String,String>> data=dt.asMaps(String.class, String.class);
		String OGFirstname=data.get(0).get("OGFirstName");
		wait.until(ExpectedConditions.visibilityOf(c.OG_FirstName));
		c.Enter_OG_FirstName(OGFirstname);	
		String OGLN= data.get(0).get("OGLastName");
		c.Enter_OGLastName(OGLN);
		String OGSSN=data.get(0).get("OGSSN");
		c.Enter_OG_SSN(OGSSN);
		String OGProfilePic=data.get(0).get("OGProfilePic");
		c.Upload_OG_ProfilePic(OGProfilePic);
		String OGRelationShip=data.get(0).get("OGRelationShip");
		c.Select_OG_Relationship(OGRelationShip);
		String OG_Street=data.get(0).get("OG_Street");
		c.Enter_OG_Address_Street(OG_Street);
		String OG_City=data.get(0).get("OG_City");
		c.Enter_OG_Address_city(OG_City);
		String OG_State=data.get(0).get("OG_State");
		c.Enter_OG_Address_state(OG_State);
		String OG_Zip=data.get(0).get("OG_Zip");
		c.Enter_OG_Address_zip(OG_Zip);
		String OG_Country=data.get(0).get("OG_Country");
		c.Enter_OG_Address_Country(OG_Country);
		String OG_PhoneHome=data.get(0).get("OG_PhoneHome");
		c.Enter_OG_HomeNumber(OG_PhoneHome);
		String OG_EmailAddress=data.get(0).get("OG_EmailAddress");
		c.Enter_OG_email(OG_EmailAddress);
		String OG_CompanyName=data.get(0).get("OG_CompanyName");
		c.Enter_OG_CompanyName(OG_CompanyName);
		String OG_Work_Street=data.get(0).get("OG_Work_Street");
		c.Enter_OG_Workaddress_street(OG_Work_Street);
		String OG_Work_City=data.get(0).get("OG_Work_City");
		c.Enter_OG_Workaddress_city(OG_Work_City);
		String OG_Work_State=data.get(0).get("OG_Work_State");
		c.Enter_OG_Workaddress_state(OG_Work_State);
		
		
		String OG_Work_Zip=data.get(0).get("OG_Work_Zip");
		c.Enter_OG_Workaddress_zip(OG_Work_Zip);
		String OG_Occupation=data.get(0).get("OG_Occupation");
		c.Enter_OG_Occupation(OG_Occupation);
		String OG_Work_Phone=data.get(0).get("OG_Work_Phone");
		c.Enter_OG_Work_phoneno(OG_Work_Phone);
		
		
	}
	
	@And("^Click on EmergencyContact$")
	public void Click_Emergency_Contact()
	{
		c.Click_EmergencyContact_Checkbox();
	}
	
	@And("^Click on AllowedToPickup$")
	public void Click_Allowed_To_Pickup()
	{
		c.Click_Allowed_to_Pickup();
		
	}
	
	@And("^Search child \"(.*)\"$")
	public void Search_child(String a)
	{
		c.search_child(a);
	}
	
	@And("^Click on Edit link for respective child$")
	public void Click_Edit_link_respective_child()
	{
		c.Click_Child_Edit_link();
	}
	
	@And("^Click on PersonalInformation Edit link$")
	public void Click_PerosnalInfo()
	{
		c.Click_PersonalInfo_Edit();
	}
	
	@And("^Update the values on Basic Info page$")
	public void Update_value_Basic_info_page(DataTable dt)
	{
		List<Map<String,String>> data=dt.asMaps(String.class, String.class);
		
		String childheight=data.get(0).get("Height");
		wait.until(ExpectedConditions.visibilityOf(c.child_height));
		c.child_height.clear();
		c.Enter_child_height(childheight);
		
		String childweight=data.get(0).get("Weight");
		c.child_weight.clear();
		c.Enter_child_weight(childweight);
	
		String childmeal=data.get(0).get("Meal");
		c.select_meal(childmeal);	
	}
	
	@And("^Click on Child Personal info Edit page Update button$")
	public void Click_Child_Personal_info_Edit_Page_Update_button()
	{
		c.Click_Child_PersonalInfo_edit_Update_button();
	}
	
	@Then("^Click on PrimaryGuardian Edit link$")
	public void Click_PrimaryGuardian_EditLink()
	{
		c.Click_PrimaryGuardian_Edit_link();
	}
	@And("^Update the values on Primary Guardian Info page$")
	public void Update_value_on_Primary_Guardian_page(DataTable dt)
	{
		List<Map<String,String>> data=dt.asMaps(String.class, String.class);

		String PStreet=data.get(0).get("P_Street");
		wait.until(ExpectedConditions.visibilityOf(c.Address_Street));
		c.Address_Street.clear();
		c.Enter_Address_Street(PStreet);
		
		String PZip=data.get(0).get("P_Zip");
		c.Address_Zip.clear();
		c.Enter_Address_zip(PZip);
		
		String PPhoneHome= data.get(0).get("P_PhoneHome");
		c.HomeNumber.clear();
		c.Enter_HomeNumber(PPhoneHome);
		
		String WorkStreet=data.get(0).get("Work_Street");
		c.Parent_Work_Street.clear();
		c.Enter_parent_Workaddress_street(WorkStreet);
		
	}
	
	@And("^Click on Parent info Edit page Update button$")
	public void Click_Parent_info_Edit_page_Update_button()
	{
		c.Click_Edit_Parent_Update_button();
	}
	
	@And("^Click on delete link for respective child$")
	public void Click_Delete_link_respective_child()
	{
		c.Click_Child_delete_link();
	}
	
	@And("^Click on YES button$")
	public void Click_YES_button()
	{
		wait.until(ExpectedConditions.elementToBeClickable(c.Child_delete_YES_button));
		c.Child_delete_YES_button();
	}

	@And("^Click on Check-in/out link for respective child$")
	public void Click_Checkin_Link()
	{
		c.click_Children_Checkin_out_link();
	}
	
	
	@And("^Click on Checkin-YES button$")
	public void Checkin_Yes_button()
	{
		wait.until(ExpectedConditions.elementToBeClickable(c.Child_Checkin_YES_button));
		c.Child_Checkin_YES_button();
	}
		
	@And("^Click on Checkout YES button$")
	public void Checkout_Yes_button()
	{
		wait.until(ExpectedConditions.elementToBeClickable(c.Child_Checkout_YES_button));
		c.Child_Checkout_YES_button();
	}

	@Then("^Verify the child name gets populated$")
	public void Verify_child_name_gets_populated()
	{
		c.FirstChildAfterSearch.isDisplayed();
	}
	
	@And("^Click on Waitlist List tab$")
	public void Click_Waitlist_Tab()
	{
		c.Click_WaitList_Link();
	}
	
	@And("^Click on Enroll button for child$")
	public void Click_Enroll_button()
	{
		c.Click_Waitlist_Enroll_child_Button();
	}
	
	@And("^Click on Remove button for child$")
	public void Click_remove_button()
	{
		c.Click_waitlist_Remove_child_button();
	}
	
	@Then("^Click on Dashboard tab$")
	public void Click_on_DashboardTab()
	{
		dash.Click_DashboardTab();
	}
	
	@Then("^Verify that child \"(.*)\" is displayed on Dashboard under Upcoming Birthday section$")
	public void Verify_Child_Birthday_Upcoming_Birthday(String s)
	{
		Assert.assertTrue(dash.NameofFirstchild_UpcomingBirthday.getText().contains(s));
	}
	
	@Then("^Click on Enrollment Edit link$")
	public void Click_Enrollment_Edit_link()
	{
		wait.until(ExpectedConditions.elementToBeClickable(c.Camp_edit_Link));
		c.Click_child_Enrollment_Camps_Edit_Link();
		//String actualcampvalue= c.Child_CampSelectedValue.getText();
		//System.out.println("value is : " +actualcampvalue);
	}
	
	@Then("^Verify the value selected for Camps dropdown is \"(.*)\"$")
	public void Verify_the_value_selected_for_Camps_dropdown(String campvalue)
	{
//		String actualcampvalue= c.Child_CampSelectedValue.getText();
	//	System.out.println(actualcampvalue);
		Assert.assertEquals(campvalue, c.Child_CampSelectedValue);
	}
	
	@And("^Click on Employee tab$")
	public void Click_Employee_tab()
	{
		e.Click_EmployeeTab();	
	}
	
	@And("^Click on Employee List tab$")
	public void Click_Employee_list_tab()
	{
		e.Click_EmployeeListTab();
	}
	
	@And("^Click on Add Employee button$")
	public void Click_AddEmployee_button()
	{
		e.Click_addNewEmployee_Button();
	}
	
	@And("^Enter the values on Primary Info page$")
	public void Enter_values_primary_infoPages(DataTable dt)
	{
		List<Map<String,String>> data=dt.asMaps(String.class, String.class);
		String empFN=data.get(0).get("empfirstname");
		e.Enter_Employee_FirstName(empFN);
		String empLN= data.get(0).get("emplastname");
		e.Enter_Employee_Lastname(empLN);
		String empgender=data.get(0).get("gender");
		e.Enter_gender(empgender);
		String empprofilepic=data.get(0).get("profilepic");
		e.Upload_Profile_Pic(empprofilepic);
		String empDOB=data.get(0).get("DOB");
		e.Enter_emp_DOB(empDOB);
		String empDesignation=data.get(0).get("Designation");
		e.Enter_Designation(empDesignation);
		String empSecurityProfile=data.get(0).get("SecurityProfile");
		e.Enter_securityProfile(empSecurityProfile);
		String empShift=data.get(0).get("Shift");
		e.Enter_Shift(empShift);
		String empDateofJoining= data.get(0).get("DateofJoining");
		e.Enter_DOJ(empDateofJoining);
		String empDateofLeaving= data.get(0).get("DateofLeaving");
		e.Enter_DOL(empDateofLeaving);
		String empSSN=data.get(0).get("SSN");
		e.Enter_SSN(empSSN);
	}
	
	@And("^Update the values on Primary Info page$")
	public void Update_values_primary_infoPages(DataTable dt)
	{
		List<Map<String,String>> data=dt.asMaps(String.class, String.class);
		String empDesignation=data.get(0).get("Designation");
		e.Enter_Designation(empDesignation);
		String empSecurityProfile=data.get(0).get("SecurityProfile");
		e.Enter_securityProfile(empSecurityProfile);
		String empShift=data.get(0).get("Shift");
		e.Enter_Shift(empShift);
		
	}
	
	
	@And("^Click on Next buton$")
	public void Click_Next_button()
	{
		e.Click_Employee_Next_Button();
	}
	
	@And("^Enter the values on Contact Details page$")
	public void Enter_values_Contact_Details_page(DataTable dt)
	{
		List<Map<String,String>> data=dt.asMaps(String.class, String.class);
		String street=data.get(0).get("Street");
		e.Enter_Employee_Street(street);
		String City=data.get(0).get("City");
		e.Enter_Employee_City(City);
		String State= data.get(0).get("State");
		e.Enter_Employee_state(State);
		String Zip=data.get(0).get("Zip");
		e.Enter_Employee_zip(Zip);
		String PhoneHome=data.get(0).get("Phone_Home");
		e.Enter_Phone_Home(PhoneHome);
		String Email=data.get(0).get("Email");
		e.Enter_Email(Email);
	
		
	}
	@And("^Enter values on Emergency Contacts page$")
	public void Enter_Emergency_contacts(DataTable dt)
	{
		List<Map<String,String>> data=dt.asMaps(String.class, String.class);
		String person=data.get(0).get("Person");
		e.Enter_Emergency_Person(person);
		String Relationship=data.get(0).get("Relationship");
		e.Enter_Emergency_Relationship(Relationship);
		String EmergencyPhone1=data.get(0).get("EmergencyPhone1");
		e.Enter_Emergency_Contact1(EmergencyPhone1);				
		
	}
	
	@And("^Enter Values on Login Details page$")
	public void Enter_values_loginDetails_page(DataTable dt)
	{
		List<Map<String,String>> data=dt.asMaps(String.class, String.class);
		String username=data.get(0).get("username");
		e.Enter_username(username);
		String password=data.get(0).get("password");
		e.Enter_password(password);
		String confpassword=data.get(0).get("confpassword");
		e.Enter_confirmpassword(confpassword);
	}
	
	@And("^Click on Employee submit page$")
	public void Click_Employee_SubmitPage()
	{
		e.Click_employee_submit_button();
	}
	
	@And("^Verify the alert popup message as \"(.*)\"$")
	public void Verify_alert_popup_message(String actualvalue)
	{
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		Assert.assertEquals(text, actualvalue);
	}
	
	@And("^Search for an employee \"(.*)\"$")
	public void Search_an_employee(String x)
	{
		e.Enter_employee_search(x);
	}
	
	@And("^click on Edit link for respective employee$")
	public void Click_Edit_Link()
	{
		e.Click_edit_link();
	}
	
	@And("^Click on Employee Update button$")
	public void Click_employee_update_button()
	{
		e.Click_Employee_Update_button();
	}
	
	@And("^Click on Delete link$")
	public void Click_Delete_link()
	{
		e.Click_delete_link();
	}
	
	@And("^Click on Delete YES button$")
	public void Click_delete_link()
	{
		driver.switchTo().alert().accept();
	}
	
	@And("^Click on CheckIn button$")
	public void Click_checkin_button()
	{
		e.Click_Checkin_button();
	}
	
	@And("^Click on CheckIn YES button$")
	public void Click_CheckIn_Yes_button()
	{
		e.Click_CheckIn_Yes_button();
	}
	
	@And("^Click on CheckOut button$")
	public void Click_checkout_button()
	{
		e.Click_Checkout_button();
	}
	
	@And("^Click on CheckOut YES button$")
	public void Click_Checkout_YES_button()
	{
		e.Click_Checkout_Yes_button();
	}
	
	@And("^Click on Employee Attendance tab$")
	public void Click_Employee_attendance_tab()
	{
		e.Click_Emp_AttendanceTab();
	}
	
	@And("^Click on Employee Shift tab$")
	public void Click_Employee_Shift_tab()
	{
		e.Click_on_Employee_Shift_tab();
	}
	
	@And("^Click on AddNewShift button$")
	public void Click_AddNewShiftButton()
	{
		e.Click_AddNewShift_button();
	}
	
	@And("^Enter Value in below fields to add shift$")
	public void Enter_Values_add_shift(DataTable dt)
	{
		List<Map<String,String>> data=dt.asMaps(String.class, String.class);
		String ShiftName=data.get(0).get("ShiftName");
		e.Enter_ShiftName(ShiftName);
		String StartTime=data.get(0).get("StartTime");
		e.Enter_StartTime(StartTime);
		String EndTime=data.get(0).get("EndTime");
		e.Enter_EndTime(EndTime);
	}
	
	@And("^Click on ADD button$")
	public void Click_Shift_Add_button()
	{
		e.Click_ADD_button();
		
	}
	
	@And("^Search a shift \"(.*)\"$")
	public void Search_shift(String s)
	{
		e.Enter_employee_search(s);
	}
	
	@And("^Click on ShiftEdit link$")
	public void Click_ShiftEdit_Link()
	{
		e.Click_ShiftEdit_link();
	}
	
	@And("^update Value for ShiftName as \"(.*)\"$")
	public void Update_shift(String s)
	{
	
		e.Enter_ShiftName(s);
		
	}
	
	@And("^Click on UPDATE button$")
	public void Click_Update_Button()
	{
		e.Click_Shift_update_button();
	}
	
	@And("^Click on ShiftDelete link$")
	public void Click_shift_delete_link()
	{
		e.Click_ShiftDelete_link();
	}
	
	@And("^Click on Shift_Delete Yes button$")
	public void Click_Shift_delete_yes_button()
	{
		driver.switchTo().alert().accept();
	}
	
	@And("^Click on Billing tab$")
	public void Click_Billing_Tab()
	{
	b.Click_BillingTab();	
	}
	
	@And("^Click on BasePackage tab$")
	public void Click_BasePackage()
	{
		b.Click_BasePackage();
	}
	
	@And("^Click on AddBasePackage button$")
	public void Click_AddBasePackage_button()
	{
		b.Click_AddNewPackage_Button();
	}
	
	@And("^Enter value in below fields$")
	public void Enter_value_below_field(DataTable dt)
	{
		List<Map<String,String>> data=dt.asMaps(String.class, String.class);
		wait.until(ExpectedConditions.visibilityOf(b.PackageName));
		String Package_Name= data.get(0).get("Package_Name");
		b.Enter_Package_Name(Package_Name);
		wait.until(ExpectedConditions.textToBePresentInElementValue(b.PackageName, Package_Name));
		String Applicable_Class=data.get(0).get("Applicable_Class");
		b.Select_ApplicableClasses(Applicable_Class);
		String Amount=data.get(0).get("Amount");
		b.Enter_Package_amount(Amount);
		String Tax=data.get(0).get("Tax");
		b.Select_Tax(Tax);
		String Description=data.get(0).get("Description");
		b.Enter_Description(Description);
	}
	
	@And("^Click on Active checkbox$")
	public void Click_Active_CheckBox()
	{
		b.Click_Active_check_box();
	}
	
	
	@And("^Click on Package_ADD button$")
	public void Click_Package_Add_button()
	{
		b.Click_ADDPackageButton();
	}
	
	@And("^Search a Package \"(.*)\"$")
	public void search_package(String s)
	{
		b.SearchBasePackage(s);
	}
	
	@And("^Click on Package_Update button$")
	public void Click_Package_Update_button()
	{
		b.Click_Package_UPDATE_button();
	}
	
	@And("^Update value in below fields$")
	public void Update_value_below_fields(DataTable dt)
	{
		List<Map<String,String>> data=dt.asMaps(String.class, String.class);
		wait.until(ExpectedConditions.visibilityOf(b.updateApplicableClass));
		String Applicable_Class=data.get(0).get("Applicable_Class");
		b.Update_select_applicable_class(Applicable_Class);
		// Amount=data.get(0).get("Amount");
		//b.Enter_Package_amount(Amount);
		wait.until(ExpectedConditions.visibilityOf(b.UpdatePackageTax));
		String Tax=data.get(0).get("Tax");
		b.Update_Selected_Tax(Tax);
		
	}
	
	@And("^Click on Edit link for respective package$")
	public void Click_Package_Edit_link()
	{
		b.Click_Package_Edit_link();
	}
	
	@And("^Click on Delete link for respective package$")
	public void Click_Package_delete_link()
	{
		b.Click_Package_delete_link();
	}
	
	@And("^Click on Package_Delete Yes button$")
	public void Click_package_delete_YES_button()
	{
		wait.until(ExpectedConditions.elementToBeClickable(b.Package_delete_YES_button));
		b.Click_Package_Delete_YES_button();
	}
	
	@And("^Click on Additional Charge tab$")
	public void Click_AdditionalCharges_tab()
	{
	a.Click_AdditionalCharges_link();	
	}
	
	@And("^Click on AddAdditionalCharge button$")
	public void Click_AdditionalCharges_button()
	{
		a.Click_AddAdditionalChargesButton();
	}
	
	@And("^Enter value in below Additional Charges fields$")
	public void Enter_Value_AdditionalChargesFilds(DataTable dt)
	{
		List<Map<String,String>> data=dt.asMaps(String.class, String.class);
		wait.until(ExpectedConditions.visibilityOf(a.ChargeName));
		String ChargeName=data.get(0).get("ChargeName");
		a.Enter_ChargeName(ChargeName);
		String Date=data.get(0).get("Date");
		a.Enter_ChargeDate(Date);
		String Applicable_on=data.get(0).get("Applicable_on");
		a.Select_ApplicableOn(Applicable_on);
		String ApplicableRef=data.get(0).get("ApplicableRef");
		a.Select_ApplicableRef(ApplicableRef);
		String Description=data.get(0).get("Description");
		a.Enter_ChargeDescription(Description);
		String Amount=data.get(0).get("Amount");
		a.Enter_ChargeAmount(Amount);
		String Tax=data.get(0).get("Tax");
		a.Select_tax(Tax);
		
	}
	
	@And("^Click on Additionalcharge_ADD button$")
	public void Click_Additionalcharge_ADD_button()
	{
		a.Click_Charges_ADD_Button();
	}
	
	@And("^Search an AdditionalCharge \"(.*)\"$")
	public void Search_AdditionalCharge(String s)
	{
		a.Enter_AdditionalChargesSearch(s);
	}
	
	@And("^Click on Additional Charge Edit link$")
	public void Click_AdditionalCharge_edit()
	{
		a.Click_EditAdditionalCharges_Link();
	}
	
	@And("^Update value in below Additional Charges fields$")
	public void Update_Value_AdditionalCharges(DataTable dt)
	{
		List<Map<String,String>> data=dt.asMaps(String.class, String.class);
		wait.until(ExpectedConditions.elementToBeClickable(a.Updated_ApplicableOn));
		String updateApplicable_on=data.get(0).get("Applicable_on");
		a.Update_Select_ApplicableOn(updateApplicable_on);
		wait.until(ExpectedConditions.elementToBeClickable(a.Updated_ApplicableRef));
		String UpdateApplicableRef=data.get(0).get("ApplicableRef");
		a.Update_Select_ApplicableRef(UpdateApplicableRef);
	}
	
	@And("^Click on AdditionalCharges_UPDATE button$")
	public void Click_additionalcharges_Update_Button()
	{
		a.Click_Charges_UPDATE_button();
	}
	
	@And("^Click on Additional Charge Delete link")
	public void Click_Additional_Charge_DeleteLink()
	{
		a.Click_DeleteAdditionalChargeLink();
	}
	
	@And("^Click on Additional Charge YES buton$")
	public void Click_AdditionalCharge_Delete_YES_button()
	{
		wait.until(ExpectedConditions.elementToBeClickable(a.Charges_Delete_YES_button));
		a.Click_Charges_Delete_YES_button();
	}
	
	@And("^Click on Discount tab$")
	public void Click_Discount_tab()
	{
		d.Click_Discounts_Links();
	}
	
	@And("^Click on Add Discount button$")
	public void Click_Add_Discount_button()
	{
		d.Click_Add_Discount_button();
	}
	
	@And("^Enter Discount value in below fields$")
	public void Enter_Discount_Value_below_fields(DataTable dt)
	{
		List<Map<String,String>> data=dt.asMaps(String.class, String.class);
		wait.until(ExpectedConditions.elementToBeClickable(d.DiscountName));
		String DiscountName=data.get(0).get("DiscountName");
		d.Enter_DiscountName(DiscountName);
		String Description= data.get(0).get("Description");
		d.Enter_DiscountDescription(Description);
		String Discount_Value=data.get(0).get("DiscountValue");
		d.Enter_DiscountValue(Discount_Value);		
	}
	
	@And("^Select Active option$")
	public void Select_active_option()
	{
		wait.until(ExpectedConditions.elementToBeClickable(d.ActiveCheckbox));
		d.Click_ActiveCheckbox();
	}
	
	@And("^Click on Discount_ADD button$")
	public void Click_Discount_ADD_button()
	{
		d.Click_Discount_ADD_button();
	}
	
	@And("^Select Limited Period offer$")
	public void Select_limited_period()
	{
		wait.until(ExpectedConditions.elementToBeClickable(d.LimitedPeriodCheckbox));
		d.Click_LimitedPeriodCheckbox();
	}
	
	@And("^Enter Start Date and End Date$")
	public void Enter_startdate_enddate(DataTable dt)
	{
		List<Map<String,String>> data=dt.asMaps(String.class, String.class);
		wait.until(ExpectedConditions.visibilityOf(d.Discount_StartDate));
		String StartDate= data.get(0).get("Start_Date");
		d.Enter_StartDate(StartDate);
		String Enddate= data.get(0).get("End_Date");
		d.Enter_EndDate(Enddate);	
	}
	
	@And("^Search a Discount \"(.*)\"$")
	public void Search_Discount(String s)
	{
		d.Enter_Discount_Search_button(s);
	}
	
	@And("^Click on Edit link for respective discount$")
	public void Click_Edit_Link_respective_discount()
	{
		d.Click_Discount_Edit();
	}
	
	@And("^Update Discount value in below fields$")
	public void Update_Discount_value_below_fields(DataTable dt)
	{
		List<Map<String,String>> data=dt.asMaps(String.class, String.class);
		wait.until(ExpectedConditions.visibilityOf(d.Update_description));
		String Updated_description=data.get(0).get("Description");
		d.Enter_Update_description(Updated_description);
		String Updated_Discount_Value=data.get(0).get("DiscountValue");
		d.Enter_Update_discount_Value(Updated_Discount_Value);
		
	}
	
	@And("^Click on Discount_Update button$")
	public void Click_Discount_Update_Button()
	{
		d.Click_Discount_UPDATE_button();
	}
	
	@And("^Click on Delete link for respective discount$")
	public void Click_Delete_Link_for_Discount()
	{
		d.Click_Discount_delete();
	}
	
	@And("^Click on Discount_Delete_YES button$")
	public void Click_Discount_Delete_YES_button()
	{
		wait.until(ExpectedConditions.elementToBeClickable(d.Discount_Delete_YES_button));
		d.Click_Discount_Delete_YES_button();
	}
	
	@And("^Select AllOptions under Applicable On sections$")
	public void Select_AllOptions_ApplicableOn_Section()
	{
		d.Click_BasePackageCheckbox();
		d.Click_CampCheckbox();
		d.Click_ActivityCheckbox();
		d.Click_ApplyCheckbox();
		d.Click_AdditionalCheckbox();
	}
	
	@And("^Click on Adjustments tab$")
	public void Click_Adjustments_tab()
	{
		ad.Click_Adjustments_tab();
	}
	
	@And("^Click on AddAdjustment button$")
	public void Click_AddAdjustments_button()
	{
		ad.Click_Add_Adjustments_button();
	}
	
	@And("^Enter value in below Adjsutment fields$")
	public void Enter_value_Adjustments_field(DataTable dt)
	{
		List<Map<String,String>> data=dt.asMaps(String.class, String.class);
		String AdjustDate=data.get(0).get("AdjustDate");
		ad.Enter_Adjust_date(AdjustDate);
		String AdjustType=data.get(0).get("AdjustType");
		ad.Select_AdjustType_link(AdjustType);
		String ApplicableOn=data.get(0).get("ApplicableOn");
		ad.select_ApplicableOn(ApplicableOn);
		String Description=data.get(0).get("Description");
		ad.Enter_Adjustments_description_link(Description);
		String Amount=data.get(0).get("Amount");
		ad.Enter_Adjustments_Amount(Amount);		
		
	}
	
	@And("^Click on Adjustment_ADD button$")
	public void Click_Adjustment_ADD_button()
	{
		ad.click_Adjustments_ADD_button();
	}
	
	@And("^Seacrh an Adjustment \"(.*)\"$")
	public void Search_an_adjustment(String s)
	{
		ad.Enter_Adjustments_Search_link(s);
	}
	
	@And("^Click on Edit link for respective adjustment$")
	public void Click_Edit_link_respective_adjustment()
	{
		ad.Click_Edit_Adjustments_link();
	}
	
	@And("^Update value in below Adjsutment fields$")
	public void Update_value_Adjustments_fields(DataTable dt)
	{
		List<Map<String,String>> data=dt.asMaps(String.class, String.class);
		String Update_AdjustDate=data.get(0).get("AdjustDate");
		ad.Enter_Updated_Adjustment_date(Update_AdjustDate);
		String Update_Description=data.get(0).get("Description");
		ad.Enter_Updated_adjust_Description(Update_Description);
				
	}
	
	@And("^Click on Adjustment_UPDATE button$")
	public void Click_Adjustments_UPDATE_Button()
	{
		ad.click_Adjust_Update_button();
	}
	
	@And("^Click on Delete link for respective adjustment$")
	public void Click_Adjustment_Delete_link()
	{
		ad.Click_Delete_adjustments_link();
	}
	
	@And("^Click on Adjustment_Delete_YES confirmation button$")
	public void Click_Adjustment_delete_YES_confirmation_button()
	{
		wait.until(ExpectedConditions.elementToBeClickable(ad.Adjustment_Delete_YES_button));
		ad.click_Adjustment_Delete_YES_button();
	}
	
	public void scrollIntoView(WebElement e)
	{
	
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", e);
	}
	
	@And("^Click on GenerateInvoice tab$")
	public void Click_generateInvoice_tab()
	{
	/*	wait.until(ExpectedConditions.visibilityOf(g.GenerateInvoice_link));
		Actions action = new Actions(driver);
		action.moveToElement(g.GenerateInvoice_link);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", g.GenerateInvoice_link);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");*/
		scrollIntoView(g.GenerateInvoice_link);
		wait.until(ExpectedConditions.visibilityOf(g.GenerateInvoice_link));
		g.Click_GenerateInvoice_link();
	}
	
	@And("^Select below 4 options$")
	public void Select_4Options(DataTable dt)
	{
		List<Map<String,String>> data=dt.asMaps(String.class, String.class);
		wait.until(ExpectedConditions.elementToBeClickable(g.SelectClass));
		String Class=data.get(0).get("Class");
		g.SelectClass(Class);
		wait.until(ExpectedConditions.elementToBeClickable(g.SelectChild));
		String Child=data.get(0).get("Child");
		g.SelectChild(Child);
		wait.until(ExpectedConditions.elementToBeClickable(g.SelectMonth));
		String Month=data.get(0).get("Month");
		g.SelectMonth(Month);
		String Year=data.get(0).get("Year");
		g.SelectYear(Year);
	}
	
	@And("^Select below 3 options$")
	public void Select_3Options(DataTable dt)
	{
		List<Map<String,String>> data=dt.asMaps(String.class, String.class);
		wait.until(ExpectedConditions.elementToBeClickable(g.SelectClass));
		String Class=data.get(0).get("Class");
		g.SelectClass(Class);
		wait.until(ExpectedConditions.elementToBeClickable(g.SelectChild));
		String Month=data.get(0).get("Month");
		g.SelectMonth(Month);
		String Year=data.get(0).get("Year");
		g.SelectYear(Year);
	}
	
	@And("^Click on GenerateInvoice button$")
	public void Click_GenerateInvoice_button()
	{
		g.Click_GENERATE_INVOICE_button();
	}
	
	@And("^Click on EmailInvoiceToGuardians checkbox button$")
	public void Click_EmailToGuardians_Button()
	{
		g.Select_Email_To_Guardians();
	}
	
	@And("^Click on InvoiceList tab$")
	public void Click_InvoiceListTab()
	{
		scrollIntoView(i.InvoiceListTab);
		i.Click_InvoiceListtab();
	}
	
	@And("^Enter Child name \"(.*)\"$")
	public void Enter_ChildName(String s)
	{
		i.Enter_InvoicePage_Search(s);
	}
	
	@And("^Click on View Details link$")
	public void Click_ViewDetails() {
		i.Click_FirstInvoice();
	}
	
	@Then("^Verify user page title as \"(.*)\"$")
	public void VerifyPageTitle(String s)
	{
		Assert.assertEquals(s, driver.getTitle());
	}
	
	
	
	
}
