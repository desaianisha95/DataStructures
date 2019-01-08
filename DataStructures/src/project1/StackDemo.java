package project1;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackMethods newStack = new StackMethods(5);
		newStack.push(10);
		newStack.push(5);
		newStack.push(12);
		newStack.push(22);
		newStack.push(14);
		
		newStack.display();
		newStack.pop();
		newStack.pop();
		newStack.pop();
		System.out.println("final");
		
		newStack.display();
		

	}

}
