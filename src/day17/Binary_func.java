package day17;

import java.util.Stack;


public class Binary_func {
	Node root;
	public static boolean flag = false;  
	  /**
	   *  
	   * @param key
	   * Function to insert the key.
	   */
	  public void insert(String key){
	        Node node=new Node(key);
	        if(root==null) {
	            root = node;
	            return;
	        }
	        Node prev=null;
	        Node temp=root;
	        while (temp!=null){
	            if(key.compareTo(temp.val)<0){
	                prev=temp;
	                temp=temp.left;
	            }
	            else if (key.compareTo(temp.val)>0){
	                prev=temp;
	                temp=temp.right;
	            }
	            else if (key.compareTo(temp.val)==0){
	                prev=temp;
	                temp=temp.right;
	            }
	        }
	        if(key.compareTo(prev.val)<0)
	            prev.left=node;
	        else prev.right=node;
	    }
	  /**
	   * Function to print the tree in inorder
	   */
	  public void inorder(){
	        Node temp=root;
	        Stack<Node> stack=new Stack<>();
	        while (temp!=null||!stack.isEmpty()){
	            if(temp!=null){
	                stack.add(temp);
	                temp=temp.left;
	            }
	            else {
	                temp=stack.pop();
	                System.out.print(temp.val+" ");
	                temp=temp.right;
	            }
	        }
	    }
	  public void searchNode(Node temp, String val){  
	        //Check whether tree is empty  
	        if(root == null){  
	          System.out.println("Tree is empty");  
	        }  
	        else{  
	          //If value is found in the given binary tree then, set the flag to true  
	          if(val.compareTo(temp.val)==0){  
	            flag = true;  
	            System.out.println("\nfound");
	               return;  
	          }  
	          //Search in left subtree  
	          if(flag == false && temp.left != null){  
	             searchNode(temp.left, val);  
	          }  
	          //Search in right subtree  
	          if(flag == false && temp.right != null){  
	             searchNode(temp.right, val);  
	          }  
	        } 
	  }
}
