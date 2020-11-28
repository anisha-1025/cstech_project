package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//div[@class='top_bar_login ml-auto']/ul/li[1]/a")
	public WebElement RegisterLink;

	@FindBy(xpath = "//div[@class='top_bar_login ml-auto']/ul/li[2]/a")
	public WebElement LoginLink;
	
	@FindBy(xpath ="//a[text()='home']")
	public WebElement HomeLink;

	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void ClickRegisterLink() {
		RegisterLink.click();
	}


	public void ClickLoginLink() {
		LoginLink.click();
	}

	


}
