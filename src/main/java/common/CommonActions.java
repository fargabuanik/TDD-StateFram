package common;

import java.util.List; 
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import reporting.Logs;

public class CommonActions {

	public static void input(WebElement element, String value) {
		try {

			element.sendKeys(value);
			Logs.log(element +":has been passed to --->" + element);
		} catch ( NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Logs.log("Element not found--->" + element ); 
			Assert.fail();
		} 
	} 
	public static void click(WebElement element) {
		try {

			element.click();
			Logs.log(element +":has been click --->" + element);
		} catch ( NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Logs.log("Element not found--->" + element ); 
			Assert.fail();
		} 

	}
	public static boolean isPresent(WebElement element) {
		try {
			element.getAccessibleName();
			Logs.log(element.getAccessibleName()+ "<--- has been present");
			return false;
		}catch ( NoSuchElementException | NullPointerException e) {
			Logs.log("ELEMENT NOT FOUND--->" + element);
			return false;
		}
	}

	public static boolean isPresent(By byLocator, WebDriver driver) {
		List<WebElement> elements = driver.findElements(byLocator);
		if (elements.size() == 0) {
			Logs.log("ELEMENT NOT FOUND--->" + byLocator);
			return false;
		}else {
			Logs.log(elements.get(0).getAccessibleName()+ "<---hase been present");
			return true;
		}
	}
	public static boolean isDisplayed( WebElement element) {
		if(element.isDisplayed()) {
			Logs.log(element.getAccessibleName()+"<-- is Visible");
			return true;
		}else {
			Logs.log(element.getAccessibleName()+"<---- not Visible");
			return false;
		}
		
	
		
	}
}
