package race_condition;



public class ThreadB implements Runnable {
	
  Common c ;
  String name;
public ThreadB(Common c2, String string) {
	// TODO Auto-generated constructor stub
	this.c =c2;
	this.name = string;
}
@Override
   public void run() {
	// TODO Auto-generated method stub
     c.fun1(name);
	
   }
 
  

}