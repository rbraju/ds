package com.ds.tree;

public class BinarySearchTreeDemo {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110 };
		TreeNode root = ArrayToBst.getBinarySearchTree(a);
		System.out.println("Root : " + root.data);

		BinarySearchTreeUtil bstUtil = new BinarySearchTreeUtil();

		// In order traversal
		bstUtil.displayInOrder(root);
		System.out.print(" --> In order\n");

		// Pre order traversal
		bstUtil.displayPreOrder(root);
		System.out.print(" --> Pre order\n");

		// Post Order traversal
		bstUtil.displayPostOrder(root);
		System.out.print(" --> Post order\n");

		// Reverse In order traversal
		bstUtil.displayReverseInOrder(root);
		System.out.print(" --> Reverse In order\n");

		// Level order traversal
		System.out.print("\n\nLevel order..\n");
		bstUtil.displayLevelOrder(root);

		// Level order traversal with formatting
		System.out.print("\n\nLevel order2 (with formatting)..\n");
		bstUtil.displayLevelOrder(root);
	}
}
