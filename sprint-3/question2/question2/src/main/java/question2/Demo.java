package question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Appconfig.AppConfig;

public class Demo {
public static void main(String[] args) {
	ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
	EmployeeService es= ac.getBean("a1",EmployeeService.class);
	es.gettheList().forEach( s-> System.out.println(s));
	
}
}
