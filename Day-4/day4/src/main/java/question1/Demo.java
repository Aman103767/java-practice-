package question1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
public static void main(String[] args) {
	ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
	Main t = ac.getBean("main",Main.class);
	t.students().forEach(s->System.out.println(s));
	t.print().forEach(s->System.out.println(s));
	((AnnotationConfigApplicationContext)ac).close();
}
}
