package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCertificationPage {

	@FindBy(xpath = "//input[@value='Add Certification']")
	public WebElement Addcertificationbutton;
	
	@FindBy(id= "CertificationName")
	public WebElement CertificateName;
	
	@FindBy(id= "Validity")
	public WebElement CertificateValidity;
	
	@FindBy(id= "LicenceNo")
	public WebElement CertificateLicenceNo;
	
	@FindBy(id= "InstituteName")
	public WebElement CertificateInstituteName;
	
	@FindBy(xpath = "//input[@value='Save changes']")
	public WebElement Addcertificatiosavenbutton;
	
	@FindBy(xpath = "//a[text()='Next']")
	public WebElement AddcertificationNextbutton;

	
	public AddCertificationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click_on_AddCertificate()
	{
		Addcertificationbutton.click();
	}
	
	public void Enter_CertificateName(String x)
	{
		CertificateName.sendKeys(x);
	}
	
	public void CertificateValidity(String x)
	{
		CertificateValidity.sendKeys(x);
	}
	
	
	public void CertificateLicenceNo(String x)
	{
		CertificateLicenceNo.sendKeys(x);
	}
	public void InstituteName(String x)
	{
		CertificateInstituteName.sendKeys(x);
	}

	public void Addcertificatiosavenbutton()
	{
		Addcertificatiosavenbutton.click();
	}
	
	public void AddcertificationNextbutton()
	{
		AddcertificationNextbutton.click();
	}
	
}
