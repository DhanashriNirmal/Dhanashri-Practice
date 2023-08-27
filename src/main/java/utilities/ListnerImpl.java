package utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerImpl implements ITestListener {
	public void OnTestStart(ITestResult result)
	{
		System.out.println("Test Case Started"+result.getName());
	}
	public void OnTestFailure(ITestResult result)
	{
		System.out.println("Test Case Failed"+result.getName());
	}
	
	
}