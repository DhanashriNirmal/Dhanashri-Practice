package b6.testcases;

import org.testng.annotations.Test;

public class TestNgGroups {
	@Test(groups = {"smoke"})
	public void test1() {
		System.out.println("test 1");
	}

	@Test(groups = {"sanity","Regression"})
	public void ab() {
		System.out.println("ab");
	}

	@Test(groups = {"sanity"})
	public void cd() {
		System.out.println("cd");
	}

	@Test(groups = {"Regrassion"})
	public void xy() {
		System.out.println("xy");
	}

}
