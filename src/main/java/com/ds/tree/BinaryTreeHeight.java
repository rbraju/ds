package com.ds.tree;

/**
 * Number of edges from root to leaf node
 * 
 * @author Rajesh Bhoopathy
 *
 */
public class BinaryTreeHeight {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110 };
		TreeNode root = ArrayToBst.getBinarySearchTree(a);
		BinarySearchTreeUtil.displayLevelOrder(root);
		System.out.println("Height of the tree : " + findHeight(root));
	}

	private static int findHeight(TreeNode root) {

		if (root == null) {
			return -1;
		}

		int lHeight = findHeight(root.left);
		int rHeight = findHeight(root.right);

		if (lHeight > rHeight)
			return lHeight + 1;
		else
			return rHeight + 1;
	}
}