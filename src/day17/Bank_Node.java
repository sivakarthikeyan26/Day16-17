package day17;

public class Bank_Node {
	public String action;
	public int money;
	Bank_Node next;
	
	/**
	 * Constructer to create the people in the queue
	 * @param act
	 * @param mon
	 */
	public Bank_Node(String act, int mon) {
		this.action=act;
		this.money=mon;
	}
}
