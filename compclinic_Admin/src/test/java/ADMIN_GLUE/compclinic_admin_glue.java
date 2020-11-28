package ADMIN_GLUE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PAGES.BrandsPage;
import PAGES.CategoriesPage;
import PAGES.CouponsPage;
import PAGES.ProductsPage;
import PAGES.ServicesPage;
import PAGES.UserDetailsPage;
import PAGES.loginpage;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class compclinic_admin_glue {

	public WebDriver driver;
	public Properties prop;
	public Scenario s;
	public WebDriverWait w;
	public loginpage lp;
	public ProductsPage pp;
	public CategoriesPage cp;
	public BrandsPage bp;
	public ServicesPage sp;
	public CouponsPage coup;
	public UserDetailsPage user;

	@Before
	public void method(Scenario s) throws IOException {
		this.s = s;
		FileInputStream fs = new FileInputStream(
				"C:\\AnishaWorkspace\\compclinic_Admin\\src\\test\\resources\\REPOSITORY\\file.properties");
		prop = new Properties();
		prop.load(fs);

	}

	@Given("^Launch Compclinic Admin Website$")
	public void Launch_Compclinic_Admin_Url() {

		System.setProperty("webdriver.chrome.driver", prop.getProperty("chromepath"));
		driver = new ChromeDriver();
		w = new WebDriverWait(driver, 10);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		lp = new loginpage(driver);
		pp = new ProductsPage(driver);
		cp = new CategoriesPage(driver);
		bp = new BrandsPage(driver);
		sp= new ServicesPage(driver);
		coup= new CouponsPage(driver);
		user= new UserDetailsPage(driver);
	}

	@And("^Enter Email \"(.*)\" value$")
	public void Enter_Email(String email) {
		lp.Enter_Email(email);
	}

	@And("^Enter Password \"(.*)\" value$")
	public void Enter_Password(String password) {
		lp.Enter_Password(password);
	}

	@And("^click on Login button$")
	public void Click_Login_Button() {
		lp.Click_Login_Button();
	}

	@SuppressWarnings("deprecation")
	@Then("^Verify user lands on Home page with \"(.*)\" and \"(.*)\"$")
	public void Verify_User_Landing_Page(String expectedoutput, String cases) {
		if (cases.equalsIgnoreCase("valid")) {
			Assert.assertEquals(expectedoutput, driver.getTitle());
		} else {
			Assert.assertTrue(lp.ErrorMessage.getText().contains(expectedoutput));
		}
	}

	@Then("^click on Logout button$")
	public void User_LogsOut() {
		lp.Click_Logout_Button();
	}

	@Then("^Click on Yes button$")
	public void Click_Yes_Button() {
		lp.Click_Yes_Button();
	}

	@And("^Click on Productslist page$")
	public void Click_Products_listPage() {
		pp.Click_Products_ListLink();
	}

	@And("^click on Select option$")
	public void Select_options() {
		pp.Select_Products_By();
	}

	@And("^choose one option \"(.*)\"$")
	public void choose_one_option(String useroption) {
		pp.Select_dropdown_options(useroption);
		// pp.Select_Category();
	}

	@And("^Enter value in SearchbyProduct field \"(.*)\"$")
	public void Enter_value_search_by_Product(String s) {
		pp.Enter_Value_SearchByProduct(s);
	}

	@And("^Click on search button$")
	public void click_search_button() {
		pp.Click_Search_Button();
	}

	@Then("^Verify the sorted list$")
	public void verify_sorted_list() {
		pp.FirstRow.isDisplayed();
	}

	@Then("^Close browser$")
	public void close_browser() {
		driver.close();
	}

	@And("^Click on CreateNew button$")
	public void Click_CreateNew_Button() {
		pp.Click_CreateNew();
	}

	@And("^Enter value in fields$")
	public void Enter_Value_Fields(DataTable dt) {
		List<Map<String, String>> data = dt.asMaps(String.class, String.class);
		String Product_Name = data.get(0).get("Product_Name");
		String Full_Name = data.get(0).get("Full_Name");
		String Price = data.get(0).get("Price");
		String Old_Price = data.get(0).get("Old_Price");
		String Features1 = data.get(0).get("Features1");
		String Features2 = data.get(0).get("Features2");
		String Warranty = data.get(0).get("Warranty");
		String Category = data.get(0).get("Category");
		String Brand = data.get(0).get("Brand");
		String ImagePath = data.get(0).get("ImagePath");

		pp.Enter_ProductName(Product_Name);
		pp.Enter_FullName(Full_Name);
		pp.Enter_Price(Price);
		pp.Enter_OldPrice(Old_Price);
		pp.Enter_Features1(Features1);
		pp.Enter_Features2(Features2);
		pp.Enter_Warranty(Warranty);
		pp.Create_Select_Category(Category);
		pp.Create_Select_Brand(Brand);
		pp.Select_Image(ImagePath);

	}

	@Then("^Click on create button$")
	public void Click_Create_Button() {
		pp.Click_Create_Button();
	}

	@SuppressWarnings("deprecation")
	@Then("^verify user lands on Productslist page$")
	public void Verify_user_landing_page() {
		System.out.println(pp.VerifyLandingPagetitle.getText());
		Assert.assertEquals("Product List", pp.VerifyLandingPagetitle.getText());
	}

	@And("^Click on Edit link$")
	public void Click_on_Edit_link() {
		pp.click_EditLink();
	}

	@And("^Update the fields$")
	public void Update_Fields(DataTable dt) {
		List<Map<String, String>> data = dt.asMaps(String.class, String.class);
		String Price = data.get(0).get("Price");
		String Warranty = data.get(0).get("Warranty");
		pp.Enter_Price(Price);
		pp.Enter_Warranty(Warranty);
	}

	@Then("^Click on Update button$")
	public void Click_Update_button() {
		pp.click_UpdateButton();
	}

	@And("^click on CategoriesList page$")
	public void click_CategoriesList_Page() {
		cp.Click_Categories_list();
	}

	@And("^Enter value in SearchbyCategory field \"(.*)\"$")
	public void click_Search_Category_field(String cat) {
		cp.SearchByCategoryField(cat);
	}

	@SuppressWarnings("deprecation")
	@And("Verify Categories page after search \"(.*)\"")
	public void verify_Categories_Page(String category) {
		String s = cp.FirstRowAfterSearch.getText();
		System.out.println(s);
		Assert.assertEquals(category, s);
	}

	@And("^Enter CategoryName \"(.*)\"$")
	public void Enter_Category_Name(String n) {
		cp.EnterNewCategoryName(n);
	}

	@Then("^click on CreateCategory button$")
	public void Click_Create_Category_Button() {
		cp.Click_Create_CategoryButton();
	}

	@SuppressWarnings("deprecation")
	@Then("^Verify user lands on Categories page$")
	public void Verify_User_Lands_On_Categories() {
		Assert.assertEquals("Categories List", pp.VerifyLandingPagetitle.getText());
	}

	@And("^Click on Edit link under Actions tab$")
	public void Click_Category_Edit_Link() {
		cp.Click_Category_Edit_Link();
	}

	@And("^Enter New category Value \"(.*)\"$")
	public void Enter_New_Category_Value(String n) {
		cp.EnterNewCategoryName(n);
	}

	@And("^click on Update Category button$")
	public void Click_Update_Category_Button() {
		cp.Click_Update_Category();
	}

	@And("^Click on Category Delete link under Actions tab$")
	public void Click_Category_Delete_link() {
		cp.Click_Category_Delete_link();
	}
	@And("^click on Category Delete OK button$")
	public void Click_OK_Button() {
		cp.click_Category_Delete_OK_Button();
	}

	@And("^click on BrandsList page$")
	public void Click_BrandList_Page() {
		bp.Click_Brand_List_Link();
	}

	@And("^select value from Dropdwon \"(.*)\"$")
	public void select_value_from_dropdown(String useroption)
	{
		bp.Select_Brand_Dropdown(useroption);
	}
	
	@SuppressWarnings("deprecation")
	@And("^Verify Brands page after search with \"(.*)\"$")
	public void Verify_BrandPage_After_Search(String s)
	{
		Assert.assertTrue(bp.FirstRowBrandAfterSort.getText().contains(s));
		
	}
	
	@And("^Click on CreateNew Brand button$")
	public void Click_CreateNew_Brand()
	{
		bp.Click_Create_New_Brand_Button();
	}
	
	@And("^Enter BrandName \"(.*)\"$")
	public void Update_BrandName(String s)
	{
		bp.EnterBrandValue.sendKeys(s);
	}
	@Then("^click on CreateBrand button$")
	public void Create_Brand_Button()
	{
		bp.Click_CreateBrand_Button();
	}
	 @SuppressWarnings("deprecation")
	@Then("^Verify user lands on Brands page$")
	 public void verify_user_lands_BrandsList_Page()
	 {
		 Assert.assertEquals("Brands List", pp.VerifyLandingPagetitle.getText());
	 }
	 
	 @And("^Click on Brand Edit link under Actions tab$")
	 public void Click_Brand_Edit_Link()
	 {
		 bp.Click_Brand_Edit_Link();
	 }
	 
	 @And("^Enter New Brand Value \"(.*)\"$")
	 public void Enter_New_Brand_value(String b)
	 {
		 bp.EnterBrandValue(b);
	 }
	 
	 @And("^click on Update Brand button$")
	 public void click_Update_Brand_button()
	 {
		 bp.Click_Brand_Update_Button();
	 }
	 
	 @And("^Click on Brand Delete link under Actions tab$")
	 public void Click_Brand_delete_link()
	 {
		 bp.Click_Brand_Delete_Link();	
	 }
	 
	 @And("^click on Brand Delete OK button$")
	 public void Click_Brand_Delete_OK_Button()
	 {
		 bp.Click_Brand_Delete_OK_Button();
	 }

	 @And("^click on Services list page$")
	 public void Click_services_list_page()
	 {
		 sp.click_services_list();
	 }
	 
	 @And("^select value from services Dropdwon \"().*\"$")
	 public void select_value_services_dropdown(String useroption)
	 {
		 sp.select_services_dropdown(useroption);
	 }
	 
	 @And("^Enter value in SearchbyService field \"(.*)\"$")
	 public void Enter_Value_searchbyservice(String useroption)
	 {
		 sp.Enter_Value_search_field(useroption);
	 }
	 
	 @And("^click on service search button$")
	 public void click_service_search_button()
	 {
		 sp.Click_service_search_button();
	 }
	 
	 @SuppressWarnings("deprecation")
		@And("^Verify Service page after search with \"(.*)\"$")
		 public void verify_Service_page(String s)
		 {
			 System.out.println(sp.FirstServiceRowaftersort.getText());
			 Assert.assertTrue(s.contains(sp.FirstServiceRowaftersort.getText()));
		 }

	 @And("^click on Service Create New button$")
	 public void click_service_create_new_Button()
	 {
		 sp.Click_create_new_button();
	 }
	 
	  
	 
	 @And("^Enter value in fields on service page$")
	 public void Enter_value_create_new_service(DataTable dt)
	 {
		 List<Map<String,String>> data=dt.asMaps(String.class, String.class);
		 String Service_name= data.get(0).get("Services_Name");
		 String Description= data.get(0).get("Description");
		 String Full_Description= data.get(0).get("Full_Description");
		 String Img_path=data.get(0).get("Image_Path");
		 
		 sp.Enter_Service_name(Service_name);
		 sp.Enter_description(Description);
		 sp.Enter_Full_Description(Full_Description);
		 sp.Click_choose_image(Img_path);
		 
	 }
	 
	 @And("^click on create services button$")
	 public void click_create_service_Button()
	 {
		 sp.click_Create_Service_Button();
	 }
	 
	 @SuppressWarnings("deprecation")
	@Then("^verify user lands on Services list page$")
	 public void verify_user_lands_services_pages()
	 {
		 
		 Assert.assertEquals("Services List", sp.verifylandingpagetitle.getText());
	 }
	 
	 @And("^click on Services Edit link$")
	 public void click_services_Edit_link()
	 {
		 sp.click_Service_Edit_link();
	 }
	 
	 @And("^Update the fields on service page$")
	 public void update_fields(DataTable dt)
	 {
		 List<Map<String,String>> data=dt.asMaps(String.class, String.class);
		 String Service_name= data.get(0).get("Description");
		
		 sp.Enter_Service_name(Service_name);
		 
	 }
	 
	 @And("^click on service Update button$")
	 public void click_service_update_button()
	 {
		 sp.click_service_update_button();
	 }
	 
	 @And("^click on Services Delete link$")
	 public void click_services_delete_link()
	 {
		 sp.click_Service_Delete_link();
	 }
	 
	 @And("^click on services delete OK button$")
	 public void click_service_delete_OK_button()
	 {
		 sp.click_service_delete_ok_button();
	 }
	 
	 @And("^click on Coupons list page$")
	 public void click_Coupons_list()
	 {
		 coup.click_coupons_list_link();
	 }
	 
	 @And("^Enter value in SearchbyCoupon field \"(.*)\"$")
	 public void Enter_value_searchbycoupon(String s)
	 {
		 coup.Enter_search_by_coupon_text_box(s);
	 }
	 
	 @And("^click on coupon search button$")
	 public void click_coupon_search_button()
	 {
		 coup.click_coupon_search_button();
	 }
	 
	 @SuppressWarnings("deprecation")
	@And("^Verify Coupons page after search done with \"(.*)\" and \"(.*)\"$")
	 public void verify_coupon_Page_afterSeacrh(String dropdownoption, String value)
	 {
		 if(dropdownoption.equals("Product"))
		 {
			 Assert.assertEquals(value, coup.first_product_row_value.getText());
		 }
		 else if(dropdownoption.equals("Coupon Code"))
		 {
			 Assert.assertEquals(value, coup.first_couponcode_row_value.getText());
		 }
		 else if(dropdownoption.equals("Coupn Amt"))
		 {
			 Assert.assertEquals(value, coup.first_couponamt_row_value.getText());
		 }
	 }
	 
	 @And("^Click on CreateNew Coupon button$")
	 public void Click_CreateNew_Coupon_button()
	 {
		 coup.click_coupon_Createnew_Button();
	 }
	 
	 @And("^Enter data in below fields$")
	 public void Enter_data_below_field(DataTable dt)
	 {
		 List<Map<String,String>> data=dt.asMaps(String.class, String.class);
		 String Product= data.get(0).get("Product");
         String Coupon_Code=data.get(0).get("Coupon_Code");
		 String Coupon_Amount=data.get(0).get("Coupon_Amount");
		 String Discount_Type=data.get(0).get("Discount_Type");
		 String Usage_Limit=data.get(0).get("Usage_Limit");
		 String Expiry_Date=data.get(0).get("Expiry_Date");
		 String Description=data.get(0).get("Description");
		 
		 coup.click_coupon_product_dropdown(Product);
		 coup.Enter_coupon_code(Coupon_Code);
		 coup.Enter_coupon_amt(Coupon_Amount);
		 coup.select_Coupon_Discout_type(Discount_Type);
		 coup.Enter_coupon_Usage_limit(Usage_Limit);
		 w.until(ExpectedConditions.visibilityOf(coup.coupon_ExpiryDate));
		 coup.Enter_coupon_ExpiryDate(Expiry_Date);
		 coup.Enter_coupon_Description(Description);

		 
	 }
	 
	 @And("^click on Create Coupon button$")
	 public void click_create_coupon_button()
	 {
		 coup.click_create_coupon();
	 }
	 
	 @SuppressWarnings("deprecation")
	@Then("^Verify user lands on Coupons page$")
	 public void Verify_user_lands_coupon_Page()
	 {
		 Assert.assertEquals("Coupon List", coup.verifycouponpagetitle.getText());
	 }
	 
	 @And("^click on coupon edit link$")
	 public void Click_on_coupon_edit_link()
	 {
		 coup.click_coupon_edit_link();
	 }
	 
	 @And("^update fields with below values$")
	 public void update_fields_below_values(DataTable dt)
	 {
		 List<Map<String,String>> data=dt.asMaps(String.class, String.class);
		 String Coupon_Amount= data.get(0).get("Coupon_Amount");
         String Description=data.get(0).get("Description");
         
         coup.Enter_coupon_amt(Coupon_Amount);
         coup.Enter_coupon_Description(Description);
         
	 }
	 
	 @And("^click on Update coupon button$")
	 public void click_update_coupon_button()
	 {
		 coup.click_update_coupon_button();
	 }
	 
	 @And("^click on coupon delete link$")
	 public void click_coupon_delete_link()
	 {
		 coup.click_coupon_delete_link();
	 }
	 
	 @And("^click on Coupon_Delete_OK button$")
	 public void click_coupon_delete_OK_button()
	 {
		 coup.click_coupon_delete_OK_button();
	 }
	 
	 @And("^click on User Details list page$")
	 public void click_user_details_list_page()
	 {
		 user.click_UserDetails_link();
	 }
	 
	 @And("^Enter value in Search by users text \"(.*)\"$")
	 public void Enter_value_search_by_user(String s)
	 {
		user.Enter_search_by_users_textbox(s); 
	 }
	 @And("^click on user search button$")
	 public void click_on_user_search_button()
	 {
		 user.click_userdetails_search_Button();
	 }
	 
	 @SuppressWarnings("deprecation")
	@And("^verify the user search with \"(.*)\" and \"(.*)\"$")
	 public void verify_user_search_with_values(String dropdown_option, String value)
	 {
		 if(dropdown_option.equals("Name"))
		 {
			 Assert.assertEquals("Admin", user.First_Row_Name_Value.getText());
		 }
		 else if(dropdown_option.equals("Email"))
		 {
			Assert.assertEquals("hr@clientservertech.com", user.First_Row_Email_value.getText()); 
		 }
		 else if(dropdown_option.equals("Phone"))
		 {
			 Assert.assertEquals("8692043879", user.First_Row_PhoneNo_value.getText());
		 }
	 }
	 
	 
	 
	 
	 
}

 