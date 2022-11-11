package auto;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test; 
import baseClass.BaseClass;
import utils.data.AutoData;

public class AutoTest_with_AutoData extends BaseClass {
	
	AutoData autoData = new AutoData("11210", "firstName", "lastName","StreetAddress" , "aptunit", "dob");
	
	@Test
	public void AutoTestwithAutoData() throws InterruptedException {
		homePage.autoProduct(autoData.getzipCode()); 
		aboutYou.aboutYourProduct(autoData.getfirstName(), autoData.getLastName(),autoData.getStreetAddress(),autoData.getAptUnit(),autoData.getDob());
		
	}
	
	@Test
	public void AutoTestwithAutoDataNoParameter() {
		homePage.autoProduct(autoData); 
		aboutYou.aboutYourProduct(autoData);
		
	}

}

