public class BinaryTree
{
         //Definition of the node
    protected class BinaryTreeNode
    {
        DataElement info;
        BinaryTreeNode llink;
        BinaryTreeNode rlink;
    } 
    
    protected BinaryTreeNode root;
    
       //default constructor 
       //Postcondition: root = null;
    public BinaryTree()  
    {
         root = null;
    }
       //copy constructor
    public BinaryTree(BinaryTree otherTree) 
    {
         if(otherTree.root == null) //otherTree is empty
            root = null;
         else
            root = copy(otherTree.root);
    }
       //Method to determine whether the binary tree is empty.
       //Postcondition: Returns true if the binary tree is empty;
       //               otherwise, returns false.  
    
    private int count;  //var used for both leaf and node count. 
    					//This will only populate when those two methods are called.
    
    public boolean isEmpty()
    {
         return (root == null);
    }
       //Method to do an inorder traversal of the binary tree.
       //Postcondition: The nodes of the binary tree are output
       //               in the inorder sequence.
    public void inorderTraversal()
    {
         inorder(root);
    }
       //Method to do a preorder traversal of the binary tree.
       //Postcondition: The nodes of the binary tree are output
       //               in the preorder sequence.
    public void preorderTraversal()
    {
         preorder(root);
    }
       //Method to do a postorder traversal of the binary tree.
       //Postcondition: The nodes of the binary tree are output
       //               in the postorder sequence.       
    public void postorderTraversal()
    {
         postorder(root);
    }
       //Method to determine the height of the binary tree.
       //Postcondition: The height of the binary tree is returned.    
    public int treeHeight()
    {
         return height(root);
    }
       //Method to determine the number of nodes in the 
       //binary tree.
       //Postcondition: The number of nodes in the binary tree
       //               is returned.       
    public int treeNodeCount()
    {
    	 count = 0;    // sets to zero in the case of other count method call
         return nodeCount(root);
    }
       //Method to determine the number of leaves in the 
       //binary tree.
       //Postcondition: The number of leaves in the binary tree
       //               is returned.       
    public int treeLeavesCount()
    {
    	 count = 0;    // sets to zero in the case of other count method call
         return leavesCount(root);
    }
       //Method to destroy the binary tree.
       //Postcondition: root = null     
    public void destroyTree()
    {
        root = null;
    }
        //Method to make a copy of the binary tree 
       //specified by otherTree points. 
       //Postcondition: A copy of otherTree is assigned to
       //               this binary tree.   
    public void copyTree(BinaryTree otherTree)
    { 
         
         if(this != otherTree) //avoid self-copy
         {
            root = null;   
    
            if(otherTree.root != null) //otherTree is nonempty
               root = copy(otherTree.root);
         }
    
    }
    public void nodeHeightPreOrdered() {
    	nodeHeightPreOrder(root);
    }
    //method for swapping the sub trees in a binary search tree. calls swaptrees to start the recursive calls.
    public void swapTree() {
    	
    	swapTrees(root);
    }
    
    public void singleParents() {
    	
    	singleParent(root);
    }
        //Method to make a copy of the binary tree to 
        //which otherTreeRoot points. 
        //Postcondition: A copy of the binary tree to which
        //               otherTreeRoot is created and the reference of
        //               the root node of the copied binary tree
        //               is returned.
    private BinaryTreeNode copy(BinaryTreeNode otherTreeRoot)
    {
         BinaryTreeNode temp;
         
         if(otherTreeRoot == null)
            temp = null;
         else
         {
            temp = new BinaryTreeNode();
            temp.info = otherTreeRoot.info.getCopy();
            temp.llink = copy(otherTreeRoot.llink);
            temp.rlink = copy(otherTreeRoot.rlink);
         }
         
         return temp;
    }//end copy
       //Method to do an inorder traversal of the binary
       //tree to which p points.  
       //Postcondition: The nodes of the binary tree to which p
       //               points are output in the inorder sequence.    
    private void inorder(BinaryTreeNode p)
    {
         if(p != null)
         {
            inorder(p.llink);
            System.out.print(p.info + " ");
            inorder(p.rlink);
         }
    }
       //Method to do a preorder traversal of the binary
       //tree to which p points.  
       //Postcondition: The nodes of the binary tree to which p
       //               points are output in the preorder sequence.       
    private void preorder(BinaryTreeNode p)
    {
         if(p != null)
         {
            System.out.print(p.info + " ");
            preorder(p.llink);
            preorder(p.rlink);
         }
    }
       //Method to do a postorder traversal of the binary
       //tree to which p points.  
       //Postcondition: The nodes of the binary tree to which p
       //               points are output in the postorder sequence.      
    private void postorder(BinaryTreeNode p)
    {
         if(p != null)
         {
            postorder(p.llink);
            postorder(p.rlink);
            System.out.print(p.info + " ");
         }
    }
       //Method to determine the height of the binary tree
       //to which p points. 
       //Postcondition: The height of the binary tree to which p
       //               points is returned.   
    private int height(BinaryTreeNode p)
    {
         if(p == null)
            return 0;
         else
            return 1 + max(height(p.llink), height(p.rlink));
    }
       //Method to determine the larger of x and y.
       //Postcondition: The larger of x and y is returned.    
    private int max(int x, int y)
    {
         if(x >= y)
            return x;
         else
            return y;
    }
       //Method to determine the number of nodes in the binary 
       //tree to which p points. 
       //Postcondition: The number of nodes in the binary tree
       //               to which p points is returned.
    
    
    // both count methods made to use post order traversal
    //node count will count every node in struct
    private int nodeCount(BinaryTreeNode p)
    {
        if(p != null)
        {
           nodeCount(p.llink); //explores every node to the left until null
           nodeCount(p.rlink); //explores all nodes to the right after
           count++; //will increment count after upon pop of call stack
        }
        return count;
    }
       //Method to determine the number of leaves in the binary 
       //tree to which p points.
       //Postcondition: The number of leaves in the binary tree
       //               to which p points is returned.  
    
    //leaf count will count the nodes if there is no left of right nodes
    private int leavesCount(BinaryTreeNode p)
    {
            if(p != null)
            {
               leavesCount(p.llink);
               leavesCount(p.rlink);
               if(p.llink == null && p.rlink == null) {
            	  count++;
               }
            }
            return count;
    }
    //swapTree method uses preorder traversal to explore swap sub trees 
	public void swapTrees(BinaryTreeNode p) 
	{
		if(p!= null)
		{
			BinaryTreeNode nodeToSwap = p.llink; //temp for swap
			p.llink = p.rlink;  //left = right
			p.rlink = nodeToSwap; //right = temp
			swapTrees(p.llink);
			swapTrees(p.rlink);
			//before traversal to the next pre ordered node swaps child leaves if exist

		}
		
	}
	//singleParent uses inorder traversal to find each node only containing one child
	public void singleParent(BinaryTreeNode p) {
		if(p!= null)
		{
			singleParent(p.llink);
			if(p.llink == null && p.rlink != null || p.llink != null && p.rlink == null) {
				System.out.print(p.info + " ");
			}
			singleParent(p.rlink);
		}
			
	}
    private void nodeHeightPreOrder(BinaryTreeNode p)
    {
         if(p != null)
         {
            System.out.print(p.info + "'s Height: ");
            System.out.println(height(p));
            nodeHeightPreOrder(p.llink);
            nodeHeightPreOrder(p.rlink);
         }
    }
	
}