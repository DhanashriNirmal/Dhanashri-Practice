package selenium.practices;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement searchBox=driver.findElement(By.xpath("//input[@name='q' and @title='search']"));
		//sendkeys() used to send text on text fields
		searchBox.sendKeys("Example");
		Thread.sleep(3000);
		//clear() used to clear text fields
		searchBox.clear();
		
		//It will get specified attribute value
		System.out.println(searchBox.getAttribute("class"));
		
		//It will used to verify specified webelement is displayed on webpage
		System.out.println(searchBox.isDisplayed());
		
		System.out.println(searchBox.getAccessibleName());
		//it is used to get the role of webelement: for ex - textbox,button
		System.out.println(searchBox.getAriaRole());
		
		//it is used to get tagname of webelement
		System.out.println(searchBox.getTagName());
		
		//it is used to access css value of particular attribute
		System.out.println(driver.findElement(By.cssSelector("button.dropbtn")).getCssValue("background-color"));
		System.out.println(driver.findElement(By.cssSelector("button.dropbtn")).getCssValue("border"));

		//it is used to access text on webelement
		System.out.println(driver.findElement(By.cssSelector("button.dropbtn")).getText());
		
		//it is used to access location of webelement
		Point p=searchBox.getLocation();
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		//it is used to access  webelement screenshot
		File file=searchBox.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("src/test/resources/ScreenShot/searchboxScreenshot.png"));

		//Use of isSelected(),isDisplayed(),isEnabled():= verification of webelement
		WebElement maleRadioBtn=driver.findElement(By.xpath("//input[@id='radio1']"));
		WebElement femaleRadioBtn=driver.findElement(By.xpath("//input[@id='radio2']"));
		
		maleRadioBtn.click();
		
		System.out.println("maleRadioBtn is Selected: "+maleRadioBtn.isSelected());
		System.out.println("femaleRadioBtn is Selected: "+femaleRadioBtn.isSelected());
		System.out.println("femaleRadioBtn is displayed: "+femaleRadioBtn.isDisplayed());

		WebElement orangeCheckbox=driver.findElement(By.xpath("//input[@id='checkbox1']"));
		WebElement blueCheckbox=driver.findElement(By.xpath("//input[@id='checkbox2']"));
		
		System.out.println("orangeCheckbox is Selected: "+orangeCheckbox.isSelected());
		System.out.println("blueCheckbox is Selected: "+blueCheckbox.isSelected());
		System.out.println("orangeCheckbox is displayed: "+orangeCheckbox.isDisplayed());

		System.out.println("Button2 is Enabled: "+driver.findElement(By.xpath("//button[@id='but2']")).isEnabled());
		System.out.println("Button1 is Enabled: "+driver.findElement(By.xpath("//button[@id='but1']")).isEnabled());

		////it is used to get size of webelement
		Dimension d=searchBox.getSize();
		System.out.println(d.height);
		System.out.println(d.width);
		System.out.println(d.getHeight());
		System.out.println(d.getWidth());
		
}
}
