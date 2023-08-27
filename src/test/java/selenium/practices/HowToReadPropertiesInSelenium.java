package selenium.practices;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.Utility;

public class HowToReadPropertiesInSelenium {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(Utility.getProperty("url"));
		driver.manage().window().maximize();
	}

}
