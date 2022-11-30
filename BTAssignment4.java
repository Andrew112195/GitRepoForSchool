//Assignment 4 Andrew Shapiro
//BinaryTree Class is modified to include NodeCount LeavesCount SingleParents SwapTrees and nodeHeight
//Used all three traversal methods in the BinaryTree Class to add the functions for practice
import java.util.Random;
import java.util.Scanner;

public class BTAssignment4{

	public static void main(String[] args) {
			Random rand = new Random();
			
			BinarySearchTree test = new BinarySearchTree();		
			int flag = 0;
			System.out.println("Please add integers to add to the binary tree. To end enter -999.");

			while(flag != 30){
				int intToInsert = rand.nextInt(10000);
				IntElement node = new IntElement(intToInsert);
				test.insert(node);
			}
			
		test.preorderTraversal();
		test.postorderTraversal();
		System.out.println("Total Nodes: " + test.treeNodeCount());
		System.out.println("Total Leaf Nodes: " + test.treeLeavesCount());
		System.out.print("Inorder Traversal Before Swap: ");  test.inorderTraversal(); System.out.println();//for newline
		test.swapTree();
		System.out.print("Inorder Traversal After Swap: ");  test.inorderTraversal(); System.out.println(); // for newline
		System.out.print("Nodes With Only 1 Child: "); test.singleParents(); System.out.println(); //for newline
		test.nodeHeightPreOrdered();
		

	}

}
