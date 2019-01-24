package com.udemy.lesson007;

public class EuclideanAlgorithm {
	
	public static int calculateRecursive(int n1, int n2) {
		if (n2 == 0) return n1;
		return calculateRecursive(n2, n1 % n2);
	}
	
	public static int calculateIterative(int n1, int n2) {
		int tmp = 0;
		while (n2 > 0) {
			tmp = n2;
			n2 = n1 % n2;
			n1 = tmp;
		}
		return n1;
	}
	
	public static void main(String[] args) {
//		System.out.println(calculateRecursive(1,5));
//		System.out.println(calculateRecursive(6,9));
//		System.out.println(calculateRecursive(28,24));
//		System.out.println(calculateRecursive(28,24));
//
//		System.out.println(calculateIterative(1,5));
//		System.out.println(calculateIterative(6,9));
//		System.out.println(calculateIterative(28,24));
		System.out.println(calculateIterative(30,100));
	}
	
}
