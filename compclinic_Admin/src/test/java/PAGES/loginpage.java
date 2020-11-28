package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	@FindBy(xpath = "//input[@name='email']")
	public WebElement Admin_Email;
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement Admin_Password;
	
	@FindBy(xpath ="//input[@type='checkbox']")
	public WebElement ShowPassword;
	
	@FindBy(xpath = "//button[text()='Log In']")
	public WebElement LogInButton;
	
	@FindBy(xpath = "//div[@class='alert alert-danger']")
	public WebElement ErrorMessage;
	
	@FindBy(xpath = "//a[@class='mb-control']/span")
	public WebElement LogOutButton;
	
	@FindBy(xpath = "//span[text()='Yes']")
	public WebElement YesButton;
	
	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Enter_Email(String email)
	{
		Admin_Email.sendKeys(email);
	}
	
	public void Enter_Password(String password)
	{
		Admin_Password.sendKeys(password);
	}
	public void Click_Show_Password()
	{
		ShowPassword.click();
	}
	public void Click_Login_Button()
	{
		LogInButton.click();
	}
	public void Click_Logout_Button()
	{
		LogOutButton.click();
	}
	public void Click_Yes_Button()
	{
		YesButton.click();
	}
	
}
