package AboutYouPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

public class AboutYourSelf {
	
	public  AboutYourSelf(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(className = "-oneX-heading--h3")
	WebElement aboutYourSelfElement;
	@FindBy(xpath = "//input[@id='primary-applicant-first-name-id']")
	WebElement firstNameElement;
	@FindBy(xpath = "//input[@id='primary-applicant-last-name-id']") 
	WebElement lastNameElement;
	@FindBy(xpath = "//input[@id='dateOfBirth']")
	WebElement dobElement;
	@FindBy(xpath = "//input[@id='emailAddress']")
	WebElement emailAddressElement;
	@FindBy(xpath = "//label[@for='checkbox']")
	WebElement checkboxElement;
	@FindBy(xpath = "//button[@type='continue']")
	WebElement continueButtonElement;
	
	public void AboutYourSelfProduct(String expected, String firstName, String lastName, String dob, String emailAddress) { 
		assertGetText(aboutYourSelfElement, expected); 
		input(firstNameElement, firstName);
		input(lastNameElement, lastName);
		input(dobElement, dob);
		input(emailAddressElement, emailAddress);
		click(checkboxElement); 
		click(continueButtonElement); 
		
	}
	
	

}
