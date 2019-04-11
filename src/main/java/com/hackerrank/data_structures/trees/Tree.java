package com.hackerrank.data_structures.trees;

public class Tree {
	
	private Node root;
	
	public Tree() {
		root = new Node(0);
	}
	
	public Tree(int d) {
		root = new Node(d);
	}
	
	private class Node {
		
		int data;
		Node left;
		Node right;
		
		Node(int d) {
			data = d;
		}
	}
	
	public void add(int d) {
		add(root, d);
	}
	
	private Node add(Node node, int d) {
		if (root == null) {
			root = new Node(d);
			return root;
		} else {
			if (d <
		}
	}
	
	void preOrder(Node root) {
	
	}
	
	public static void main(String[] args) {
		
		Tree tree = new Tree(1);
		
		
	}
	
}
