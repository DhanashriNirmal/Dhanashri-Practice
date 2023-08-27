package omayo.testcase;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import utilities.Utility;
	
public class VerifyCheckBtnEnable extends BestTest {
	@Test
	public void checkBtnEnable()
	{
		boolean status=Utility.checkBtnIsEnable(driver,"//button[text()='Button1']");
		assertEquals(status, false);
		
	}

}
