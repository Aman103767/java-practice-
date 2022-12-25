package race_condition;

public class Main {
	public static void main(String[] args) {
		Common c = new Common();
		Common c1 = new Common();
	
		ThreadB threadb = new ThreadB(c,"SaiPrasad");
		Thread thread = new Thread(threadb);
		ThreadA threada = new ThreadA(c1,"aman");
		Thread thread1 = new Thread(threada);
		thread.start();
		thread1.start();
	
	}

}
