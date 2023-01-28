package garbage;

public class Check {
	@Override
	protected void finalize() {
		System.out.println("inside filnalize");
	}
	
  public static void main(String[] args) {
	  Check c = new Check();
	  c = null;
	System.gc();
	//System.out.println("aman");
}

}
