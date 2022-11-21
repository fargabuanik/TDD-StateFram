package baseClass;

import org.openqa.selenium.WebDriver;      
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Parameters;

import RentersPage.AddressPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import page.AboutYou;
import page.HomePage;
import utils.Configuration;
import static utils.IConstant.*;
import java.time.Duration;

public class BaseClass {


	Configuration config = new Configuration();
	WebDriver driver;
	protected HomePage homePage;
	protected AboutYou aboutYou;
	protected AddressPage addressPage;


	@Parameters("browser")
	@BeforeMethod
	public void setUpDriver(String browser) {	
		//String browser = config.getProperty(BROWSER);
		initDriver(browser);
		driver.manage().window().maximize();
		driver.get(config.getProperty((URL))); 
		long pageLoadTime = Long.parseLong(config.getProperty(PAGELOAD_WAIT));
		long implicitWait = Long.parseLong(config.getProperty(IMPLICIT_WAIT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTime));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
		initClasses();
	}
	
	private void initDriver(String browser) { 
		switch (browser) {
		
		case CHROME:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
	
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case EDGE :
			WebDriverManager. edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case 	SAFARI:
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;

		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		}
	}
	
	private void initClasses() {
		homePage = new HomePage(driver);
		aboutYou = new AboutYou(driver);
		addressPage = new AddressPage(driver);
	
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	@AfterMethod
	public void closingDriverSession() {
		getDriver().quit();
	}  
}
