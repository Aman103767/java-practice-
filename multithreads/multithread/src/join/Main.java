package join;

public class Main {
	
	public static void main(String[] args) {
		
		College col = new College();
		Thread t1 = new Thread(col);
		
        Training train = new Training(t1);
        Thread t2 = new Thread(train);
        
        Project pro = new Project(t2);
        Thread t3 = new Thread(pro);
        
        t1.start();
        t2.start();
        t3.start();
		
	}

}
