package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ItecyGeneralInfo {

	@FindBy(id="Gender")
	public WebElement gender;
	
	@FindBy(id="MaritalStatus")
	public WebElement MaritalStatus;
	
	@FindBy(id="NationalityId")
	public WebElement NationalityId;
	
	@FindBy(id="CountryId")
	public WebElement CountryId;
	
	@FindBy(id="StateId")
	public WebElement StateId;
		
	@FindBy(id="CityId")
	public WebElement CityId;

	@FindBy(id="DateOfBirth")
	public WebElement DateOfBirth;
	
	
	@FindBy(xpath = "//*[@id='ddlLang_chosen']/ul/li/input")
	public WebElement selectLanguageoption;
	
	@FindBy(xpath = "//*[@id=\"ddlLang_chosen\"]/ul/li[1]/a")
	public WebElement deselectlanguage;
	
	@FindBy(xpath = "//div[@id='ddlLang_chosen']/div/ul/li[22]")
	public WebElement selectLanguage;
	
	@FindBy(xpath = "//*[@id='ddlLoc_chosen']/ul/li/input")
	public WebElement SelectPreferredLocationoption;
	
	@FindBy(xpath = "//*[@id=\"ddlLoc_chosen\"]/ul/li[1]/a")
	public WebElement unselectlocation;
	
	@FindBy(xpath = "//*[@id='ddlLoc_chosen']/div/ul/li[1]")
	public WebElement SelectPreferredLocation;
		
	@FindBy(xpath="//input[@id='Exp']")
	public WebElement Experience;
	
	@FindBy(id="ExpLevel")
	public WebElement ExperienceLevel;
	
	@FindBy(id="AuthId")
	public WebElement WorkAuthorization;
	
	@FindBy(xpath = "//input[@type='submit']")
	public WebElement GeneralInfoNextButton;
	
	
	
	public ItecyGeneralInfo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SelectGender()
	{
		gender.click();
		Select s=new Select(gender);
		s.selectByVisibleText("Female");
		
	}
	
	public void SelectMaritalStatus()
	{
		MaritalStatus.click();
		Select s=new Select(MaritalStatus);
		s.selectByVisibleText("Married");
	}
	
	public void SelectNationality()
	{
		NationalityId.click();
		Select s=new Select(NationalityId);
		s.selectByVisibleText("Indian");
	}
	
	public void SelectCountry()
	{
		CountryId.click();
		Select s=new Select(CountryId);
		s.selectByVisibleText("INDIA");
	}
	
	public void SelectState()
	{
		StateId.click();
		Select s=new Select(StateId);
		s.selectByVisibleText("TELANGANA");
	}
	
	
	public void SelectCity() 
	{
		CityId.click();
		Select s=new Select(CityId);
		s.selectByVisibleText("Hyderabad");
	}
	
	public void selectdateofbirth(String x)
	{
		DateOfBirth.sendKeys(x);
	}

		
	public void selectlanguagedropdown()
	{
	selectLanguageoption.click();	
	
	} 
	
	public void selectlanguage()
	{
	
	selectLanguage.click();	
	}
	
	public void unselectlanguage()
	{
	
	deselectlanguage.click();	
	}
	
	public void unselectlocation()
	{
	
	unselectlocation.click();	
	}
	
	public void SelectPreferredLocation()
	{
		
		SelectPreferredLocationoption.click();
	} 
	
	
	public void SelectLocation()
	{
	
		SelectPreferredLocation.click();
	}

	public void Experience(String x)
	{
		Experience.clear();
		Experience.sendKeys(x);
	}
	
	public void ExperienceLevel()
	{
		
		ExperienceLevel.click();
		Select s = new Select(ExperienceLevel);
		
		s.selectByValue("4");
	}
	
	public void WorkAuthorization()
	{
		WorkAuthorization.click();
		Select s = new Select(WorkAuthorization);
		s.selectByVisibleText("Permanent Resident");
	}
	
	public void generalinfoNextbutton()
	{
		GeneralInfoNextButton.click();
	}
			

}
	

	

