package com.ds.tree;

/**
 * Given the root node of a binary tree, check if it is a valid binary search 
 * tree
 *
 */
public class IsBinarySearchTree {

	public static void main(String[] args) {

		TreeNode node1 = new TreeNode(10);
		TreeNode node2 = new TreeNode(20);
		TreeNode node3 = new TreeNode(30);
		TreeNode node4 = new TreeNode(40);	// Root Node
		TreeNode node5 = new TreeNode(50);
		TreeNode node6 = new TreeNode(60);

		node4.left = node2;
		node2.left = node1;
		node2.right = node3;
		node4.right = node5;
		// node5.right = node6; // Valid BST
		node5.left = node6; // Invalid BST
		
		System.out.println(isBinarySearchTree(node4, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

	private static boolean isBinarySearchTree(TreeNode root, int min, int max) {
		if (root == null)
			return true;

		if (root.data < min || root.data > max) {
			System.out.println(min + " < " + root.data + " < " + max + " not satisfied.");
			return false;
		}

		return 
				isBinarySearchTree(root.left, min, root.data)
				&& 
				isBinarySearchTree(root.right, root.data, max);
	}
}
