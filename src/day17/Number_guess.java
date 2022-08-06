package day17;

import java.util.Scanner;

public class Number_guess {
	public static final Scanner sc = new Scanner(System.in);
	
	/**
	 * function to check if the user value matches
	 * @param size
	 * @param num
	 */
	public static void guessNumber(int size, int num) {
		boolean flag=true;
		System.out.println("Start to guess the number");
		while(flag) {
			System.out.println("guess the number");
			int ch =sc.nextInt();
			if(ch>num) {
				System.out.println("high value try to enter the lower value");
			}
			else if(ch<num) {
				System.out.println("low value try to enter the higher value");
			}
			else if(ch==num) {
				System.out.println("number found");
				flag=false;
			}
		}
	}
	
	/**
	 * main function to initialize the value from the user.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter the range");
		int n = sc.nextInt();
		System.out.println("Enter the no between 1-"+n);
		int number = sc.nextInt();
		guessNumber(n,number);

	}

}
