package com.real_interviews;

/*
Write a program that prints the numbers from 1 to 100.
But for multiples of three print “Freedom” instead of the number
and for the multiples of five print “Rocks”.
For numbers which are multiples of both three and five print “FreedomRocks"
*/

public class _002_FreedomRocks {
	
	static String getFreedomRocksString(int i) {
		String s = "";
		if (i % 3 == 0 || i % 5 == 0) {
			if (i % 3 == 0) {
				s = "Freedom";
			}
			if (i % 5 == 0) {
				s += "Rocks";
			}
		} else {
			s = String.valueOf(i);
		}
		return s;
	}
	
	private static void freedomRocks() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(getFreedomRocksString(i));
		}
	}
	
	public static void main(String[] args) {
		freedomRocks();
	}
}
