package auto;

import org.testng.annotations.Parameters;   
import org.testng.annotations.Test;
import baseClass.BaseClass; 


public class AutoTest extends BaseClass{
	@Test
	public void autoQuote() throws InterruptedException{
		homePage.autoProduct("11210"); 
		aboutYou.aboutYourProduct("zahid", "nahid","501 E 26st","2nd","03-01-1977");
	}
	
	@Parameters({"zipCode","firstName","lastName", "streetAddress","aptUnit" ,"dob"})
	@Test
	public void autoQuoteParameter(String zipCode, String firstName, String lastName, String streetAddress, String aptUnit , String dob) throws InterruptedException {
		homePage.autoProduct(zipCode);
		aboutYou.aboutYourProduct(firstName, lastName, streetAddress, aptUnit ,dob);
	}
	
	} 
