package Multithreading;
class A1 extends Thread {
	
	public void run(){
		
		for(int i=0;i<10;i++) {
			System.out.println("class a thread");
		}
		
	}
	
	
	
}

class B extends Thread{
	
	public void run(){
		
		for(int i=0;i<10;i++) 
		{
			System.out.println("Class B threade");
		}
		
	}
}
public class CW2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		A1 a=new A1();
		B b=new B();
		
		
		a.start();
		
		b.sleep(6000);
		b.start();
	}

}
