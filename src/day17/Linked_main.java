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
	
	/**
	 * Main function to read the input from the user.
	 * @param args
	 */
	public static void main(String[] args) {
		String line;
		Linked_func lf=new Linked_func();
		boolean flag=true;
		

		try (
		    InputStream fis = new FileInputStream("D:\\Bridge\\test.txt");
		    InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
		    BufferedReader br = new BufferedReader(isr);
		){
		while ((line = br.readLine()) != null) {
	        String[] words = line.split(" ");
	        System.out.println(words.length);
	        for (int i=0; i<words.length;i++) {
	        	lf.add(words[i]);
	        }
	    }
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		/**
		 * Getting the value to search from the user as input.
		 */
		while(flag) {
			System.out.println("1.Enter a word to search\n2.exit and print the linked list");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the word");
				String ch = sc.next();
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
