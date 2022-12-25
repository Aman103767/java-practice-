package multithread;

public class Main {
	public static void main(String[] args) throws InterruptedException {
//		AThread athread = new AThread();
//		athread.setName("kolhi");
//		athread.setPriority(10);
//		athread.start();
	
		RThread rthread = new RThread();
	   Thread thread = new Thread(rthread);
	   thread.setName("t1");
	   thread.start();
	 
		
		RThread r1thread = new RThread();
	 Thread thread1 = new Thread(r1thread);
	 thread1.setName("t2");
	 thread1.start();
	 
		

		
	}

}
