package linkedlist;

import utils.PrintUtils;

public class ReverseLinkedList {

	public static Node reverseLinkedListIterative(Node head) {
		Node curr = head, prev = null;
		while (curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	public static Node reverseLinkedListRecursive(Node head) {
		if (head == null) {
			return null;
		}
		Node next = head.next;
		if (next == null)
			return head;

		Node n = reverseLinkedListRecursive(next);
		head.next.next = head;
		head.next = null;
		head = n;
		return n;

	}

	public static void main(String[] args) {
		Node head = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5,
				null)))));

		PrintUtils.printLinkedList(head);
		PrintUtils.printLinkedList(head = reverseLinkedListIterative(head));
		PrintUtils.printLinkedList(reverseLinkedListRecursive(head));
	}

}
