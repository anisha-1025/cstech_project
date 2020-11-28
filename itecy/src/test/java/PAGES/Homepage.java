package PAGES;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	//page class we locate the web elements
	
	@FindBy(name="identifier")
	public WebElement userid;
	
	//@FindBy(id = "identifierNext")
	//@FindBy(xpath = "//*[@class='ZFr60d CeoRYc']")
	//@FindBy(xpath = "//*[text()= 'Next']")
	@FindBy(xpath= "//*[@id='identifierNext']/span/span")  
	public WebElement NextButton;
	
	@FindBy(xpath= "//*[text()='Enter an email or phone number']")  //*[text() ='Enter an email or phone number']
	
	public WebElement USERidBlank; 
	
				   
	//@FindBy(xpath= "(//*[contains(text(), 'find your Google Account')])[2]" )     
	@FindBy(xpath= "//*[@id='view_container']/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[2]")
	public WebElement InvalidUserid; 
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void fill_uid(String x)
	{
		userid.sendKeys(x);
	}
	
	public void useridNextClick()
	{
		NextButton.click();
		//WebElement element = driver.findElement(By.id("gbqfd"));
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();", NextButton);
	}
	
	
}
