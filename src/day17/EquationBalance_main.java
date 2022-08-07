package day17;

import java.util.Scanner;

public class EquationBalance_main {
	static NodeEq result;
	/**
	 * Main function to get input from the user
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the equation to check");
		String eq = sc.next();
		String[] arr = eq.split("");
		EquationBalance_func ef = new EquationBalance_func();
		for (int i = 0; i < eq.length(); i++) {
			if (arr[i].equals("(") || arr[i].equals(")") || arr[i].equals("{") || arr[i].equals("}")
					|| arr[i].equals("[") || arr[i].equals("]")) {
				result = ef.check(arr[i]);
			}
		}
		if (result == null) {
			System.out.println("equation is balanced");
			ef.display();
		} else {
			System.out.println("equation is not balanced");
			ef.display();
		}
		sc.close();

	}

}
