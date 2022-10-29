package question2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service(value = "a1")
public class EmployeeService {

	//@Autowired
	//private Map<Department, Employee> theMap;
	@Autowired
	private List<Employee> theList;
	private String appName;
	//@Bean
//	public Map<Department,Employee> gettheMap(){
//		Map<Department,Employee> map = new HashMap<>();
//		map.put(new Department(1,"HR","gwalior"), new Employee(1,"Aman",2434234));
//		map.put(new Department(1,"Marketing","Delhi"), new Employee(1,"Avinash",244234));
//		map.put(new Department(1,"Account","Varanasi"), new Employee(1,"rohit",24484));
//		return map;
//	}
	@Bean
	public List<Employee> gettheList(){
		List<Employee> list = new ArrayList<>();
	    list.add( new Employee(1,"Aman",2434234));
		list.add( new Employee(1,"Avinash",244234));
		list.add( new Employee(1,"rohit",24484));
		return list;
	}
	
	public void printMap() {
		
	}
	public void printList() {
		
	}
	public void printAppName() {
		
	}
	@Override
	public String toString() {
		return "EmployeeService [theMap=" + theMap + ", theList=" + theList + ", appName=" + appName + "]";
	}
	public Map<Department, Employee> getTheMap() {
		return theMap;
	}
	public void setTheMap(Map<Department, Employee> theMap) {
		this.theMap = theMap;
	}
	public List<Employee> getTheList() {
		return theList;
	}
	public void setTheList(List<Employee> theList) {
		this.theList = theList;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	} 
	
	
}
