package question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component(value = "a1")
public class EmployeeService {

	@Autowired
	private Map<Department, Employee> theMap;
	@Autowired
	private List<Employee> theList;
	
    @Autowired
    Environment ev;
	
	private String appName;

	
	public void printMap() {
		 
		 for( Entry<Department, Employee> m: theMap.entrySet()) {
			 System.out.println(m.getKey()+" = "+ m.getValue());
		 }
	
		
	}
	public void printList() {
		Collections.sort(theList,(o1,o2)->(o1.getSalary()>o2.getSalary() ? 1 : -1));
		theList.forEach(s-> System.out.println(s));
		
	}
	public void printAppName() {
		this.appName = ev.getProperty("appName");
		System.out.println("AppName = "+appName);
	   
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
