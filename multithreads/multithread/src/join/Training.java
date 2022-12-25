package join;

public class Training implements Runnable{
	Thread t1 ;

	public Training(Thread t1) {
		// TODO Auto-generated constructor stub
		this.t1 = t1;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			t1.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+"training-> "+i);
			}
	}

}
