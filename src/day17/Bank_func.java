package day17;

public class Bank_func {
	Bank_Node head;
	private int bank_balance=1000000;
	/**
	 * function to add n no of persons.
	 */
	public void add() {
		System.out.println("Enter the no of persons to add");
		int n = Bank_main.sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("enter the person "+(i+1)+" deposit or withdraw");
			String ch = Bank_main.sc.next();
			if(ch.equals("withdraw")) {
				System.out.println("Enter the amount to withdraw");
				int amt = Bank_main.sc.nextInt();
				enqueue("withdraw",amt);
			}
			else if(ch.equals("deposit")) {
				System.out.println("Enter the amount to deposit");
				int amt = Bank_main.sc.nextInt();
				enqueue("deposit",amt);
			}
			
		}
	}
	/**
	 * Function to add the persons in the queue
	 * @param ch
	 * @param amt
	 */
	public void enqueue(String ch, int amt) {
		Bank_Node newnode =  new Bank_Node(ch,amt);
		if(head==null) {
			head=newnode;
		}
		else {
			Bank_Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
		}
	}
	/**
	 * function to dequeue to persons from the queue according to the withdraw and deposit parameter
	 */
	public void dequeue() {
		while(head!=null) {
			Bank_Node temp=head;
			if(temp.next!=null) {
				if(temp.action.equals("withdraw")) {
					bank_balance-=temp.money;
					Bank_Node prev=temp;
					temp=temp.next;
					prev.next=null;
					head=temp;
				}
				else if(temp.action.equals("deposit")) {
					bank_balance+=temp.money;
					Bank_Node prev=temp;
					temp=temp.next;
					prev.next=null;
					head=temp;
				}
			}
			else {
				System.out.println("inside head");
				System.out.println(head.action);
				if(head.action.equals("withdraw")) {
					bank_balance-=head.money;
					head=null;
				}
				else if(head.action.equals("deposit")) {
					System.out.println("inside deposit");
					bank_balance+=head.money;
					head=null;
				}
			}
		}
		System.out.println("Simulation is completed and the bank balance is = "+bank_balance);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
