package question1;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
@Service
public class Main {
	@Autowired
	Environment ev;
  @Bean
  public List<Student> students(){
	  List<Student> s = new ArrayList<>();
	  s.add(new Student(1,"aman",333));
	  s.add(new Student(2,"avinash",363));
	  s.add(new Student(3,"rohit",433));
	  s.add(new Student(4,"kohli",533));
	  s.add(new Student(5,"virat",373));
	  return s;
  }
  @PostConstruct
  public void mySetup() {
	  System.out.println("inside my setup");
  }
  @PreDestroy
  public void destory() {
	  System.out.println("inside my destory");
  }
  public List<String> print() {
	  List<String> s = new ArrayList<>();
	  s.add(ev.getProperty("city1"));
	  s.add(ev.getProperty("city2"));
	  s.add(ev.getProperty("city3"));
	  s.add(ev.getProperty("city4"));
	  s.add(ev.getProperty("city4"));
	  
	  return s;
  }
  
}
