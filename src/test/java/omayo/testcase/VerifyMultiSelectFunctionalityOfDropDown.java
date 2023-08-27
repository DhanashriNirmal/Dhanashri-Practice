package omayo.testcase;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

import omayoblog.pages.HomePage;
import utilities.Utility;

public class VerifyMultiSelectFunctionalityOfDropDown extends BestTest {
	
	HomePage page;
	@Test
	public void verifyMultiSelectFunctionalityOfDropDown()
	{
		page=new HomePage(driver);
		String options[]= {"Audi","Volvo"};
		ArrayList<String> selectOptions=Utility.selectOptionFromDropDown(page.getMultiSelectDropDownLocator(), options);
		assertEquals(selectOptions, Arrays.asList("Volvo","Audi"));
	}
	

}
