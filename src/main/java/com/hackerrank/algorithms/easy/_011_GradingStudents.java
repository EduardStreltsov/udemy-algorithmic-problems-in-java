package com.hackerrank.algorithms.easy;

import java.io.IOException;
import java.util.Scanner;

public class _011_GradingStudents {
	
	static int gradingStudent(int grade) {
		if (grade < 38) {
			return grade;
		}
		int over = (5 - grade % 5);
		if (over < 3) {
			grade += over;
		}
		return grade;
	}
	
	/*
	 * Complete the gradingStudents function below.
	 */
	static int[] gradingStudents(int[] grades) {
		for (int i = 0; i < grades.length; i++) {
			grades[i] = gradingStudent(grades[i]);
		}
		return grades;
	}
	
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		System.out.println(gradingStudent(38));
	}
	
}
