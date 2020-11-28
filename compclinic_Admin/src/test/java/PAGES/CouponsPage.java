package PAGES;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CouponsPage {

	
	@FindBy(xpath = "//a[@href='/admin/Coupons/index']")
	public WebElement coupons_list_link;
	
	@FindBy(xpath = "//select[@id='ddlItem']")
	public WebElement coupon_select_dropdown;
	
	@FindBy(xpath = "//input[@id='filter']")
	public WebElement search_by_coupon_text_box;
	
	@FindBy(xpath = "//button[@id='btnSearch']")
	public WebElement coupon_search_button;
	
	@FindBy(xpath = "//table[@class='table']/tbody/tr[1]/td[2]")
	public WebElement first_product_row_value;
	
	@FindBy(xpath = "//table[@class='table']/tbody/tr[1]/td[3]")
	public WebElement first_couponcode_row_value;
	
	@FindBy(xpath = "//table[@class='table']/tbody/tr[1]/td[4]")
	public WebElement first_couponamt_row_value;
	
	@FindBy(xpath = "//a[text()='Create New']")
	public WebElement coupon_Createnew_Button;
	
	@FindBy(xpath = "//select[@id='ProductId']")
	public WebElement coupon_product_dropdown;
	
	@FindBy(xpath = "//input[@id='CouponCode']")
	public WebElement Enter_coupon_code;
	
	@FindBy(xpath = "//input[@id='CouponAmt']")
	public WebElement Enter_coupon_amt;
	
	@FindBy(xpath = "//select[@id='DiscountType']")
	public WebElement Coupon_Discout_type;
	
	@FindBy(xpath = "//input[@id='UsageLimit']")
	public WebElement coupon_Usage_limit;
	
	@FindBy(xpath = "//input[@id='ExpiryDate']")
	public WebElement coupon_ExpiryDate;
	
	@FindBy(xpath = "//textarea[@id='Description']")
	public WebElement coupon_Description;
	
	@FindBy(xpath = "//button[text()='Create Coupon']")
	public WebElement create_coupon;
	
	@FindBy(xpath = "//div[@class='page-title']/h2")
	public WebElement verifycouponpagetitle;
	
	@FindBy(xpath = "//table[@class='table']/tbody/tr[1]/td[1]/a[2]")
	public WebElement coupon_edit_link;
	
	@FindBy(xpath = "//button[text()='Update Coupon']")
	public WebElement update_coupon_button;
	
	@FindBy(xpath = "//table[@class='table']/tbody/tr[1]/td[1]/a[3]")
	public WebElement coupon_delete_link;
	
	@FindBy(xpath = "//button[text()='OK']")
	public WebElement coupon_delete_OK_button;
	
	
	public CouponsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void click_coupons_list_link()
	{
		coupons_list_link.click();
	}
	public void click_coupon_select_dropdown()
	{
		coupon_select_dropdown.click();
	}
	public void Enter_search_by_coupon_text_box(String s)
	{
		search_by_coupon_text_box.sendKeys(s);
	}
	
	public void click_coupon_search_button()
	{
		coupon_search_button.click();
	}
	public void click_coupon_Createnew_Button()
	{
		coupon_Createnew_Button.click();
	}
	public void click_coupon_product_dropdown(String useroption)
	{
		coupon_product_dropdown.click();
		Select s= new Select(coupon_product_dropdown);
		List<WebElement> alloptions=s.getOptions();
		for(int i=0;i<alloptions.size();i++)
		{
			if(alloptions.get(i).getText().equals(useroption))
			{
				alloptions.get(i).click();
			}
		}
	}
	
	public void Enter_coupon_code(String n)
	{
		Enter_coupon_code.sendKeys(n);
	}
	

	public void Enter_coupon_amt(String n)
	{
		Enter_coupon_amt.sendKeys(n);
	}
	
	public void select_Coupon_Discout_type(String c)
	{
		Coupon_Discout_type.click();
		Select s= new Select(Coupon_Discout_type);
		List<WebElement> alloptions=s.getOptions();
		for(int i=0;i<alloptions.size();i++)
		{
			if(alloptions.get(i).getText().equals(c))
			{
				alloptions.get(i).click();
			}
		}
	}
	
	public void Enter_coupon_Usage_limit(String x)
	{
		coupon_Usage_limit.sendKeys(x);
	}
	public void Enter_coupon_ExpiryDate(String d)
	{
		coupon_ExpiryDate.sendKeys(d);
	}
	public void Enter_coupon_Description(String s)
	{
		coupon_Description.sendKeys(s);
	}
	
	public void click_create_coupon()
	{
		create_coupon.click();
	}
	public void click_coupon_edit_link()
	{
		coupon_edit_link.click();
	}
	
	public void click_update_coupon_button()
	{
		update_coupon_button.click();
	}
	
	public void click_coupon_delete_link()
	{
		coupon_delete_link.click();
	}
	
	public void click_coupon_delete_OK_button()
	{
		coupon_delete_OK_button.click();
	}
}
