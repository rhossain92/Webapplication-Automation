package helper_classes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Setdriver {
	public static WebDriver webDriver;
	public String browser;

	
	@Before
	public void beforeTest(Scenario scenario) throws Exception {
		System.out.println("Before test....");
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");  
		webDriver = new ChromeDriver();
		}
	

	@After
	public void afterTest(Scenario scenario) {
		System.out.println("After test....The scenario passed ");
		webDriver.quit();
	}

	
    }
