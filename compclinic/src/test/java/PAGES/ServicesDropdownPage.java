package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicesDropdownPage {

	@FindBy(xpath = "//ul[@class='main_nav']/li[3]/a")
	public WebElement ServicesDropdownLink;
	
	@FindBy(xpath = "//div[@class='dropdown-menu show']/a[1]")
	public WebElement DataRecoveryServies;
	
	@FindBy(xpath = "//div[@class='dropdown-menu show']/a[2]")
	public WebElement DesktopLaptopRepairs;
	
	@FindBy(xpath = "//div[@class='dropdown-menu show']/a[3]")
	public WebElement IpadImacServices;
	
	@FindBy(xpath = "//div[@class='dropdown-menu show']/a[4]")
	public WebElement NetworkingServices;
	
	@FindBy(xpath = "//div[@class='dropdown-menu show']/a[5]")
	public WebElement MobileRepairing;
	
	@FindBy(xpath = "//div[@class='home_title']")
	public WebElement hometitle;
	public ServicesDropdownPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Click_DataRecoveryServices()
	{
		ServicesDropdownLink.click();
		DataRecoveryServies.click();
	}
	
	public void Click_DesktopLaptopRepairs()
	{
		ServicesDropdownLink.click();
		DesktopLaptopRepairs.click();
	}
	
	public void Click_IpadImacServices()
	{
		ServicesDropdownLink.click();
		IpadImacServices.click();
	}
	
	public void Click_NetworkingServices()
	{
		ServicesDropdownLink.click();
		NetworkingServices.click();
	}
	
	public void Click_MobileRepairing()
	{
		ServicesDropdownLink.click();
		MobileRepairing.click();
	}
}
