package com.ds.linkedlist;

/**
 * Find whether a given list is circular or not. Find the node.
 * 
 * @author Rajesh Bhoopathy Raju
 *
 */
public class CircularLinkedList {

	public static void main(String[] args) {

		ListNode node1 = new ListNode(10);
		ListNode node2 = new ListNode(20);
		ListNode node3 = new ListNode(30);
		ListNode node4 = new ListNode(40);
		ListNode node5 = new ListNode(50);
		ListNode node6 = new ListNode(60);
		ListNode node7 = new ListNode(70);
		ListNode node8 = new ListNode(80);
		ListNode node9 = new ListNode(90);
		ListNode node10 = new ListNode(100);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		node8.next = node9;
		node9.next = node10;
		node10.next = node5;

		ListNode p1 = node1, p2 = node1;

		boolean isCircular = false;
		while (p2 != null && p2.next != null) {
			p1 = p1.next;
			p2 = p2.next.next;

			System.out.println(p1.data + " ---> " + p2.data);

			if (p1 == p2) {
				isCircular = true;
				break;
			}
		}

		if (isCircular) {
			p1 = node1;
			while (true) {
				if (p1 == p2)
					break;
				p1 = p1.next;
				p2 = p2.next;
			}
			System.out.println(p1.data + " is the start of the loop");
		} else {
			System.out.println("Not a circular list");
		}
	}
}
