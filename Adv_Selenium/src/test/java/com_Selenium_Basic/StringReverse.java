package com_Selenium_Basic;

import org.testng.annotations.Test;

public class StringReverse {

	
	public static void Test(String[] args) {
		// TODO Auto-generated method stub

		String s = "i am archana";
		String rev = " ";
		int length=s.length();
		for(int i=length-1;i>=0;i--)
		{
			 rev+=s.charAt(i);
		}
		System.out.println(rev);
	}

}
