package day17;

import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort {
	/**
	 * function to sort the adjacent elements.
	 */
	public static void bubbleSort(String[] array) {
	    boolean sorted = false;
	    String temp;
	    while (!sorted) {
	        sorted = true;
	        for (int i = 0; i < array.length - 1; i++) {
	            if (array[i].compareTo(array[i+1])>0) {
	                temp = array[i];
	                array[i] = array[i+1];
	                array[i+1] = temp;
	                sorted = false;
	            }
	        }
	    }
	}
	/**
	 * main method to initialize the string array from the user and sort.
	 */
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the no of elemets");	
	int n= sc.nextInt();
	String[] array = new String[n];
	System.out.println("enter the elemets");
	for (int i=0;i<n;i++) {
		String ch= sc.next();
		array[i]=ch;
	}
	bubbleSort(array);
	System.out.println(Arrays.toString(array));
	sc.close();

	}

}
