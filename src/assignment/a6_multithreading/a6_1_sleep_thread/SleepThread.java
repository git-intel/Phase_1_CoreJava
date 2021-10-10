package assignment.a6_multithreading.a6_1_sleep_thread;

public class SleepThread extends Thread {  
	
	 public void run() {  
	  for(int i=1;i<6;i++){  
	    try {
	    		Thread.sleep(1000);
//	    		System.out.println(Thread.currentThread().getState()); 
	    	}
	    catch(InterruptedException e)
	    {
	    	System.out.println(e);
	    }  
	    System.out.println(Thread.currentThread().getName()+ "  :"+ i);  
	  }  
	 }  
	 
	 public static void main(String args[]){  
	  SleepThread t1=new SleepThread();  
	  t1.setName("Java");
	  t1.setPriority(MAX_PRIORITY);
	  
	  SleepThread t2=new SleepThread();  
	  t2.setName("Python");
	  
	  SleepThread t3=new SleepThread(); 
	  t3.setName("Oracle");
	  
	  SleepThread t4=new SleepThread(); 
	  t4.setName("C++");
	  t4.setPriority(MIN_PRIORITY);
	  
	  SleepThread t5=new SleepThread(); 
	  t5.setName("TypeScript");
	  t5.setPriority(MIN_PRIORITY);
	  
	  t1.start();  
	  t2.start();  
	  t3.start();
	  t4.start();
	  t5.start();
	  
	  System.out.println(t1.getState()); 
	  System.out.println(t2.getState());
	  System.out.println(t3.getState());
	  System.out.println(t4.getState());
	  System.out.println(t5.getState());
	 }  
	}  