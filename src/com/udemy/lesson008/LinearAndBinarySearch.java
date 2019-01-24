package com.udemy.lesson008;

public class LinearAndBinarySearch {
	
	public static int linearSearch(int[] array, int item) {
		return 0;
	}
	
	public static int binarySearch(int[] array, int item) {
		return binarySearch(array, 0, array.length-1, item);
	}
	
	private static int binarySearch(int[] array, int startIndex, int endIndex, int item){
		if (endIndex < startIndex) {
			System.out.println("The item is not present in the array");
			return -1;
		}
		
		int middleIndex = (startIndex + endIndex) / 2;
		
		if (item == array[middleIndex]) {
			return middleIndex;
		} else if (item < array[middleIndex]) {
			return binarySearch(array, startIndex, middleIndex-1, item);
		} else {
			return binarySearch(array, middleIndex + 1, endIndex, item);
		}
	}
	
	public static void main(String[] args) {
		
		int[] array = {1,5,3,8,9,10,-3};
		
		System.out.println(binarySearch(array,1));
		System.out.println(binarySearch(array,5));
		System.out.println(binarySearch(array,3));
		System.out.println(binarySearch(array,8));
		System.out.println(binarySearch(array,9));
		System.out.println(binarySearch(array,10));
		System.out.println(binarySearch(array,-3));
	}
}
