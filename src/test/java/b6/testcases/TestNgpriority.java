package b6.testcases;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgpriority {
	@Test(priority = 2)             //lowest no =highest priority
									//highest no=lowest priority
	public void test1()
	{
		System.out.println("test 1");
	}
	@Test(priority = 1)
	public void ab()
	{
		System.out.println("ab");
	}
	@Test(priority = 5)
	public void cd()
	{
		System.out.println("cd");
	}
	@Test(priority = -1)
	public void xy()
	{
		System.out.println("xy");
	}
	

}
