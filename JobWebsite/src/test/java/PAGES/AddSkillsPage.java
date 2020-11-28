package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddSkillsPage {

	@FindBy(xpath = "//*[@id='ddlSkills_chosen']/ul/li/input")
	public WebElement ClickAddSkillsoptions;
	
	@FindBy(xpath = "//*[@id='ddlSkills_chosen']/div/ul/li[1]")
	public WebElement ASPDOTNETskill;
	
	@FindBy(xpath = "//*[@id='ddlSkills_chosen']/div/ul/li[2]")
	public WebElement CSHARPskill;
	
	@FindBy(xpath = "//*[@id='ddlSkills_chosen']/div/ul/li[11]")
	public WebElement SQLskill;
	
	@FindBy(xpath = "//*[@id='ddlSkills_chosen']/ul/li[1]/a")
	public WebElement unselectASPNET;
		
	@FindBy(xpath = "//input[@value='Next']")
	public WebElement AddSkillsNextbutton;

	
	public AddSkillsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void AddSkillsoptions()
	{
		ClickAddSkillsoptions.click();
		
	}
	
	public void Click_AddSkill()
	{
		ASPDOTNETskill.click();
		//CSHARPskill.click();
		//SQLskill.click();
		
	}
	
	public void unselectASPNET()
	{
		unselectASPNET.click();
	}
	public void Click_AddSkillNextbutton()
	{
		AddSkillsNextbutton.click();
	}
}