package day17;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Linked_main {
	public static final Scanner sc = new Scanner(System.in);
	static Linked_func lf=new Linked_func();
	/**
	 * method to sor the array.
	 * @param arr
	 */
	public static void sort(int[] arr) {
		boolean sorted = false;
	    int temp;
	    while (!sorted) {
	        sorted = true;
	        for (int i = 0; i < arr.length - 1; i++) {
	            if (arr[i]>arr[i+1]) {
	                temp = arr[i];
	                arr[i] = arr[i+1];
	                arr[i+1] = temp;
	                sorted = false;
	            }
	        }
	    }
	    for (int i = 0; i < arr.length; i++) {
	    	lf.add(arr[i]);
	    }
	}
	
	/**
	 * Main function to read the input from the user.
	 * @param args
	 */
	public static void main(String[] args) {
		String line;
		boolean flag=true;
		

		try (
		    InputStream fis = new FileInputStream("D:\\Bridge\\test2.txt");
		    InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
		    BufferedReader br = new BufferedReader(isr);
		){
		while ((line = br.readLine()) != null) {
	        String[] words = line.split(" ");
	        int[] arr = new int[words.length];
	        for (int i=0; i<words.length;i++) {
	        	arr[i]=Integer.parseInt(words[i]);
	        }
	        sort(arr);
	    }
		
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		/**
		 * Getting the value to search from the user as input.
		 */
		
		while(flag) {
			System.out.println("1.Enter a nuber to search\n2.exit and print the linked list");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the number");
				int ch = sc.nextInt();
				lf.search(ch);
				break;
			case 2:
				lf.display();
				flag=false;
				break;
			}
		}

	}

}
