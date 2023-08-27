package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Utility {
	
	public WebDriver getdriver() throws IOException {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(Utility.getProperty("url"));
		driver.manage().window().maximize();
		return driver;
		
	}
	public static String getProperty(String key) throws IOException {
		File file = new File("src/test/resources/Data/Master.properties");
		FileInputStream fileInputStream = new FileInputStream(file);// for read the file

		Properties properties = new Properties();
		properties.load(fileInputStream);// load the file properties

		return properties.getProperty(key);

	}

	public static void main(String args[]) throws IOException {

		File file = new File("src/test/resources/Data/UserData.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);// for read the file

		XSSFWorkbook xssfworkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = xssfworkbook.getSheet("Sheet1");
		int lastrow = sheet.getLastRowNum();
		for (int i = 1; i <= lastrow; i++)
		{
			XSSFRow row = sheet.getRow(i);
			int lastCell = row.getLastCellNum();
			for (int j = 0; j < lastCell; j++)
			{
				System.out.println(row.getCell(j).getStringCellValue()+" ");
			}
			System.out.println();
		}

	}
	public static ArrayList<String> selectOptionFromDropDown(WebElement dropdown,String[] options)
	{
		Select select =new Select(dropdown);
		ArrayList<String> selectedOptions=new ArrayList<>();
		for(String option:options)
		{
			select.selectByVisibleText(option);
		}
		List<WebElement> selectedOptionsByLogic=select.getAllSelectedOptions();
		for(WebElement element:selectedOptionsByLogic)
		{
			selectedOptions.add(element.getText());
		}
		return selectedOptions;
	}
	public static  String switchToNewWindow(WebDriver driver)
	{
		String currentWindowhandle=driver.getWindowHandle();
		Set<String> allWindowhandles=driver.getWindowHandles();
		for(String handle:allWindowhandles)
		{
			if(!(handle.equals(currentWindowhandle)))
			{
				driver.switchTo().window(handle);
			}
			
		}
		return currentWindowhandle;
	}
	public static void switchToWindow1(WebDriver driver,String windowHandle)
	{
		driver.switchTo().window(windowHandle);
	}
	public static ArrayList<String> getAllData(WebDriver driver,String table)
	{
		List<WebElement>tableOptions=driver.findElements(By.xpath(table));
		ArrayList<String> alltableData=new ArrayList<String>();
		for(WebElement td:tableOptions)
		{
			alltableData.add(td.getText());
		}
		return alltableData;
	}
	public static boolean checkBtnIsEnable(WebDriver driver,String btn)
	{
		boolean btnStatus= driver.findElement(By.xpath(btn)).isEnabled();
		
		return btnStatus;
	}
	public static String getElementText(WebDriver driver,String btn)
	{
		return driver.findElement(By.xpath(btn)).getText();
		
		
	}
	
}
