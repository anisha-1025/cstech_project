package PAGES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoriesPage {

	@FindBy(xpath = "//a[@href='/admin/categories/Index']")
	public WebElement CategoriesListLink;
	
	@FindBy(xpath = "//input[@id='filter']")
	public WebElement SearchbyCategoryField;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement searchbutton;
	
	@FindBy(xpath = "//table[@class='table']/tbody/tr/td[2]")
	public WebElement FirstRowAfterSearch;
	
	@FindBy(xpath = "//a[text()='Create New']")
	public WebElement CreateNewButton;
	
	@FindBy(xpath = "//input[@name='CategoryName']")
	public WebElement CategoryNameField;
	
	@FindBy(xpath = "//button[text()='Create Category']")
	public WebElement CreateCategoryButton;
	
	@FindBy(xpath = "//table[@class='table']/tbody/tr/td/a[2]")
	public WebElement CategoryEditLink;
	
	@FindBy(xpath = "//button[text()='Update Category']")
	public WebElement UpdateCategorybutton ;

	@FindBy(xpath = "//table[@class='table']/tbody/tr/td/a[3]")
	public WebElement CategoryDeleteLink ;

	@FindBy(xpath = "//button[text()='OK']")
	public WebElement CategoryOkButton ;

//	@FindBy(xpath = "")
//	public WebElement ;
	
	public CategoriesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Click_Categories_list()
	{
		CategoriesListLink.click();
	}
	
	public void SearchByCategoryField(String x)
	{
		SearchbyCategoryField.sendKeys(x);
	}
	
	public void Click_SearchBUtton()
	{
		searchbutton.click();
	}
	public void Click_CreateNewCategory_Button()
	{
		CreateNewButton.click();
	}
	public void EnterNewCategoryName(String n)
	{
		CategoryNameField.clear();
		CategoryNameField.sendKeys(n);
	}
	public void Click_Create_CategoryButton()
	{
		CreateCategoryButton.click();
	}
	public void Click_Category_Edit_Link()
	{
		CategoryEditLink.click();
	}
	public void Click_Update_Category()
	{
		UpdateCategorybutton.click();
	}
	public void Click_Category_Delete_link()
	{
		CategoryDeleteLink.click();
	}
	public void click_Category_Delete_OK_Button()
	{
		CategoryOkButton.click();
	}
}
