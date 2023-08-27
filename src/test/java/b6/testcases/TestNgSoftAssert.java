package b6.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.Utility;

public class TestNgSoftAssert {
	Utility util;
	SoftAssert verify=new SoftAssert();
	@Test
	public void verifypageTitle() throws IOException
	{
		util=new Utility();
		WebDriver driver=util.getdriver();
		
		verify.assertEquals(driver.getTitle(), "omayo (QAFox.com)","assertEquals Testcase");//True
		
		verify.assertTrue(driver.getTitle().equals("omayo (QAFox.com)"),"assertTrue Testcase");//True
		
		verify.assertNotEquals(driver.getTitle(), "omayo (QAFox.com)","assertNotEquals TestCase");//False
		System.out.println("After Failure 1");
		
		verify.assertFalse(driver.getTitle().equals("omayo (QAFox.com)"),"assertFalse Testcase");//False
		System.out.println("After Failure 2");
		
		verify.assertAll();
	}
	

}
