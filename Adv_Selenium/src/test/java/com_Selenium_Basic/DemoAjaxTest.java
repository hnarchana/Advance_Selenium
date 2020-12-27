package com_Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAjaxTest {

	@Test
	public void testA() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.plus2net.com/jquery/msg-demo/dropdown3.php");
		WebElement country = driver.findElement(By.id("country_code"));
		WebElement state = driver.findElement(By.id("state_id"));
		WebElement city = driver.findElement(By.id("city_id"));
		Select countryList = new Select(country);
		Select stateList = new Select(state);
		Select cityList = new Select(city);
		
		Thread.sleep(1000);
		countryList.selectByIndex(3);
		Thread.sleep(1000);
		stateList.selectByIndex(3);
		Thread.sleep(1000);
		cityList.selectByIndex(3);
		Thread.sleep(1000);
		
		driver.close();
		
	}
}
