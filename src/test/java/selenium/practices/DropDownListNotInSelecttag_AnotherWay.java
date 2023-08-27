package selenium.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownListNotInSelecttag_AnotherWay {

	public static void main(String[] args) {
		DropDownListNotInSelecttag_AnotherWay select=new DropDownListNotInSelecttag_AnotherWay();
		select.selectDropDownOptions("Nepal");

	}
	public String selectDropDownOptions(String country)
	{
		WebDriver set=getdriver();
		set.get("https://www.airvistara.com/fr/en");
		set.manage().window().maximize();
		set.findElement(By.xpath("//img[contains(@src,'dropdown')]")).click();
		
		List<WebElement> countries=set.findElements(By.xpath("//ul[@id='country-scroll']//li/span"));
		for(WebElement cont:countries)
		{
			if(cont.getText().equalsIgnoreCase(country))
				cont.click();	
		}
		return country;
	}
	public WebDriver getdriver()
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;	}

}
