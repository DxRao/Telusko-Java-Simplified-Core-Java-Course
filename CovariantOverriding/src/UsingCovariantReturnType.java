/*
 Covariant Return Type is needed to prevent ClassCastException s by eliminating the need for Type casting. 
 
 Applicable for non-primitive return types only. ex: object reference variables
 
 Java doesn't allow the return type-based overloading, but JVM always allows return type-based 
 overloading. JVM uses the full signature of a method for lookup/resolution. Full signature means 
 it includes return type in addition to argument types. i.e., a class can have two or more methods
  differing only by return type. javac uses this fact to implement covariant return types.
 
 */

class A1  
{  
    A1 foo()  
    {  
        return this;  
    }  
      
    void print()  
    {  
        System.out.println("Inside the class A1");  
    }  
}  
  
  
// A2 is the child class of A1  
class A2 extends A1  
{  
    @Override  
    A2 foo()  
    {  
        return this;  
    }  
      
    void print()  
    {  
        System.out.println("Inside the class A2");  
    }  
}  
  
// A3 is the child class of A2  
class A3 extends A2  
{  
    @Override  
    A3 foo()  
    {  
        return this;  
    }  
      
    @Override  
    void print()  
    {  
        System.out.println("Inside the class A3");  
    }  
}  
  
public class UsingCovariantReturnType 
{  
    // main method  
    public static void main(String argvs[])  
    {  
       A1 a1 = new A1();  
         
       a1.foo().print();  
         
       A2 a2 = new A2();  
         
       a2.foo().print();  
         
       A3 a3 = new A3();  
         
       a3.foo().print();  
         
    }  
} 
