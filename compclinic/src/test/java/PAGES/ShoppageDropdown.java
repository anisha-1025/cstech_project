package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppageDropdown {

	@FindBy(xpath = "//ul[@class='main_nav']/li[4]/a")
	public WebElement ShopPageDropdown;
	
	@FindBy(xpath = "//div[@class='dropdown-menu show']/a[1]")
	public WebElement Computer_Pc;
	
	@FindBy(xpath = "//a[text()=' Gaming']")
	public WebElement GamingComputerOption; 
	
	@FindBy(xpath = "//div[@class='dropdown-menu show']/a[2]")
	public WebElement Laptops;
	
	@FindBy(xpath = "//a[text()='Lenovo']")
	public WebElement LenovoLaptop;
	
	@FindBy(xpath = "//div[@class='dropdown-menu show']/a[3]")
	public WebElement Tablets;
	
	@FindBy(xpath = "//a[@href='/product/Home/productDetails?id=1039']")
	public WebElement SamsungTablet;
	
	
	
	
	public ShoppageDropdown(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Click_Compuere_Pc()
	{
		ShopPageDropdown.click();
		Computer_Pc.click();
	}
	
	public void Click_Laptops()
	{
		ShopPageDropdown.click();
		Laptops.click();
	}
	
	public void Click_Tablets()
	{
		ShopPageDropdown.click();
		Tablets.click();
	}
}
