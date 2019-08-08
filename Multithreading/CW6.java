package Multithreading;

class Demo6 extends Thread {
	@Override
	public void run() {

		//Thread.yield();
		for (int i = 0; i < 5; i++) {
			System.out.print(i+" ");
		}
	}

}

class Demo7 extends Thread {

	@Override
	public void run() {

		for (char ch = 'a'; ch < 'h'; ch++) {
		 Thread.yield();
			System.out.print(ch + " ");
		}
	}
}

public class CW6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo6 d = new Demo6();
		d.start();
		Demo7 d2 = new Demo7();
		d2.start();
	}

}
