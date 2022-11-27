package page;


import static common.CommonActions.click;         
import static common.CommonActions.input;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reporting.Logs;
import utils.data.AutoData;

public class AboutYou {

	WebDriver driver;
	
	public AboutYou(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this); 
	}
	//@FindBy(partialLinkText = "Homeowners Q")
	//WebElement homeownersQuoteeElement;
	@FindBy(id = "optclosebtn")
	WebElement popoUpElement;
	@FindBy(xpath = "//input[@id='firstName']")
	WebElement firstNameElement;
	@FindBy(xpath = "//input[@id='lastName']")
	WebElement lastNameElement;
	@FindBy(xpath = "//input[@name='riskLocationAddress.street']")
	WebElement streetAddressElement;
	@FindBy(xpath = "//input[@name='riskLocationAddress.street2']")
	WebElement aptUnitElement; 
	@FindBy(xpath = "//input[@id='dateOfBirth']")
	WebElement dobElement;
	@FindBy(xpath = "continue")
	WebElement continueButtonElement;


	public void aboutYourProduct(String firstName, String lastName,  String streetAddress, String aptUnit, String dob) throws InterruptedException{ 
		//if(isPresent( homeownersQuoteeElement) && isDisplayed(homeownersQuoteeElement)) {
		//click(homeownersQuoteeElement);

		input(firstNameElement, firstName); 
		input(lastNameElement, lastName); 
		input(streetAddressElement, streetAddress); 
		input(aptUnitElement, aptUnit); 
		input(dobElement, dob); 
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 700)", "");
		Logs.log("Scrolling down...");
		click(popoUpElement);
		Thread.sleep(5000);
		((JavascriptExecutor)driver).executeScript("document.getElementById('continue').click();");
		//click(continueButtonElement);  
		Thread.sleep(5000);

	}

	
	public void aboutYourProduct(AutoData autoData) { 
		//if(isPresent( homeownersQuoteeElement) && isDisplayed(homeownersQuoteeElement)) {
		//click(homeownersQuoteeElement);

		input(firstNameElement, autoData.getfirstName()); 
		input(lastNameElement,autoData.getLastName()); 
		input(streetAddressElement,autoData.getStreetAddress()); 
		input(aptUnitElement,autoData.getAptUnit()); 
		input(dobElement,autoData.getDob()); 
		click(continueButtonElement);  

	}
}
