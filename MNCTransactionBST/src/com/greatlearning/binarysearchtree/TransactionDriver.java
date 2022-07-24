package com.greatlearning.binarysearchtree;

import java.util.Scanner;

public class TransactionDriver {

	static Scanner sc = new Scanner(System.in);
	static Node root;
	
	public static void main(String arg[]) {
		
		
		TransactionServices bst = new TransactionServices();
		
		root = new Node(50);
		root.left = new Node(30);
		root.right = new Node(60);
		root.left.left = new Node(10);
		root.right.left= new Node(55);
		
		bst.Inorder(root);
		bst.BinaryToSkew(root);
	}
}
