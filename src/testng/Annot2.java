package testng;

import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Annot2 {
	
	@BeforeSuite  
	public void installsoftware()
	{
		System.out.println("Iam first");
	}
	

	@AfterSuite  
	public void deinstallsoftware()
	{
		System.out.println("Iam last");
	}
}