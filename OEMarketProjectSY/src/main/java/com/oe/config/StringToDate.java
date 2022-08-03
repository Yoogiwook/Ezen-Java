package com.oe.config;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class StringToDate {

	
	public Date transformatDate(String date) {
		
		
		SimpleDateFormat beforeFormat = new SimpleDateFormat("yyyymmdd");
		SimpleDateFormat afterformat = new SimpleDateFormat("yyyy-mm-dd");
		
		java.util.Date temDate = null;
		
		try {
			temDate = beforeFormat.parse(date);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		String transDate = afterformat.format(temDate);
		
		Date d = Date.valueOf(transDate);
		
		return d;
			
	}
 }
