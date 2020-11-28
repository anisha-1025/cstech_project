package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ItecyAddEducationPage {
					
	@FindBy(xpath = "//input[@value='Add Education']")
	public WebElement AddEducationButton;
	
	@FindBy(id="EducationId")
	public WebElement selectdegree;
	
	@FindBy(id= "EducationTypeId")
	public WebElement Specialization;
	
	@FindBy(xpath = "//input[@id='PasYr']")
	public WebElement PassingYear;
	
	@FindBy(xpath = "//input[@id='UniName']")
	public WebElement UniversityName ;

	@FindBy(xpath = "//input[@id= 'btnSubmit']")
	public WebElement AddEduationSubmitbutton ;
	
	@FindBy(xpath = "//a[text()='Next']")
	public WebElement AddEduationNextbutton ;
	
	
	public ItecyAddEducationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void click_on_AddEducation_Button()
	{
		AddEducationButton.click();
	}
	
	public void Selectdegree()
	{
		selectdegree.click();
		Select s=new Select(selectdegree); 
		s.selectByVisibleText("B.B.A");
	}
	
	public void SelectSpecialization()
	{
		Specialization.click();
		Select s=new Select(Specialization); 
		s.selectByVisibleText("Management");
	}
	
	public void Enter_Passing_Year(String x)
	{
		PassingYear.sendKeys(x);
	}
	
	public void Enter_UniversityName(String x)
	{
		UniversityName.sendKeys(x);
	}
	
	public void Click_on_AddEduationSavebutton()
	{
		AddEduationSubmitbutton.click();
	}
	
	public void Click_on_AddEduationNextbutton()
	{
		//Thread.sleep(20);
		AddEduationNextbutton.click();
	}
	
}
