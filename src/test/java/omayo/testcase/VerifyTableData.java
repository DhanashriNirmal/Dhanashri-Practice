package omayo.testcase;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.testng.annotations.Test;

import utilities.Utility;

public class VerifyTableData extends BestTest{
	@Test
	public void verifyTableData()
	{
		//This is compare table data
		ArrayList<String> expectedTableData=new ArrayList<String>();
		expectedTableData.add("Kishore");
		expectedTableData.add("22");
		expectedTableData.add("Delhi");
		expectedTableData.add("Manish");
		expectedTableData.add("25");
		expectedTableData.add("Pune");
		expectedTableData.add("Praveen");
		expectedTableData.add("29");
		expectedTableData.add("Bangalore");
		expectedTableData.add("Dheepthi");
		expectedTableData.add("31");
		expectedTableData.add("Mumbai");
		
		assertEquals(Utility.getAllData(driver, "//table[@id='table1']/tbody/tr//td"), expectedTableData);
	}
}
