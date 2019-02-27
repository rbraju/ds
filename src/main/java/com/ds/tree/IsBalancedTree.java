package com.ds.tree;

public class IsBalancedTree {

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);

		node1.left = node2;
		node1.right = node3;
		
		node2.left = node4;
		node2.right = node5;
		
		node3.left = node6;
		node3.right = node7;
		
		// node7.right = new TreeNode(8);
		// node7.right.right = new TreeNode(9);
		
		System.out.println(isBalanced(node1) > 0 ? "true" : "false");
	}

	static int isBalanced(TreeNode root) {

		if (root == null)
			return 0;

		int leftHeight = isBalanced(root.left);
		if (leftHeight == -1)
			return -1;

		int rightHeight = isBalanced(root.right);
		if (rightHeight == -1)
			return -1;

		int diff = leftHeight - rightHeight;
		if (Math.abs(diff) > 1)
			return -1;

		return 1 + Math.max(leftHeight, rightHeight);
	}
}
