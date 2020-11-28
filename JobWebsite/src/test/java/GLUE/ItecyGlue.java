package GLUE;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PAGES.AddCertificationPage;
import PAGES.AddExperience;
import PAGES.AddSkillsPage;
import PAGES.AddSocialProfilepage;
import PAGES.ItecyAddEducationPage;
import PAGES.ItecyCreationPage;
import PAGES.ItecyGeneralInfo;
import PAGES.ItecyHomePage;
import PAGES.ItecyLoginPage;
import PAGES.UploadResumePage;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ItecyGlue {

	public WebDriver driver;
	public WebDriverWait w;
	public Scenario s;
	public AddCertificationPage certpage;
	public AddExperience addexp;
	public AddSkillsPage addskill;
	public AddSocialProfilepage socpp;
	public ItecyAddEducationPage EduP;
	public ItecyCreationPage cp;
	public ItecyGeneralInfo genp;
	public ItecyHomePage hp;
	public ItecyLoginPage lp;
	public UploadResumePage uploadp;
	public Properties prop;
	
	
	@Before
	public void method(Scenario s) throws IOException
	{
		this.s=s;
		FileInputStream fs=new FileInputStream("C:\\AnishaWorkspace\\JobWebsite\\src\\test\\resources\\repository\\resource.properties");
		prop=new Properties();
		prop.load(fs);
	}
	
	@Given("^Launch Itecy Website$")
	public void itecy_launchwebsite()
	{  					  
		System.setProperty("webdriver.chrome.driver", prop.getProperty("driverpath")); 
		driver= new ChromeDriver();
		System.out.println("inside itecy website");
		certpage= new AddCertificationPage(driver);
		addexp= new AddExperience(driver);
		addskill = new AddSkillsPage(driver);
		socpp= new AddSocialProfilepage(driver);
		EduP= new ItecyAddEducationPage(driver);
		cp= new ItecyCreationPage(driver);
		genp= new ItecyGeneralInfo(driver);
		hp=new ItecyHomePage(driver);
		lp=new ItecyLoginPage(driver);
		uploadp=new UploadResumePage(driver);
		w=new WebDriverWait(driver, 20);
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
		
	}
	
	@When("^Click on JobSeeker Sign In$")
	public void clickonjobseekerlink()
	{
		w.until(ExpectedConditions.visibilityOf(lp.LoginPageJobSeekerButton));		
		lp.Click_on_JobSeekerLink();
	}
	
	
	@And("^Enter Username as \"(.*)\" value$")
	public void enter_username(String x)
	{
		w.until(ExpectedConditions.visibilityOf(lp.EmailIdField));
		lp.EnterUsername(x);
	}
	  
	@And("^Enter Password like \"(.*)\"$")
	public void enter_password(String y)
	{
		w.until(ExpectedConditions.visibilityOf(lp.PasswordField));
		lp.EnterPassword(y);
	}
	
	@And("^Click on Login button$")
	public void click_login_button()
	{
		w.until(ExpectedConditions.visibilityOf(lp.LoginButton));
		lp.ClickonLoginButton();
	}
	
	@And("^Click on JobSeeker Dropdown$")
	public void click_on_JobSeeker_dropdown()
	{
		w.until(ExpectedConditions.visibilityOf(hp.JobSeekerDropdown));
		hp.click_onJobSeeker_dropdown();
	} 
	
	@And("^Click on Create Profile$")
	public void click_on_create_profile()
	{
		w.until(ExpectedConditions.visibilityOf(hp.CreateProfileLink));
		hp.click_on_CreateProfile();
	} 
	
	@And("^Fill the fields on Creation page$")
	public void fill_fields_in_creationpage(DataTable dt)
	{
		List<Map<String,String>> data=dt.asMaps(String.class, String.class);
		w.until(ExpectedConditions.visibilityOf(cp.ProfessionalTitle));
		
		String Professional_Title=data.get(0).get("Professional_Title");
		String About_Notes=data.get(0).get("About_Notes");
		
		cp.selectProfessionalTitle(Professional_Title);
		w.until(ExpectedConditions.visibilityOf(cp.Industry));
		
		cp.selectindustry();
		w.until(ExpectedConditions.visibilityOf(cp.AboutNotes));
		cp.AboutNotes(About_Notes);
	}
	
	@And("^Click on ProfileCreation Next button$")
	public void clickon_creationpage_nextButton() throws Exception
	{
		Thread.sleep(5000);
		w.until(ExpectedConditions.elementToBeClickable(cp.CreateProfileNextbutton));
		cp.CreateProfileNextButton();
		
	}
	
	@And("^Fill fields in General information page$")
	public void fill_in_generl_info_page(DataTable dt) 
	{
		List<Map<String,String>> data= dt.asMaps(String.class, String.class);
		w.until(ExpectedConditions.visibilityOf(genp.gender));
		
		String Select_DOB=data.get(0).get("Select_DOB");
		String Experience= data.get(0).get("Experience");
		
		genp.SelectGender();
		
		w.until(ExpectedConditions.visibilityOf(genp.MaritalStatus));
		genp.SelectMaritalStatus();
		
		w.until(ExpectedConditions.visibilityOf(genp.NationalityId));
		genp.SelectNationality();
		
		w.until(ExpectedConditions.visibilityOf(genp.CountryId));
		genp.SelectCountry();
		
		
		w.until(ExpectedConditions.visibilityOf(genp.StateId));
		genp.SelectState();
		
		
		w.until(ExpectedConditions.visibilityOf(genp.CityId));
		genp.SelectCity();
		
		w.until(ExpectedConditions.visibilityOf(genp.DateOfBirth));
		genp.selectdateofbirth(Select_DOB);
		
		w.until(ExpectedConditions.elementToBeClickable(genp.deselectlanguage));
		genp.unselectlanguage();
		
		w.until(ExpectedConditions.visibilityOf(genp.selectLanguageoption));
		genp.selectlanguagedropdown();
		
		w.until(ExpectedConditions.visibilityOf(genp.selectLanguage));
		genp.selectlanguage();
		
		w.until(ExpectedConditions.visibilityOf(genp.SelectPreferredLocationoption));
		genp.SelectPreferredLocation();
		
		w.until(ExpectedConditions.elementToBeClickable(genp.unselectlocation));
		genp.unselectlocation();
		
		w.until(ExpectedConditions.visibilityOf(genp.SelectPreferredLocation));
		genp.SelectLocation();
		
		genp.Experience(Experience);
		
		w.until(ExpectedConditions.visibilityOf(genp.ExperienceLevel));
		genp.ExperienceLevel();
		
		w.until(ExpectedConditions.visibilityOf(genp.WorkAuthorization));
		genp.WorkAuthorization();
		
	}
	
	@And("^Click on GeneralInformation NextButton$") 
	public void clickonGeneralInformationNextButton() throws Exception
	{
		Thread.sleep(5000);
		w.until(ExpectedConditions.elementToBeClickable(genp.GeneralInfoNextButton));
		genp.generalinfoNextbutton();
	}
	
	@And("^Click on AddEducationbutton$")
	public void Add_education_details() throws InterruptedException
	{
		Thread.sleep(5000);
		w.until(ExpectedConditions.elementToBeClickable(EduP.AddEducationButton));
		EduP.click_on_AddEducation_Button();
	}
	
	@And("^fill the fields in add education page$")
	public void fill_in_fields_in_education_page(DataTable dt)
	{
		List<Map<String,String>> data= dt.asMaps(String.class, String.class);
		w.until(ExpectedConditions.visibilityOf(EduP.selectdegree));
		
		String Passing_Year= data.get(0).get("Passing_Year");
		String University_Name=data.get(0).get("University_Name");
		
		EduP.Selectdegree();
		
		w.until(ExpectedConditions.visibilityOf(EduP.Specialization));
		EduP.SelectSpecialization();
		
		w.until(ExpectedConditions.visibilityOf(EduP.PassingYear));
		EduP.Enter_Passing_Year(Passing_Year);
		EduP.Enter_UniversityName(University_Name);
		
	}
	
	@And("^Click on SaveChanges button on EducationPage$")
	public void save_changes_on_educationpage(){
		
		w.until(ExpectedConditions.elementToBeClickable(EduP.AddEduationSubmitbutton));
		EduP.Click_on_AddEduationSavebutton();	
		
	}
	
	@And("^Click on EducationPage Nextbutton$")
	public void click_nextbutton_on_educationpage() throws Exception {
		Thread.sleep(5000);
		//w.until(ExpectedConditions.visibilityOf(EduP.AddEduationNextbutton));
		w.until(ExpectedConditions.elementToBeClickable(EduP.AddEduationNextbutton));
		EduP.Click_on_AddEduationNextbutton();	
		
	}
	
	@And("^Click on AddExperience button$")
	public void Click_on_AddExperience_button() throws Exception {
		Thread.sleep(5000);
		w.until(ExpectedConditions.elementToBeClickable(addexp.AddExperienceButton));
		addexp.AddExperienceButton();	
	}
	
	@And("^fill the fields of AddExperience page$")
	public void fill_the_fields_of_AddExperience_page(DataTable dt)
	{
		List<Map<String,String>> data= dt.asMaps(String.class, String.class);
		w.until(ExpectedConditions.visibilityOf(addexp.CompanyIdDropdown));
		
		String Select_JoiningDate= data.get(0).get("Select_JoiningDate");
		String Select_MonthlySalary= data.get(0).get("Select_MonthlySalary");
		
		addexp.selectcompany();
		
		w.until(ExpectedConditions.visibilityOf(addexp.IndustryIdDropdown));
		addexp.selectIndustry();
		
		w.until(ExpectedConditions.visibilityOf(addexp.FunctionalAreaId));
		addexp.selectFunctionalAreaId();
		
		w.until(ExpectedConditions.visibilityOf(addexp.DesignationId));
		addexp.selectDesignationId();
		
		addexp.enterdate(Select_JoiningDate);
		addexp.MonthlySalary(Select_MonthlySalary);
		
	}
	
	@And("^click on IsCurrentCompany checkbox$")
	public void click_on_IsCurrentCompany_checkbox()
	{
		w.until(ExpectedConditions.visibilityOf(addexp.IsCurrentCompanycheckbox));
		addexp.Click_on_IsCurrentCompanycheckbox();
	}
	
	@And("^Select Expected increments$")
	public void  Select_Expected_increments() {
		w.until(ExpectedConditions.visibilityOf(addexp.ExpectedSalary));
		addexp.ExpectedSalary();
	}
	
	
	@And("Select Notice period$")
	public void  Select_Notice_period() {
		w.until(ExpectedConditions.visibilityOf(addexp.NoticePeriod));
		addexp.NoticePeriod();
	}
	
	@And("^Click on SaveChanges button on Experience page$")
	public void  Click_on_SaveChanges_button_on_Experience_page()
	{
		//w.until(ExpectedConditions.visibilityOf(addexp.Experiencesavechangesbutton));
		w.until(ExpectedConditions.elementToBeClickable(addexp.Experiencesavechangesbutton));
		addexp.Click_on_Experiencesavechangesbutton();
	}
	
	@And("^Click on Experience NextButton$")
	public void Click_AddExperience_NextButton() throws Exception
	{
		Thread.sleep(5000);
		w.until(ExpectedConditions.visibilityOf(addexp.ExperienceNextbutton));
		addexp.Click_on_ExperienceNextbutton();
	}
	
	@And("^Click on AddCertification pagebutton$")
	public void Click_on_AddCertification_pagebutton() throws Exception
	{
		Thread.sleep(5000);
		w.until(ExpectedConditions.elementToBeClickable(certpage.Addcertificationbutton));
		certpage.click_on_AddCertificate();
	}
	
	@And("^fill the fields of Certification page$")
	public void fill_the_fields_of_Certification_page(DataTable dt) 
	{
		List<Map<String,String>> data= dt.asMaps(String.class, String.class);
		w.until(ExpectedConditions.visibilityOf(certpage.CertificateName));
		
		String Select_CertificateName= data.get(0).get("Select_CertificateName");
		String Select_Date= data.get(0).get("Select_Date");
		String Select_LicenseNo= data.get(0).get("Select_LicenseNo");
		String Select_Institute_Name= data.get(0).get("Select_Institute_Name");
		
		certpage.Enter_CertificateName(Select_CertificateName);
		
		w.until(ExpectedConditions.visibilityOf(certpage.CertificateValidity));
		certpage.CertificateValidity(Select_Date);
		
		w.until(ExpectedConditions.visibilityOf(certpage.CertificateLicenceNo));
		certpage.CertificateLicenceNo(Select_LicenseNo);
		
		w.until(ExpectedConditions.visibilityOf(certpage.CertificateInstituteName));
		certpage.InstituteName(Select_Institute_Name);
		
	}
	
	@And("^Click on SaveChanges button on Certificaton page$")
	public void Click_on_SaveChanges_button_Certificatonpage()
	{
		w.until(ExpectedConditions.visibilityOf(certpage.Addcertificatiosavenbutton));
		certpage.Addcertificatiosavenbutton();
	}
	
	@And("^Click on Certification page Nextbutton$")
	public void Click_on_Next_button_Certificatonpage() throws Exception
	{
		Thread.sleep(5000);
		w.until(ExpectedConditions.visibilityOf(certpage.AddcertificationNextbutton));
		certpage.AddcertificationNextbutton();
	}
	
	@And("^Select Skills$")
	public void Select_Skills() throws Exception
	{
		w.until(ExpectedConditions.visibilityOf(addskill.unselectASPNET));
		addskill.unselectASPNET();
		Thread.sleep(5000);
		w.until(ExpectedConditions.visibilityOf(addskill.ClickAddSkillsoptions));
		addskill.AddSkillsoptions(); 
		w.until(ExpectedConditions.visibilityOf(addskill.ASPDOTNETskill));
		addskill.Click_AddSkill();
		
	}
	
	@And("^click on Next button on Skills page$")
	public void click_Next_button_Skills_page () throws Exception 
	{
		Thread.sleep(5000);
		w.until(ExpectedConditions.elementToBeClickable(addskill.AddSkillsNextbutton));
		addskill.Click_AddSkillNextbutton();
	}
	
	@And("^fill the fields on Social Profile page$")
	public void fill_fields_SocialProfilepage(DataTable dt)
	{
		List<Map<String,String>> data= dt.asMaps(String.class, String.class);
		w.until(ExpectedConditions.visibilityOf(socpp.Facebook));
		
		String Facebook= data.get(0).get("Facebook");
		String GoogleLink= data.get(0).get("GoogleLink");
		String TwitterLink= data.get(0).get("TwitterLink");
		String InstagramLink= data.get(0).get("InstagramLink");
		
		socpp.Enter_Facebook(Facebook);
		
		w.until(ExpectedConditions.visibilityOf(socpp.Gplus));
		socpp.Enter_Gplus(GoogleLink);
		
		w.until(ExpectedConditions.visibilityOf(socpp.Twitter));
		socpp.Enter_Twitter(TwitterLink);
		
		w.until(ExpectedConditions.visibilityOf(socpp.Instagram));
		socpp.Enter_Instagram(InstagramLink);
		
	}
	
	@And("^Click on SocialProfile Next button$")
	public void Click_SocialProfile_Next_button()
	{
		
		w.until(ExpectedConditions.elementToBeClickable(socpp.SocialProfileNextbutton));
		socpp.Click_SocialProfileNextbutton();
	} 
	
	@And("^upload Resume$")
	public void upload_Resume() throws Exception
	{
		w.until(ExpectedConditions.visibilityOf(uploadp.uploadResume));
		uploadp.uploadresumepage();
	}
	
	@And("^Click on Submit your details$")
	public void Submit_details() throws Exception
	{
		Thread.sleep(5000);
		w.until(ExpectedConditions.elementToBeClickable(uploadp.SubmitYourDetails));
		uploadp.click_on_submitdetailsbutton();
	}
	@Then("^Observe the Update profile Successfully message should be displayed$")
	public void uploadProfileObservation() throws Exception
	{
		try
		{
			if(uploadp.ProfileUploadMessage.isDisplayed())
			{
				w.until(ExpectedConditions.visibilityOf(uploadp.ProfileUploadMessage));
				s.write("update profile successfully message should be displayed");
				Thread.sleep(5000);
			}
			else
			{
				byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
				s.embed(ss, "Test failed");
			}
		}
		
		catch(Exception e)
		{
			byte[] ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			s.embed(ss, "Test failed");
		}
		
			
	} 
	
	@When("^close site$")
	public void close_browser()
	{
		driver.quit();
	}
}