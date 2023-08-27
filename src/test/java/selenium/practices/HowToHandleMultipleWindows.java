package selenium.practices;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleMultipleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@id='selenium143']")).click();
		
		String currentWindowHandle=driver.getWindowHandle();
		
		Set<String> allWindowhandle=driver.getWindowHandles();
		
		for(String handle:allWindowhandle)
		{
			if(handle.equals(currentWindowHandle))
			{
				continue;
			}
			else
			{
				driver.switchTo().window(handle);
			}
		}
		System.out.println(driver.findElement(By.xpath("//a[text()='What is Selenium?']")).getText());

		driver.switchTo().window(currentWindowHandle);
		
		driver.findElement(By.cssSelector("input#radio1")).click();
	}

}
