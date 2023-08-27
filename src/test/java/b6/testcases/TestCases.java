package b6.testcases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utilities.Utility;

public class TestCases {
	
	@Test
	public void VerifyPageTitle() throws IOException
	{
		Utility util=new Utility();
		WebDriver driver=util.getdriver();
//		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("http://omayo.blogspot.com/");
//		driver.manage().window().maximize();
		Assert.assertEquals(driver.getTitle(),"omayo (QAFox.com)");
	}

}
