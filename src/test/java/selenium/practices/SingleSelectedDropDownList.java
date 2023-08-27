package selenium.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectedDropDownList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement singleDropdown= driver.findElement(By.xpath("//select[@id='drop1']"));
		Select singleDropdownList=new Select(singleDropdown);
		
		System.out.println(singleDropdownList.isMultiple());
		
		singleDropdownList.selectByIndex(1);
		singleDropdownList.selectByValue("ghi");
		singleDropdownList.selectByVisibleText("doc 3");
		
		System.out.println(singleDropdownList.getFirstSelectedOption().getText());
		List<WebElement> option=singleDropdownList.getOptions();
		for(WebElement opt:option)
		{
			System.out.println(opt.getText());
		}

	}

}
