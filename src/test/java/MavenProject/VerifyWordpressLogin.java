package MavenProject;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyWordpressLogin 
{
 
@Test
public void verifyValidLogin()
{

System.setProperty("webdriver.chrome.driver", "C:\\Users\\praveenkumarra\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
WebDriver driver=new ChromeDriver();
 
driver.manage().window().maximize();
 
driver.get("https://opensource-demo.orangehrmlive.com/");
 
LoginPage login=new LoginPage(driver);

login.clickOnLoginButton();
 
driver.quit();
 
}
}