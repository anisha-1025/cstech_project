package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registeration {

	
	
	@FindBy(xpath = "//input[@name='FirstName']")
	public WebElement FirstName;
	
	@FindBy(xpath = "//input[@name='LastName']")
	public WebElement LastName;
	
	@FindBy(xpath = "//input[@name='Email']")
	public WebElement EmailAddress;
	
	@FindBy(xpath = "//input[@name='Phone']")
	public WebElement PhoneNo;
	
	@FindBy(xpath = "//input[@name='Password']")
	public WebElement RegisterPassword;
	
	@FindBy(xpath = "//input[@name='ConfirmPassword']")
	public WebElement ConfirmPassword;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement SignUp_button;
	
	@FindBy(xpath = "//a[text()='You already have a membership?']")
	public WebElement ExistingMembershipLink;
	
	@FindBy(xpath = "//div[@class='alert alert-success']")
	public WebElement successmessage; 
	
	@FindBy(xpath = "//div[@class='alert alert-danger']")
	public WebElement alertmessage;
	
	public Registeration(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void Enter_FirstName(String fn)
	{
		FirstName.sendKeys(fn);
	}
	
	public void Enter_LastName(String fn)
	{
		LastName.sendKeys(fn);
	}
	
	public void Enter_EmailAddress(String fn)
	{
		EmailAddress.sendKeys(fn);
	}
	
	public void Enter_PhoneNo(String fn)
	{
		PhoneNo.sendKeys(fn);
	}
	
	public void Enter_Password(String fn)
	{
		RegisterPassword.sendKeys(fn);
	}
	
	public void Enter_Confirm_Password(String fn)
	{
		ConfirmPassword.sendKeys(fn);
	}
	
	public void Click_Signup_Button()
	{
		SignUp_button.click();
	}
	
	public void Click_Already_Membership_Link()
	{
		ExistingMembershipLink.click();
	}
}
