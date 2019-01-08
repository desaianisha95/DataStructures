package project4;

public class LinkedList {
	public ListNode head;
	private static  class ListNode{
		public int data;
		public ListNode next;
		public ListNode(int data) {
			this.data = data;
			this.next=null;
		}
	}
	public  static ListNode insertAtFirst(ListNode head, int data) {
		ListNode newNode = new ListNode(data);
		if(head==null) {
			return newNode;
		}
		newNode.next=head;
		head=newNode;
		return head;
	}
	public static ListNode deleteFirst(ListNode head) {
		if(head==null) {
			return head;
		}
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}
	public static ListNode deleteLast(ListNode head) {
		if(head==null) {
			return head;
		}
		ListNode last = head;
		ListNode previousToLast = null;
		while(last.next!= null) {
			previousToLast = last;
			last=last.next;
		}
		previousToLast.next=null;
		return last;
		
	}
	
	public static void display(ListNode head) {
		if(head==null) {
			return;
		}
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data + "--> ");
			current=current.next;
		}
		System.out.println(current);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(8);
		ListNode third = new ListNode(5);
		ListNode fourth = new ListNode(11);
		head.next=second;
		second.next=third;
		third.next=fourth;
		LinkedList linkedlist = new LinkedList();
		linkedlist.display(head);
		//ListNode newHead = LinkedList.insertAtFirst(head, 15);
		//LinkedList.display(newHead);
		ListNode last = LinkedList.deleteLast(head);
		System.out.println(last.data);
		
		
		
	}
}


