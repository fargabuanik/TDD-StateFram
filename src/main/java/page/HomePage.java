package page;

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this); 
	}
	@FindBy(xpath ="//input[@class='-oneX-textfield__input']")
	WebElement zipCodeElement;  
	@FindBy (name ="productName")
	WebElement autoproductElement;
	@FindBy(id ="quote-main-zip-btn")
	WebElement startAQuotElement;
	@FindBy(id ="nyLegacyCloseLinkId")
	WebElement continuElement;

	public void autoProduct() {  
		input(zipCodeElement, "11210");
		click(autoproductElement);
		click(startAQuotElement);
	
		if(isPresent(continuElement)) {
			if(isDisplayed(continuElement)) {
				click(continuElement);
			}
		}
	}

}
