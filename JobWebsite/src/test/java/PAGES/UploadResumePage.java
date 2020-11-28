package PAGES;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadResumePage {

	@FindBy(id="uploadResume")
	public WebElement uploadResume;
	
	@FindBy(xpath = "//input[@value='Submit Your Details']")
	public WebElement SubmitYourDetails;
	
	@FindBy(xpath = "//*[@class='alert alert-danger']")
	public WebElement ProfileUploadMessage;
	
	public UploadResumePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void uploadresumepage() throws Exception
	{
		uploadResume.sendKeys("C:\\Users\\PC\\Downloads\\SampleResume.docx");
		/*uploadResume.click();
		Thread.sleep(10000);
		StringSelection sec=new StringSelection("C:\\Users\\PC\\Downloads\\SampleResume");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sec,null);
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);*/
	}
	
	public void click_on_submitdetailsbutton()
	{
		SubmitYourDetails.click();
		
	}
}
//C:\Users\PC\Downloads\SampleResume.docx