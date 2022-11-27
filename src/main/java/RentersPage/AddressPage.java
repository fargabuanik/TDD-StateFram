package RentersPage;


import org.openqa.selenium.JavascriptException;   
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;
import common.CommonWaits;

public class AddressPage {
	

	CommonWaits waits;
	WebDriver driver;
	
	public AddressPage(WebDriver driver) {
		this.driver=driver;
		waits = new CommonWaits(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='-oneX-heading--h3']")
	WebElement addressPageTitle;
	@FindBy(xpath = "//textarea[@id='insured-address-full-address-id']")
	WebElement addressElement;
//	@FindBy(className = "px38")
//	WebElement continueButtonElement;
	
	
	public void AddressPageProduct(String expected) {
		waits.waitUntilVisible(addressPageTitle);
		assertGetText(addressPageTitle, expected);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='501 E 26st' ", addressElement);
		waits.waitUntilClickable(addressElement);
		try {
			((JavascriptExecutor)driver).executeScript("document.getElementById('continueButton').click();");
		} catch (JavascriptException e) {
		}
		
		
		//click(continueButtonElement);
		

	}
}