package race_condition;

public  class Common {
	
   public static synchronized void fun1(String name)  {
	   System.out.print("Welcome ");
	   try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   System.out.print(name+" ");
	   
	   
   }

}
