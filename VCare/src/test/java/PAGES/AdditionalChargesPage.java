package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdditionalChargesPage {

	@FindBy(xpath = "//a[text()='Additional Charges']")
	public WebElement AdditionalChargeslink;
	
	@FindBy(xpath = "//div[@class='header']/h2/button")
	public WebElement AddAdditionalChargesButton;
	
	@FindBy(xpath = "//i[text()='create']")
	public WebElement EditAdditionalCharges_Link;
	
	@FindBy(xpath = "//i[text()='delete']")
	public WebElement DeleteAdditionalChargeLink;
	
	@FindBy(name = "ChargeName")
	public WebElement ChargeName;
	
	@FindBy(name = "ChargeDate")
	public WebElement ChargeDate;	
	
	@FindBy(xpath = "//*[@id='change']/div[2]")
	public WebElement ApplicabeOn;
	
	@FindBy(xpath = "//*[@id='change']/div[3]")
	public WebElement ApplicableOnDropdown;
	
	@FindBy(xpath = "//*[@id='change']/div[3]/div[1]")
	public WebElement ApplicabeOn_Firstoption;
	
	@FindBy(xpath = "//*[@id='change']/div[3]/div[2]")
	public WebElement ApplicabeOn_SecondOption;
	
	@FindBy(xpath = "//*[@id='changes']/div[2]")
	public WebElement Updated_ApplicableOn;
	
	@FindBy(xpath = "//*[@id='changes']/div[3]")
	public WebElement Updated_ApplicableOnDropdown;
		
	@FindBy(xpath = "//*[@id='changes']/div[3]/div[2]")
	public WebElement Updated_ApplicabeOn_Firstoption;
	
	@FindBy(xpath = "//*[@id='changes']/div[3]/div[3]")
	public WebElement Updated_ApplicabeOn_SecondOption;
	
	
	@FindBy(xpath = "//*[@id='c2']/div[2]")
	public WebElement ApplicableRef;
	
	@FindBy(xpath = "//*[@id='c2']/div[3]")
	public WebElement ApplicableRefDropdown;
	
	@FindBy(xpath = "//*[@id='c2']/div[3]/div[1]")
	public WebElement ApplicableRef_firstOption;
	
	@FindBy(xpath = "//*[@id='c2']/div[3]/div[2]")
	public WebElement ApplicableRef_SecondOption;
	
	@FindBy(xpath = "//*[@id='c2']/div[3]/div[3]")
	public WebElement ApplicableRef_ThirdOption;
	
	@FindBy(xpath = "//*[@id='cl2']/div[2]")
	public WebElement Updated_ApplicableRef;
	
	@FindBy(xpath = "//*[@id='cl2']/div[3]")
	public WebElement Updated_ApplicableRefDropdown;
	
	@FindBy(xpath = "//*[@id='cl2']/div[3]/div[1]")
	public WebElement InfantFirstOption;
	
	@FindBy(xpath = "//*[@id=\"forms11\"]/div/div[2]/div/div/div/div/div[4]/div[1]/div/div/input")
	public WebElement ChargeAmount;
	
	@FindBy(xpath = "//input[@id='ChargeAmt']")
	public WebElement Updated_ChargeAmount;
	
	@FindBy(xpath = "//*[@id=\"forms11\"]/div/div[2]/div/div/div/div/div[3]/div/div/div/textarea")
	public WebElement ChargeDescription;
	
	@FindBy(xpath = "//textarea[@id='ChargeDesc']")
	public WebElement Updated_ChargeDescription;
					
	@FindBy(xpath = "//*[@id='forms11']/div/div[2]/div/div/div/div/div[4]/div[2]/div/div[2]")
	public WebElement Tax;
	
	@FindBy(xpath = "//*[@id='forms11']/div/div[2]/div/div/div/div/div[4]/div[2]/div/div[3]")
	public WebElement Tax_Dropdown;
	
	@FindBy(xpath = "//*[@id='forms11']/div/div[2]/div/div/div/div/div[4]/div[2]/div/div[3]/div[1]")
	public WebElement FirstoptionTax;
	
	@FindBy(xpath = "//*[@id='forms11']/div/div[2]/div/div/div/div/div[4]/div[2]/div/div[3]/div[1]")
	public WebElement SecondoptionTax;
	
	@FindBy(xpath = "//*[@id='forms11']/div/div[2]/div/div/div/div/div[4]/div[2]/div/div[3]/div[1]")
	public WebElement ThirdoptionTax;
	
	@FindBy(xpath = "//*[@id=\"forms13\"]/div[1]/div/div/div/div/div[4]/div[2]/div/div[2]")
	public WebElement Updated_Tax;
	
	@FindBy(xpath = "//*[@id=\"forms13\"]/div[1]/div/div/div/div/div[4]/div[2]/div/div[3]")
	public WebElement Updated_Tax_Dropdown;
	
	@FindBy(xpath = "//button[text()='ADD']")
	public WebElement Charges_ADD_Button;
	
	@FindBy(xpath = "//input[@type='search']")
	public WebElement AdditionalChargesSearch;
	
	@FindBy(xpath = "//button[text()='UPDATE']")
	public WebElement Charges_UPDATE_button;
	
	@FindBy(xpath = "//button[text()='YES']")
	public WebElement Charges_Delete_YES_button;

	public AdditionalChargesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Click_AdditionalCharges_link()
	{
		AdditionalChargeslink.click();	
	}
	
	public void Click_AddAdditionalChargesButton()
	{
		AddAdditionalChargesButton.click();
	}
	
	public void Click_EditAdditionalCharges_Link()
	{
		EditAdditionalCharges_Link.click();
	}
	
	public void Click_DeleteAdditionalChargeLink()
	{
		DeleteAdditionalChargeLink.click();
	}
	
	public void Enter_ChargeName(String c)
	{
		ChargeName.sendKeys(c);
	}
	
	public void Enter_ChargeDate(String c)
	{
		ChargeDate.sendKeys(c);
	}
	
	public void Select_ApplicableOn(String s)
	{
		ApplicabeOn.click();
		if(s.equalsIgnoreCase("Class"))
		{
			ApplicabeOn_Firstoption.click();
		}
		else if(s.equalsIgnoreCase("Child"))
		{
			ApplicabeOn_SecondOption.click();
		}
	}
	
	public void Update_Select_ApplicableOn(String s)
	{
		Updated_ApplicableOn.click();
		if(s.equalsIgnoreCase("Class"))
		{
			Updated_ApplicabeOn_Firstoption.click();
		}
		else if(s.equalsIgnoreCase("Child"))
		{
			Updated_ApplicabeOn_SecondOption.click();
		}
	}
	
	
	public void Select_ApplicableRef(String s)
	{
		ApplicableRef.click();
		if(s.equalsIgnoreCase("Infant"))
		{
			ApplicableRef_firstOption.click();
		}
		else if(s.equalsIgnoreCase("Toddler"))
		{
			ApplicableRef_SecondOption.click();
		}
		else if(s.equalsIgnoreCase("Pre-school"))
		{
			ApplicableRef_ThirdOption.click();
		}
	}
	
	public void Update_Select_ApplicableRef(String s)
	{
		Updated_ApplicableRef.click();
		if(s.equalsIgnoreCase("Infant"))
		{
			InfantFirstOption.click();
		}
		else if(s.equalsIgnoreCase("Toddler"))
		{
			System.out.println("Toddler option");
		}
	}
	
	public void Enter_ChargeAmount(String c)
	{
		ChargeAmount.sendKeys(c);
	}
	
	public void Update_ChargeAmount(String c)
	{
		Updated_ChargeAmount.sendKeys(c);
	}
	
	public void Enter_ChargeDescription(String s)
	{
		ChargeDescription.sendKeys(s);
	}
	
	public void Updated_ChargeDescription(String s)
	{
		Updated_ChargeDescription.sendKeys(s);
	}
	
	public void Select_tax(String t)
	{
		Tax.click();
		if(t.equalsIgnoreCase("8.00"))
		{
			FirstoptionTax.click();
		}
		else if(t.equalsIgnoreCase("10.00"))
		{
			SecondoptionTax.click();
		}
		else if(t.equalsIgnoreCase("5.00"))
		{
			ThirdoptionTax.click();
		}
	}
	
	public void Click_Charges_ADD_Button()
	{
		Charges_ADD_Button.click();
	}
	
	public void Click_Charges_UPDATE_button()
	{
		Charges_UPDATE_button.click();
	}
	
	public void Click_Charges_Delete_YES_button()
	{
		Charges_Delete_YES_button.click();
	}
	
	public void Enter_AdditionalChargesSearch(String s)
	{
		AdditionalChargesSearch.sendKeys(s);
	}
	
	
}
