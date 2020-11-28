package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterationPage {
	@FindBy(xpath = "//input[@name='FirstName']")
	public WebElement Firstname;
	
	@FindBy(xpath = "//input[@name='LastName']")
	public WebElement Lastname;
	
	@FindBy(xpath = "//input[@name='Phone']")
	public WebElement contactnumber;
	
	@FindBy(xpath = "//input[@name='Email']")
	public WebElement email;
	
	@FindBy(xpath = "//input[@name='Password']")
	public WebElement Password;
	
	@FindBy(xpath = "//input[@name='ConfirmPassword']")
	public WebElement ConfirmPassword;
	
	@FindBy(xpath = "//button[contains(text(),'Register')]")
	public WebElement Registerbutton;
	
	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	public WebElement Cancelbutton;

	@FindBy(xpath = "//input[@type='checkbox']")
	public WebElement show_password_checkboxbutton;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/form/div[2]/div/div/div[1]")
	//@FindBy(xpath = "//div[@class='alert alert-success']")
	public WebElement Registeration_confirmation_message;
	
//	@FindBy(xpath = "/html/body/div[2]/div[2]/form/div[2]/div/div/div[1]")
//	
//	public WebElement Registeration_Email_AlreadyRegistered;
	
	public RegisterationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterFirstName(String fn)
	{
		Firstname.sendKeys(fn);
	}
	
	public void EnterLastName(String fn)
	{
		Lastname.sendKeys(fn);
	}
	
	public void EnterContactNumber(String fn)
	{
		contactnumber.sendKeys(fn);
	}
	
	public void EnterEmailId(String fn)
	{
		email.sendKeys(fn);
	}
	
	public void EnterPassword(String x)
	{
		Password.sendKeys(x);
	}
	
	public void Re_EnterPassword(String x)
	{
		ConfirmPassword.sendKeys(x);
	}
	
	public void Click_Register_Button()
	{
		Registerbutton.click();
	}
	
	public void Click_Cancel_Button()
	{
		Cancelbutton.click();
	}
	
	public void check_show_password()
	{
		show_password_checkboxbutton.click();
	}
}
