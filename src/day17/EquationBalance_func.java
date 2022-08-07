package day17;

import java.util.Dictionary;
import java.util.Hashtable;

public class EquationBalance_func {
	NodeEq head;
	Dictionary<String, String> dict = new Hashtable<String, String>();
	/**
	 * intializing the constructor with the brackets
	 */
	public EquationBalance_func() {
		dict.put(")", "(");
		dict.put("}", "{");
		dict.put("]", "[");
	}
	/**
	 * Method to check the stack to pop the elements if a match is found.
	 * @param str
	 * @return
	 */
	public NodeEq check(String str) {
		int count = 0;
		/*
		 * if stack is empty then insert the element.
		 */
		if (head == null) {
			NodeEq newnode = new NodeEq(str);
			head = newnode;
		} 
		/**
		 * if it is not empty then traverse till last to get the top node and check for
		 */
		else {
			NodeEq temp = head;
			NodeEq prev = temp;
			while (temp.next != null) {
				prev = temp;
				temp = temp.next;
				count++;
			}
			String t = dict.get(str);
			/*
			 * checking if the top of the stack matches the case
			 */
			if (count > 0) {
				if (t != null) {
					if (t.equals(temp.value)) {
						prev.next = null;
					}
				}else {
					NodeEq newnode = new NodeEq(str);
					temp.next=newnode;
				}
					/*
					 * checking if the head value matches the case.
					 */
			} else {
				if (t != null) {
					if (t.equals(head.value)) {
						head = null;
					}
				}
				else {
					NodeEq newnode = new NodeEq(str);
					temp.next=newnode;
				}

			}
		}
		return head;
	}
	
	/**
	 * Method to display the stack
	 */
	public void display() {
		if (head != null) {
			NodeEq temp = head;
			while (temp.next != null) {
				System.out.print(" " + temp.value);
				temp = temp.next;
			}
			System.out.print(" " + temp.value);
		} else {
			System.out.println("stack is empty is empty");
		}
	}
}
