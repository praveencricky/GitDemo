package MavenProject;

import org.testng.annotations.Test;

public class Close {

	@Test(priority=1)
	public void TestAnnotations()
	{
		System.out.println("***TESTNG SEQUENCE***");
		System.out.println("-------------------------------");
		System.out.println("1-BeforeSuite Annotations");
		System.out.println("2-BeforeTest Annotations");
		System.out.println("3-BeforeClass Annotations");
		System.out.println("4-BeforeMethod Annotations");
		System.out.println("0-Test Annotations");
		System.out.println("1-AfterSuite Annotations");
		System.out.println("2-AfterTest Annotations");
		System.out.println("3-AfterClass Annotations");
		System.out.println("4-AfterMethod Annotations");
		System.out.println("-------------------------------");
	
	}
	
	
}
