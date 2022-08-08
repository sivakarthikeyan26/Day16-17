package day17;

import java.util.Scanner;

public class Anagram {
	static boolean flag=false;
	/**
	 * Function to swap the characters
	 * @param a
	 * @param i
	 * @param j
	 * @return
	 */
	
	public static String swapString(String a, int i, int j) {
        char[] b =a.toCharArray();  
        char ch;  
        ch = b[i];  
        b[i] = b[j];  
        b[j] = ch;
        return String.valueOf(b);
    }
	
	/**
	 * Function to generate the permutation
	 * @param str
	 * @param start
	 * @param end
	 * @param temp
	 * @return
	 */
	public static boolean generatePermutation(String str, int start, int end, String temp)  
    {  
        /**
         * For checking whether the string is anagram.
         */
        if (start == end-1) {  
            if(str.equals(temp)) {
            	flag=true;
            }
        }
        else  
        {  
            for (int i = start; i < end; i++)  
            {  
                //Swapping the string by fixing a character  
                str = swapString(str,start,i);  
                //Recursively calling function generatePermutation() for rest of the characters   
                generatePermutation(str,start+1,end,temp);  
                //Backtracking and swapping the characters again.  
                str = swapString(str,start,i);  
            }  
        }  
        return flag;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		System.out.println("enter the second string");
		String temp = sc.next();
        int len = str.length();  
        boolean result=generatePermutation(str, 0, len,temp);  
        if(result) {
        	System.out.println("String is a anagram");
        }
        else {
        	System.out.println("String is not anagram");
        }
        sc.close();

	}
}
