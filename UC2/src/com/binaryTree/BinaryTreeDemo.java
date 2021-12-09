package com.binaryTree;
import java.util.Scanner;

public class BinaryTreeDemo {
	
	public static void main(String args[]) {
	            
	        Scanner scan = new Scanner(System.in);
	        /* Creating object of BT */
	        BinaryTreeServices bt = new BinaryTreeServices(); 
	            bt.insert(56);
	            bt.insert(30);
	            bt.insert(70);
	            
	            System.out.print("\n Binary Search Tree ");
	            System.out.print("\nPost order : ");
	            bt.postorder();
	            System.out.print("\nPre order : ");
	            bt.preorder();
	            System.out.print("\nIn order : ");
	            bt.inorder();
	            
	            System.out.println("\n Nodes = "+ bt.size());
	            
	}
}
	            
	           
  
