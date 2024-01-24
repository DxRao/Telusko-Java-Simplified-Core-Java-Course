package com.company.lamda;

@FunctionalInterface
interface Calc
{
	int add(int a);
}

@FunctionalInterface
interface Calc2
{
	int add(int a, int b);
}

public class LambdaExpressionExample1 {

	public static void main(String[] args) {

//		Calc c= (int a)->{
//			return a+10;
//		};
		
//		Calc c= (a)->{ // data type not needed when only one parameter present
//		return a+10;
//	};
		
//		Calc c= a->{ // parenthesis not needed when only one parameter present
//		return a+10;
//	};
		//Calc c= a ->  a;	// Ok
		//Calc c= a ->  return a;	// return not accepted here. return keyword must be within braces.
		
		Calc c= a ->  a + 10;	
		System.out.println(c.add(10));
		
		Calc2 c1= (a,b) -> a+b;
		System.out.println(c1.add(10, 4));
		
	//////////////////////////////////////////////////////
		
		// Alternative implementations
		
		Calc c3= a-> { // return keyword and statement must be within {} braces. You can skip return keyword and code return statement on same line.
		
			return a+10;
		};	
		System.out.println(c3.add(10));
		
		/////////////////////////////////
		
		Calc2 c4= (a,b) -> { // parenthesis for parameters is mandatory when more than one parameter is present.
			
			return a+b;
		};
		
		System.out.println(c4.add(10, 4));

	}

}
