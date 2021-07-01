package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
	// we have to create a constructor to call on the test page
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// library

	// Create Element Lib
//		WebElement username_field_element = driver.findElement(By.xpath("//*[@id= 'username']"));//does not work in Page object model
//	  	By username_field = By.xpath("//*[@id='username']");//does not work in Page object model

	@FindBy(how = How.XPATH, using = "//*[@id='username']")
	WebElement user_name_field;
	@FindBy(how = How.XPATH, using = "//*[@id='password']")
	WebElement password_field;
	@FindBy(how = How.XPATH, using = "//button[@name ='login']")
	WebElement signing_button_field;

	// interactive methods(actions)

	public void enterUserName(String userName) {
		user_name_field.sendKeys(userName);
	}

	public void enterpassword(String password) {
		password_field.sendKeys(password);

	}

	public void clickOnSignInButton() {
		signing_button_field.click();
	}

}
