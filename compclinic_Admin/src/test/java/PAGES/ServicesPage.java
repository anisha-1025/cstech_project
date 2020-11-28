package PAGES;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ServicesPage {

	@FindBy(xpath = "//a[@href='/admin/Services/index']")
	public WebElement ServicesList_Link;
	
	@FindBy(xpath = "//select[@id='ddlItem']" )
	public WebElement select_Service_dropdown ;
	
	@FindBy(xpath = "//input[@id='filter']")
	public WebElement Enter_Value_Search_By_Service_Text;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement service_search_button;
	
	@FindBy(xpath = "//table[@class='table']/tbody/tr[1]/td[1]")
	public WebElement FirstServiceRowaftersort; ;
	
	@FindBy(xpath = "//a[text()='Create New']")
	public WebElement Service_CreateNew;
	
	@FindBy(xpath = "//input[@id='ServiceName']")
	public WebElement Enter_Service_Name;
	
	@FindBy(xpath = "//input[@id='Description']")
	public WebElement Enter_Description_Name;
	
	@FindBy(xpath = "//div[text()='Full Description']")
	public WebElement Enter_Full_Description;
	
	@FindBy(xpath = "//input[@id='files']")
	public WebElement choose_Image_service;
	
	@FindBy(xpath = "//button[text()='Create Services']")
	public WebElement Create_Service_Button;
	
	@FindBy(xpath = "//div[@class='page-title']/h2")
	public WebElement verifylandingpagetitle;
	
	@FindBy(xpath = "//table[@class='table']/tbody/tr/td/a[2]")
	public WebElement Service_Edit_link;
	
	@FindBy(xpath = "//table[@class='table']/tbody/tr/td/a[3]")
	public WebElement Service_Delete_link;
	
	@FindBy(xpath = "//button[text()='Update']")
	public WebElement Service_Update_button;
	
	@FindBy(xpath = "//button[text()='OK']")
	public WebElement Service_delete_OK_Button;
	
	
	public ServicesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click_services_list()
	{
		ServicesList_Link.click();
	}
	public void select_services_dropdown(String useroption)
	{
		select_Service_dropdown.click();
		Select s= new Select(select_Service_dropdown);
		List<WebElement> optionlist= s.getOptions();
		for(int i=0; i< optionlist.size();i++)

		{
			if(optionlist.get(i).getText().equals(useroption))
			{
				optionlist.get(i).click();
			}
		}
	}
	
	public void Enter_Value_search_field(String x){
		
		Enter_Value_Search_By_Service_Text.sendKeys(x);
		}
	
	public void Click_service_search_button()
	{
		service_search_button.click();
	}
	public void Click_create_new_button()
	{
		Service_CreateNew.click();
	}
	public void Enter_Service_name(String n)
	{
		Enter_Service_Name.clear();
		Enter_Service_Name.sendKeys(n);
	}
	public void Enter_description(String n)
	{
		Enter_Description_Name.clear();
		Enter_Description_Name.sendKeys(n);
	}
	
	public void Enter_Full_Description(String n)
	{
		//Enter_Full_Description.clear();
		Enter_Full_Description.sendKeys(n);
	}
	
	public void Click_choose_image(String f)
	{
		choose_Image_service.sendKeys(f);
	}
	
	public void click_Create_Service_Button()
	{
		Create_Service_Button.click();
	}
	
	public void click_Service_Edit_link()
	{
		Service_Edit_link.click();
	}
	
	public void click_Service_Delete_link()
	{
		Service_Delete_link.click();
	}
	
	public void click_service_update_button()
	{
		Service_Update_button.click();
	}
	
	public void click_service_delete_ok_button()
	{
		Service_delete_OK_Button.click();
	}
	
}
