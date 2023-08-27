package omayo.testcase;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import omayoblog.pages.HomePage;
import omayoblog.pages.Selenium143Page;
import utilities.Utility;

public class VerifyPageNavigation extends BestTest {
	HomePage page;
	Selenium143Page selenium143Page;
	@Test
	public void verifyPageNavigation() {
		page = new HomePage(driver);
		selenium143Page = new Selenium143Page(driver);
		page.clickOnThisBlogIsCreatedForLink();
		String parentWindowhandle=Utility.switchToNewWindow(driver);
		assertEquals(selenium143Page.getWhatIsSeleniumLinkText(), "What is Selenium?");
		driver.close();
		Utility.switchToWindow1(driver, parentWindowhandle);
		assertEquals(driver.getTitle(), "omayo (QAFox.com)");


	}

}
