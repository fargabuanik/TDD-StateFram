package HomeTest;

import org.testng.annotations.Test;

import baseClass.BaseClass;

public class HomeTest extends BaseClass{   

	@Test
	public void test() {
		homePage.autoProduct();
	}
}
