package com.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * To perform operations on binary tree based on the given root node
 *
 */
public class BinarySearchTreeUtil {

	/**
	 * Prints Left --> Parent --> Right
	 * 
	 * @param node
	 *            - Root node of the binary tree
	 */
	public void displayInOrder(TreeNode node) {
		if (node == null)
			return;

		displayInOrder(node.left);
		System.out.print(node.data + " ");
		displayInOrder(node.right);
	}

	/**
	 * Prints Parent --> Left --> Right
	 * 
	 * @param node
	 *            - Root node of the binary tree
	 */
	public void displayPreOrder(TreeNode node) {
		if (node == null)
			return;

		System.out.print(node.data + " ");
		displayPreOrder(node.left);
		displayPreOrder(node.right);
	}

	/**
	 * Prints Left --> Right --> Parent
	 * 
	 * @param node
	 *            - Root node of the binary tree
	 */
	public void displayPostOrder(TreeNode node) {
		if (node == null)
			return;

		displayPostOrder(node.left);
		displayPostOrder(node.right);
		System.out.print(node.data + " ");
	}

	/**
	 * Same as displayLevelOrder(BinaryTreeNode node) but with proper formatting
	 * <br>
	 * Non recursive method
	 * 
	 * @param node
	 *            - Root Node
	 */
	public static void displayLevelOrder(TreeNode node) {

		Queue<TreeNode> queue = new LinkedList<TreeNode>();

		queue.add(node);
		int size = 0;

		while (!queue.isEmpty()) {
			size = queue.size();

			while (size > 0) {
				node = queue.poll();

				if (node.left != null)
					queue.add(node.left);

				if (node.right != null)
					queue.add(node.right);

				System.out.print(node.data + " ");
				--size;
			}
			System.out.println("");
		}
	}

	/**
	 * Prints Right --> Parent --> Left
	 * 
	 * @param node
	 *            - Root node of the binary tree
	 */
	public void displayReverseInOrder(TreeNode node) {
		if (node == null)
			return;

		displayReverseInOrder(node.right);
		System.out.print(node.data + " ");
		displayReverseInOrder(node.left);
	}

}
