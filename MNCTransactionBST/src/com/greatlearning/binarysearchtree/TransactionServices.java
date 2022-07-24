package com.greatlearning.binarysearchtree;

import java.util.ArrayList;

class Node{
	int key;
	Node left;
	Node right;
	
	public Node(int data) {
		key = data;
		left = null;
		right = null;
	}
}

public class TransactionServices {
	public Node prevNode = null;
	public Node headNode = null;
	public ArrayList<Node> list = new ArrayList<>();
	
	public void BinaryToSkew(Node root) {
        if(root == null)
        {
            return;
        }
        
        for (int i = 0; i < list.size(); i++) {
        	if( i == list.size()-1) {
        		 list.get(i).left = null;
        	        list.get(i).right = null;
        	}
        	else {
        		list.get(i).right = list.get(i+1);
    			list.get(i).left = null;
        	}
        	
		}
        
       
        
        RightNodes(list.get(0));
	}
	
	void RightNodes(Node root) {
			if( root == null) {
				return;
			}
			else {
				System.out.print(root.key + " ");
				RightNodes(root.right);
			}
	}
	
	void Inorder(Node root)
	{
		  if(root == null)
	        {
	            return;
	        }
	        Inorder(root.left);
	        list.add(root);
	        Inorder(root.right);
	}
}
