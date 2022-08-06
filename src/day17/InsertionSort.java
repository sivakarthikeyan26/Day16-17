package day17;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/**
		 * declare an array and print the original contents
		 */
		System.out.println("Enter the no of elements");
		int n = sc.nextInt();
		String[] strArray = new String[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			String ch = sc.next();
			strArray[i]=ch;
		}
		System.out.println("Original Array:" + Arrays.toString(strArray));
		/**
		 * apply insertion sort algorithm on the array
		 */
		for (int k = 1; k < strArray.length - 1; k++) {
			String temp = strArray[k];
			int j = k - 1;
			while (j >= 0 && temp.compareTo(strArray[j])<0) {
				strArray[j + 1] = strArray[j];
				j = j - 1;
			}
			strArray[j + 1] = temp;
		}
		// print the sorted array
		System.out.println("Sorted Array:" + Arrays.toString(strArray));
		sc.close();
	}

}
