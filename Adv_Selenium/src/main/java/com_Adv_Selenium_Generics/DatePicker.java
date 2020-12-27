package com_Adv_Selenium_Generics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePicker {
	
	Date date = new Date();
	SimpleDateFormat s1 = new SimpleDateFormat("dd");
	String day = s1.format(date);

}
