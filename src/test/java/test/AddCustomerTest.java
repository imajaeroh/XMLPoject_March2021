package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;



public class AddCustomerTest  {

	WebDriver  driver;
	
	/*
			String userName = null;
			String password  = null;
			
			String fullName =  null;
			String Companyname = null;	
			
			String email = null;
	//		String phoneNo = null;
			String phoneNo = null;
			String Address = null;
			String cityName = null;
			String state = null;
			String zipcode = null;
			String country = null;
			String groupName =null;
	*/
	
	@Test
	@Parameters({"username","password","fulName","CompanyName","Email","Phone","Address","City","State","ZipCode","Country","GroupName"})
		public void validUserShouldBeAbleToAddCustomerFromListCustomerPageAndViewProfile(String userName,String password,String  fullName,String Companyname, String email,String phoneNo, String Address, String cityName,String state, String zipcode,String country,String groupName) {
		driver =	BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName(userName);
		loginPage.enterpassword(password);
		loginPage.clickOnSignInButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashBoardHeader();
		dashboardPage.clickOnCustomerButton();
		dashboardPage.clickOnAddCustomerButton();
		
		AddCustomerPage addCustomerPage =PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.clickOnListCustomerField();
		addCustomerPage.clickOnAddCustomerOnListCustomerPage();
		addCustomerPage.insertFullName(fullName);
		
		addCustomerPage.insertcompany(Companyname);
		
		addCustomerPage.insertEmailAddress(email);
		addCustomerPage.insertPhoneNumber(phoneNo);
		
		addCustomerPage.insertuserAddress(Address);
		
		addCustomerPage.insertCityName(cityName);
		
		addCustomerPage.insertstateRegion(state);
		
		addCustomerPage.insertzipCode(zipcode);
		
		addCustomerPage.insertcountry(country);
		addCustomerPage.insertGroup(groupName);
		addCustomerPage.clickOnSaveButton();
		
//		Thread.sleep(5000); Thread is not allowed to be used in the industry . We can use for verification purpose 
		
//	 only and then expunge it from the code there after
	 
		addCustomerPage.clickOnListCustomerField();
		addCustomerPage.insertEnteredNameInSearchFieldOnListCustomerPage();
		addCustomerPage.verifyEnteredNameAndViewProfile();
//		addCustomerPage.verifyEnteredName();
		
		
//		addCustomerPage.clickDeleteButton();
//		addCustomerPage.clickOnOkButton();
	}

		
		
		}

