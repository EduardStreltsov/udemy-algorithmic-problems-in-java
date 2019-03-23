package com.hackerrank.interview_preparation_kit._01_warm_up_challenges;

import java.util.HashMap;
import java.util.Map;

public class _001_SockMerchant {
	
	// Complete the sockMerchant function below.
	private static int sockMerchant(int n, int[] ar) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : ar) {
			Integer currentValue = map.get(i);
			map.put(i, currentValue == null ? 1 : ++currentValue);
		}
		int socks = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			socks += entry.getValue() - entry.getValue() % 2;
		}
		return socks/2;
	}
	
	public static void main(String[] args) {
		System.out.println(sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}));
	}
}
