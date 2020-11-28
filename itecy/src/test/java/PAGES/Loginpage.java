package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	
	@FindBy(xpath="//input[@type='password']")
	public WebElement pwd;
	
	@FindBy(xpath="//div[@id='passwordNext']")
	public WebElement PwdNextButton; 
	
	@FindBy(xpath="//*[text()='Enter a password']")
	//@FindBy(xpath = "(//*[contains(text(), 'Enter a password')])[2]")
	public WebElement blankPwd;
	
	@FindBy(xpath="//*[contains(text(), 'Wrong password')]")
	//@FindBy(xpath = "(//*[contains(text(), 'Wrong')])[2]")
	public WebElement wrongpwd; 
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void enter_pwd(String p)
	{
		pwd.sendKeys(p);
	}
	
	public void pwdNextClick() 
	{
		PwdNextButton.click();
	}
}
