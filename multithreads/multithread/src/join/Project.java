package join;

public class Project implements Runnable{
	
	Thread t2;

	public Project(Thread t2) {
		// TODO Auto-generated constructor stub
		this.t2 = t2;
	}

	@Override
	public void run() {
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+"project-> "+i);
			}
	}

}
