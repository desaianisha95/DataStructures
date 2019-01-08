package project6;



public class LinkedList2 {
	public ListNode head;
	public static class ListNode{
		public int data;
		public ListNode next;
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public static  ListNode  insertAfter(ListNode previous, int data) {
		if(previous==null) {
			System.out.println("The previous cannot be null");
		}
		ListNode newNode = new ListNode(data);
		newNode.next=previous.next;
		previous.next=newNode;
		return newNode;
		
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
		LinkedList2 linkedlist = new LinkedList2();
		linkedlist.display(head);
		LinkedList2.insertAfter(second, 12);
		LinkedList2.display(head);
		
		

	}

}
