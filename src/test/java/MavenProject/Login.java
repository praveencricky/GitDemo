package MavenProject;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	
	@Test 
	public void WebPageLogin()
	{
		System.out.println("Login Page");
		System.out.println("we need import org.testng.annotations.Test for TestNG");
	}

	@Test 
	public void ValidCredentials()
	{
		System.out.println("Enterted valid credentials");
		System.out.println("Type***sysout + Press CTRL and SPACE***");
	}
	
	@Test 
	//@AfterTest
	public void LoginPage()
	{
		System.out.println("successfully Login");
	}
}
