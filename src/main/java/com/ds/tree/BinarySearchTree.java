package com.ds.tree;

/**
 * Binary Search Tree.
 * 
 * @author Rajesh Bhoopathy Raju
 *
 */
public class BinarySearchTree {

	private TreeNode root = null;

	/**
	 * Adding a new tree node to the binary tree. No node will be created if the
	 * data already exists.
	 * 
	 * @param n
	 *            - Node value/data
	 */
	public void add(int n) {

		// Creating root node
		if (root == null) {
			root = new TreeNode(n);
			return;
		}

		TreeNode temp = root;
		TreeNode curr = root;
		while (temp != null) {
			curr = temp;
			if (n > temp.data) {
				temp = temp.right;
			} else if (n < temp.data) {
				temp = temp.left;
			} else if (n == temp.data) {
				return;
			}
		}

		TreeNode node = new TreeNode(n);
		if (n > curr.data)
			curr.right = node;
		else
			curr.left = node;
	}

	/**
	 * Returns root node of the binary tree
	 * 
	 * @return - Root Node
	 */
	public TreeNode getRootNode() {
		return root;
	}
}