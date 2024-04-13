import java.util.Scanner;

class SquareThread extends Thread {
    private int begin;
    private int end;
    
    public SquareThread(int begin, int end) {
        
        this.begin = begin;
        this.end = end; 
    
  	}   
    
    public synchronized void run() {
  	  // print the square of each number from begin to end
    	
    	 
  	
  	if(Thread.currentThread().getName().equals("Thread-0")) {
  	   
  	  
  	   if(begin > end){
  		   for(int i = begin; i >= end; i--) {
  			   
  			   int result = i * i;
  			   
  			   System.out.println(result);  			   
  		   }	   
  		   
  	    }//if 
  	   
  	 if(begin < end){
		   for(int i = begin; i <= end; i++) {
			   
			   int result = i * i;
			   
			  System.out.println(result);
			   
		   } 
	     }  	   
  	   
  	}//Tread-0
  	
  	if(Thread.currentThread().getName().equals("Thread-1")) {
  		
  		 Thread.yield();
  		
  		/*
  		 try {
  			
            
        } 
        catch (InterruptedException e) { 
            e.printStackTrace(); 
        } 
        */
  		   
  		if(begin < end){
   		   for(int i = begin; i <= end; i++) {
   			   
   			   int result = i * i;
   			   
   			  System.out.println(result);
   			   
   		   } 
   	     } 
  	     
  	     if(begin > end){
  	    	 
  	    	 for(int i = begin; i >= end; i--) {
  	    		 
  	    		 	int result = i * i;
  	  		   
  	   		  		System.out.println(result); 
  	   		  		
  	    	 }	    	 
  	    	 
  	     }//if
  	     
  	}//Thread-0	     
  	          
  	   
  }  // run method 
    
}// class    

    	public class W09_P1 {
    	    public static void main(String args[]) {
    	        Scanner scanner = new Scanner(System.in);
    	        //System.out.print("Enter the begin for square calculation: ");
    	        int begin = scanner.nextInt();
    	        //System.out.print("Enter the end for square calculation: ");
    	        int end = scanner.nextInt();
    	        scanner.close();

    	        SquareThread thread1 = new SquareThread(begin, end);
    	        SquareThread thread2 = new SquareThread(end, begin);

    	        thread1.start();       
    	        thread2.start();
    	    }
    	}  
    
    
