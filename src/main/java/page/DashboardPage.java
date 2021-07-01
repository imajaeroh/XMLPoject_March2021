package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage  extends BasePage{
	
	WebDriver driver;
	
public DashboardPage(WebDriver driver) {
	this.driver = driver;
	
}
	// Create Element Lib
//	WebElement username_field_element = driver.findElement(By.xpath("//*[@id= 'username']"));//does not work in Page object model
//  	By username_field = By.xpath("//*[@id='username']");//does not work in Page object model
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Dashboard')]")
	WebElement DashBoard_Header_field;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a")
	WebElement Customer_field_button;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")
	WebElement Add_Customer_field;
	
//	@FindBy(how = How.XPATH, using = "//*[@id='side-menu']/li[3]/ul/li[2]/a")
//	WebElement List_Customer_field;

	
	// Interacting Methods
	
	public void  validateDashBoardHeader() {
		waitForElement(driver, 5, DashBoard_Header_field);
		Assert.assertEquals(DashBoard_Header_field.getText(),"Dashboard", "Dashboard Page Not Found!");
	}

	public void clickOnCustomerButton() {
		Customer_field_button.click();
	}
	
	public void clickOnAddCustomerButton() {
	waitForElement( driver, 3 ,Add_Customer_field ); 	
	Add_Customer_field.click();
	}
	
//	public void clickOnListCustomerField() {
//		waitForElement( driver, 10 ,List_Customer_field);
//		List_Customer_field.click();
//	}

	

}
