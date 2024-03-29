package assignment.a6_multithreading.a6_3_sync_wait_notify;



class Customer{  
int amount=10000;  
  
	synchronized void withdraw(int amount){  
	System.out.println("going to withdraw...");  
	  
		if(this.amount<amount)
		{  
		System.out.println("Less balance; waiting for deposit...");  		
		try{
			wait();
		   }
		catch(Exception e){}  
		}  
		this.amount-=amount;  
//		System.out.println("\n"+ Thread.currentThread().getName());
		System.out.println("\n"+ Thread.currentThread().getName() +  " :::" + Thread.currentThread().getState() );
		
		System.out.println("withdraw completed...the left over amount is : "+ this.amount);  
	}  
  
	synchronized void deposit(int amount){  
		System.out.println("going to deposit...");  
		this.amount+=amount;  
//		System.out.println("\n"+ Thread.currentThread().getName());
		System.out.println("\n"+ Thread.currentThread().getName() +  " :::" + Thread.currentThread().getState() );
		System.out.println("deposit completed... amount :  " + this.amount);  
		notify();  //unlocking of thread
	}  
}  
  
public class SyncWaitNotify {

	public static void main(String[] args) {
		final Customer c=new Customer();  
		
		new Thread("t1"){                
			public void run()
			  {
				c.withdraw(5000);
			  }  
			}.start();  
		new Thread("t2"){                
			public void run()
				{
				 c.withdraw(4000);
				}  
			}.start();  			
		new Thread("t3"){                 
			public void run()
				{
					 c.withdraw(10000);
				}  
		}.start(); 			
		new Thread("t4"){  
			  public void run()
			   {
				 c.deposit(20000);
			   }  
		}.start();  
	}

}
