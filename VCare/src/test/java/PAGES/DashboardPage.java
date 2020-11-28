package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	@FindBy(xpath = "//a[@href='/Dashboard/Index' and @class=' waves-effect waves-block']")
	public WebElement DashboardTablink;

	@FindBy(xpath = "//div[@class='info-box bg-pink hover-expand-effect']")
	public WebElement DashboardEmployeeTab;

	@FindBy(xpath = "//div[@class='info-box bg-cyan hover-expand-effect']")
	public WebElement DashboardChildTab;

	@FindBy(xpath = "//div[@class='info-box bg-light-green hover-expand-effect']")
	public WebElement DashboardClassesTab;

	@FindBy(xpath = "//div[@class='info-box bg-orange hover-expand-effect']")
	public WebElement DashboardWaitlistTab;

	@FindBy(xpath = "//i[text()='keyboard_arrow_down']")
	public WebElement settingsdropdown;

	@FindBy(xpath = "//a[@href='/Dashboard/Settings']")
	public WebElement DashboardSettingsLink;

	@FindBy(xpath = "//div[@class='header']/h2/a")
	public WebElement DashboardEditButton;
	
	@FindBy(xpath = "//button[text()='UPDATE']")
	public WebElement DashboardSettingsUpdateButton;
	
	@FindBy(xpath = "//button[text()='CANCEL']")
	public WebElement DashboardSettingsCancelButton;	

	@FindBy(xpath = "//div[@class='alert alert-success']")
	public WebElement Dashboardsettingsalertsuccessmessage;
	
	@FindBy(xpath = "//div[@class='alert alert-danger']")
	public WebElement DashboardPasswordChangeAlertMessage;
	
	@FindBy(xpath = "//span[@class='login100-form-title p-b-33']")
	public WebElement successfulpasswordchangemessage;
	
	@FindBy(xpath = "//a[@href='/Account/ChangePassword']")
	public WebElement ChangePasswordLink;

	@FindBy(xpath = "//input[@name='OldPassword']")
	public WebElement OldPasswordfield;

	@FindBy(xpath = "//input[@name='NewPassword']")
	public WebElement NewPasswordfield;

	@FindBy(xpath = "//input[@name='ConfirmPassword']")
	public WebElement ConfirmPasswordfield;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement changepasswordsubmitbutton;

	@FindBy(xpath = "//button[text()='CANCEL']")
	public WebElement changepasswordcancelbutton;
	
	@FindBy(xpath = "//a[text()='Login']")
	public WebElement ChangePasswordLoginLink;

	@FindBy(xpath = "//*[@id=\"leftsidebar\"]/div[1]/div[2]/div[2]/ul/li[4]/a")
	public WebElement SignOutlink;
	//alt xpath = "//ul[@class='dropdown-menu pull-right']/li[4]/a")
	
	@FindBy(xpath = "//div[@class='body bg-indigo']/div/div/table/tbody/tr[1]/td[1]")
	public WebElement NameofFirstchild_UpcomingBirthday;
	
	
	public DashboardPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	public void Click_DashboardTab()
	{
		DashboardTablink.click();
	}
	public void Click_DashboardEmployeeTab()
	{
		DashboardEmployeeTab.click();
	}
	public void Click_DashboardChildTab()
	{
		DashboardChildTab.click();
	}
	public void Click_DashboardClassesTab()
	{
		DashboardClassesTab.click();
	}
	public void Click_DashboardWaitlistTab()
	{
		DashboardWaitlistTab.click();
		
	}
	public void Click_settingsdropdown()
	{
		settingsdropdown.click();
	}
	public void Click_DashboardSettingsLink()
	{
		DashboardSettingsLink.click();
	}
	public void Click_DashboardEditButton()
	{
		DashboardEditButton.click();
	}
	public void Click_DashboardSettingsUpdateButton()
	{
		DashboardSettingsUpdateButton.click();
	}
	public void Click_DashboardSettingsCancelButton()
	{
		DashboardSettingsCancelButton.click();
	}
	public void Click_ChangePasswordLink()
	{
		ChangePasswordLink.click();
	}
	public void Enter_OldPasswordfield(String op)
	{
		OldPasswordfield.sendKeys(op);
	}
	public void Enter_NewPasswordfield(String newp)
	{
		NewPasswordfield.sendKeys(newp);
	}
	public void Enter_ConfirmPasswordfield(String conp)
	{
		ConfirmPasswordfield.sendKeys(conp);
	}
	public void Click_changepasswordsubmitbutton()
	{
		changepasswordsubmitbutton.click();
	}
	public void Click_changepasswordcancelbutton()
	{
		changepasswordcancelbutton.click();
	}
	public void Click_ChangePasswordLoginLink()
	{
		ChangePasswordLoginLink.click();
	}
	public void Click_SignOutlink()
	{
		SignOutlink.click();
	}
}
