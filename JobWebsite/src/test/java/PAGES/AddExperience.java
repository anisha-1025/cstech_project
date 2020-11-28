package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddExperience {

	@FindBy(xpath = "//input[@value='Add Experience']")
	public WebElement AddExperienceButton;
	
	@FindBy(name="CompanyId")
	public WebElement CompanyIdDropdown;
	
	@FindBy(name="IndustryId")
	public WebElement IndustryIdDropdown;
	
	@FindBy(id ="FunctionalAreaId")
	public WebElement FunctionalAreaId;
	
	@FindBy(id ="DesignationId")
	public WebElement DesignationId;
	
	@FindBy(xpath= "//input[@id='JoiningDate']")
	public WebElement JoiningDate;
	
	@FindBy(id = "MonthlySalary")
	public WebElement MonthlySalary;

	@FindBy(id = "IsCurrentCompany")
	public WebElement IsCurrentCompanycheckbox; 
	
	@FindBy(xpath = "//*[@id = 'ExpectedSalary']")
	public WebElement ExpectedSalary; 
	
	@FindBy(id = "NoticePeriod")
	public WebElement NoticePeriod; 
	
	@FindBy(xpath = "//input[@type='submit']")
	public WebElement Experiencesavechangesbutton; 

	@FindBy(xpath = "//a[text()='Next']")
	public WebElement ExperienceNextbutton;
	
	public AddExperience(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void AddExperienceButton()
	{
		AddExperienceButton.click();
	}
	
	public void selectcompany()
	{
		CompanyIdDropdown.click();
		Select s=new Select(CompanyIdDropdown);
		s.selectByVisibleText("Infosys");
	}
	
	public void selectIndustry()
	{
		IndustryIdDropdown.click();
		Select s=new Select(IndustryIdDropdown);
		s.selectByVisibleText("IT");
	}
	
	public void selectFunctionalAreaId()
	{
		FunctionalAreaId.click();
		Select s=new Select(FunctionalAreaId);
		s.selectByVisibleText("Automationtesting");
	}
	
	public void selectDesignationId()
	{
		DesignationId.click();
		Select s=new Select(DesignationId);
		s.selectByVisibleText("Automationtester");
	}
	
	public void enterdate(String x)
	{
		JoiningDate.sendKeys(x);
	}
	
	public void MonthlySalary(String x)
	{
		MonthlySalary.sendKeys(x);
	}

	public void Click_on_IsCurrentCompanycheckbox()
	{
		IsCurrentCompanycheckbox.click();
	}


	public void ExpectedSalary()
	{
		ExpectedSalary.click();
		Select s=new Select(ExpectedSalary);
		s.selectByVisibleText("30% Hike");
	}
	
	public void NoticePeriod()
	{
		NoticePeriod.click();
		Select s=new Select(NoticePeriod);
		s.selectByVisibleText("15 Days");
	}

	
	public void Click_on_Experiencesavechangesbutton()
	{
		Experiencesavechangesbutton.click();
	} 
	
	public void Click_on_ExperienceNextbutton()
	{
		ExperienceNextbutton.click();
	}
	
}
