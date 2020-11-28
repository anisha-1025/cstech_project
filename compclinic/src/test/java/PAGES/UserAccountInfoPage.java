package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAccountInfoPage {

	@FindBy(xpath = "//a[@href='blog.html']")
	public WebElement UserDropdown;
	
	@FindBy(xpath = "//div[@class='dropdown-menu show']/a[1]")
	public WebElement ChangePasswordlink;
	
	@FindBy(xpath = "//input[@id='oldpassword']")
	public WebElement OldPasswordfield;
	
	@FindBy(xpath = "//input[@id='newpassword']")
	public WebElement NewPasswordfield;
	
	@FindBy(xpath = "//input[@id='confirmpassword']")
	public WebElement ConfirmPasswordfield;
	
	@FindBy(xpath = "//span[contains(text(), 'The new password and confirmation password do not match.')]")
	public WebElement pwdmismatch;
	
	@FindBy(xpath = "//button[@value='Change password']")
	public WebElement Changepassword_button; 
	
	@FindBy(xpath = "//button[text()='Cancel']")
	public WebElement Cancel_button;
	
	@FindBy(xpath = "//div[@class='dropdown-menu show']/a[2]")
	public WebElement MyAccountlink;
	
	@FindBy(xpath = "//form[@id='logoutForms']/a")
	public WebElement LogOfflink;
	
	
	public UserAccountInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Click_on_UserDropdown()
	{
		UserDropdown.click();
	}
	
	public void Click_on_ChangePasswordLink()
	{
		ChangePasswordlink.click();
	}
	
	public void Enter_Old_Password(String op)
	{
		OldPasswordfield.sendKeys(op);
	}
	
	public void Enter_New_Password(String np)
	{
		NewPasswordfield.sendKeys(np);
	}
	
	public void Enter_Confirm_Password(String cp)
	{
		ConfirmPasswordfield.sendKeys(cp);
	}
	
	public void Click_ChangePassword_Button()
	{
		Changepassword_button.click();
	}
	
	public void Click_on_MyAccountLink()
	{
		MyAccountlink.click();
	}
	
	public void Click_LogOffLink()
	{
		LogOfflink.click();
	}
	
	
	
}
