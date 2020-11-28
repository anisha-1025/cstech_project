package PAGES;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BrandsPage {

	@FindBy(xpath = "//a[@href='/admin/Brands/Index']")
	public WebElement BrandsListLink;

	@FindBy(xpath = "//select[@name='lcdet_List']")
	public WebElement BrandSelectDropdown;

	@FindBy(xpath = "//input[@id='filter']")
	public WebElement Enter_Value_SearchByBrand;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement searchbutton;

	@FindBy(xpath = "//table[@class='table']/tbody/tr/td[1]")
	public WebElement FirstRowBrandAfterSort;
	
	@FindBy(xpath = "//a[text()='Create New']")
	public WebElement CreateNewBrandButton;
	
	@FindBy(xpath = "//input[@name='BrandName']")
	public WebElement EnterBrandValue;
	
	@FindBy(xpath = "//button[text()='Create Brand']")
	public WebElement CreateBrandButton;
	
	@FindBy(xpath="//table[@class='table']/tbody/tr/td/a[2]")
	public WebElement BrandEditLink ;
	
	@FindBy(xpath="//table[@class='table']/tbody/tr/td/a[3]")
	public WebElement BrandDeleteLink ;
	
	@FindBy(xpath="//button[text()='Update Brand']")
	public WebElement UpdateBrandButton;
	
	@FindBy(xpath = "//button[text()='OK']")
	public WebElement DeleteBrandOkButton ;
	
	public BrandsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Click_Brand_List_Link() {
		BrandsListLink.click();
	}
	public void Select_Brand_Dropdown(String useroption) {
		Select s = new Select(BrandSelectDropdown);
		List<WebElement> all = s.getOptions();
		for (int i = 0; i < all.size(); i++) {
			if ((all.get(i).getText()).equals(useroption)) {
				all.get(i).click();
				System.out.println(all.get(i).getText());
			}	}
	}
	
	public void Enter_SearchByBrand_Value(String n)
	{
		Enter_Value_SearchByBrand.sendKeys(n);
	}
	
	public void Click_search_button()
	{
		searchbutton.click();
	}
	
	public void Click_Create_New_Brand_Button()
	{
		CreateNewBrandButton.click();
	}
	
	public void EnterBrandValue(String b)
	{
		EnterBrandValue.clear();
		EnterBrandValue.sendKeys(b);
	}
	
	public void Click_CreateBrand_Button()
	{
		CreateBrandButton.click();
	}
	public void Click_Brand_Edit_Link()
	{
		BrandEditLink.click();
	}
	
	public void Click_Brand_Update_Button()
	{
		UpdateBrandButton.click();
	}
	public void Click_Brand_Delete_Link()
	{
		BrandDeleteLink.click();
	}
	
	public void Click_Brand_Delete_OK_Button()
	{
		DeleteBrandOkButton.click();
	}
}//main