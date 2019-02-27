package com.ds.tree;

/**
 * Given two tree nodes t1 and t2, find if t2 is subtree of t1. Note that t1 may
 * or may not be the root of the tree.
 * 
 * @author Rajesh Bhoopathy Raju
 *
 */
public class SubTree {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 45, 50, 60, 70, 75, 80, 85, 90, 95, 100, 120 };

		TreeNode root = ArrayToBst.getBinarySearchTree(a);

		BinarySearchTreeUtil.displayLevelOrder(root);

		TreeNode node1 = getNode(root, 80);
		TreeNode node2 = getNode(root, 75);

		System.out.println(verifySubTree(node1, node2));
	}

	private static boolean verifySubTree(TreeNode node1, TreeNode node2) {
		if (node1 == null)
			return false;

		if (node1 == node2)
			return true;

		return verifySubTree(node1.left, node2) || verifySubTree(node1.right, node2);
	}

	private static TreeNode getNode(TreeNode root, int data) {
		if (root == null)
			return root;

		if (root.data == data) {
			return root;
		} else if (root.data > data) {
			return getNode(root.left, data);
		} else {
			return getNode(root.right, data);
		}
	}
}
