package project5;

public class LinkedList1 {
	public ListNode head;
	 public static class ListNode {
		public int data;
		public ListNode next;
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public static ListNode insertAtEnd(ListNode head, int data) {
		ListNode newNode = new ListNode(data);
		if(head==null) {
			return newNode;
		}
		ListNode current = head;
		while(null!=current.next) {
			current=current.next;
		}
		current.next=newNode;
		return head;
		
	}
	public static void display(ListNode head) {
		if(head==null) {
			return;
		}
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data + " -->");
			current=current.next;
		}
		System.out.println(current);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(8);
		ListNode third = new ListNode(1);
		ListNode fourth = new ListNode(11);
		head.next = second;
		second.next =third;
		third.next = fourth;
		LinkedList1 linkedlist = new LinkedList1();
		linkedlist.display(head);
		ListNode newHead = LinkedList1.insertAtEnd(head, 15);
		LinkedList1.display(newHead);
		
	}

}
