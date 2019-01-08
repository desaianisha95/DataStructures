package project2;

public class Machine {
	private String name;
	private int code;
	
	public Machine() {
		this("Annie",0);
		System.out.println("Constructor running");
		
	}
	public Machine(String name) {
		System.out.println("Second Constructor running");
		this.name=name;
	}
	public Machine(String name, int code) {
		System.out.println("Third constructor running");
		this.name=name;
		this.code=code;
	}

}
