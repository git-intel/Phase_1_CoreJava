package assignment.a5.exception_handling.a5_3_salary_exception;

public class SalaryException {

	   static void checkSalary(int sal) throws PerformanceException{  
		     if(sal<2000)  
		      throw new PerformanceException("You need to work hard");
		     else if (sal>2100 && sal<5000)
		      throw new PerformanceException("Your salary is somehow good!!");  
		     else if (sal>5000)
			  throw new PerformanceException("Your salary is very good!!");  
		     else  
		      System.out.println("sal:" + sal);  
		   } 
	   public static void main(String args[]){  
		      try {  
		    	  checkSalary(2999);  
		      }
		      catch(Exception m)
		      {
		    	  System.out.println("Exception occured: "+ m.getMessage());
		      }  
  
	   }  
}
class PerformanceException extends Exception { 

	PerformanceException(String s){  
	  super(s);  
	 }  
} 


