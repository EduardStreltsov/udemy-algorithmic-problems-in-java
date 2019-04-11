package com.hackerrank.algorithms.easy;

import java.util.ArrayList;
import java.util.List;

public class _002_CompareTheTriplets {
	
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> results = new ArrayList<Integer>();
		results.add(0);
		results.add(0);
		for (int i = 0; i < 3; i++) {
			if (a.get(i) > b.get(i)) {
				results.set(0, 1 + results.get(0));
			} else if (a.get(i) < b.get(i)) {
				results.set(1, 1 + results.get(1));
			}
		}
		return results;
	}
}
