package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdjustmentsPage {

	@FindBy(xpath = "//a[text()='Adjustments']")
	public WebElement AdjustmentsTab;
	
	@FindBy(xpath = "//div[@class='header']/h2/button")
	public WebElement Add_Adjustments_button;
	
	@FindBy(xpath = "//input[@type='search']")
	public  WebElement Adjustments_Search_link;
	
	@FindBy(xpath = "//i[text()='create']")
	public WebElement Edit_Adjustments_link;
	
	@FindBy(xpath = "//i[text()='delete']")
	public WebElement Delete_adjustments_link;
	
	@FindBy(xpath = "//*[@id=\"bs_datepicker_container\"]/input")
	public WebElement Adjust_date;
	
	@FindBy(xpath = "//input[@id='datePickers12']")
	public WebElement Updated_Adjustment_date;	
	
	@FindBy(xpath = "//*[@id='forms1']/div/div[2]/div/div/div/div/div[2]/div[1]/div/div[2]")
	public WebElement AdjustType_link;
	
	@FindBy(xpath = "//*[@id='forms1']/div/div[2]/div/div/div/div/div[2]/div[1]/div/div[3]/div[1]")
	public WebElement AdjustType_firstoption;
	
	@FindBy(xpath = "//*[@id='forms1']/div/div[2]/div/div/div/div/div[2]/div[1]/div/div[3]/div[2]")
	public WebElement AdjustType_secondoption;
	
	@FindBy(xpath = "//*[@id='modal-Update']/div/div/div[2]/div/form/div[1]/div/div/div/div/div[2]/div[1]/div/div[2]")
	public WebElement Updated_Adjust_type;
	
	@FindBy(xpath = "//*[@id='modal-Update']/div/div/div[2]/div/form/div[1]/div/div/div/div/div[2]/div[1]/div/div[3]")
	public WebElement Updated_AdjustType_dropdown;
	
	@FindBy(xpath = "//*[@id='forms1']/div/div[2]/div/div/div/div/div[2]/div[2]/div/div[2]")
	public WebElement ApplicableOn;
	
	@FindBy(xpath = "//*[@id='forms1']/div/div[2]/div/div/div/div/div[2]/div[2]/div/div[3]/div[1]")
	public WebElement ApplicableOn_firstoption;
	
	@FindBy(xpath = "//*[@id='forms1']/div/div[2]/div/div/div/div/div[2]/div[2]/div/div[3]/div[2]")
	public WebElement ApplicableOn_secondoption;
	
	@FindBy(xpath = "//*[@id='forms1']/div/div[2]/div/div/div/div/div[3]/div/div/div/textarea")
	public WebElement Adjustments_description_link;
	
	@FindBy(xpath = "//textarea[@id='AdjustDesc']")
	public WebElement Updated_adjust_Description;
		
	@FindBy(xpath = "//*[@id='forms1']/div/div[2]/div/div/div/div/div[4]/div/div/div/input[1]")
	public WebElement Adjustments_Amount;
	
	@FindBy(xpath = "//button[text()='ADD']")
	public WebElement Adjustments_ADD_button;
	
	@FindBy(xpath = "//button[text()='UPDATE']")
	public WebElement Adjust_Update_button;
	
	@FindBy(xpath = "//button[text()='YES']")
	public WebElement Adjustment_Delete_YES_button;
		
	public AdjustmentsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Click_Adjustments_tab()
	{
		AdjustmentsTab.click();
	}
	
	public void Click_Add_Adjustments_button()
	{
		Add_Adjustments_button.click();
	}
	
	public void Enter_Adjustments_Search_link(String s)
	{
		Adjustments_Search_link.sendKeys(s);
	}
	
	public void Click_Edit_Adjustments_link()
	{
		Edit_Adjustments_link.click();
	}
	
	public void Click_Delete_adjustments_link()
	{
		Delete_adjustments_link.click();
	}
	
	public void Enter_Adjust_date(String s)
	{
		Adjust_date.sendKeys(s);
	}
	
	public void Enter_Updated_Adjustment_date(String s)
	{
		Updated_Adjustment_date.clear();
		Updated_Adjustment_date.sendKeys(s);
	}
	
	
	public void Select_AdjustType_link(String s)
	{
		AdjustType_link.click();
		if(s.equalsIgnoreCase("Deposit"))
		{
			AdjustType_firstoption.click();
		}
		else if(s.equalsIgnoreCase("Wrong Posting"))
		{
			AdjustType_secondoption.click();
		}
	}

	
	public void select_ApplicableOn(String s)
	{
		ApplicableOn.click();
		if(s.equalsIgnoreCase("Aaryan"))
		{
			ApplicableOn_firstoption.click();
		}
		else if(s.equalsIgnoreCase("Ria"))
		{
			ApplicableOn_secondoption.click();
		}
	}
	
	public void Enter_Adjustments_description_link(String s)
	{
		Adjustments_description_link.sendKeys(s);
	}
	
	public void Enter_Updated_adjust_Description(String s)
	{
		Updated_adjust_Description.clear();
		Updated_adjust_Description.sendKeys(s);;
	}
	
	public void Enter_Adjustments_Amount(String s)
	{
		Adjustments_Amount.sendKeys(s);
	}
	
	
	public void Enter_Adjustments_ADD_button(String s)
	{
		Adjustments_ADD_button.sendKeys(s);
	}
	
	public void click_Adjustments_ADD_button()
	{
		Adjustments_ADD_button.click();
	}
	
	public void click_Adjust_Update_button()
	{
		Adjust_Update_button.click();
	}
	
	public void click_Adjustment_Delete_YES_button()
	{
		Adjustment_Delete_YES_button.click();
	}
}
