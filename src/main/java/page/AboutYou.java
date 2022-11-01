package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

public class AboutYou {
	public AboutYou(WebDriver driver) {
		PageFactory.initElements(driver, this); 
	}
	@FindBy(xpath = "dateOfBirth")
	WebElement dobElement;
	
	public void aboutYourSteps(String dob) {
	 input(dobElement, dob);
	 //input(lastNameElement, lastNameElement);
	}

}
