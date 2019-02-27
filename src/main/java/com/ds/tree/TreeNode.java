package com.ds.tree;

/**
 * Node for a Binary Tree. Can be used for any type of binary tree.
 * 
 * @author Rajesh Bhoopathy Raju
 *
 */
public final class TreeNode {

	public int data;

	public TreeNode left;

	public TreeNode right;

	public TreeNode(int data) {
		this.data = data;
	}

	public String toString() {
		return "" + data;
	}
}
