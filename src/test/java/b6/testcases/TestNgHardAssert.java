package b6.testcases;



import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.Utility;


public class TestNgHardAssert {
	Utility util;
	@Test
	public void verifyTitle() throws IOException
	{
		util=new Utility();
		WebDriver driver=util.getdriver();
		
		assertEquals(driver.getTitle(), "omayo (QAFox.com)","assertEquals Testcase");//True
		
		assertTrue(driver.getTitle().equals("omayo (QAFox.com)"),"assertTrue Testcase");//True
		
		assertNotEquals(driver.getTitle(), "omayo (QAFox.com)","assertNotEquals TestCase");//False
		System.out.println("After Failure 1");
		
		assertFalse(driver.getTitle().equals("omayo (QAFox.com)"),"assertFalse Testcase");//False
		System.out.println("After Failure 2");
		
	}
	

}
