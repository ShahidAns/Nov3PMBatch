package HomePageTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.WebDriverUtility;
import POMRepo.HomePage;

public class ToverifyHomePageTest extends BaseClass{
	@Test
	public void toVerifyHomePageTest() throws IOException,EncryptedDocumentException
	
	{	
		String expectedTitle = eUtils.fetchStringDataFromExcelSheets("sheet3", 1,0);
		HomePage home = new HomePage(driver);
		
		WebDriverUtility wUtils = new WebDriverUtility();
		wUtils.toWaitForTitle(driver, "Enter");
		
		String actualTitle = home.verifyHomePageTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Pass : The title is verify");
			
}
	
}
