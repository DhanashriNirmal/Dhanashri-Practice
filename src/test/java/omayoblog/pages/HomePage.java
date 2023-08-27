package omayoblog.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	WebElement multiselectDropDown;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement getMultiSelectDropDownLocator()
	{
		return driver.findElement(By.xpath("//select[@id='multiselect1']"));	
	}
	public WebElement clickOnThisBlogIsCreatedForLink()
	{
		return driver.findElement(By.xpath("//a[@id='selenium143']"));
	}
	
	

}
