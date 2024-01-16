/*

Runtime Polymorphism requirements:

--- Parents Object Reference variable (which contains child class object's address)

--- Overriding the parent class method from the relevant child's class

--- Method's Full signature exactly matching/same (ie .. Method's return type, Method name, 
    Methods parameters number, type, order). May be Covarient type also accepted in child method.

*/

class AeroPlane
{
   public void takeOff()
   {
	   System.out.println("Aeroplane is taking off....");
   }
   public void fly()
   {
	   System.out.println("Aeroplane is flying....");
   }
   public void landing()
   {
	   System.out.println("Aeroplane is landing....");
   }
}

class CargoPlane extends AeroPlane
{
	   public void takeOff()
	   {   
		   System.out.println("Cargoplane is taking off....");
	   }
	   public void fly()
	   {
		   System.out.println("Cargoplane is flying....");
	   }
	   public void landing()
	   {
		   System.out.println("Cargoplane is landing....");
		   
		   System.out.println("***************************");
	   }
}


class PassengerPlane extends AeroPlane
{
	   public void takeOff()
	   {
		   System.out.println("Passengerplane is taking off....");
	   }
	   public void fly()
	   {
		   System.out.println("Passengerplane is flying....");
	   }
	   public void landing()
	   {
		   System.out.println("Passengerplane is landing....");
		   
		   System.out.println("***************************");
	   }
	}


class FighterPlane extends AeroPlane
	{
	   public void takeOff()
	   {
		   System.out.println("Fighterplane is taking off....");
	   }
	   public void fly()
	   {
		   System.out.println("Fighterplane is flying....");
	   }
	   public void landing()
	   {
		   System.out.println("Fighterplane is landing....");
		   
		   System.out.println("***************************");
	   }
	}


class Airport
{
    public void permit(AeroPlane ref) // ref = cp address; ref = pp address; ref = fp address 
    									//depending on which object the same method is invoked.
    {
    	ref.takeOff();
		ref.fly();               
		ref.landing();
    }
}
public class RunTimePolymorphism 
{

	public static void main(String[] args) 
	{
		
		
		
		
		
		Airport airport = new Airport();
		
		airport.permit(new CargoPlane()); //CargoPlane cp = new CargoPlane();
		airport.permit(new PassengerPlane()); //PassengerPlane pp = new PassengerPlane();
		airport.permit(new FighterPlane()); //FighterPlane fp = new FighterPlane();

//		AeroPlane ref;
//		
//		ref=cp;//AeroPlane ref=new CargoPlane();
//		
//		ref.takeOff();
//		ref.fly();               
//		ref.landing();
//		
//		System.out.println("****************************************");
//		
//		ref=pp;//AeroPlane ref=new PassengerPlane();
//		ref.takeOff();
//		ref.fly();
//		ref.landing();
//		
//		System.out.println("*************************************");
//		
//		ref=fp;
//		
//		ref.takeOff();
//		ref.fly();
//		ref.landing();

	}

}

