package b6.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.Utility;

public class DataDivenTesting {
	WebDriver driver;

	@BeforeMethod
	public void setup() throws IOException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "userData")
	public void verifyValidLoginWithDifferentusers(String username, String password) {

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);

		driver.findElement(By.xpath("//input[@name='submit']")).click();

		WebElement loginsucessfullymsg = driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
		assertEquals(loginsucessfullymsg.getText(), "Login Successfully","User not logged in sucessfully");

	}

	@DataProvider(name = "userData")
	public String[][] usersDataProvider() {
		String[][] users = { { "user1", "pass1" }, { "user2", "pass2" }, { "user3", "pass3" } };
		return users;
	}
	
	@AfterMethod
	public void testDown()
	{
		driver.close();
	}

}
