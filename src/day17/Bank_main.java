package day17;

import java.util.Scanner;

public class Bank_main {
	public static Scanner sc = new Scanner(System.in);
	
	/**
	 * main function to ask for the choice to the user.
	 * @param args
	 */
	public static void main(String[] args) {
		Bank_func bf = new Bank_func();
		boolean flag=true;
		while(flag) {
			System.out.println("1.Add person to the queue\n2.Perform simulation\n3.exit program");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				bf.add();
				break;
			case 2:
				bf.dequeue();
				break;
			case 3:
				flag=false;
				}
			}
		}

	}

