package Appconfig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import question2.Department;
import question2.Employee;

@Configuration
@ComponentScan(basePackages = "question2")
@PropertySource("a1.properties")
public class AppConfig {
	@Bean
	public List<Employee> gettheList(){
		List<Employee> list = new ArrayList<>();
	    list.add( new Employee(1,"Aman",2434234));
		list.add( new Employee(1,"Avinash",244234));
		list.add( new Employee(1,"rohit",24484));
		return list;
	}
	@Bean
	public Map<Department,Employee> gettheMap(){
		Map<Department,Employee> map = new HashMap<>();
		map.put(new Department(1,"HR","gwalior"), new Employee(1,"Aman",2434234));
		map.put(new Department(1,"Marketing","Delhi"), new Employee(1,"Avinash",244234));
		map.put(new Department(1,"Account","Varanasi"), new Employee(1,"rohit",24484));
		return map;
	}
	
}
