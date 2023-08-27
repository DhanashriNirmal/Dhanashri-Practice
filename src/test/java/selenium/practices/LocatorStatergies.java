package selenium.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStatergies {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");

		// By name
		WebElement element = driver.findElement(By.name("userid"));
		element.sendKeys("Example");
		Thread.sleep(2000);
		element.clear();

		// By id
		WebElement element1 = driver.findElement(By.id("but1"));
		System.out.println(element1.getText());

		// By linkText
		driver.findElement(By.linkText("SeleniumTutorial")).click();
		
		//By partial link text
		driver.findElement(By.partialLinkText("Tutorial")).click();
		
		//By Tagname
		List<WebElement> link=driver.findElements(By.tagName("a")); 
		System.out.println("Number of links : "+link.size());
//		for(WebElement i:link)
//		{
//			System.out.println(i);
//		}
		
		//By xpath
		WebElement element4=driver.findElement(By.xpath("//input[@type='text' and @name='userid']"));
		element4.sendKeys("Dhanashri");
		
	}

}
