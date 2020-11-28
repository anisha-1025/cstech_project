package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItecyLoginPage {
@FindBy(xpath = "//a[text()= 'Jobseeker Sign In']")  
public WebElement LoginPageJobSeekerButton;


@FindBy(xpath ="//input[@name='email']")
public WebElement EmailIdField;

@FindBy(xpath = "//input[@name='password']")
public WebElement PasswordField;

@FindBy(id="login-btn")
public WebElement LoginButton;



//constructor
public ItecyLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


public void Click_on_JobSeekerLink()
	{
		LoginPageJobSeekerButton.click();
	}

public void EnterUsername(String x)
	{
		EmailIdField.sendKeys(x);
	}

public void EnterPassword(String y)
	{
		PasswordField.sendKeys(y);
	}
public void ClickonLoginButton()
	{
	LoginButton.click();
	}

}