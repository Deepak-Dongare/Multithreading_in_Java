package Multithreading;



class myNewThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<4;i++) {
			System.out.println("in child thread");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				System.out.println("its too long to wait here!!!");
			}
		}
	}
}
public class CW11 {

	public static void main(String[] args) throws InterruptedException {
		myNewThread t = new myNewThread();
		t.start();
		t.join();
		for(int i=0;i<4;i++) {
			System.out.println("in main thread");
		}
	}

}
