package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItecyHomePage {

	
	@FindBy(xpath = "//a[text()= 'Job Seeker']")
	public WebElement JobSeekerDropdown;
	
	@FindBy(xpath = "//a[text()= 'Create Profile']")
	public WebElement CreateProfileLink;
	
	public ItecyHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click_onJobSeeker_dropdown()
	{
		JobSeekerDropdown.click();
	}
	
	public void click_on_CreateProfile()
	{
		CreateProfileLink.click();
	}
	
	
}
