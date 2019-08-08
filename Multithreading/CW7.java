package Multithreading;

class Demojion extends Thread{
	
	
	static Thread tmain;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		   try {
				tmain.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
				int n=5;
		for(int i=0;i<n;i++)
			System.out.println("Demojion"+i);
		super.run();
	}
	
	
	
}
class joinDemo extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<3;i++)
			System.out.println(i);
		super.run();
	}
			
		}
public class CW7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demojion.tmain=Thread.currentThread();
		//Mythread m=new Mythread();
		Demojion  d=new Demojion();
		joinDemo j=new joinDemo();
		j.start();
		d.start();
		
		//for(int i=0;i<5;i++) {
			
			//System.out.println(Thread.currentThread().getName());
				//	System.out.println(i);			
		//}
	}

}
