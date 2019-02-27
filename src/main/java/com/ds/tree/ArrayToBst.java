package com.ds.tree;

/**
 * <b>Question:</b><br>
 * Convert a given 'Sorted array' into a Binary Search Tree
 * 
 * <br>
 * <br>
 * <b>Approach:</b><br>
 * Print the middle element of the array. Recursively print the middle element
 * of left and right sub arrays.
 * 
 * @author Rajesh Bhoopathy
 *
 */
public class ArrayToBst {

	private static BinarySearchTree bst = null;

	public static void main(String[] args) {
		
		int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110 };

		BinarySearchTreeUtil.displayLevelOrder(getBinarySearchTree(a));
	}

	public static TreeNode getBinarySearchTree(int[] a) {
		int length = a.length;
		if (length == 0) {
			System.out.println("Array is empty");
			return null;
		}

		bst = new BinarySearchTree();
		convertArrayToBST(a, 0, a.length - 1);

		System.out.println("Root node : " + bst.getRootNode().data);

		return bst.getRootNode();
	}

	/**
	 * Converts the given SORTED array to a binary search tree<br>
	 * <br>
	 * Print the middle element of the array. Recursively print the middle
	 * element of left and right sub arrays.
	 * 
	 * @param a
	 *            Sorted Integer array
	 * @param start
	 *            Start Index of the array
	 * @param end
	 *            End index of the array
	 */
	private static void convertArrayToBST(int[] a, int start, int end) {
		if (start == end) {
			bst.add(a[start]);
			return;
		}
		int mid = (start + end) / 2;
		bst.add(a[mid]);

		if (start < mid) {
			convertArrayToBST(a, start, mid - 1);
		}
		if (mid < end) {
			convertArrayToBST(a, mid + 1, end);
		}
	}
}
