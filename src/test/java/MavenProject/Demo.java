package MavenProject;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	//@Test
	@BeforeSuite
	public void DayOne()
	{
		System.out.println("Day One - Selenium Installation");
	}

	//@Test
	@AfterSuite 
	public void DayTwo()
	{
		System.out.println("Day Two - Maven And TestNG");
	}
	
	// Exclude the method with using Day.* to eliminates all the methods starts with Day.
}
