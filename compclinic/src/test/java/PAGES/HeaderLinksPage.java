package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderLinksPage {

		@FindBy(xpath = "//ul[@class='main_nav']/li[1]/a")
		public WebElement HomeLink;
		
		@FindBy(xpath = "//ul[@class='main_nav']/li[2]/a")
		public WebElement AboutUsLink;
		
		@FindBy(xpath = "//ul[@class='main_nav']/li[3]/a")
		public WebElement Servicesdropdownlink;
		
		@FindBy(xpath = "//div[@class='dropdown-menu show']/a[1]")
		public WebElement DataRecoveryServices;
		
			
		@FindBy(xpath = "//ul[@class='main_nav']/li[4]/a")
		public WebElement Shoppagedropdownlink;
		
		@FindBy(xpath = "//ul[@class='main_nav']/li[5]/a")
		public WebElement TransactionLink;
		
		@FindBy(xpath = "//ul[@class='main_nav']/li[6]/a")
		public WebElement ContactUslink;
		
		
		
		public HeaderLinksPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void Click_HomeLink()
		{
			HomeLink.click();
		}
		
				
		public void Click_AboutUsLink()
		{
			AboutUsLink.click();
		}
		
		public void Click_ServicesDropdownlink()
		{
			Servicesdropdownlink.click();
			DataRecoveryServices.click();
		}
		
		public void Click_TransactionLink()
		{
			TransactionLink.click();
		}
		
		public void Click_ContactLink()
		{
			ContactUslink.click();
		}

}
