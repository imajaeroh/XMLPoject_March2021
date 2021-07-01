package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;



public class LoginTest {
	
	WebDriver driver;
//		String userName = null;
//		String password = null;

			
			
	@Test
	@Parameters({"username","password"})
	
	
	public void validpasswordUserShouldBeAbleToLogin(String userName, String password) {
		
		driver = BrowserFactory.init();
		

		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.enterUserName(userName);
		loginPage.enterpassword(password);
		loginPage.clickOnSignInButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashBoardHeader();
		BrowserFactory.tearDown();
		
		}

}
