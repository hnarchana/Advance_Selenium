package com_Adv_Selenium_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportsPage {
	
	@FindBy(linkText = "Time-Track")
	private WebElement ttBT;
	
	
	public ReportsPage(WebDriver driver)
	{
		 
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnTimeTrack()
	{
		ttBT.click();
	}
	

}
