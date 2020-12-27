package com_Adv_Selenium_Pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage
{
	//declaration
	@FindBy(xpath="(//div[@class='menu_icon'])[4]")
	private WebElement  helpBT;
	
	@FindBy(linkText = "Contact actiTIME Support")
	private WebElement contactBT;
	
	@FindBy(xpath = "//div[@class='icon dz-clickable']")
	private WebElement attachBT;
	
	@FindBy(xpath = "//div[@id='addTaskButtonId']")
	private WebElement newTask;
	
	@FindBy(xpath = "(//div[@class='dropdownButton'])[5]")
	private WebElement selectDD;
	
	@FindBy(xpath = "//div[text()='- New Customer -']")
	private WebElement newCustomer;
	
	@FindBy(xpath = "//input[@placeholder = 'Enter Customer Name']")
	private WebElement customerName;
	
	@FindBy(xpath = "//input[@placeholder = 'Enter Project Name']")
	private WebElement projectName;
	
	@FindBy(xpath = "//div[text() = 'Add new row']")
	private WebElement newTaskRow;
	
	@FindBy(xpath = "(//input[@placeholder='Enter task name'])[1]")
	private WebElement enterTaskName;
	
	@FindBy(xpath = "//button[@id='ext-gen64']")
	private WebElement deadLine;
	
	@FindBy(xpath = "//div[text() = 'Create Tasks']")
	private WebElement createTaskBN;
	
	//initilaztion
	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void clickOnHelpButton()
	{
		helpBT.click();
	}
	
	public void clickOnContactSupport()
	{
		contactBT.click();
	}
	
	public void clickOnAttach()
	{
		attachBT.click();
	}

	
	public void uploadFile(String file_path)
	{
		//for copying the file
		StringSelection file = new StringSelection(file_path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file ,null);
		
		//pasting the link 
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			Thread.sleep(1000);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void clickOnNew()
	{
		newTask.click();
	}
	
	public void clickOnDropDown()
	{
		selectDD.click();
		newCustomer.click();
	}
	
	public void enterCustomerName(String cName)
	{
		customerName.sendKeys(cName);
	}
	
	public void enterProjectName(String pName)
	{
		projectName.sendKeys(pName);
	}
	
	public void clickOnNewTask()
	{
		newTaskRow.click();
	}
	
	public void enterNewTask(String task)
	{
		enterTaskName.sendKeys(task);
		
	}
	
	public void clickOnDeadLine()
	{
		deadLine.click();
	}
	
	public void clickOnCreateTask()
	{
		createTaskBN.click();
	}
	
}
