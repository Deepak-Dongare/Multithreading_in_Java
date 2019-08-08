package Multithreading;

class priorities extends Thread {
	
	public void run(){
		
		for(int i=0;i<5;i++) {
			System.out.println("priorities thread");
		}
		
		
	}
	
}
class priorities1 extends Thread{
	
	public void run(){
		
	}
}
public class CW4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		priorities p=new priorities ();
		//p.setName("PATNA");
		String s=p.getName();
		
		p.setName("PATNA");
		System.out.println(s);
		System.out.println(":--:"+p);
			p.setPriority(5);
			System.out.println("Noraml priorities "+p.getPriority());
			p.setPriority(10);
			System.out.println("Max priorities "+p.getPriority());
			p.setPriority(1);
			
			System.out.println("Min priorities "+p.getPriority());
	}

}
