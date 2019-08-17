package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeMethod  //Runs before every method
	public void UseIdGeneration()
	{
		System.out.println("This block executes before each test");
	}
	
	
	@BeforeTest//Runs only once before the test starts
	public void Cookies()
	{
		System.out.println("This block executes before all test cases");
	
	}
	
	
	@AfterTest
	public void Cookiesclose()
	{
		System.out.println("This block executes after all tests cases");
	}
	
	
	@AfterMethod
	public void Reportadding()
	{
		System.out.println("This block executes after each test");
	}
	
	
	@Test //it makes understand as main method
	public void OpenBrowser()
	{
		System.out.println("Executing test 1");
	}
	
	
	
	@Test
	public void FlightBooking()
	{
		System.out.println("Executing test 2");
	}
	

}
