package testng;

import org.testng.annotations.Test;

public class DependencyAnnot {
	
	
	@Test //it makes understand as main method
	public void OpenBrowser()
	{
		System.out.println("Executing opening browser");
	}
		
	
	@Test(dependsOnMethods={"OpenBrowser"}) /*attributes for annotation
	this flight booking executes only when open browser tests passes hence (dependsOnMethods={"OpenBrowser"}) is used */ 
	public void FlightBooking()
	{
		System.out.println("Executing flight booking");
	}
	
	@Test(enabled=false) //used when one of the test cases is failing and we don't need it to be executed
	public void Payment()
	{
		System.out.println("");
	}
	


}
