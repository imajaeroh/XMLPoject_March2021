package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public void waitForElement(WebDriver driver, int timeInSeconds, WebElement elementlocator) {
		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.visibilityOf(elementlocator));	

	}
	
//		Random rnd = new Random();
//		public int randomGenerator(int boundaryNumber) {
//		int randomNumber = rnd.nextInt(boundaryNumber); 
//		return randomNumber;
//	}
		Random rnd = new Random();
		public int randomGenerator(int min, int max) {
			int randomNumber = rnd.nextInt(max-min)+min;
			return randomNumber;
		}
	
	
	public void selectDropDown(WebElement element, String visibleText) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);

	}


}
