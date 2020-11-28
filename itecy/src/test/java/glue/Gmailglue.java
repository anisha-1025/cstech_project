package glue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import PAGES.ComposePage;
import PAGES.Homepage;
import PAGES.Loginpage;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Gmailglue {

	public WebDriver driver;
	public WebDriverWait w;
	public Scenario s;
	public Homepage hp;
	public Loginpage lp;
	public ComposePage cp;
	public Properties prop;

	@Before
	public void method(Scenario s) throws IOException {
		this.s = s;
		FileInputStream fs = new FileInputStream(
				"C:\\AnishaWorkspace\\itecy\\src\\test\\resources\\repository\\file.properties");
		prop = new Properties();
		prop.load(fs);
	}

	@Given("^Launch website$")
	public void launchWebsite() {
		System.setProperty("webdriver.chrome.driver", prop.getProperty("driverpath"));
		driver = new ChromeDriver();
		w = new WebDriverWait(driver, 10);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		

		hp = new Homepage(driver);
		lp = new Loginpage(driver);
		cp = new ComposePage(driver);
		driver.get(prop.getProperty("url"));

	}

	@When("^Enter userid like \"(.*)\" value$")
	public void EnterUserid(String x) throws Exception  {
		w.until(ExpectedConditions.visibilityOf(hp.userid));
		hp.fill_uid(x);
		//Thread.sleep(5000);
		
	}

	@And("^Click on UserID Next button$")
	public void useridNext() throws InterruptedException {
		w.until(ExpectedConditions.visibilityOf(hp.NextButton));
		hp.useridNextClick();
		Thread.sleep(2000);
		
	}

	@Then("^Validate userid output for \"(.*)\" with \"(.*)\" with \"(.*)\" criteria$")
	public void validate_userid_output(String x, String y, String z) {
		try {
			if (x.length() == 0 && hp.USERidBlank.isDisplayed()) {
				s.write("uid blank test is passed");
				Thread.sleep(5000);
			} //else if (y.equalsIgnoreCase("invalid") && hp.InvalidUserid.isDisplayed())
			else if (x.length() != 0 && z.equals("Test2") && hp.InvalidUserid.isDisplayed())

			{
				s.write("uid invalid test is passed");
				Thread.sleep(5000);
			} else if (y.equalsIgnoreCase("Valid") && z.equals("test3") && lp.pwd.isDisplayed()) {  //userid is valid and pwd page is displayed 
				s.write("Valid uid testcase passed");
				Thread.sleep(5000);
			}
			else 
			{
				s.write("Valid uid testcase failed");
				byte[] b= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
				s.embed(b,"pwd test failed");
				Thread.sleep(5000);
			}
		} 
		
		catch (Exception e) {
			s.write(e.getMessage());
		}

	}
	
	@When ("^close site$")
	
	public void close_site()
	{
		driver.quit();
	}

	
	@When ("^Enter password like \"(.*)\" value$") 
	public void Enterpwd(String p) throws Exception
	{
		w.until(ExpectedConditions.visibilityOf(lp.pwd));
		lp.enter_pwd(p);
		Thread.sleep(5000);
	}
	
	@And ("^click on Password Next button$")
	public void Pwdnext() throws Exception
	{
		
		w.until(ExpectedConditions.visibilityOf(lp.PwdNextButton));
		lp.pwdNextClick();
		Thread.sleep(5000);
	}
	
	@Then ("^Validate password output with \"(.*)\" with \"(.*)\" criteria$")
	public void validate_pwd_output(String x, String y)
	{
		try {
			if (x.length() == 0 && lp.blankPwd.isDisplayed()) {
				s.write("pwd blank test is passed");
				Thread.sleep(5000);
			} else if (y.equalsIgnoreCase("invalid") && lp.wrongpwd.isDisplayed())

			{
				s.write("pwd invalid test is passed");
				Thread.sleep(5000);
			} else if (y.equalsIgnoreCase("valid") && cp.compose.isDisplayed()) {
				s.write("Valid pwd testcase passed");
				Thread.sleep(5000);
			}
			else 
			{
				byte[] b= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
				s.embed(b,"pwd test failed");
				Thread.sleep(5000);
			}
		} 
		
		catch (Exception e) {
			s.write(e.getMessage());
		}
		
	}
	
	@When("^close site$")
	public void close_browser()
	{
		driver.quit();
	}
}
