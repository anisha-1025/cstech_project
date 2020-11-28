package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiscountPage {
	
	@FindBy(xpath = "//a[text()='Discounts']")
	public WebElement Discounts;
	
	@FindBy(xpath = "//button[text()='Add Discounts']")
	public WebElement Add_Discount_button;
	
	@FindBy(xpath = "//input[@type='search']")
	public WebElement Discount_Search_button;
	
	@FindBy(xpath = "//i[text()='create']")
	public WebElement Discount_Edit;
	
	@FindBy(xpath = "//i[text()='delete']")
	public WebElement Discount_delete;
	
	@FindBy(xpath = "//form[@id='forms1']/div/div[2]/div/div/div/div/div/div/div/div/input")
	public WebElement DiscountName;
	
	@FindBy(xpath = "//*[@id='forms1']/div/div[2]/div/div/div/div/div[2]/div/div/div/textarea")
	public WebElement DiscountDescription;
	
	@FindBy(id = "discdesc")
	public WebElement Update_description;
					
	@FindBy(xpath = "//*[@id='forms1']/div/div[2]/div/div/div/div/div[3]/div/div/div/input")
	public WebElement DiscountValue;
	
	@FindBy(id= "discval")
	public WebElement Update_discount_Value;
	
	@FindBy(xpath = "//label[@for='Active']")
	public WebElement ActiveCheckbox;
	
	@FindBy(xpath = "//label[@for='lmtdperiod']")
	public WebElement LimitedPeriodCheckbox;
	
	@FindBy(xpath = "//*[@id='forms1']/div/div[2]/div/div/div/div/div[5]/div/div/div/input[@name='LimitedPeriodFromDate']")
	public WebElement Discount_StartDate;
	
	@FindBy(xpath = "//*[@id='forms1']/div/div[2]/div/div/div/div/div[5]/div/div/div/input[@name='LimitedPeriodToDate']")
	public WebElement Discount_Enddate;
	
	@FindBy(xpath = "//label[@for='Base']")
	public WebElement BasePackageCheckbox;
	
	@FindBy(xpath = "//label[@for='Additional']")
	public WebElement AdditionalCheckbox;
	
	@FindBy(xpath = "//label[@for='Camp']")
	public WebElement CampCheckbox;
	
	@FindBy(xpath = "//label[@for='Activity']")
	public WebElement ActivityCheckbox;
	
	@FindBy(xpath = "//label[@for='Apply']")
	public WebElement ApplyCheckbox;
	
	@FindBy(xpath = "//button[text()='ADD']")
	public WebElement Discount_ADD_button;
	
	@FindBy(xpath = "//button[text()='UPDATE']")
	public WebElement Discount_UPDATE_button;
	
	@FindBy(xpath = "//button[text()='YES']")
	public WebElement Discount_Delete_YES_button;
	
	public DiscountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Click_Discounts_Links()
	{
		Discounts.click();
	}
	
	public void Click_Add_Discount_button()
	{
		Add_Discount_button.click();
	}
	
	public void Enter_Discount_Search_button(String s)
	{
		Discount_Search_button.sendKeys(s);
	}
	
	public void Click_Discount_Edit()
	{
		Discount_Edit.click();
	}
	
	public void Click_Discount_delete()
	{
		Discount_delete.click();
	}
	
	public void Enter_DiscountName(String s)
	{
		DiscountName.sendKeys(s);
	}
	
	public void Enter_DiscountDescription(String s)
	{
		DiscountDescription.sendKeys(s);
	}
	
	public void Enter_Update_description(String s)
	{
		Update_description.clear();
		Update_description.sendKeys(s);
	}
	
	public void Enter_DiscountValue(String s)
	{
		DiscountValue.sendKeys(s);
	}
	
	public void Enter_Update_discount_Value(String s)
	{
		Update_discount_Value.clear();
		Update_discount_Value.sendKeys(s);
	}
	
	public void Click_ActiveCheckbox()
	{
		ActiveCheckbox.click();
	}
	
	public void Click_LimitedPeriodCheckbox()
	{
		LimitedPeriodCheckbox.click();
	}
	
	public void Enter_StartDate(String s)
	{
		Discount_StartDate.sendKeys(s);
	}
	
	public void Enter_EndDate(String s)
	{
		Discount_Enddate.sendKeys(s);
	}
	
	public void Click_BasePackageCheckbox()
	{
		BasePackageCheckbox.click();
	}
	
	public void Click_AdditionalCheckbox()
	{
		AdditionalCheckbox.click();
	}
	
	public void Click_CampCheckbox()
	{
		CampCheckbox.click();
	}
	
	public void Click_ActivityCheckbox()
	{
		ActivityCheckbox.click();
	}
	
	public void Click_ApplyCheckbox()
	{
		ApplyCheckbox.click();
	}
	
	public void Click_Discount_ADD_button()
	{
		Discount_ADD_button.click();
	}
	
	public void Click_Discount_UPDATE_button()
	{
		Discount_UPDATE_button.click();
	}
	
	public void Click_Discount_Delete_YES_button()
	{
		Discount_Delete_YES_button.click();
	}
	
	

}
