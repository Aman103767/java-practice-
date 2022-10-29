package question3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
public static void main(String[] args) {
	ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
	Travel t = ac.getBean("travel",Travel.class);
	t.journey();
}
}
