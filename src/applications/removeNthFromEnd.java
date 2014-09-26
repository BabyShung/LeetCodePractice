package applications;

import helperClass.ListNode;

/**
 * Given a linked list, remove the nth node from the end of list and return its
 * head.
 * 
 * For example, Given linked list: 1->2->3->4->5, and n = 2.
 * 
 * After removing the second node from the end, the linked list becomes
 * 1->2->3->5. Note: Given n will always be valid. Try to do this in one pass.
 * 
 * @author haozheng
 *
 */
public class removeNthFromEnd {
	public ListNode removeNthFromEndByHao(ListNode head, int n) {
		ListNode fake = new ListNode(520);
		fake.next = head;
		ListNode fast = fake, slow = fake;
		while (n > 0) {
			fast = fast.next;
			n--;
		}
		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return fake.next;
	}
}
