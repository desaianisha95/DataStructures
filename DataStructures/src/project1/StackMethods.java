package project1;


public class StackMethods {
	private int top;
	int size;
	int[] stack;
	
	public StackMethods() {
		System.out.println("");
	}
	public StackMethods(int arraySize) {
		size=arraySize;
		stack= new int[size];
		top=-1;
	}
	public void push(int value) {
		if(top==size-1) {
			System.out.println("Stack is full, cant push a value");
		}
		else {
			top=top+1;
			stack[top]=value;
		}
	}
	public void pop() {
		if(!isEmpty())
			top=top-1;
		else {
			System.out.println("Cant pop..stack is empty");
		}
	}
public boolean isEmpty() {
	return top==-1;
}
public void display() {
	for(int i=0;i<=top;i++) {
		System.out.println(stack[i] + " ");
	}
	System.out.println();
}
}
