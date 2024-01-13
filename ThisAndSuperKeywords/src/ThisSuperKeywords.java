/*		 
		 super dot and super(): To access immediate Parent class's variables, Parent's default
		 and overloaded constructors, and Parent's normal and overloaded methods.
		 
		 this dot and this(): To access same class's variables, same class's default
		 and overloaded constructors, and same class's normal and overloaded methods.	 
		 
		 */


class Parent{
	
	int a;
	int b;
	static int c;
	Parent(){
		
		super();
		
		System.out.println("Parent class default constructor");
		
	}
	Parent(int x, int y){
		
		super();
		
		System.out.println("Parent class overloaded constructor");
		System.out.println(x + "  " + y);
		
	}
	void parentMethod() {
		
		System.out.println("Parent class normal method");
		
	}
	void parentMethod(int x, int y) {
		
		System.out.println("Parent class overloaded method");
		System.out.println(x + "  " + y);
		
		
		
	}
	
	void parentTest(int a, int b) {
		
		this.a = a;
		this.b = b;
		
	}
	
}
class Child extends Parent{
	
	int a;
	int b;
	static int c;
	
	Child(){
		
		this(10, 20);
		
		System.out.println("same class default constructor");
		
	}
	Child(int x, int y){
		
		this(x, y, 30);
		
		System.out.println("same class 2-argumentoverloaded constructor");
		
	}
	Child(int x, int y, int z){
		
		super(6, 2); // super() is there by default and overloaded constructor is the first one to print
		
		System.out.println("same class 3-argument overloaded constructor");
		System.out.println(x + "  " + y + "  " + z);
		
	}
	void childMethod() {
		
		System.out.println("same class normal method");
		
	}
	void childMethod(int x, int y) {
		
		System.out.println("same class overloaded method");
		System.out.println(x + "  " + y);
		
		
	}
	
	void childTest(int a, int b) {
		
		this.a = a;
		this.b = b;
		System.out.println(this.a + "  " + this.b);	
		
		super.a = 4;
		super.b = 5;
		
		this.a = super.a;
		this.b = super.b;
		
		childMethod();
		// or
		this.childMethod();
		
		childMethod(this.a, this.b);
		// or
		this.childMethod(this.a, this.b);
		
		super.parentMethod();
		super.parentMethod(11, 22);		
		
	}
	
}


public class ThisSuperKeywords {

	public static void main(String[] args) {
		
		Child child = new Child();
		child.parentTest(33,55);
		child.childTest(77,99);		
		
	}

}
