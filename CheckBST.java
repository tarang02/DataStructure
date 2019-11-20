package achievers;

import java.util.LinkedList;
import java.util.Queue;


public class CheckBST {
	static Node root;
	static Boolean check;
 	static class Node {
 		int key;
 		Node left, right;
 		Node(int data)
 		{
 			this.key = data;
 			this.left = null;
 			this.right = null;
 			check = true;
 		}
 	}
 	

	static Node insertLevelOrder(int[] arr, Node root,
	                            int i)
	{
	   if (i < arr.length) {
	       Node temp = new Node(arr[i]);
	       root = temp;
	
	       root.left = insertLevelOrder(arr, root.left,2*i+1);
	
	       root.right = insertLevelOrder(arr, root.right,   2 * i + 2);
	   }
	   return root;
	}
	
	static void BST_Check(Node root)
	{
		if(root==null)
			return;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty())
		{
			root = q.poll();
			if(root.left!=null)
				{
				if(root.left.key<root.key)
					q.add(root.left);
				else if(root.left.key>root.key) {
					check=false;
					System.out.println("No");
					break;
				}
			}
			if(root.right!=null)
				{
				if(root.right.key>root.key)
					q.add(root.right);
				else if(root.right.key<root.key) {
					check=false;
					System.out.println("No");
					break;
				}
			
			}
		}
		if(check==true)
			System.out.println("yes");
	}
	
	public static void main(String args[])
	{
	   int arr[] = { 10,5,15,3,8,13,18 };
	   root = insertLevelOrder(arr, root, 0);
	   BST_Check(root);
	}
}