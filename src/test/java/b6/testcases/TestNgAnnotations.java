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

public class TestNgAnnotations {
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
		
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
		
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before TestPlan");
		
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
		
	}
	@Test
	public void test1()
	{
		System.out.println("Test Case 1");
		
	}
	@Test
	public void test2()
	{
		System.out.println("Test Case 2");
		
	}

	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
		
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
		
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
		
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After Method");
		
	}

}
