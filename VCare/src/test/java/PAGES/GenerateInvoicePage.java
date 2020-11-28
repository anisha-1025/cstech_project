package PAGES;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GenerateInvoicePage {
	
	@FindBy(xpath = "//a[@href='/GenerateInvoice/Index']")
	public WebElement GenerateInvoice_link;
	
	@FindBy(xpath = "//select[@id='Classid1']")
	public WebElement SelectClass;
	
	@FindBy(xpath = "//select[@id='childid']")
	public WebElement SelectChild;
	
	@FindBy(xpath = "//select[@id='Month']")
	public WebElement SelectMonth;
	
	@FindBy(xpath = "//select[@id='Year']")
	public WebElement SelectYear;
	
	@FindBy(xpath = "//label[@for='md_checkbox_9']")
	public WebElement EmailInvoiceToGuardians;
	
	@FindBy(xpath = "//button[text()='GENERATE INVOICE']")
	public WebElement GenerateInvoiceButton;
	
	public GenerateInvoicePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Click_GenerateInvoice_link()
	{
		GenerateInvoice_link.click();
	}
	
	public void SelectClass(String s)
	{
		Select c= new Select(SelectClass);
		List<WebElement> list=c.getOptions();
		for(int i=0; i<list.size();i++)
		{
			if(list.get(i).getText().equals(s))
			{
				list.get(i).click();
			}
		}
	}
	
	public void SelectChild(String s)
	{
		Select c= new Select(SelectChild);
		List<WebElement> list=c.getOptions();
		for(int i=0; i<list.size();i++)
		{
			if(list.get(i).getText().equals(s))
			{
				list.get(i).click();
			}
		}
	}
	
	public void SelectMonth(String s)
	{
		Select c= new Select(SelectMonth);
		List<WebElement> list=c.getOptions();
		for(int i=0; i<list.size();i++)
		{
			if(list.get(i).getText().equals(s))
			{
				list.get(i).click();
			}
		}
	}
	
	
	public void SelectYear(String s)
	{
		Select c= new Select(SelectYear);
		List<WebElement> list=c.getOptions();
		for(int i=0; i<list.size();i++)
		{
			if(list.get(i).getText().equals(s))
			{
				list.get(i).click();
			}
		}
	}
	
	public void Select_Email_To_Guardians()
	{
		EmailInvoiceToGuardians.click();
	}
	
	public void Click_GENERATE_INVOICE_button()
	{
		GenerateInvoiceButton.click();
	}
}
