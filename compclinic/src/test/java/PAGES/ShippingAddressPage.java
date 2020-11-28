package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingAddressPage {

	
	@FindBy(xpath = "//input[@value='Deliver to this Address']")
	public WebElement DeliverAddressButton;
	
	@FindBy(xpath = "//input[@value='Edit']")
	public WebElement EditAdressButton;
	
	@FindBy(xpath = "//button[text()= 'Update']")
	public WebElement UpdateButton;
	
	@FindBy(xpath="//input[@value='Delete']")
	public WebElement DeleteAddressButton;
	
	@FindBy(xpath = "//input[@value='Pickup From this Address']")
	public WebElement Pickup_AddressButton;
	
	
	
	public ShippingAddressPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Click_DeliverAddressButton()
	{
		DeliverAddressButton.click();
	}
	
	public void Click_EditAdressButton()
	{
		EditAdressButton.click();
	}
	
	public void Click_DeleteAddressButton()
	{
		DeleteAddressButton.click();
	}
	
	public void Pickup_AddressButton()
	{
		DeliverAddressButton.click();
	}
	
	public void Click_UpdateButton()
	{
		UpdateButton.click();
	}
	
}
