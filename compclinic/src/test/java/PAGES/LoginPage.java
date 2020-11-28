package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath = "//input[@name='email']")
	public WebElement LoginPage_Email;
	
	@FindBy(xpath ="//input[@name='Password']")
	public WebElement LoginPage_Password;
	
	@FindBy(xpath ="//input[@type='checkbox']")
	public WebElement LoginPage_Show_password_checkbox;

	@FindBy(xpath ="//div[@class='col-md-12']/p/a[1]")
	public WebElement LoginPage_Register_Link;
	
	@FindBy(xpath ="//div[@class='col-md-12']/p/a[2]")
	public WebElement LoginPage_ForgotPassword_Link;

	@FindBy(xpath ="//button[@value='Register']")
	public WebElement LoginPage_LoginButton;

	@FindBy(xpath ="//button[text()='Cancel']")
	public WebElement LoginPage_Cancelbutton;
	
	@FindBy(xpath = "//input[@type='email']")
	public WebElement Enter_Email_Forgot_Password;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement Forgot_Password_Submit_button;
	
	@FindBy(xpath = "//div[@class='col-md-12']/p")
	public WebElement Reset_Password_message;
	
	@FindBy(xpath = "//div[@class='top_bar_login ml-auto']/ul/li[1]/a")
	public WebElement RegisterLink_LoginPage;
	

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void LoginP_Enter_Email(String x) 
	{
		LoginPage_Email.sendKeys(x);
	}
	
	public void LoginP_Enter_Password(String y) 
	{
		LoginPage_Password.sendKeys(y);
	}
	
	public void Click_LoginP_showPassword() 
	{
		LoginPage_Show_password_checkbox.click();
	}
	
	public void Click_LoginP_RegisterLink()
	{
		LoginPage_Register_Link.click();
	}
	
	public void Click_LoginP_ForgotPasswordlink()
	{
		LoginPage_ForgotPassword_Link.click();
	}
	
	public void Click_LoginP_LoginButton()
	{
		LoginPage_LoginButton.click();
	}
	
	public void Click_LoginP_CancelButton()
	{
		LoginPage_Cancelbutton.click();
	}
	
	public void Enter_Email_Forgot_Password(String x)
	{
		Enter_Email_Forgot_Password.sendKeys(x);
	}
	
	public void Forgot_Password_Submit_button()
	{
		Forgot_Password_Submit_button.click();
	}
	
	public void RegisterLink_LoginPage()
	{
		RegisterLink_LoginPage.click();
	}
	
}
