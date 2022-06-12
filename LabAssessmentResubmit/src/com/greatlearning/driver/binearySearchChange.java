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
public class binearySearchChange {
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
       
		binearySearchChange tree = new binearySearchChange();
		int order = 0;
		 tree.node = new Node(50);
		 tree.node.left = new Node(30);
		 tree.node.right = new Node(60);
		 tree.node.left.left = new Node(10);
		 tree.node.right.left = new Node(55);
		 changeBTToSkewedTree(node,order);
		 System.out.println("The resultant output is: ");
		 traverseRightSkewedTree(headNode);
			}
}
