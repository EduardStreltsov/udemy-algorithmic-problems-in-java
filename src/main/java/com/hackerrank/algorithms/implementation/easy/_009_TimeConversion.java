package com.hackerrank.algorithms.implementation.easy;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _009_TimeConversion {
	
	private static String convertTime(String s) {
		DateFormat inputDateFormat = new SimpleDateFormat("hh:mm:ssaa");
		DateFormat outputDateFormat = new SimpleDateFormat("HH:mm:ss");
		try {
			Date date = inputDateFormat.parse(s);
			return outputDateFormat.format(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public static void main(String[] args) {
		System.out.println(convertTime("07:05:45PM"));
	}
	
}
