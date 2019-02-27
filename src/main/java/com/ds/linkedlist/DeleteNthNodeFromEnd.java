package com.ds.linkedlist;

/**
 * Given the head of a linked list, delete the nth node from end<br>
 * <br>
 * 
 * <b>Approach:</b><br>
 * Two pointer approach. Traverse p2 N times from head. Move p1 and p2 till p2
 * reaches the end. p1.next will be Nth element from the end.
 * 
 * @author Rajesh Bhoopathy Raju
 *
 */
public class DeleteNthNodeFromEnd {

	public static void main(String[] args) {
		int[] values = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		ListNode l1 = LinkedListUtil.getAsList(values);
		LinkedListUtil.display(l1);
		ListNode x = deleteNthFromEnd(l1, 8);
		LinkedListUtil.display(x);
	}

	/**
	 * Delete nth node from end
	 * 
	 * @param head
	 * @return - New head
	 */
	private static ListNode deleteNthFromEnd(ListNode head, int n) {

		ListNode p1 = head, p2 = head;

		int i = 0;
		while (i < n) {
			if (p2.next != null)
				p2 = p2.next;
			else {
				if (i == n - 1)
					head = head.next;
				else
					System.out.println("Invalid number");
				return head;
			}
			i++;
		}
		while (p2.next != null) {
			p1 = p1.next;
			p2 = p2.next;
		}

		if (p1.next != null) {
			p1.next = p1.next.next;
		} else {
			p1.next = null;
		}
		return head;
	}
}
