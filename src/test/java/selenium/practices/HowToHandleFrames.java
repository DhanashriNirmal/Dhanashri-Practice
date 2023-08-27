package selenium.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='navbar-iframe']")));
				
		System.out.println(driver.findElement(By.xpath("//a[@id='b-getorpost']")).getText());
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.cssSelector("input#radio1")).click();
	}

}
