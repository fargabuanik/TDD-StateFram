package HomeTest;

 
import org.testng.annotations.Test;   
import baseClass.BaseClass;

public class RentersQuoteTest extends BaseClass {

	@Test
	public void RentersQuote() throws InterruptedException{
		homePage.rentersProduct("11210");
		addressPage.AddressPageProduct("Let's start with the address");
		

}

}
