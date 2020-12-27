package com_Selenium_Basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromJavaProperties
{

	@Test
	public void readData() throws Exception
	{
		//create and read data
		File f= new File("./src/test/resources/Data/input.properties");
		FileInputStream fio = new FileInputStream(f);
		//create the object for properties class
		Properties p = new Properties();
		//load the file 
		p.load(fio);
		//get the data
		String url = p.getProperty("url");
		String un = p.getProperty("un");
		String pwd = p.getProperty("pw");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(1000);
		driver.close();
		
		
	}
}
