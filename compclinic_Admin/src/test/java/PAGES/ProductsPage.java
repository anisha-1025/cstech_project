package PAGES;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductsPage {

	
	@FindBy(xpath = "//a[@href='/admin/Products/Index']")
	public WebElement ProductsListLink;
	
	@FindBy(xpath = "//select[@id='ddlItem']")
	public WebElement products_select_dropdown;
	
	@FindBy(xpath = "//input[@name='filter']")
	public WebElement SearchByProductText;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement searchbutton;
	
	@FindBy(xpath = "//table[@class='table']/tbody/tr[1]/td[1]")
	public WebElement FirstRow;
	
	@FindBy(xpath = "//a[@href='/admin/Products/Edit?id=7']/span")
	public WebElement EditLink;
	
	@FindBy(xpath = "//a[text()='Create New']")
	public WebElement CreateNewButton;
	
	@FindBy(xpath = "//input[@id='ProductName']")
	public WebElement EnterProductName;
	
	@FindBy(xpath = "//input[@id='FullName']")
	public WebElement EnterFullName;
	
	@FindBy(xpath = "//input[@id='Price']")
	public WebElement EnterPrice;
	
	@FindBy(xpath = "//input[@id='OldPrice']")
	public WebElement EnterOldPrice;
	
	@FindBy(xpath = "(//div[@class='note-editable'])[1]")
	public WebElement Feature1TextField;
	
	@FindBy(xpath = "(//div[@class='note-editable'])[2]")
	public WebElement Feature2TextField;
	
	@FindBy(xpath = "//input[@id='Waranty']")
	public WebElement Warranty;
	
	@FindBy(xpath = "//select[@id='CategoryId']")
	public WebElement CategoryDropdown;
	
	@FindBy(xpath = "//option[text()='Computer/ PC']")
	public WebElement Computer_PC_Option;

	@FindBy(xpath = "//option[text()='Laptops']")
	public WebElement Laptops_Option;
	
	@FindBy(xpath = "//option[text()='Tablets']")
	public WebElement Tablets_Option;
	
	@FindBy(xpath = "//select[@id='BrandId']")
	public WebElement BrandDropdown;
	
	@FindBy(xpath = "//input[@id='files']")
	public WebElement chooseFilebutton;
	
	@FindBy(xpath = "//button[text()='Create']")
	public WebElement CreateButton;
	
	@FindBy(xpath = "//div[@class='page-title']/h2")
	public WebElement VerifyLandingPagetitle;
	
	@FindBy(xpath = "//button[text()='Update']")
	public WebElement Updatebutton;
	
	public ProductsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Click_Products_ListLink()
	{
		ProductsListLink.click();
	}
	
	public void Select_Products_By()
	{
		products_select_dropdown.click();
		
	}
	
	public void Select_dropdown_options(String useroption)
	{
		Select s= new Select(products_select_dropdown);
		List<WebElement> all=s.getOptions();
		for(int i=0;i< all.size();i++)
		{
			if((all.get(i).getText()).equals(useroption))
			{
				all.get(i).click();
				System.out.println(all.get(i).getText());
			}
		
		}
	}
	
	
	
	public void Enter_Value_SearchByProduct(String s)
	{
		SearchByProductText.sendKeys(s);
	}
	
	public void Click_Search_Button()
	{
		searchbutton.click();
	}
	
	public void Click_CreateNew()
	{
		CreateNewButton.click();
	}
	
	public void Enter_ProductName(String p)
	{
		EnterProductName.clear();
		EnterProductName.sendKeys(p);
	}
	
	public void Enter_FullName(String p)
	{	
		EnterFullName.clear();
		EnterFullName.sendKeys(p);
	}
	
	public void Enter_Price(String p)
	{
		EnterPrice.clear();
		EnterPrice.sendKeys(p);
	}
	public void Enter_OldPrice(String p)
	{
		EnterOldPrice.clear();
		EnterOldPrice.sendKeys(p);
	}
	
	public void Enter_Features1(String p)
	{
		Feature1TextField.clear();
		Feature1TextField.sendKeys(p);
	}
	
	public void Enter_Features2(String p)
	{
		Feature2TextField.clear();
		Feature2TextField.sendKeys(p);
	}
	
	public void Enter_Warranty(String p)
	{
		Warranty.clear();
		Warranty.sendKeys(p);
	}
	
	public void Create_Select_Category(String userselection)
	{
		CategoryDropdown.click();
		Select  s= new Select(CategoryDropdown);
		List<WebElement> alloption= s.getOptions();
		for(int i =0; i< alloption.size(); i++)
		{
			if((alloption.get(i).getText()).equals(userselection))
			{
				alloption.get(i).click();
			}
		}
	}
	
	
	public void Create_Select_Brand(String userselection)
	{
		BrandDropdown.click();
		Select  s= new Select(CategoryDropdown);
		List<WebElement> alloption= s.getOptions();
		for(int i =0; i< alloption.size(); i++)
		{
			if((alloption.get(i).getText())==userselection)
			{
				alloption.get(i).click();
			}
		}
	}
	
	public void Select_Image(String path)
	{
		chooseFilebutton.sendKeys(path);
		}
	
	public void Click_Create_Button()
	{
		CreateButton.click();
	}
	
	public void click_EditLink()
	{
		EditLink.click();
	}
	
	public void click_UpdateButton()
	{
		Updatebutton.click();
	}
	}

