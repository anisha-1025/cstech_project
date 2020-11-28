package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class paymentspage {

	@FindBy(xpath = "//*[@id=\"leftsidebar\"]/div[2]/div/ul/li[8]/a")
	public WebElement Payments_link;
	
	@FindBy(xpath = "//a[text()='Payments']")
	public WebElement Payments_Type_link;
	
	@FindBy(xpath = "//a[@href='/Payments/Add']")
	public WebElement AddNewPayment_Button;
	
	@FindBy(xpath = "//i[text()='create']")
	public WebElement EditPayment;
	
	@FindBy(xpath = "//i[text()='delete']")
	public WebElement DeletePayment;
	
	@FindBy(xpath = "//select[@id='RefChild']")
	public WebElement Select_Child;
	
	@FindBy(xpath = "//input[@id='paydate']")
	public WebElement Payment_Date;
	
	@FindBy(xpath = "//select[@id='RefInvoice']")
	public WebElement Select_InvoiceNo; ;
	
	@FindBy(xpath = "//select[@id='Paymenttyp']")
	public WebElement PaymentType ;
	
	@FindBy(xpath = "//input[@id='payamount']")
	public WebElement PaymentAmount;
	
	@FindBy(xpath = "//textarea[@name='PaymentNotes']")
	public WebElement Payment_Notes;
	
	@FindBy(xpath = "//button[text()='ADD']")
	public WebElement Payment_Add_button;
	
	@FindBy(xpath = "//button[text()='UPDATE']")
	public WebElement Payment_UPDATE_button;	
	
	@FindBy(xpath = "//button[text()='YES']")
	public WebElement Payment_delete_yes_button;
	
	public paymentspage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//public void Click 
	
	
	
}

