package assignment.a5.exception_handling.a5_2_user_input;

import java.util.Scanner;
import java.io.IOException;  

public class HandlingUserInput {

	public static void main(String[] args) throws IOException {

		   int result=0;
		   Scanner scanner = new Scanner(System.in);  // taking user input from console
	       
	       System.out.println("Enter number 1 : ");
	       int num1 = scanner.nextInt();

	       System.out.println("Enter number 2 : ");
	       int num2 = scanner.nextInt();
	       
	       
	       try {
	    	  result = numValueCheck(num1,num2);
	       }
	       catch(Exception e)
	       {
	    	   System.out.println(e.getMessage());
	       }
	       
	       System.out.println("Result is : "+result);
	      
	}
    static int numValueCheck(int num1, int num2) throws IOException {
        if (num1 > num2){
           throw new IOException("Num 1 is greater than greater than num2 and hence IOException  is thrown");
        } else  if (num1 < num2){
            throw new ArithmeticException("Num 2 is greater than num1 and hence ArithmeticException is thrown");
        } else {
           System.out.println("Both parameters are same!!");
        }
        return num1+num2;
     }
      

}
