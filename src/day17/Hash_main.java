package day17;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Hash_main {
	/**
	 * Main method to get the input from the file
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;
		Hash_func hf = new Hash_func();
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
		        int len = arr.length;
		        hf.insert(arr,len);
		    }
			
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		
		System.out.println("Enter the number to search");
		int num = sc.nextInt();
		hf.search(num);
		sc.close();

	}

}
