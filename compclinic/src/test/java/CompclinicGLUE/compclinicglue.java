package CompclinicGLUE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PAGES.HeaderLinksPage;
import PAGES.HomePage;
import PAGES.LandingPage;
import PAGES.LoginPage;
import PAGES.RegisterationPage;
import PAGES.ServicesDropdownPage;
import PAGES.ShippingAddressPage;
import PAGES.ShoppageDropdown;
import PAGES.UserAccountInfoPage;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.deps.com.google.gson.annotations.Until;
import junit.framework.Assert;

public class compclinicglue {

	public WebDriver driver;
	public HomePage hp;
	public RegisterationPage rp;
	public LoginPage lp;
	public LandingPage lan;
	public ShippingAddressPage sh;
	public HeaderLinksPage headp;
	public ServicesDropdownPage servicep;
	public ShoppageDropdown shoppage;
	public UserAccountInfoPage useracc;
	public WebDriverWait w;
	public Scenario s;
	public Properties prop;

	@Before
	public void method(Scenario s) throws IOException {
		this.s = s;
		FileInputStream fs = new FileInputStream(
				"C:\\AnishaWorkspace\\compclinic\\src\\test\\resources\\repository\\file.properties");
		prop = new Properties();
		prop.load(fs);
	}

	@Given("^Launch compclinic website$")
	public void LaunchCompclinicWebsite() {
		System.setProperty("webdriver.chrome.driver", prop.getProperty("chromedriverpath"));
		driver = new ChromeDriver();
		hp = new HomePage(driver);
		rp = new RegisterationPage(driver);
		lp = new LoginPage(driver);
		lan = new LandingPage(driver);
		sh = new ShippingAddressPage(driver);
		shoppage= new ShoppageDropdown(driver);
		headp = new HeaderLinksPage(driver);
		servicep = new ServicesDropdownPage(driver);
		useracc= new UserAccountInfoPage(driver);
		w = new WebDriverWait(driver, 10);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
	}

	@When("^click on Register link$")
	public void Click_Registeration_Link() {
		System.out.println("inside registeration 1st");
		w.until(ExpectedConditions.elementToBeClickable(hp.RegisterLink));

		hp.ClickRegisterLink();

	}

	@When("^Enter firstname,lastname,contactnumber,Emailid, Password, Re_Password like \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\" value$")
	public void enter_firstname_lastname_conatctNumber_Emailid_Password_Re_enterpassword_like_value(String un,
			String ln, String cn, String em, String pwd, String re_pwd) throws Exception {

		w.until(ExpectedConditions.elementToBeClickable(rp.Firstname));
		rp.EnterFirstName(un);
		w.until(ExpectedConditions.visibilityOf(rp.Lastname));
		rp.EnterLastName(ln);
		rp.EnterContactNumber(cn);
		rp.EnterEmailId(em);
		rp.EnterPassword(pwd);
		rp.Re_EnterPassword(re_pwd);
		rp.check_show_password();
		Thread.sleep(3000);
	}

	@And("^Click on Register Button$")
	public void click_Register_button_method() {
		w.until(ExpectedConditions.elementToBeClickable(rp.Registerbutton));
		rp.Click_Register_Button();
	}

	@SuppressWarnings("deprecation")
	@Then("^verify message with \"(.*)\"$")
	public void verify_message(String expectedoutput) {
		try {
			w.until(ExpectedConditions.visibilityOf(rp.Registeration_confirmation_message));
			Assert.assertTrue((rp.Registeration_confirmation_message.getText()).contains(expectedoutput));

		} catch (Exception e) {
			s.write(e.getMessage());
		}

	}

	@SuppressWarnings("deprecation")
	@Then("^verify login message with \"(.*)\" and \"(.*)\"$")
	public void verify_login_message_output(String expectedoutput, String type) {
		try {

			if (type.equals("valid")) {
				Assert.assertEquals(expectedoutput, driver.getTitle());
			} else {
				Assert.assertTrue((rp.Registeration_confirmation_message.getText()).contains(expectedoutput));
			}
		} catch (Exception e) {
			s.write(e.getMessage());
		}
	}

	@Then("^user clicks on Login link$")
	public void user_clicks_on_Login_link() {
		hp.ClickLoginLink();
	}

	@When("^user enters Emaild and Password like \"(.*)\" and \"(.*)\" value$")
	public void user_enters_Emaild_and_Password_like_and_value(String x, String y) {
		w.until(ExpectedConditions.visibilityOf(lp.LoginPage_Email));
		lp.LoginP_Enter_Email(x);
		lp.LoginP_Enter_Password(y);
	}

	@When("^user clicks on Login button$")
	public void user_clicks_on_Login_button() {
		lp.Click_LoginP_LoginButton();
	}

	@When("^user clicks on Forgot password link$")
	public void user_clicks_on_Forgot_password_link() {
		lp.Click_LoginP_ForgotPasswordlink();
	}

	@When("^User enters emailid \"(.*)\"$")
	public void user_enters_emailid(String x) {
		lp.Enter_Email_Forgot_Password.sendKeys(x);
	}

	@When("^user clicks on Submit button$")
	public void user_clicks_on_Submit_button() {
		lp.Forgot_Password_Submit_button.click();
	}

	@SuppressWarnings("deprecation")
	@Then("^verify the page title \"(.*)\" getting displayed$")
	public void verify_the_message_getting_displayed(String title) {

		Assert.assertEquals(title, driver.getTitle());

	}

	@When("^user clicks on Register link$")
	public void user_clicks_on_Register_link() {
		lp.RegisterLink_LoginPage();
	}

//	@SuppressWarnings("deprecation")
//	@Then("^verify that user navigates to Regiteration page$")
//	public void Verify_user_navigation()
//	{
//		Assert.assertEquals("Comp Clinic - Register", driver.getTitle());
//	}

	@When("^close site$")
	public void close_browser() {
		driver.close();
	}

	@When("^user enters Email password \"(.*)\" and \"(.*)\" value$")
	public void user_enters_Emaild_and_Password_to_login_and_value(String arg1, String arg2) {
		lp.LoginPage_Email.sendKeys(arg1);
		lp.LoginP_Enter_Password(arg2);
	}

	@And("^enter \"(.*)\" in searchbar$")
	public void enter_product_searchbar(String x) {
		lan.Enter_searchbar(x);
	}

	@And("^click on search button$")
	public void click_on_search_button() {
		w.until(ExpectedConditions.visibilityOf(lan.searchbutton));
		lan.click_searchbutton();
	}

	@And("^click on the item you want to purchase$")
	public void clickon_item_to_purchase() {
		w.until(ExpectedConditions.elementToBeClickable(lan.FirstListedOption));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", lan.FirstListedOption);
		// lan.Select_FirstListedOption();
	}

	@And("^click on Add to Cart button$")
	public void click_AddtoCart_button() {
		w.until(ExpectedConditions.elementToBeClickable(lan.AddtoCartbutton));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", lan.AddtoCartbutton);
		// lan.Click_AddtoCartbutton();
	}

	@And("^Enter the fields in shipping address$")
	public void Enter_shipping_Address(DataTable dt) throws Exception {
		List<Map<String, String>> data = dt.asMaps(String.class, String.class);

		w.until(ExpectedConditions.visibilityOf(lan.phoneno));
		Thread.sleep(2000);

		String Phone_No = data.get(0).get("Phone_No");

		w.until(ExpectedConditions.visibilityOf(lan.address));
		Thread.sleep(2000);
		String Address_Line1 = data.get(0).get("Address_Line1");

		Thread.sleep(2000);
		w.until(ExpectedConditions.visibilityOf(lan.address2));
		String Address_Line2 = data.get(0).get("Address_Line2");

		Thread.sleep(2000);
		w.until(ExpectedConditions.visibilityOf(lan.city));
		String City = data.get(0).get("City");

		Thread.sleep(2000);
		w.until(ExpectedConditions.visibilityOf(lan.state));
		String State = data.get(0).get("State/Province");

		Thread.sleep(2000);
		w.until(ExpectedConditions.visibilityOf(lan.zip));
		String Zip = data.get(0).get("Zip");

		lan.Enter_phoneno(Phone_No);
		lan.Enter_address(Address_Line1);
		lan.Enter_address2(Address_Line2);
		lan.Enter_city(City);
		lan.Enter_state(State);
		lan.Enter_zip(Zip);
	}

	@And("^Edit the fields in shipping address$")
	public void Edit_Shipping_Address(DataTable dt) throws Exception {
		List<Map<String, String>> data = dt.asMaps(String.class, String.class);

		w.until(ExpectedConditions.visibilityOf(lan.UserName));
		Thread.sleep(2000);
		lan.UserName.clear();
		String Full_Name = data.get(0).get("Full_Name");

		w.until(ExpectedConditions.visibilityOf(lan.phoneno));
		Thread.sleep(2000);
		lan.phoneno.clear();
		String Phone_No = data.get(0).get("Phone_No");

		lan.Enter_UserName(Full_Name);
		lan.Enter_phoneno(Phone_No);

	}

	@And("^click on shipping address to delete$")
	public void ShippingAddress_Delete() {
		sh.Click_DeleteAddressButton();
	}

	@And("^select from existing shipping address$")
	public void select_from_existing_shipping_address() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", sh.DeliverAddressButton);
		//sh.Click_DeliverAddressButton();
	}

	@And("^select the existing shipping address to edit$")
	public void select_address_edit() {
		sh.Click_EditAdressButton();
	}

	@And("^click on Update button$")
	public void Click_Update_Button() {
		sh.Click_UpdateButton();
	}

	@And("^click on Pickup from this Address button$")
	public void Pickup_From_Address_option() {
		sh.Pickup_AddressButton();
	}

	@And("^click on Continue button$")
	public void Click_Continue_button() {
		lan.click_continuebutton();
	}

	@And("^Click on Make Payment button$")
	public void Click_MakePyament_Button() {
		w.until(ExpectedConditions.elementToBeClickable(lan.MakePaymentbutton));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", lan.MakePaymentbutton);
		//lan.click_Make_Payment_button();
	}

	@SuppressWarnings("deprecation")
	@Then("Verify user lands on Payment page")
	public void Verify_PageUrl() {
		Assert.assertEquals("Log in to your PayPal account", driver.getTitle());
		s.write("user landed on payment page");
	}

	@And("^user enters coupon code \"(.*)\"$")
	public void user_enters_coupon_code(String x) {
		w.until(ExpectedConditions.visibilityOf(lan.couponcode));
		lan.enter_couponcode(x);
	}

	@And("^click on ApplyCoupon button after entering text$")
	public void click_ApplyCoupon_button() {
		w.until(ExpectedConditions.elementToBeClickable(lan.couponcode));
		lan.click_apply_coupon();
	}

	@SuppressWarnings("deprecation")
	@Then("^Verify Coupon code successfully applied message with \"(.*)\"$")
	public void verify_coupon_code_message(String x) {
		String msg = lan.CouponCodeMessage.getText();
		System.out.println(msg);
		// Assert.assertTrue((lan.CouponCodeMessage.getText()).contains(x));
		Assert.assertEquals(x, msg);
	}

	@And("^user clicks on \"(.*)\"$")
	public void userclicksonHeaderLinks(String x) {

		if (x.equals("Homelink")) {
			headp.Click_HomeLink();
		} else if (x.equals("Aboutuslink")) {
			headp.Click_AboutUsLink();
		} else if (x.equals("ServicesDropdown")) {
			headp.Click_ServicesDropdownlink();
		} else if (x.equals("Transaction_link")) {
			headp.Click_TransactionLink();
		} else {
			headp.Click_ContactLink();
		}
	}

	@SuppressWarnings("deprecation")
	@Then("^verify the \"(.*)\" url with \"(.*)\"$")
	public void VerifyTheLink(String x, String y) {
		Assert.assertEquals(y, driver.getTitle());

	}

	@When("^user clicks on links\"(.*)\"$")
	public void user_clicks_Services_dropdown_links(String link)
	{
		if(link.equals("Data_Recovery_Services"))
		{
			servicep.Click_DataRecoveryServices();
		}
		else if(link.equals("Desktop/Laptop_Repairs"))
				{
				servicep.Click_DesktopLaptopRepairs();
				}
		else if(link.equals("Ipad_Imac_services")) {
			servicep.Click_IpadImacServices();
		}
		else if(link.equals("NetworkingServices")) {
			servicep.Click_NetworkingServices();
		}
		else if(link.equals("MobileRepairing")) {
			servicep.Click_MobileRepairing();
			
		}
		else if(link.equals("Computer/PC"))
		{
			shoppage.Click_Compuere_Pc();
		}
		else if(link.equals("Laptops"))
		{
			shoppage.Click_Laptops();
		}
		else if(link.equals("Tablets")) {
			shoppage.Click_Tablets();
		}
		else {
			s.write("Somethign went wrong");
		}
	}

	@SuppressWarnings("deprecation")
	@Then("^verify page title with \"(.*)\"$")
	public void verify_page_title_Services_Dropdown(String title)
	{
		//Assert.assertEquals(title, headp.Page_Title.getText());
		Assert.assertTrue(title.contains(servicep.hometitle.getText()));
	}
	
	@And("^user clicks on Computer/Pc link$")
	public void user_clicks_Computer_Pc()
	{
		shoppage.Click_Compuere_Pc();
	}
	
	@And("^User clicks on Gaming pc$")
	public void user_clicks_GamingPC()
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", shoppage.GamingComputerOption);
	}
	
	@And("^user clicks on Laptop link$")
	public void user_clicks_Laptop()
	{
		shoppage.Click_Laptops();
	}
	
	@And("^user clicks on Lenovo laptop$")
	public void user_clicks_onLaptop()
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", shoppage.LenovoLaptop);
		
	}
	
	@And("^user clicks on Tablets link$")
	public void user_clicks_Tablet_links()
	{
		shoppage.Click_Tablets();
	}
	
	@And("^User clicks on Samsung Tablet$")
	public void user_clicks_Samsung_tablet()
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", shoppage.SamsungTablet);
	}
	
	@And("^user clicks on NavigationDropdown$")
	public void user_clicks_Navigationdropdown()
	{
		useracc.Click_on_UserDropdown();
	}
	
	@And("^user clicks on ChangePassword link$")
	public void user_clicks_ChangePasswordLink()
	{
		useracc.Click_on_ChangePasswordLink();
	}
	
	@And("^user Enters OldPassowrd\"(.*)\"$")
	public void user_Enters_Oldpassword(String op)
	{
		useracc.Enter_Old_Password(op);
	}
	
	@And("^user Enters NewPassword\"(.*)\"$")
	public void user_Enters_NewPassword(String np)
	{
		useracc.Enter_New_Password(np);
	}
	
	@And("^user Enters Confirm New Password\"(.*)\"$")
	public void user_Enters_Confirm_password(String cp)
	{
		useracc.Enter_Confirm_Password(cp);
	}
	
	@And("^user Clicks on ChangePassword button$")
	public void user_Clicks_ChangePasswordButton()
	{
		useracc.Click_ChangePassword_Button();
	}
	
	@And("^user clicks on MyAccount link$")
	public void user_clicks_MyAccount_link()
	{
		useracc.Click_on_MyAccountLink();
	}
	
	@SuppressWarnings("deprecation")
	@Then("^verify the page title after landing on Account page$")
	public void verify_page_title_on_Account_Page()
	{
		Assert.assertEquals("Comp Clinic - AccountDetails", driver.getTitle());
	}
	
	@SuppressWarnings("deprecation")
	@And("^user verifies the message getting displayed with \"(.*)\"$")
	public void user_verifies_message_Getting_displayed(String x) 
	{
		if(x.equalsIgnoreCase("invalidOldpassword"))
		{
			System.out.println("old password invalid");
		}
		else if(x.equalsIgnoreCase("The new password and confirmation password do not match."))
		
		{
			Assert.assertTrue(useracc.pwdmismatch.getText().contains(x));
		}
		else if(x.equalsIgnoreCase("valid"))
		{
			Assert.assertTrue(rp.Registeration_confirmation_message.getText().contains(x));
		}
		else
		{
			System.out.println("Something went wrong");
		}
	}
	
	
	@And("^user clicks on Logout link$")
	public void user_clicks_logout()
	{
		useracc.Click_LogOffLink();
	}
	
	@SuppressWarnings("deprecation")
	@And("^verify the page_title after logout$")
	public void verify_Page_title()
	{
		Assert.assertEquals("Comp Clinic - Index", driver.getTitle());
	}
	public void footer_links() 
	{
		//not implementing now
	}
	
	
	
}

