package com.hackerrank;

import java.util.Arrays;

public class _000_LeftRotationOfArray {

    private static int getShiftedIndex(int lenght, int index, int shift) {
        if (shift == 0) {
            return index;
        }
        int shifted = index - shift;
        if (shifted < 0) {
            shifted = lenght - shifted;
        }
        return shifted;
    }

    private static int[] leftShift(int[] arr, int n) {

        if (n == arr.length) {
            return arr;
        }
        if (n > arr.length) {
            n = n % arr.length;
        }

        int[] buffer = new int[n-1];

        for (int i = arr.length - 1; i >= 0; i-=n) {
            for (int j = 0; j < n-1; j++) {
                int tmp = buffer[j];
                buffer[j] = arr[i-j];

                int shiftedIndex = i-n-j < 0 ? arr.length-1-i-n-j : i-n-j;
                arr[shiftedIndex] = tmp;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(leftShift(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, 2)));
    }
}
