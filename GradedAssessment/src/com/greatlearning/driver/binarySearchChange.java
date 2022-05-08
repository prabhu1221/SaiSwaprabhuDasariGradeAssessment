package com.greatlearning.driver;

import java.util.Scanner;
import java.util.HashSet;

class Node{
	int value;
	Node left,right;
 Node(int data){
	 value = data;
	 left=right= null;
 }
}
public class binarySearchChange {
		public static Node node;
		static Node previousNode = null;
		static Node headNode = null;
		
		static void changeBTToSkewedTree(Node root,int order) {
			if(root == null)
				return;
			if(order>0) {
				changeBTToSkewedTree(root.right,order);
			}else {
				changeBTToSkewedTree(root.left,order);
			}
			Node rightNode = root.right;
			Node leftNode = root.left;
			
			if (headNode == null) {
				headNode =root;
				root.left=null;
				previousNode = root;
			}
			else {
				previousNode.right=root;
				root.left = null;
				previousNode = root;
			}
			if(order > 0) {
				changeBTToSkewedTree(leftNode,order);
			}else {
				changeBTToSkewedTree(rightNode,order);
			}
		}
		static void traverseRightSkewedTree(Node root) {
			if(root == null) {
				return;
			}
			System.out.println(root.value +" ");
			traverseRightSkewedTree(root.right);
		}

	public static void main(String[] args) {
       
		Scanner sc = new Scanner(System.in);
		binarySearchChange tree = new binarySearchChange();
		System.out.println("Please enter the root value for the binary tree");
        tree.node = new Node(sc.nextInt());
        System.out.println("Please enter the left node value ");
        tree.node.left = new Node(sc.nextInt());
        if(tree.node.value  < tree.node.left.value) {
      	  System.out.println("Please enter the correct values for the binary tree.");
      	  System.exit(0);
        }
        System.out.println("Please enter the right node value ");
        tree.node.right = new Node(sc.nextInt());
        if(tree.node.value > tree.node.right.value) {
      	  System.out.println("Please enter the correct values for the binary tree.");
      	  System.exit(0);
        }
		int order = 0;
		changeBTToSkewedTree(node, order);
		traverseRightSkewedTree(headNode);
	}
}
