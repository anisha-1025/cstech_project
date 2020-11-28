package PAGES;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePackagePage {

	@FindBy(xpath = "//div[@class='slimScrollDiv']/ul/li[6]/a/span")
	public WebElement BillingTab;

	@FindBy(xpath = "//a[text()='Base Packages']")
	public WebElement BasePackages;

	@FindBy(xpath = "//button[text()='Add Base Package']")
	public WebElement Add_Base_Package_Button;

	@FindBy(xpath = "//i[text()='create']")
	public WebElement EditBasePackage;

	@FindBy(xpath = "//i[text()='delete']")
	public WebElement DeleteBasePackage;

	@FindBy(xpath = "//input[@type='search']")
	public WebElement SearchBasePackage;

	@FindBy(name = "PackageName")
	public WebElement PackageName;
					
	@FindBy(xpath = "//*[@id=\"forms1\"]/div/div[2]/div/div/div/div/div[2]/div/div/div[2]")
	public WebElement ApplicableClass;
	
	@FindBy(xpath = "//*[@id='forms']/div[1]/div/div/div/div/div[2]/div/div/div[2]")
	public WebElement updateApplicableClass;
	
	@FindBy(xpath = "//div[@class='select-items']")
	public WebElement ApplicableClassSelectList;
	
	
	@FindBy(xpath = "//div[@class='select-items']/div[1]")
	public WebElement selectFirstOption;
	
	@FindBy(xpath = "//div[@class='select-items']/div[2]")
	public WebElement selectSecondOption;
	
	@FindBy(xpath = "//div[@class='select-items']/div[3]")
	public WebElement selectThirdoption;

	@FindBy(xpath = "//*[@id=\"forms1\"]/div/div[2]/div/div/div/div/div[3]/div[2]/div/div[2]")
	public WebElement PackageTax;
	
	@FindBy(xpath = "//*[@id='forms']/div[1]/div/div/div/div/div[3]/div[2]/div/div[2]")	
	public WebElement UpdatePackageTax;

	@FindBy(name = "PackageAmount")
	public WebElement PackageAmount;
	
	@FindBy(name = "PackageDescription")
	public WebElement PackageDescription;
	
	@FindBy(xpath = "//label[@for='Active']")
	public WebElement Active_CheckBox_button;

	@FindBy(xpath = "//button[text()='ADD']")
	public WebElement ADDPackageButton;
	
	@FindBy(xpath = "//button[text()='UPDATE']")
	public WebElement UpdatePackageButton;

	@FindBy(xpath = "//button[text()='YES']")
	public WebElement Package_delete_YES_button;
	/*********ADDITIONALCHARGES********/
	
	@FindBy(xpath = "//a[text()='Additional Charges']")
	public WebElement AdditionalCharges;

	@FindBy(xpath = "//a[text()='Discounts']")
	public WebElement Discounts;

	@FindBy(xpath = "//a[text()='Adjustments']")
	public WebElement Adjustments;

	@FindBy(xpath = "//a[text()='Generate Invoice']")
	public WebElement GenerateInvoice;

	@FindBy(xpath = "//a[text()='Invoice List']")
	public WebElement InvoiceList;

	@FindBy(xpath = "//a[text()='Child closeout']")
	public WebElement ChildCloseout;

	public BasePackagePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Click_BillingTab() {
		BillingTab.click();
	}

	public void Click_BasePackage() {
		BasePackages.click();
	}

	public void Click_AddNewPackage_Button() {
		Add_Base_Package_Button.click();
	}

	public void Enter_Package_Name(String s) {
		PackageName.sendKeys(s);
	}

	public void Enter_Package_amount(String s) {
		PackageAmount.sendKeys(s);
	}


	public void Select_ApplicableClasses(String s)
	{
		
		ApplicableClass.click();
		if(s.equalsIgnoreCase("Toddler"))
		{
			selectSecondOption.click();
		}
		else if(s.equalsIgnoreCase("Infant"))
		{
			selectFirstOption.click();
		}
		else if(s.equalsIgnoreCase("Pre-school")) {
			selectThirdoption.click();
			
		}
	}

	public void Update_select_applicable_class(String s)
	{
	updateApplicableClass.click();
	if(s.equalsIgnoreCase("Toddler"))
	{
		selectSecondOption.click();
	}
	else if(s.equalsIgnoreCase("Infant"))
	{
		selectFirstOption.click();
	}
	else if(s.equalsIgnoreCase("Pre-school")) {
		selectThirdoption.click();
		
	}
	}
	public void Select_Tax(String s)

	{
		
		PackageTax.click();
		if(s.equalsIgnoreCase("IGST"))
		{
			selectSecondOption.click();
		}
		else if(s.equalsIgnoreCase("GST"))
		{
			selectFirstOption.click();
		}
		else if(s.equalsIgnoreCase("CGST")) {
			selectThirdoption.click();
			
		}
		
	}
	
	public void Update_Selected_Tax(String s)

	{
		
		UpdatePackageTax.click();
		if(s.equalsIgnoreCase("IGST"))
		{
			selectSecondOption.click();
		}
		else if(s.equalsIgnoreCase("GST"))
		{
			selectFirstOption.click();
		}
		else if(s.equalsIgnoreCase("CGST")) {
			selectThirdoption.click();
			
		}
		
	}
	
	public void Click_Active_check_box()
	{
		Active_CheckBox_button.click();
	}

	public void Enter_Description(String s)
	{
		PackageDescription.sendKeys(s);
	}
	
	public void Click_ADDPackageButton()
	{
		ADDPackageButton.click();
	}
	
	public void SearchBasePackage(String b)
	{
		SearchBasePackage.sendKeys(b);
	}
	
	public void Click_Package_Edit_link()
	{
		EditBasePackage.click();
	}
	
	public void Click_Package_delete_link()
	{
		DeleteBasePackage.click();
	}
	
	public void Click_Package_UPDATE_button()
	{
		UpdatePackageButton.click();	
	}
	
	public void Click_Package_Delete_YES_button()
	{
		Package_delete_YES_button.click();
	}
}
