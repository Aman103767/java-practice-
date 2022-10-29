package Appconfig;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import question2.Employee;

@Configuration
@ComponentScan(basePackages = "question2")
public class AppConfig {
	@Bean
	public List<Employee> gettheList(){
		List<Employee> list = new ArrayList<>();
	    list.add( new Employee(1,"Aman",2434234));
		list.add( new Employee(1,"Avinash",244234));
		list.add( new Employee(1,"rohit",24484));
		return list;
	}
}
