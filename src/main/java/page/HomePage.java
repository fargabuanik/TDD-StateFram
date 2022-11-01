package page;

import org.openqa.selenium.WebDriver;   
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import common.CommonWaits;
import static common.CommonActions.*;

public class HomePage {
	
	WebDriver driver;
	CommonWaits waits;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		waits = new CommonWaits(driver);
		PageFactory.initElements(driver, this); 
	}
	@FindBy(xpath ="//input[@class='-oneX-textfield__input']")
	WebElement zipCodeElement;  
	@FindBy (name ="productName")
	WebElement autoproductElement;
	@FindBy(id ="quote-main-zip-btn")
	WebElement startAQuotElement;
	@FindBy(id ="nyLegacyCloseLinkId")
	WebElement continueWebElement;

	public void autoProduct() {   
		input(zipCodeElement, "11210");
		click(autoproductElement); 
		click(startAQuotElement);
		
	waits.waitUntilVisible(continueWebElement);
		if(isPresent(continueWebElement)) {
			if(isDisplayed(continueWebElement)) {
				click(continueWebElement);
			}
		}
	}

}
