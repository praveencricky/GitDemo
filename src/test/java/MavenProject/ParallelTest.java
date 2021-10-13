package MavenProject;

import org.apache.log4j.BasicConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {

	private WebDriver driver;
	String baseURL = "http://www.google.com/";
	private static final Logger logger = LogManager.getLogger(ParallelTest.class);

	@Parameters({ "browser" })
	@BeforeTest
	public void openBrowser(String browser) {
		try {
			if (browser.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver","C:\\Users\\praveenkumarra\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");

				
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\praveenkumarra\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
			} 
		
		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void login_TestCase() {
		driver.navigate().to(baseURL);
		BasicConfigurator.configure();
		logger.info("Inside login test case");
		logger.info("navigating to page");
                //do something
	}

	@Test
	public void search_TestCase() {
		driver.navigate().to(baseURL);
             //do something
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}