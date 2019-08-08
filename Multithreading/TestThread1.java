package Multithreading;
class ThreadTest1 extends Thread{
	@Override
		public void run() {
			for(int i=0;i<5;i++) {
				Thread.yield();
				
				System.out.println("ist thread");
				
			}
		}
	
}
class ThreadTest2 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			//Thread.yield();
			System.out.println("2nd thread");
		}
	}
}


public class TestThread1 {

	public static void main(String[] args) {
		ThreadTest1 t1=new ThreadTest1();
		
		System.out.println("t1: "+t1.getPriority());
		ThreadTest2 t2 = new ThreadTest2();
		System.out.println("t2: "+t2.getPriority());
		t2.setPriority(7);
		System.out.println("t2: "+t2.getPriority());
		t1.start();t2.start();

	}

}
