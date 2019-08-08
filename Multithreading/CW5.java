package Multithreading;


class Demo5 extends  Thread

{
		@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i<5;i++) {
			
			System.out.println("Thrad i"+Thread.currentThread().getName());
			System.out.println(i);
		}
		super.run();
	
	try 
	{
		sleep(11000);
		
	}catch( InterruptedException i)
	{
		System.out.println(i);
		
	}
	
	
	}
	}

public class CW5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().isDaemon());
		
		Demo5 d=new Demo5();
		d.setDaemon(true);
	//	System.out.println(Thread.currentThread().getName());
		
		System.out.println(d.currentThread().getName());
		System.out.println(d.isDaemon());
		d.start();
		
		for(int i=0;i<2;i++) {
			
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		
		System.out.println(d.isDaemon());
				
	}

}
