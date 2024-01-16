/*		 
		 this() or this(argument list or hard coded values): can be used or invoked from a constructor only
		 that too as a first statement in that constructor. this() calls the default constructor of same class only.
		 and this(argument list)... the overloaded constructor of same class only. Based on number of arguments, 
		 type of arguments, order of arguments ... this(args) recognizes the relevant overloaded constructor 
		 in the same class.
		 
		 
		 super() or super(argument list or hard coded values): can be used or invoked from a constructor only
		 that too as a first statement in that constructor. super() calls the default constructor of parent class
		 and super(argument list)... the overloaded constructor of parent class only. Based on number of arguments, 
		 type of arguments, order of arguments ... super(args) recognizes the relevant overloaded constructor 
		 in the parent.
		 
		 super dot variable and super dot methodName(): These statements can be used anywhere and used 
		 to access immediate Parent class's variables and Parent class's normal and overloaded methods.
		 
		 this dot variableName and this dot methodName(): These statements can be used anywhere and used 
		 to access same class's variables and same class's normal and overloaded methods.
		 
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
		childMethod(111, 888);
		
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
