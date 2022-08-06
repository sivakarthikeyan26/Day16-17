package day17;

public class Linked_func {
	Linked_node head;
	boolean flag=false;
	
	/*
	 * Method to add the value to linked list.
	 */
	public void add(String value) {
		if(head!=null) {
			Linked_node newnode =  new Linked_node(value);
			Linked_node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
		}
		else {
			Linked_node newnode =  new Linked_node(value);
			head=newnode;
		}
	}
	
	/**
	 * Method to search for the value and delete the word if it is present in the linked list.
	 * @param value
	 */
	public void search(String value) {
		/*
		 * deleting if the value is present is the head node.
		 */
		if(head!=null) {
			if(value.compareTo(head.val)==0) {
				flag=true;
				System.out.println("word found and deleting from list");
				Linked_node temp = head;
				Linked_node prev = temp;
				temp=temp.next;
				prev.next=null;
				head=temp;
				return;
			}
			/*
			 * deleting if the word is present in the middle of the linked list.
			 */
			else {
				Linked_node temp = head;
				Linked_node prev = temp;
				while(temp.next!=null) {
					if(value.compareTo(temp.val)==0) {
						flag=true;
						System.out.println("word found2 and deleting from list");
						prev.next=temp.next;
						return;
					}
					else {
						prev=temp;
						temp=temp.next;
					}
				}
				/*
				 * deleting if the word is present in the end of the linked list.
				 */
				if(value.compareTo(temp.val)==0) {
					flag=true;
					System.out.println("word found and deleting from list");
					prev.next=null;
					return;
				}
			}
			
		}
		else {
			System.out.println("list is empty");
		}
		/*
		 * adding the word to linked list if the word is not found in the list.
		 */
		if(flag==false) {
			System.out.println("word is not found in the list so the word is added to the liked list");
			add(value);
		}
		
	}
	
	/*
	 * function to display the linked list containing words.
	 */
	public void display() {
		if(head!=null) {
			Linked_node temp = head;
			while(temp.next!=null) {
				System.out.print(" "+temp.val);
				temp=temp.next;
			}
			System.out.print(" "+temp.val);
		}
		else {
			System.out.println("linked list is empty");
		}
	}
	
}
