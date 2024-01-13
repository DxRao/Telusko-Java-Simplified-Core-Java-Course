package com.company.methodHiding;

/*
 Overriden methods are bound and resolved at runtime. 
 Static methods are bound and resolved at compile time by compiler and hence static methods are not overriden. 
  
 */

class Animal{
	
	static int i = 10;;;;;;;;;;; // OK
	
	
	void runs(){
		
		System.out.println("Animal Runs");
		
	}
	
	static void eats(){
		
		System.out.println("Animal eats");
		
	}
	
	void test() {		
		
		Animal A = new Animal();
		Deer D = new Deer();
		
		// non-static overriden method runs()
		A.runs();  //Animal Runs
		runs(); // Animal runs
		D.runs(); // Deer runs much faster than many animals
		
		// static method eats()		
		Animal.eats(); // Animal eats
		A.eats(); //  //Animal eats
		eats(); // Animal eats
		
		Deer.eats(); // Deer eats only grass
		D.eats(); // Deer eats only grass
	}
}

class Deer extends Animal{
	
	@Override
	void runs(){
		
		System.out.println("Deer runs much faster than many animals");
		
	}
	
	// @Override -> static methods of Parent can be derived but can't be overridden and just treated as specialized method of child class
	static void eats(){
		
		System.out.println("Deer eats only grass");
		
	}
	
	void Super() { // if you make it static method ... you can't use super.eats() in the body
		
		// static method eats()
		super.eats(); // Animal eats ... Can't call super from a static context/static method and is the reason you can't use super key word in a main() method which is static.		
		eats(); // Deer eats only grass
		Deer.eats(); //Deer eats only grass // static method call
		
		// non-static overriden method runs()
		super.runs(); //Animal Runs
		runs(); // Deer runs much faster than many animals
		
		Animal A = new Animal();
		A.runs(); //  //Animal Runs	
		
		Deer D = new Deer();
		D.runs(); // Deer runs much faster than many animals
	} 
}

public class StaticMethodHidingExample {

	public static void main(String[] args) {
		
		Deer.eats();	// Output: Deer eats only grass ... static method call to Specialized method of Deer (static methods of Parent not overriden)	
		
		Deer deer = new Deer();		
		deer.eats(); // Output:Deer eats only grass ... Object method call to Specialized method of Deer (static methods of Parent not overriden)	
		deer.Super();
		
		System.out.println("**********************");
		
		Animal animal = new Deer();		
		animal.eats(); //output: Animal eats ... Object method call to the Static Hidden method of Animal in Deer class
		((Deer)animal).eats(); //Output: Deer eats only grass ... calling specialized method of Deer class thru Parent Object reference variable and by down casting to Deer type.
		
		Animal.eats(); //output: Animal eats ... Static method call to Parent's eats() method
		
		Animal animal_1 = new Animal();	// duplicate variable name not allowed even for assigning different objects.	
		animal_1.eats(); // output: Animal eats ...  Object method call to Parent's eats() method
		
		System.out.println("***********************************");
		
		animal_1.test();
		

	}

}
