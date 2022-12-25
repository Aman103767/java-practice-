package sycronizedBlock;

public class Main {
	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		 
		Demo threadb = new Demo(new ThreadB());
		Thread thread = new Thread(threadb);
		thread.start();
		Thread thread1 = new Thread(threadb);
		thread1.start();
	
	
	}

}
