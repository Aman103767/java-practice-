package question2;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Appconfig.AppConfig;

public class Demo {
public static void main(String[] args) {
	ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
	EmployeeService es= ac.getBean("a1",EmployeeService.class); 
	es.printList();
	es.printMap();
	
}
}
