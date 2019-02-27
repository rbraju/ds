package com.ds.linkedlist;

public class LinkedListUtil {

	/**
	 * Display the contents of the linked list
	 * 
	 * @param head
	 */
	public static void display(ListNode head) {
		if (head == null) {
			System.out.println("List is empty..");
			return;
		}
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println("");
	}

	public static ListNode getAsList(int[] values) {
		ListNode head = null, temp = null;
		for (int i : values) {
			if (head == null) {
				head = new ListNode(i);
				temp = head;
			} else {
				ListNode t = new ListNode(i);
				temp.next = t;
				temp = temp.next;
			}
		}
		return head;
	}
}
