package page;

import org.openqa.selenium.WebDriver;       
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import common.CommonWaits;
import utils.data.AutoData;

import static common.CommonActions.*;

public class HomePage {

	WebDriver driver;
	CommonWaits waits;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		waits = new CommonWaits(driver);
		PageFactory.initElements(driver, this); 
	}
	@FindBy(xpath ="//input[@id='quote-main-zip-code-input']")
	WebElement zipCodeElement;  
	@FindBy (xpath ="//select[@id='popDropdown']")
	WebElement homeownersElement;  
	@FindBy(xpath ="//select[@id='popDropdown']")
	WebElement rentersElement;
	@FindBy(id ="quote-main-zip-btn")
	WebElement startAquoteElement; 

	public void rentersProduct(String zipCode) {
		input(zipCodeElement, zipCode);
		selectMethod(rentersElement, "Renters");
		sleep(2);
		click(startAquoteElement); 
	}

	public void autoProduct(String zipCode) {     
		input(zipCodeElement, zipCode);
		selectMethod(homeownersElement, "Homeowners");
		click(startAquoteElement); 

	}

	public void autoProduct( AutoData autoData) {     
		input(zipCodeElement,autoData.getzipCode());
		selectMethod(homeownersElement, "Homeowners");
		click(startAquoteElement); 

	}
}



