package com.company.methodHiding;


class Animal{
	
	static String color = "Blackish";
	
	void runs(){
		
		System.out.println("Animal Runs");
		
	}
	
	static void eats(){
		
		System.out.println("Animal eats");
		
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
}

public class StaticMethodHidingExample {

	public static void main(String[] args) {
		
		Deer.eats();	// Output: Deer eats only grass ... static method call to Specialized method of Deer (static methods of Parent not overriden)	
		
		Deer deer = new Deer();		
		deer.eats(); // Output:Deer eats only grass ... Object method call to Specialized method of Deer (static methods of Parent not overriden)	
				
		Animal animal = new Deer();		
		animal.eats(); //output: Animal eats ... Object method call to the Static Hidden method of Animal in Deer class
		((Deer)animal).eats(); //Output: Deer eats only grass ... calling specialized method of Deer class thru Parent Object reference variable and by down casting to Deer type.
		
		Animal.eats(); //output: Animal eats ... Static method call to Parent's eats() method
		
		Animal animal_1 = new Animal();		
		animal_1.eats(); // output: Animal eats ...  Object method call to Parent's eats() method
		
		

	}

}
