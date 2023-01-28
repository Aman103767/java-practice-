package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class JavaStream {

	
	public static void main(String[] args) {
		
	     String [] names = {"Aman","Asique","Sai","Falgun","efat","Saras"};
        List<Integer> ans = Arrays.asList(1,2,3,4,5);
	List<Integer> list = 	ans.stream()
		.map(x->x*x).collect(Collectors.toList());
	   
	   System.out.println(list);
	}
}
