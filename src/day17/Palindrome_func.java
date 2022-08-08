package day17;

import java.util.Scanner;

public class Palindrome_func {
	Palindrome_node head;
	Scanner sc = new Scanner(System.in);
	/**
	 * Method to get the string from the user
	 */
	public void compute() {
		System.out.println("enter the string :");
		String ch = sc.next();
		String[] arr = ch.split("");
		addEle(arr,ch);
	}
	/**
	 * method to pass the character to add it to node
	 * @param arr
	 * @param ch
	 */
	public void addEle(String[] arr, String ch) {
		for(int i=0; i<arr.length; i++) {
			Enqueue(arr[i]);
		}
		check(ch);
	}
	/**
	 * Method to add the element to node
	 * @param str
	 */
	public void Enqueue(String str) {
		Palindrome_node newnode = new Palindrome_node(str);
		if(head==null) {
			head=newnode;
		}
		else {
			head.next=newnode;
			newnode.prev=head;
			head=newnode;
		}
	}
	
	/**
	 * Method to check whether it is a palindrome
	 * @param ch
	 */
	public void check( String ch) {
		StringBuilder sb = new StringBuilder();
		Palindrome_node temp = head;
		while(temp.prev!=null) {
			sb.append(temp.value);
			temp=temp.prev;
		}
		sb.append(temp.value);
		String t= sb.toString();
		System.out.println(t);
		if(t.equals(ch)) {
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
}
