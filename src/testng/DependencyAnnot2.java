package testng;

import org.testng.annotations.Test;

public class DependencyAnnot2 {
	
	@Test 
	public void OpenBrowser()
	{
		System.out.println("Executing opening browser");
	}
		
	
	@Test(dependsOnMethods={"OpenBrowser"},alwaysRun=true)/* Opening browser should run first 
	but that does not mean that if that fails flight booking should not run, so use this testcase where there is a
	dependency on other method by telling (dependsOnMethods={"OpenBrowser"} but the method which has a dependency should 
	run even if it fails by telling alwaysRun=true */
	public void FlightBooking()
	{
		System.out.println("Executing flight booking");
	}
	
	
	@Test(timeOut=5000) //used when we want a test to be executed within particular time
	public void TimeRelated()
	{
		System.out.println("Time related tests");
	}
	
	
	@Test(enabled=false) 
	public void Payment()
	{
		System.out.println("New testcase");
	}
	

}
