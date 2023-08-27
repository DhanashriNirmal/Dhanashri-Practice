package selenium.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class ScrollingInSelenium {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor je=(JavascriptExecutor)driver;
		//scroll till end of the page
		je.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		
		//Scroll vertically down
		je.executeScript("window.scrollBy(0,1000)","");
		Thread.sleep(2000);
		
		//Scroll vertically Up
		je.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(2000);
		
		//Scroll horizantally right
		je.executeScript("window.scrollBy(100,0)", "");
		Thread.sleep(2000);
		
		//Scroll horizantally left
		je.executeScript("window.scrollBy(-50,0)", "");
		Thread.sleep(2000);
		
		//Scroll into view
		WebElement link=driver.findElement(By.xpath("//a[text()='Blogger']"));
		je.executeScript("arguments[0].scrollIntoView(true);", link);
		
		//click using jS
		je.executeScript("arguments[0].click()", link);
	}

}
