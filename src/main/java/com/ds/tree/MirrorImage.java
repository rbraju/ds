package com.ds.tree;

/**
 * Given a Binary Tree, create another tree which is a mirror image of the given
 * tree.
 *
 */
public class MirrorImage {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		TreeNode root = ArrayToBst.getBinarySearchTree(a);

		BinarySearchTreeUtil.displayLevelOrder(root);
		System.out.println("---------------------");

		convertToMirrorImage(root);
		BinarySearchTreeUtil.displayLevelOrder(root);
		System.out.println("---------------------");

	}

	private static void convertToMirrorImage(TreeNode root) {
		if (root == null)
			return;

		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		convertToMirrorImage(root.left);
		convertToMirrorImage(root.right);
	}
}
