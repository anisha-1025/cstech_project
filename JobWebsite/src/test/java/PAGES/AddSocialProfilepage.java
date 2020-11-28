package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddSocialProfilepage {

	@FindBy(id="Facebook")
	public WebElement Facebook;
	
	@FindBy(id="Gplus")
	public WebElement Gplus;
	
	@FindBy(id="Twitter")
	public WebElement Twitter;
	
	@FindBy(id="Instagram")
	public WebElement Instagram;
	
	@FindBy(xpath = "//input[@value='Next']")
	public WebElement SocialProfileNextbutton;

	public  AddSocialProfilepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	} 
	
	public void Enter_Facebook(String x)
	{
		Facebook.clear();
		Facebook.sendKeys(x);
	}
	
	public void Enter_Gplus(String x)
	{
		Gplus.clear();
		Gplus.sendKeys(x);
	}
	
	public void Enter_Twitter(String x)
	{
		
		Twitter.click();
		Twitter.sendKeys(x);
	}
	
	public void Enter_Instagram(String x)
	{
		Instagram.click();
		Instagram.sendKeys(x);
	}
	
	public void Click_SocialProfileNextbutton()
	{
		SocialProfileNextbutton.click();
	}
	
}


