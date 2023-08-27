package selenium.practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderControl {

	public static void main(String[] args) throws InterruptedException {
		CalenderControl calenderControl = new CalenderControl();
		calenderControl.selectdateFromdatePicker("1", "22");// 1 is month and 22 is dare
		
	}
	/**
	 * 
	 * @param month
	 * 			Month pass month as string and it will 1 or 2.
	 * @param date
	 * 			date pass date as string and it will as per calender date e.g. 1 or 30
	 * @throws InterruptedException
	 */

	public void selectdateFromdatePicker(String month, String date) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();

		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(20));

		// wait.until(ExpectedConditions
		// .elementToBeClickable(driver.findElement(By.xpath("//input[@id='departure']/../span"))));
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@id='departure']/../span")).click();

		// wait.until(ExpectedConditions.elementToBeClickable(
		// driver.findElement(By.xpath("//div[@class='DayPicker']//div[@class='DayPicker-Month']["
		// + month
		// + "]//div[@class='DayPicker-Day']//p[text()='" + date + "']"))));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='DayPicker']//div[@class='DayPicker-Month'][" + month
				+ "]//div[@class='DayPicker-Day']//p[text()='" + date + "']")).click();

	}

}
