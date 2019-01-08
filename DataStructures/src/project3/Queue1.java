package project3;

public class Queue1 {
	private int capacity;
	int queueArr[];
	int front =0;
	int rear = 0 ;
	int currentSize=0;


public Queue1(int queueSize) {
	this.capacity=queueSize;
	queueArr=new int[this.capacity];
}
public void enqueue(int item) {
	if(isQueueFull()) {
		System.out.println("overflow! :" +item);
	}
	else {
		rear++;
		if(rear==capacity-1) {
			rear =0;
		}
	queueArr[rear]=item;
	currentSize++;
	System.out.println("Element" + item + "is pushed to Queue!");
	}
}
	public void dequeue() {
		if(isQueueEmpty()) {
			System.out.println("Underflow!unable to remove element");
			
		}
		else {
			front++;
			if(front==capacity-1) {
				System.out.println("Pop operartion done!removed:" +queueArr[front-1]);
				front=0;
			}
			else {
				System.out.println("Pop operation done! removed:"+queueArr[front-1]);
			}
			currentSize--;
		}
		
	}
	public boolean isQueueFull() {
		boolean status=false;
		if(currentSize==capacity) {
			status=true;
		}
		return status;
	}
	public boolean isQueueEmpty() {
		boolean status=false;
		if(currentSize==0) {
			status=true;
		}
		return status;
	}
}

