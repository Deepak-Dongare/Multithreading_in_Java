package Multithreading;

class Demm extends Thread 
{
	
	public void run(){
		
	//	for(int i=0;i<5;i++) {
			System.out.println("Current threade name :"+Thread.currentThread().getName());
			
			System.out.println("Current threade property"+Thread.currentThread().getPriority());
			
	//	}
		
		
	}
	}

class Demo1 implements Runnable
{
	public void run(){
		
		
			
			for(int i=0;i<5;i++) {
				System.out.println("Main threade:");
			}
	
	
	
	}
	
}
public  class CW1  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Demm d=new Demm();
	d.setPriority(Thread.MAX_PRIORITY);
	//d.getPriority();
		d.start();
	
		//Demo1 d=new Demo1();
		//Thread t=new Thread();
		
		
		
		}

	
}

