package com_Adv_Selenium_Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com_Adv_Selenium_Pages.EnterTimeTrackPage;
import com_Adv_Selenium_Pages.LoginPage;
import com_Adv_Selenium_Pages.ReportsPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
	@Test
	public void testA() throws InterruptedException
	{
		//WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.actitime.com/reports/reports.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPage lp = new LoginPage(driver);
		EnterTimeTrackPage et = new EnterTimeTrackPage(driver);
		ReportsPage rp = new ReportsPage(driver);
		lp.enterUserName("admin");
		lp.enterPassword("manager");
		lp.clickOnLogin();
		rp.clickOnTimeTrack();
		et.clickOnNew();
		et.clickOnDropDown();
		et.enterCustomerName("Amazon");
		et.enterProjectName("Dresses");
		et.clickOnNewTask();
		et.enterNewTask("aaaaa");
		et.clickOnDeadLine();
		et.clickOnCreateTask();
		//et.clickOnHelpButton();
		//et.clickOnContactSupport();
		//et.clickOnAttach();
		//Thread.sleep(1000);
		//et.uploadFile("C:\\Users\\apple\\Desktop\\GoToWebinar 000.png");
		
		Thread.sleep(2000);
		//driver.close();
	}
}
