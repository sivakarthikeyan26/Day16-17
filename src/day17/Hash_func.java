package day17;

import java.util.ArrayList;

public class Hash_func {
	Hash_node head;
	ArrayList<Hash_node> lis = new ArrayList<Hash_node>();
	/**
	 * constructor to initialize the table.
	 */
	public Hash_func() {
		for(int i=0; i<=11; i++) {
			Hash_node newnode =  new Hash_node(i);
			lis.add(newnode);
		}
	}
	/**
	 * Method to accept the number and return the hash key
	 * @param n
	 * @return
	 */
	public int HashKey(int n) {
		return n%11;
	}
	
	/**
	 * Method to search for the value in the hashtable
	 * @param val
	 */
	public void search(int val) {
		int key=HashKey(val);
		for(Hash_node node : lis) {
			if(node.value==key) {
				head=node;
				Hash_node temp= head.next;
				System.out.println(temp.value);
				while(temp.next!=null) {
					if(temp.value==val) {
						System.out.println("number found");
						break;
					}
					temp=temp.next;
				}
				if(temp.next==null) {
					if(temp.value==val) {
						System.out.println("number found");
						break;
					}
				}
			}
		}
	}
	
	/**
	 * Method to insert the value into hash table.
	 * @param num
	 */
	public void insertHash(int num) {
		int key = HashKey(num);
		Hash_node newnode =  new Hash_node(num);
		if(lis!=null) {
			for(Hash_node node : lis) {
				if(node.value==key) {
					head=node;
					Hash_node temp= head;
					while(temp.next!=null) {
						temp=temp.next;
					}
					temp.next=newnode;
				}
			}
		}
	}
	/**
	 * starter method to fetch the value form the array param
	 * @param arr
	 * @param length
	 */
	public void insert(int[] arr, int length) {
		for(int i=0; i<length; i++) {
			insertHash(arr[i]);
		}
		
	}
}
