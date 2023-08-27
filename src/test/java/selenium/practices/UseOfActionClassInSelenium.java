package selenium.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UseOfActionClassInSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		Actions actions=new Actions(driver);
		WebElement blogs=driver.findElement(By.xpath("//span[@id='blogsmenu']"));
		actions.moveToElement(blogs).build().perform();//for mouseOver on webelement
		
		WebElement textarea=driver.findElement(By.xpath("//textarea[@id='ta1']"));
		actions.keyDown(textarea,Keys.SHIFT).keyDown("a").keyUp("a").keyDown(Keys.SHIFT).perform();//for type character like key press down and press up 
		
		actions.contextClick(textarea).build().perform();//for Double click
	}

}
