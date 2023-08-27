package omayo.testcase;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import utilities.Utility;

public class VerifyElementText extends BestTest {
	@Test
	public void verifyElementText()
	{
		assertEquals(Utility.getElementText(driver, "//button[text()='Submit']"),"Submit");
	}

}
