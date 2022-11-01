package auto;

import org.testng.annotations.Test; 
import baseClass.BaseClass; 


public class AutoTest extends BaseClass{
	@Test
	public void autoQuote() {
		homePage.autoProduct(); 
		aboutYou.aboutYourSteps("firstName"); 
	}
	
	} 
