package race_condition;

public class Common {
	
   public void fun1(String name)  {
	   System.out.print("Welcome");
	   try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   System.out.println(name);
	   
	   
   }

}
