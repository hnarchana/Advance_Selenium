package com_Selenium_Basic;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersTest.class)
public class DemoTest
{
	
	@Test
	public void testA()
	{
		Reporter.log("test methos A...", true);
	}

	@Test
	public void testB()
	{
		Reporter.log("test method B...", true);
		Assert.fail();
	}
}
