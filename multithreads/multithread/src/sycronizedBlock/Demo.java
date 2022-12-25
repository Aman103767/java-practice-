package sycronizedBlock;

public class Demo implements Runnable{
	
	ThreadA a;

	

	

	public Demo(ThreadA a) {
		// TODO Auto-generated constructor stub
		this.a =a;
	}

	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"do something....");
		/// 1 thousand lines of codes 
	synchronized (a) {
		System.out.println(Thread.currentThread().getName()+"do more 1 something....");
		System.out.println(Thread.currentThread().getName()+"do more 2 something....");
	}
	}

}
