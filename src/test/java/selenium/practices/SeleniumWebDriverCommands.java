package selenium.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriverCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebElement button = driver.findElement(By.xpath("//button[@id='but2']"));
		System.out.println(button.getText());

		WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@id='radio1']"));

		WebElement femaleRadioBtn = driver.findElement(By.cssSelector("input#radio2"));
		// WebElement femaleRadioBtn = driver.findElement(By.id("radio2"));

		// NoSuchElementException shows
		// WebElement femaleRadioBtn = driver.findElement(By.cssSelector("input#abc"));

		maleRadioBtn.click();
		Thread.sleep(5000);
		femaleRadioBtn.click();
		
		//If findElements methods unable to find any web element then it returns empty list 
		List<WebElement> links = driver.findElements(By.tagName("button"));
		System.out.println("Number of links in webpage:"+links.size());
		
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());
		
		System.out.println(driver.getTitle());
		
		
		driver.close();

	}

}
