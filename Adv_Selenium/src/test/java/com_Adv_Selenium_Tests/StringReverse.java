package com_Adv_Selenium_Tests;

import java.util.Scanner;

import org.testng.annotations.Test;

public class StringReverse {
	@Test
	public static void main(String[] args){ 
		/*
		 * Scanner sc=new Scanner(System.in); String str = sc.nextLine();
		 * 
		 * //Solution 1. int l=str.length(); String reverse=""; for(int i=l-1;i>=0;i--)
		 * reverse= reverse + str.charAt(i); System.out.println(reverse);
		 */
		//Soultion 2. 
/* 
		StringBuilder sb= new StringBuilder(str); 
		reverse = sb.reverse().toString(); 
		System.out.println(reverse); 
*/ 
		
		String str = " i am Archana";
		int length = str.length();
		String reverse =" ";
		for (int i=length-1;i>=0;i--)
		{
			reverse += str.charAt(i);
		}
		System.out.println(reverse);
		
	}

}
