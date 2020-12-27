package com_Selenium_Basic;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NonHtmlScreenShotTest
{
	@Test
	public void nonHtmlScreenShot() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("wdgt-file-upload")).click();
		
		Thread.sleep(2000);
		Robot r  = new Robot();
		//get screen size 
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(d);
		BufferedImage img = r.createScreenCapture(rect);
		ImageIO.write(img, "png", new File("./demoA.png"));
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
