package omayo.testcase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.Utility;

public class BestTest {
	WebDriver driver;

	@BeforeMethod
	public void setup() throws IOException {
		Utility util = new Utility();
		driver = util.getdriver();

	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
