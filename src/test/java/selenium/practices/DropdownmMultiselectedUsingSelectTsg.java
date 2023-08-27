package selenium.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownmMultiselectedUsingSelectTsg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement multiDropdown=driver.findElement(By.xpath("//select[@id='multiselect1']"));
		Select multiDropdownList=new Select(multiDropdown);
		
		System.out.println(multiDropdownList.isMultiple());
		multiDropdownList.selectByIndex(2);
		multiDropdownList.selectByValue("swiftx");
		multiDropdownList.selectByVisibleText("Audi");
		
		List<WebElement> options=multiDropdownList.getOptions();
		for(WebElement element:options)
		{
			System.out.println(element.getText());
		}
		System.out.println("==========================================================\n");
		System.out.println(multiDropdownList.getFirstSelectedOption());
		System.out.println("==========================================================\n");
		List<WebElement> allOption=multiDropdownList.getAllSelectedOptions();
		for(WebElement opt:allOption)
		{
			System.out.println(opt.getText());
		}
		multiDropdownList.deselectByIndex(2);
		multiDropdownList.deselectByValue("swiftx");
		multiDropdownList.deselectByVisibleText("Audi");
		System.out.println("==========================================================");
		multiDropdownList.selectByIndex(1);
		multiDropdownList.selectByValue("Hyundaix");
		multiDropdownList.selectByVisibleText("Audi");
		multiDropdownList.deselectAll();	
	}

}
