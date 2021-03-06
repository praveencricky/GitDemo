package MavenProject;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orange {
	static WebDriver driver;

	//public static void main(String[] args) throws InterruptedException, IOException 
	@BeforeTest
	public void Loginbase() throws IOException, InterruptedException
		{
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\praveenkumarra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		}
	
	@Test
	public void ValidLogin() throws InterruptedException, IOException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Screenshot();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		Screenshot();
		driver.findElement(By.className("button")).click();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Screenshot();
		
	
	}
		
		public void Screenshot() throws IOException
		{
		Date d = new Date();
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\praveenkumarra\\Pictures\\Screenshots\\OrangeHrm.png"+d.toString().replace(":","_")+".png"));
		}
		
		@AfterTest()
		public void Closewindow()
		{
		driver.close();
		}
	}


