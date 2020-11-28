package PAGES;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ChildCloseoutPage {

	@FindBy(xpath = "//a[text()='Child closeout']")
	public WebElement ChildCloseout_link;
	
	@FindBy(xpath = "//select[@id='Classid1']")
	public WebElement Closeout_ClassId;
	
	@FindBy(xpath = "//select[@id='childid']")
	public WebElement Closeout_ChildId;
	
	@FindBy(xpath = "//button[text()='CALCULATE DUES/RETURN DEPOSIT']")
	public WebElement CalculateDues_ReturnDeposit;
	
	@FindBy(xpath = "//a[text()='Go to Payment']")
	public WebElement GoToPayment_Button;
	
	@FindBy(xpath = "//p[contains(text(), 'Child need to pay balance amount:')]")
	public WebElement Childneedtopay_assertion;
	
	@FindBy(xpath = "//p[contains(text(), 'Payments are clear, you can closeout child')]")
	public WebElement Payment_are_clear_assertion;
	
	@FindBy(xpath = "//button[text()='Closeout']")
	public WebElement Closeout_button;
	
	
	public ChildCloseoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Click_ChildCloseout_link()
	{
		ChildCloseout_link.click();
	}
	
	public void select_Closeout_ClassId(String c)
	{
		Select s=new Select(Closeout_ClassId);
		List<WebElement> e=s.getOptions();
		for(int i=0; i< e.size();i++ )
		{
			if(e.get(i).getText().equals(c))
			{
				e.get(i).click();
			}
		}
	}
	
	public void select_Closeout_ChildId(String c)
	{
		Select x=new Select(Closeout_ChildId);
		List<WebElement> e=x.getOptions();
		for(int i=0; i< e.size(); i++)
		{
			if(e.get(i).getText().equals(c))
			{
				e.get(i).click();
			}
		}
	}
	
	public void Click_CalculateDues_ReturnDeposit()
	{
		CalculateDues_ReturnDeposit.click();
	}
	
	public void Click_GoToPayment_Button()
	{
		GoToPayment_Button.click();
	}
	
	public void Click_Closeout_button()
	{
		Closeout_button.click();
	}
	
}
