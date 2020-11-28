package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoiceList {
	
	@FindBy(xpath = "//a[text()='Invoice List']")
	public WebElement InvoiceListTab;
	
	@FindBy(xpath = "//input[@type='search']")
	public WebElement InvoicePage_Search;
	
	@FindBy(xpath = "//a[@href='/GenerateInvoice/details?id=90']")
	public WebElement FirstInvoiceListLink; 
	
	public InvoiceList(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void Click_InvoiceListtab()
	{
		InvoiceListTab.click();
	}
	
	public void Enter_InvoicePage_Search(String x)
	{
		InvoicePage_Search.sendKeys(x);
	}
	
	public void Click_FirstInvoice()
	{
		FirstInvoiceListLink.click();
	}
	
	

}
