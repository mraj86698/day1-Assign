package JavaBasics;

public class StaticDemo {
	static int a=10; /* Static variable*/
	static void display()/*Static Method*/
	{
		System.out.println("Static  Method");
	}
	static /*Static Block*/
	{
		System.out.println("Static Block");
	}
	
	public static void main(String args[]) {
		System.out.println("Main Method");
		System.out.println(a);
		display();
		
	}

}
