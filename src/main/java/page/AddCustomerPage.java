package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddCustomerPage extends BasePage{

	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	// Create Element Lib
//		WebElement username_field_element = driver.findElement(By.xpath("//*[@id= 'username']"));//does not work in Page object model
//	  	By username_field = By.xpath("//*[@id='username']");//does not work in Page object model

//	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a")
//	WebElement Customer_field_button;
//	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")
//	WebElement Add_Customer_filed;
	@FindBy(how = How.XPATH, using = "//input[@name='account']")
	WebElement fullName_field;
	@FindBy(how = How.XPATH, using = "//*[@id='cid']")
	WebElement companyName_field;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement Email_field;
	@FindBy(how = How.XPATH, using = "//input[@type='text' and@name='phone']")
	WebElement Phone_field;
	@FindBy(how = How.XPATH, using = "//input[@type='text' and@id='address']")
	WebElement Address_field;
	@FindBy(how = How.XPATH, using = "//input[@type='text' and@id='city']")
	WebElement City_field;
	@FindBy(how = How.XPATH, using = "//input[@name='state']")
	WebElement stateRegion_field;
	@FindBy(how = How.XPATH, using = "//input[@type='text' and@id='zip']")
	WebElement zipCode_field;
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]")
	WebElement Country_field;
//	@FindBy(how = How.XPATH, using = "//ul[@class='select2-selection__rendered']")
//	WebElement Tag_field;
//	@FindBy(how = How.XPATH, using = "//select[@id='currency']")
//	WebElement Currency_field;
	@FindBy(how = How.XPATH, using = "//*[@id='group']")
	WebElement GroupDropDown_field;
//	@FindBy(how = How.XPATH, using = "//input[@type='password' and @id='password']")
//	WebElement Password_field;
//	@FindBy(how = How.XPATH, using = "//input[@type='password' and @id='password']")
//	WebElement Confirm_Password_field;
//	@FindBy(how = How.XPATH, using = "//label[@class='btn btn-primary btn-sm toggle-on']")
//	WebElement WelcomeEmail__field;
	@FindBy(how = How.XPATH, using = "//button[@class='md-btn md-btn-primary waves-effect waves-light']")
	WebElement Save_button__field;
	
	@FindBy(how = How.XPATH, using = "//*[@id='application_ajaxrender']/a")
	WebElement autoLoginButton_field;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a")
	WebElement List_Customer_field;
//	@FindBy(how =How.XPATH, using = "//tbody/tr[1]/td[7]/a[2]")
//	WebElement clickDeleteButton_field;

	@FindBy(how = How.XPATH, using = "//button[@data-bb-handler='confirm']")
	WebElement clickOnOkButton__field;
	@FindBy(how = How.XPATH, using = "//*[@id='page-wrapper']/div[3]/div[1]/div/div/div[1]/a[1]")
	WebElement AddCustomerOnListCustomer__field;

	@FindBy(how = How.XPATH, using = "//*[@id='foo_filter']")
	WebElement SearchFieldOnListCustomer__field;

	// Interactive Method
	/*
	 * public void clickOnCustomerButton() { Customer_field_button.click(); }
	 * 
	 * public void clickOnAddCustomerButton() { waitForElement( driver, 3
	 * ,Add_Customer_filed ); Add_Customer_filed.click(); }
	 */
	
	
	public void clickOnAddCustomerOnListCustomerPage() {
		AddCustomerOnListCustomer__field.click();
	}
	
	String enteredName;
	public void insertFullName(String fullName) {
		waitForElement( driver, 5 ,fullName_field);
		int genNum = randomGenerator(100, 1000);
		fullName_field.sendKeys(fullName + genNum);
		enteredName = fullName + genNum;

	}

public void insertEnteredNameInSearchFieldOnListCustomerPage() {
	SearchFieldOnListCustomer__field.sendKeys(enteredName);
}
	
	public void insertcompany(String Companyname) {
		selectDropDown(companyName_field, Companyname);
	}

	public void insertEmailAddress(String email) {
		int genNum = randomGenerator(100, 1000);
		Email_field.sendKeys(genNum + email);
	}

	public void insertPhoneNumber(String phoneNo) {
		int genNum = randomGenerator(100, 1000);
		Phone_field.sendKeys("  "  + phoneNo+ genNum);

	}

	public void insertuserAddress(String Address) {
		int genNum = randomGenerator(100, 1000);
		Address_field.sendKeys("  " + genNum + "  " + Address);
	}

	public void insertCityName(String cityName) {
		City_field.sendKeys(cityName);
	}

	public void insertstateRegion(String state) {
		stateRegion_field.sendKeys(state);
	}

	public void insertzipCode(String zipcode) {
		int genNum = randomGenerator(100, 1000);
		zipCode_field.sendKeys(genNum + zipcode);
	}

	public void insertcountry(String country) {
		selectDropDown(Country_field, country);

	}
	
	
/*
	public void insertTag(String Tag) {
		Tag_field.sendKeys(Tag);
	}

	public void insertCurrency(String currencyName) {
		Currency_field.sendKeys(currencyName);
	}
*/
	public void insertGroup(String groupName) {
		selectDropDown(GroupDropDown_field, groupName);
	}

	
//	public void insertPassword(String password) {
//		Password_field.sendKeys(password);
//	}

//	public void confirmPassword(String password) {
//		Confirm_Password_field.sendKeys(password);
//	}

	

	public void clickOnSaveButton() {
		Save_button__field.click();
		waitForElement( driver, 10 ,autoLoginButton_field);
	}
	
	

	
	public void clickOnListCustomerField() {
		List_Customer_field.click();
	}

	 //tbody/tr[1]/td[3]
	//tbody/tr[2]/td[3]
	//tbody/tr[3]/td[3]
	
	//tbody/tr[1]/td[3]/following-sibling::td[4]/a[2]
	//button[@data-bb-handler='confirm']
	//tbody/tr[1]/td[7]/a[2]
	
//	String enteredName;
//	public void insertFullName(String fullName) {
//		int genNum = randomGenerator(100, 1000);
//		fullName_field.sendKeys(" " + fullName + genNum);
//		enteredName = fullName + genNum;
//		fullName_field.sendKeys(enteredName);
//	}	
	
//	public void verifyEnteredName() {
	public void verifyEnteredNameAndDelete() {
		String before_xpath = "//tbody/tr[";
		
		String after_xpath = "]/td[3]";

	for(int i = 1 ; i<=10; i++) {
	String name =	driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
	
//	System.out.println(name);
//	Assert.assertEquals(name,enteredName.trim(),"Entered Name does not exist!");
//	break; 
	
	
	
	if(name.contains(enteredName)) {
		System.out.println("entered name exists");
		driver.findElement(By.xpath("//tbody/tr["+i + "]/td[3]/following-sibling::td[4]/a[2]")).click();
//		driver.findElement(By.xpath("//tbody/tr["+i + "]/td[7]/a[2]")).click();
			}
	
	}

	}
	
//	public void clickDeleteButton()  {
//		clickDeleteButton_field.click();
		
//	}	
/*	
	public void clickOnOkButton()  {
		waitForElement( driver, 20 ,clickOnOkButton__field);
		clickOnOkButton__field.click();
	 
			
		String verifiedName = driver.findElement(By.xpath("//div[@class='alert alert-success fade in']")).getText();
		System.out.println(verifiedName);
		
		Assert.assertEquals(verifiedName, "×\r\n"
				+ "Contact Deleted Successfully", "verifiedName does not exist!");
	}

	*/	


	
public void verifyEnteredNameAndViewProfile() {
	String before_xpath = "//tbody/tr[";
	
	String after_xpath = "]/td[3]";

for(int i = 1 ; i<=10; i++) {
String name =	driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();

//System.out.println(name);
//Assert.assertEquals(name,enteredName.trim(),"Entered Name does not exist!");
//break; 



if(name.contains(enteredName)) {
	System.out.println("entered name exists");
	driver.findElement(By.xpath("//tbody/tr["+i + "]/td[3]/following-sibling::td[4]/a[1]")).click();
//	driver.findElement(By.xpath("//tbody/tr["+i + "]/td[7]/a[2]")).click();
		}

}

}

}