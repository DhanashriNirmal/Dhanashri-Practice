package selenium.practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncgronizationInSelenium_Wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		//Implicit Wait()
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
		WebElement btn=driver.findElement(By.xpath("//abc")); 

		JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement checkThisBtn = driver.findElement(By.xpath("//button[text()='Check this']"));
		je.executeScript("arguments[0].scrollIntoView(true);", checkThisBtn);
		checkThisBtn.click();

		WebElement mrOption = driver.findElement(By.xpath("//input[@id='dte']"));
		// Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(mrOption));
		mrOption.click();
		System.out.println("==========================================================");
		WebElement dropdown = driver.findElement(By.xpath("//button[@class='dropbtn']"));
		dropdown.click();
		WebElement flipkart = driver.findElement(By.xpath("//a[text()='Flipkart']"));
		 WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(15));
		 wait.until(ExpectedConditions.elementToBeClickable(flipkart));
		
		//FluentWait
		FluentWait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver); 
		fluentwait.pollingEvery(Duration.ofMillis(100)); 
		fluentwait.ignoring(TimeoutException.class); 
		fluentwait.withTimeout(Duration.ofSeconds(11)); 
		fluentwait.until(ExpectedConditions.invisibilityOf(flipkart));

		//je.executeScript("arguments[0].click()", flipkart);

	}

}
