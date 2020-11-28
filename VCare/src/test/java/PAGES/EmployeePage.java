package PAGES;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EmployeePage {

	@FindBy(xpath = "//div[@class='slimScrollDiv']/ul/li[4]/a/span")
	public WebElement EmployeeTab;

	@FindBy(xpath = "//a[text()='Employee List']")
	public WebElement EmployeeList;

	@FindBy(xpath = "//a[text()='Employee Attendance']")
	public WebElement EmployeeAttendance;

	@FindBy(xpath = "//a[text()='Shifts']")
	public WebElement EmployeeShift;

	@FindBy(xpath = "//a[text()=' Add New Employee ']")
	public WebElement AddNewEmployee_Button;

	@FindBy(xpath = "//i[text()='create']")
	public WebElement Employee_Edit_link;

	@FindBy(xpath = "//i[text()='delete']")
	public WebElement Employee_Delete_link;

	@FindBy(name = "FirstName")
	public WebElement Employee_FirstName;

	@FindBy(name = "LastName")
	public WebElement Employee_LastName;

	@FindBy(xpath = "//label[@for='male']")
	public WebElement Employee_Male_Gender_option;

	@FindBy(xpath = "//label[@for='female']")
	public WebElement Employee_Female_Gender_option;

	@FindBy(name = "files")
	public WebElement EmployeeProfilepic;

	@FindBy(name = "DOB")
	public WebElement EmployeeDOB;

	@FindBy(name = "Designation")
	public WebElement EmployeeDesignation;

	@FindBy(name = "SecurityProfileId")
	public WebElement Employee_SecurityProfile;

	@FindBy(name = "ShiftId")
	public WebElement Employee_ShiftId;

	@FindBy(name = "JoiningDate")
	public WebElement Employee_joiningDate;

	@FindBy(name = "LeavingDate")
	public WebElement Employee_LeavingDate;

	@FindBy(name = "SSN")
	public WebElement Employee_SSN;

	@FindBy(xpath = "//a[text()='Next']")
	public WebElement Employee_Next_Button;

	@FindBy(name = "Street")
	public WebElement Employee_Address_street;

	@FindBy(name = "City")
	public WebElement Employee_Address_city;

	@FindBy(name = "State")
	public WebElement Employee_Address_state;

	@FindBy(name = "Zip")
	public WebElement Employee_Address_zip;

	@FindBy(name = "HomePhone")
	public WebElement Employee_HomePhone;

	@FindBy(name = "Email")
	public WebElement Employee_email;

	@FindBy(name = "EmergencyContact")
	public WebElement Employee_emergencyContact;

	@FindBy(id = "EmergencyRelation")
	public WebElement Employee_EmergencyRelation;

	@FindBy(name = "EmergencyPhone1")
	public WebElement Employee_EmergencyPhone1;

	@FindBy(name = "EmergencyPhone2")
	public WebElement Employee_EmergencyPhone2;

	@FindBy(name = "LoginName")
	public WebElement EmployeeLoginName;

	@FindBy(name = "LoginPassword")
	public WebElement Emp_LoginPassword;

	@FindBy(name = "ConfirmPassword")
	public WebElement Emp_ConfirmPassword;

	@FindBy(xpath = "//input[@value='Submit']")
	public WebElement EmpSubmitButon;
	
	@FindBy(xpath = "//input[@value='Update']")
	public WebElement EmployeeUpdateButton;

	/************ Emp Attendance Webelements *************/
	@FindBy(xpath = "//div[@class='header']/h2")
	public WebElement Employee_AttendancePage_header;

	@FindBy(xpath = "//a[text()=' Add New Shift ']")
	public WebElement Emp_Add_new_Shift_button;

	@FindBy(name = "ShiftName")
	public WebElement Emp_Shiftname;

	@FindBy(name = "StartTime")
	public WebElement Emp_starttime;

	@FindBy(name = "EndTime")
	public WebElement Emp_endtime;

	@FindBy(xpath = "//button[text()='ADD']")
	public WebElement Shift_ADD_Button;

	@FindBy(xpath = "//button[text()='UPDATE']")
	public WebElement Shift_UPDATE_button;

	@FindBy(xpath = "//input[@type='search']")
	public WebElement emp_search_field;

	@FindBy(xpath = "//button[text()='CheckIn']")
	public WebElement Emp_checkin_Button;

	@FindBy(xpath = "//button[text()='CheckOut']")
	public WebElement Emp_checkout_button;

	@FindBy(xpath = "//form[@action='/EmployeeAttendance/CheckIn']/div/div/div/div/div/span/button[1]")
	public WebElement Employee_Checkin_YES_button;

	@FindBy(xpath = "//form[@action='/EmployeeAttendance/CheckOut']/div/div/div/div/div/span/button[1]")
	public WebElement Employee_CheckOut_YES_button;

	public EmployeePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Click_EmployeeTab() {
		EmployeeTab.click();
	}

	public void Click_EmployeeListTab()
	{
		EmployeeList.click();
	}
	
	public void Click_Emp_AttendanceTab()
	{
		EmployeeAttendance.click();
	}
	
	public void Click_addNewEmployee_Button()
	{
		AddNewEmployee_Button.click();
	}
	
	public void Enter_Employee_FirstName(String fn)
	{
		Employee_FirstName.sendKeys(fn);
	}
	
	public void Enter_Employee_Lastname(String ln)
	{
		Employee_LastName.sendKeys(ln);
	}
	
	public void Enter_gender(String g)
	{
		if(g.equalsIgnoreCase("male"))
		{
			Employee_Male_Gender_option.click();
		}
		else if(g.equalsIgnoreCase("female"))
		{
			Employee_Female_Gender_option.click();
		}
	}
	
	public void Upload_Profile_Pic(String x)
	{
		EmployeeProfilepic.sendKeys(x);
	}
	
	public void Enter_emp_DOB(String dob)
	{
		EmployeeDOB.sendKeys(dob);
	}
	
	public void Enter_Designation(String d)
	{
		Select s = new Select(EmployeeDesignation);
		List<WebElement> l=s.getOptions();
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i).getText().equalsIgnoreCase(d))
			{
				l.get(i).click();
			}
		}
		
	}
	
	public void Enter_securityProfile(String d)
	{
		Select s = new Select(Employee_SecurityProfile);
		List<WebElement> l=s.getOptions();
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i).getText().equalsIgnoreCase(d))
			{
				l.get(i).click();
			}
		}
	}
	
	public void Enter_Shift(String d)
	{
		Select s = new Select(Employee_ShiftId);
		List<WebElement> l=s.getOptions();
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i).getText().equalsIgnoreCase(d))
			{
				l.get(i).click();
			}
		}
		
	}
	
	public void Enter_DOJ(String doj)
	{
		Employee_joiningDate.sendKeys(doj);
	}
	
	public void Enter_DOL(String dol)
	{
		Employee_LeavingDate.sendKeys(dol);
	}
	
	public void Enter_SSN(String ssn)
	{
		Employee_SSN.sendKeys(ssn);
	}
	
	public void Click_Employee_Next_Button()
	{
		Employee_Next_Button.click();
	}
	
	public void Enter_Employee_Street(String x)
	{
		Employee_Address_street.sendKeys(x);
	}
	
	public void Enter_Employee_City(String x)
	{
		Employee_Address_city.sendKeys(x);
	}
	
	public void Enter_Employee_state(String x)
	{
		Employee_Address_state.sendKeys(x);
	}
	
	public void Enter_Employee_zip(String x)
	{
		Employee_Address_zip.sendKeys(x);
	}
	public void Enter_Phone_Home(String x)
	{
		Employee_HomePhone.sendKeys(x);
	}
	public void Enter_Email(String x)
	{
		Employee_email.sendKeys(x);
	}
	public void Enter_Emergency_Person(String p)
	{
		Employee_emergencyContact.sendKeys(p);
	}
	
	public void Enter_Emergency_Relationship(String r)
	{
		Employee_EmergencyRelation.sendKeys(r);
	}
	
	public void Enter_Emergency_Contact1(String c)
	{
		Employee_EmergencyPhone1.sendKeys(c);
	}
	

	public void Enter_Emergency_Contact2(String c)
	{
		Employee_EmergencyPhone2.sendKeys(c);
	}
	
	public void Enter_username(String x)
	{
		EmployeeLoginName.sendKeys(x);
	}
	public void Enter_password(String x)
	{
		Emp_LoginPassword.sendKeys(x);
	}
	
	public void Enter_confirmpassword(String x)
	{
		Emp_ConfirmPassword.sendKeys(x);
	}
	
	public void Click_employee_submit_button()
	{
		EmpSubmitButon.click();
	}
	
	public void Enter_employee_search(String x)
	{
		emp_search_field.sendKeys(x);
	}
	
	public void Click_edit_link()
	{
		Employee_Edit_link.click();
	}

	public void Click_delete_link()
	{
		Employee_Delete_link.click();
	}
	
	public void Click_Employee_Update_button()
	{
		EmployeeUpdateButton.click();
	}
	
	public void Click_Checkin_button()
	{
		Emp_checkin_Button.click();
	}
	
	public void Click_Checkout_button()
	{
		Emp_checkout_button.click();
	}
	
	public void Click_CheckIn_Yes_button()
	{
		Employee_Checkin_YES_button.click();
	}
	
	public void Click_Checkout_Yes_button()
	{
		Employee_CheckOut_YES_button.click();
	}
	
	public void Click_on_Employee_Shift_tab()
	{
		EmployeeShift.click();
	}
	
	public void Click_AddNewShift_button()
	{
		Emp_Add_new_Shift_button.click();
	}
	
	public void Enter_ShiftName(String s)
	{
		Emp_Shiftname.clear();
		Emp_Shiftname.sendKeys(s);
	}
	
	public void Enter_StartTime(String s)
	{
		Emp_starttime.sendKeys(s);	
	}
	
	public void Enter_EndTime(String x)
	{
		Emp_endtime.sendKeys(x);
	}
	
	public void Click_ADD_button()
	{
		Shift_ADD_Button.click();
	}
	
	public void Click_ShiftEdit_link()
	{
		Employee_Edit_link.click();
	}
	
	public void Click_ShiftDelete_link()
	{
		Employee_Delete_link.click();
	}
	
	public void Click_Shift_update_button()
	{
		Shift_UPDATE_button.click();
	}
}
