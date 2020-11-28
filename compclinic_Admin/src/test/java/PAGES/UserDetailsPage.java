package PAGES;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class UserDetailsPage {
	
	@FindBy(xpath = "//a[@href='/admin/UserDetails/index']")
	public WebElement UserDetails_link;
	
	@FindBy(xpath = "//select[@id='ddlItem']")
	public WebElement select_dropdown_user_details;
	
	@FindBy(xpath = "//input[@id='filter']")
	public WebElement search_by_users_textbox;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement userdetails_search_Button;
	
	@FindBy(xpath = "//table[@class='table']/tbody/tr[1]/td[2]")
	public WebElement First_Row_Name_Value;
	
	@FindBy(xpath = "//table[@class='table']/tbody/tr[1]/td[3]")
	public WebElement First_Row_Email_value;
	
	@FindBy(xpath = "//table[@class='table']/tbody/tr[1]/td[4]")
	public WebElement First_Row_PhoneNo_value;
	
	public UserDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void click_UserDetails_link()
	{
		UserDetails_link.click();
		
	}

	public void click_select_dropdown_user_details(String useroption)
	{
		select_dropdown_user_details.click();
		Select s= new Select(select_dropdown_user_details);
		List<WebElement> optionlist= s.getOptions();
		for(int i=0; i< optionlist.size();i++)

		{
			if(optionlist.get(i).getText().equals(useroption))
			{
				optionlist.get(i).click();
			}
		}
	}
	
	public void Enter_search_by_users_textbox(String s)
	{
		search_by_users_textbox.sendKeys(s);
	}
	
	public void click_userdetails_search_Button()
	{
		userdetails_search_Button.click();
	}
	
	
	
}
