package MavenProject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praveenkumarra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('Hello, do not close me !')");
		Thread.sleep(2000);
		driver.quit();

	}
	

}
