package com.ds.tree;

/**
 * Given a Binary Tree, create another tree which is a mirror image of the given
 * tree.
 *
 */
public class MirrorImage {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		TreeNode root = ArrayToBst.getBinarySearchTree(a);

		BinarySearchTreeUtil.displayLevelOrder(root);
		System.out.println("---------------------");

		convertToMirrorImage(root);
		BinarySearchTreeUtil.displayLevelOrder(root);
		System.out.println("---------------------");

	}

	private static void convertToMirrorImage(TreeNode node) {
		if (node == null)
			return;

		TreeNode temp = node.left;
		node.left = node.right;
		node.right = temp;
		
		convertToMirrorImage(node.left);
		convertToMirrorImage(node.right);
	}
}
