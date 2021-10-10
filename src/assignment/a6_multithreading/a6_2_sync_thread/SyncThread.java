package assignment.a6_multithreading.a6_2_sync_thread;



class Factorial {  
	  
	void printFactorial(int n) {  
		 synchronized(this){
			 
//				System.out.println("@printFactorial() - "+ Thread.currentThread().getName() + "Begins");
			 long fact = 1l;	
				for(int i=1;i<=n;i++) {    
					fact=(long) fact*i;   
				}    
				try {  
					Thread.sleep(400);  
				}
				catch(Exception e){System.out.println(e);}  
			System.out.println("@printFactorial() - "+ Thread.currentThread().getName() + " = " + fact);
			
		}
	 }//end of the method  
}  
class Sum {  
	  
	void printSum(int n1, int n2 ) {  
		 synchronized(this){
	 		 
			 long sum = 0l;	
			 sum = n1 + n2;
			 try {  
//				 System.out.println("@printSum() - "+ Thread.currentThread().getName() + "Begins");
				 Thread.sleep(400);  
			 }
			 catch(Exception e){System.out.println(e);}  
			 System.out.println("@printSum() - "+ Thread.currentThread().getName() + " = " + sum);
		 }
	   
	 }//end of the method  
}  

class process1 extends Thread {
	Factorial f;
	int num;
	process1(Factorial f , int num)
	{
		this.f = f;
		this.num = num;
	}
	@Override
	public void run()
	{
		f.printFactorial(num);
	}
}
class process2 extends Thread {
	Sum s;
	int num1;
	int num2;
	process2(Sum s, int num1, int num2)
	{
		this.s = s;
		this.num1 = num1;
		this.num2 = num2;
	}
	@Override
	public void run()
	{
		s.printSum(num1,num2);
	}
}
public class SyncThread  {

	public static void main(String[] args) {

		Factorial obj1 = new Factorial();
		Sum obj2 = new Sum();
		
		process1 t1=new process1(obj1, 2); 
		process1 t2=new process1(obj1, 4);    
		process2 t3=new process2(obj2, 1, 2); 
		process2 t4=new process2(obj2, 5, 6);  
		
		t1.setName("process 1- thread1");
		t2.setName("process 1- thread2");
		t3.setName("process 2- thread3");
		t4.setName("process 2- thread4");
		
		t2.start(); 
		t4.start(); 
		t1.start();  
		t3.start();  
	}

}


