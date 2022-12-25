package join;

public class College implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
		System.out.println(Thread.currentThread().getName()+"Student-> "+i);
		}
	}

}
