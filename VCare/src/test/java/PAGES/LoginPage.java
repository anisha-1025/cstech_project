package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath = "//input[@name='custid']")
	public WebElement CustomerId; 
	
	@FindBy(xpath = "//input[@name='email']")
	public WebElement Username; 
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement Login_Password; 
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement SignInButton;
	
	@FindBy(xpath = "//a[text()='Register Now!']")
	public WebElement RegisterNowLink; 
	
	@FindBy(xpath = "//a[text()='Forgot Customer Id/ Password?']")
	public WebElement ForgotCustId_Password; 
	
	@FindBy(xpath = "//input[@name='EmailID']")
	public WebElement ForgotPasswordPageEmailId;
	
	@FindBy(xpath = "//button[text()='SUBMIT']")
	public WebElement ForgotPasswordSubmitbutton;
	
	@FindBy(xpath = "//a[text()='Sign In!']")
	public WebElement ForgotPasswordSignInButton;
	
	@FindBy(xpath = "//div[@class='alert alert-danger']")
	public WebElement AlertMessage;
	
	@FindBy(xpath = "//div[@class='msg']")
	public WebElement sentemailmessage;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public void Enter_CustomerId(String custid)
	{
		CustomerId.sendKeys(custid);
	}
	public void Enter_Username(String email)
	{
		Username.sendKeys(email);
	}
	public void Enter_Login_Password(String password)
	{
		Login_Password.sendKeys(password);
	}
	public void Click_SignIn_Button()
	{
		SignInButton.click();
	}
	
	public void Click_RegisterNow_Link()
	{
		RegisterNowLink.click();
	}
	
	public void Click_ForgotCustId_Password()
	{
		ForgotCustId_Password.click();
	}
	
	public void Enter_ForgotPasswordPageEmailId(String emailid)
	{
		ForgotPasswordPageEmailId.sendKeys(emailid);
	}
	
	public void Click_ForgotPasswordSubmitbutton()
	{
		ForgotPasswordSubmitbutton.click();
	}
	
	public void Click_ForgotPasswordSignInButton()
	{
		ForgotPasswordSignInButton.click();
	}
}
