package com.ds.linkedlist;

/**
 * Reverse a linked list
 * 
 * @author Rajesh Bhoopathy Raju
 *
 */
public class ReverseLinkedList {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(10);
		ListNode l2 = new ListNode(20);
		ListNode l3 = new ListNode(30);
		ListNode l4 = new ListNode(40);
		ListNode l5 = new ListNode(50);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;

		LinkedListUtil.display(l1);

		System.out.println("\nReversed List");
		LinkedListUtil.display(reverse(l1));
	}

	/**
	 * To reverse a given linked list
	 * 
	 * @param head
	 *            - Head node of the list
	 * 
	 * @return - New head node
	 */
	public static ListNode reverse(ListNode head) {

		if (head == null || head.next == null)
			return head;

		ListNode current = head, next = head.next;
		head.next = null;
		head = next;

		while (head.next != null) {
			next = head.next;
			head.next = current;
			current = head;
			head = next;
		}
		head.next = current;
		return head;
	}
}
