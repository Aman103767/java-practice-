package race_condition;



public class ThreadB implements Runnable {
	
  Common c ;
  String name;
@Override
   public void run() {
	// TODO Auto-generated method stub
     c.fun1(name);
	
   }
 
  

}