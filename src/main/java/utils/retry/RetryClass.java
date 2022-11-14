package utils.retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import reporting.Logs;

public class RetryClass implements IRetryAnalyzer{

	int times = 0;
	int invoked = 2;
	@Override
	public boolean retry(ITestResult result) {
		if(invoked < times) {
			invoked++;
		Logs.log("Retrying" + invoked);
		return true;
		}
		return false;

	}
}
