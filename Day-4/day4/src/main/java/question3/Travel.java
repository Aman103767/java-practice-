package question3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class Travel {
	@Autowired
    Car c ;
public void journey() {
	c.start();
	System.out.println("jounrney started...");
}
@PostConstruct
public void mySetup() {
	System.out.println("inside my setup");
}
@PreDestroy
public void destory() {
	System.out.println("inside destory");
}
}
