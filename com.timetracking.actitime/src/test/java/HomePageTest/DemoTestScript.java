package HomePageTest;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;

public class DemoTestScript extends BaseClass {
	@Test(priority=2)
	public void verifyCustomer()
	{
		System.out.println("Customer has been verify");
	}
	@Test(priority=1)
	public void verifyHomePage()
	{
		System.out.println("Customer has been verify");
	}
	
}
