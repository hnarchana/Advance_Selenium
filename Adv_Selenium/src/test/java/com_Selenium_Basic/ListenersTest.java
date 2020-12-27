package com_Selenium_Basic;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class ListenersTest implements ITestListener
{
	public WebDriver driver;
	public void onStart(ITestContext arg0) 
	{
		Reporter.log("My test method started.." , true);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void onFinish(ITestContext arg0)
	{
		Reporter.log("My test method finished.." , true);
		driver.close();

	}
	
	public void onTestFailure(ITestResult arg0)
	{
		Reporter.log("get screen shot...", true);
		
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0)
	{
		
	}
	
	public void onTestSkipped(ITestContext arg0)
	{
		
	}
	
	public void onTestStart(ITestResult arg0)
	{
		Reporter.log("test method Started....",true);
	}

}
