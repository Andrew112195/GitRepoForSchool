/*
 * Assignment 5
 * Author: Andrew Shapiro
 * Extended Binary tree reference from week 9 - 10
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Assignment5 extends BinarySearchTree{
	
	public static BinarySearchTree thisBST = new BinarySearchTree();	
	public static BinarySearchTree lessThan = new BinarySearchTree();	
	public static BinarySearchTree greaterThan = new BinarySearchTree();	
	/**
	 * 
	 * @param l lowest element for range
	 * @param w highest element for range
	 * @param pcurrent binary tree node for exploration
	 * This method will display items in range from l to w. Uses inorder traversal to output values in ascending order.
	 */
	public static void displayItemsInRange(IntElement l, IntElement w, BinaryTreeNode p) {
		if(p != null)
        {
			//this shall traverse left until reaching the lowest node in range
			if(p.info.compareTo(l) > 0) {
				displayItemsInRange(l, w, p.llink);
			}
			//this will explore each current node and print the data of the node
			if(p.info.compareTo(w) < 0 && p.info.compareTo(l) > 0) {
		        System.out.print(p.info + " ");
			}
			
			 displayItemsInRange(l, w, p.rlink);
			 
			}
        }
	/**
	 * 
	 * @param p current node for exploration
	 * @param theKey the key being compared to
	 * @param lessThan the binary tree holding the values lessthan the key
	 * @param greaterThan the binary tree holding the nodes greater than the key
	 * @return 
	 * @return returns either null upon not finding the key or returns the key if present in binary tree
	 * This method uses post order traversal to split the tree between the greater than or less than trees.
	 * postorder traversal should allow deleting pointers when each node is being explored.
	 */
	public static  DataElement split(BinaryTreeNode p, IntElement theKey, BinarySearchTree lessThan, BinarySearchTree greaterThan) {
		if(p != null) {
			split(p.llink, theKey, lessThan, greaterThan);
			split(p.rlink, theKey, lessThan, greaterThan);
			if(p.info.compareTo(theKey) < 0) {
				lessThan.insert(p.info);
			}
			if(p.info.compareTo(theKey) > 0) {
				greaterThan.insert(p.info);
			}
			 p.llink = null; p.rlink = null;
			
			if(p.info.equals(theKey)) {
				return p.info;
			}
			if (p.info.equals(thisBST.root.info)){
				thisBST.root = null;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		
		Random rand = new Random();
				
		ArrayList<Integer> noDupes =  new ArrayList<Integer>(30);
		
		int flag = 0;
		//generates 20 random integers that are not dublicates
		while(flag != 20){
			int intToInsert = rand.nextInt(100);
			if(!noDupes.contains(intToInsert)) { //checks for dupes
				noDupes.add(intToInsert);
				IntElement node = new IntElement(intToInsert);
				thisBST.insert(node);
				flag++;
			}
		}
		System.out.print("Original Binary Tree Nodes: "); thisBST.inorderTraversal();
		System.out.println();
		//l and w initialization
		IntElement l = new IntElement(20);
		IntElement w = new IntElement(70);
		//display method invocation
		System.out.print("Nodes In Range " + l.num + " - " + w.num + " Binary Tree Nodes: ");
		displayItemsInRange(l, w, thisBST.root);
		System.out.println(); //for new line
		IntElement key = new IntElement(45);   //key for split
		System.out.print("Present In Tree: ");System.out.println(split(thisBST.root, key, lessThan, greaterThan));
		System.out.print("Less Than " + key.num + " Binary Tree Nodes: ");lessThan.preorderTraversal();
		System.out.println();
		System.out.print("Greater Than " + key.num + " Binary Tree Nodes: ");greaterThan.preorderTraversal();
		System.out.println();
		System.out.print("New Original Binary Tree Nodes: ");thisBST.inorderTraversal();

	}
}
