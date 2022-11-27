package auto;

import org.testng.annotations.Test;   

import baseClass.BaseClass;
import utils.data.AutoData;

public class AutoTest_with_AutoData extends BaseClass {
	
	AutoData autoData = new AutoData("11210", "zahid", "nahid","501 E 26st","2nd","03/01/1977");

	@Test
	public void AutoTestwithAutoData() throws InterruptedException {
		homePage.autoProduct(autoData.getzipCode()); 
		aboutYou.aboutYourProduct(autoData.getfirstName(), autoData.getLastName(),autoData.getStreetAddress(),autoData.getAptUnit(),autoData.getDob());
	}
	@Test
	public void AutoTestwithAutoDataNoParameter() throws InterruptedException {
		homePage.autoProduct(autoData); 
		aboutYou.aboutYourProduct(autoData);
		
	}

}

