package HomeTest;


import org.testng.Assert;  
import org.testng.annotations.Test;
import baseClass.BaseClass;
import reporting.Logs;
import utils.retry.RetryClass;

public class HomeTest extends BaseClass{   

	@Test (priority = 1, testName ="Testing home quote with priority ")
	public void homeQuote1() {
		Logs.log("This is priority1"); 

	}@Test(priority = 2, groups = {"home","priority" })
	public void homeQuote2() {
		Logs.log("This is priority2");

	}		
	@Test(priority = 3, groups = {"home","nopriority" })
	public void homeQuote3() {
		Logs.log("This is nopriority3");

	}	@Test (groups ="home",dependsOnGroups = "home", alwaysRun = true, retryAnalyzer = RetryClass.class)
	public void homeQuote4() {
		Logs.log("This is priority4"); 
		Assert.fail();
	}
	@Test (groups ="home",dependsOnGroups = "homeQuote", ignoreMissingDependencies = true)
	public void homeQuote5() {
		Logs.log("No priority5"); 
	}	
	@Test(priority = 6, enabled = false)
	public void homeQuote6() {
		Logs.log("This is nopriority6");
}
}