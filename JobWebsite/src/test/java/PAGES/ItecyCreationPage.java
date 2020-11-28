package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ItecyCreationPage {

	@FindBy(id="ResumeTitle")
	public WebElement ProfessionalTitle;
	
	@FindBy(id="IndustryId")
	public WebElement Industry;
	
	@FindBy(xpath = "//textarea[@id='Summary']")
	public WebElement AboutNotes;
	
	@FindBy(xpath = "//input[@type='submit']")
	public WebElement CreateProfileNextbutton;
	
	public ItecyCreationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selectProfessionalTitle(String x)
	{
		ProfessionalTitle.clear();
		ProfessionalTitle.sendKeys(x);
	}
	
	public void selectindustry()
	{
		Industry.click();
		Select s=new Select(Industry);
		s.selectByVisibleText("IT");
	}
	
	public void AboutNotes(String x)
	{
		AboutNotes.clear();
		AboutNotes.sendKeys(x);
	}
	
	public void CreateProfileNextButton()
	{
		CreateProfileNextbutton.click();
	}
	
}
