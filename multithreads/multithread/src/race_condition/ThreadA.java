package race_condition;



public class ThreadA implements Runnable {
	
  Common c ;
  String name;
@Override
public void run() {
	// TODO Auto-generated method stub
c.fun1(name);
	
}
 
  

}
