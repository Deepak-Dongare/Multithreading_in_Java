package Multithreading;

public class newclass extends Thread{
	
	
	
	
	public void run()
	try{
		for(int i;i<=10;i++) {
			
			
		}
		
	}catch(Exception e)
	{
		System.out.println(e);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			
			Demo ob=new Demo();
			ob.start();
			
			for(int i=0;i<=10;i++) {
				
				
				System.out.println("main th"+i);
				
				Thread.sleep(1000);
				if(i==5)
				ob.suspend();	
			}
		}
	}

}
