package PAGES;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	
	
	@FindBy(xpath="//input[@name='prodname']")
	public WebElement searchbar;
	
	@FindBy(xpath="//div[@class='course_search']/form/button")
	public WebElement searchbutton;
	
	@FindBy(xpath="//div[@class='course_title']/h3/a[@href='/product/Home/productDetails?id=7']")
	public WebElement FirstListedOption;
	
	@FindBy(xpath = "//button[@class='course_button']")
	public WebElement AddtoCartbutton;
	
	@FindBy(id = "userName")
	public WebElement UserName;
	
	@FindBy(id = "phoneNo")
	public WebElement phoneno;
	
	@FindBy(id = "address")
	public WebElement address;
	
	@FindBy(id = "address2")
	public WebElement address2;
	
	@FindBy(id = "city")
	public WebElement city;
	
	@FindBy(id = "state")
	public WebElement state;
	
	@FindBy(id = "Zip")
	public WebElement zip;
	
	@FindBy(xpath = "//input[@value='Continue']")
	public WebElement continuebutton;
	
	@FindBy(xpath = "//div[@class='course_search_form d-flex flex-md-row flex-column align-items-start justify-content-between']/button")
	public WebElement MakePaymentbutton;
	
	@FindBy(name = "coupon_code")
	public WebElement couponcode;
	
	@FindBy(xpath = "//button[@value='Apply coupon']")
	public WebElement ApplyCouponbutton;
	
	//@FindBy(xpath = "//div[@class='alert alert-success']")
	@FindBy(xpath = "//*[@id='frmCouponCode']/div/div[2]")
	public WebElement CouponCodeMessage;
	
	public LandingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Enter_searchbar(String x)
	{
		searchbar.sendKeys(x);
	}
	
	public void click_searchbutton()
	{
		searchbutton.click();
	}
	
	public void Select_FirstListedOption()
	{
		
		
	}
	
	public void Click_AddtoCartbutton()
	{
		AddtoCartbutton.click();
	}
	
	public void Enter_UserName(String x)
	{
		UserName.sendKeys(x);
	}
	
	public void Enter_phoneno(String x)
	{
		phoneno.sendKeys(x);	
	}
	
	public void Enter_address(String x)
	{
		address.sendKeys(x);	
	}
	
	public void Enter_address2(String x)
	{
		address2.sendKeys(x);	
	}
	
	public void Enter_city(String x)
	{
		city.sendKeys(x);	
	}
	
	public void Enter_state(String x)
	{
		state.sendKeys(x);	
	}
	
	public void Enter_zip(String x)
	{
		zip.sendKeys(x);	
	}
	
	public void click_continuebutton()
	{
		continuebutton.click();
	}
	
	public void click_Make_Payment_button()
	{
		MakePaymentbutton.click();
	}
	
	public void enter_couponcode(String x)
	{
		couponcode.sendKeys(x);
	}
	
	public void click_apply_coupon()
	{
		ApplyCouponbutton.click();
	}
}

