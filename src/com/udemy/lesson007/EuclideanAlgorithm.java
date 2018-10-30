package com.udemy.lesson007;

public class EuclideanAlgorithm {
	
	public static int calculateRecursive(int n1, int n2) {
		if (n2 == 0) return n1;
		return calculateRecursive(n2, n1 % n2);
	}
	
	public static void main(String[] args) {
		System.out.println(calculateRecursive(1,5));
		System.out.println(calculateRecursive(6,9));
		System.out.println(calculateRecursive(28,24));
	}
	
}
