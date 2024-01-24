package com.company.lamda;

interface Alpha // Functional interface with single public abstract method without a body.
{
	void disp();
}

//class AlphaImpl implements Alpha // Normal implementation of an abstract interface method
//{
//	public void disp() // visibility of implementing methods can't be less than public for interface public abstract methods
//	{
//		System.out.println("Alpha implementation ");
//	}
//}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		
//		AlphaImpl alpha=new AlphaImpl();
//		alpha.disp();
		
		Alpha a = new Alpha() { // Implementation of Alpha functional interface through Anonymous unnamed Inner Class
			
			public void disp()
			{
				System.out.println("Alpha implementation ");
			}
		};
		
		a.disp();		

	}

}
