package question2;

public class Department {
 private int deptId;
 private String deptName;
 private String location;
public Department(int i, String string, String string2) {
	// TODO Auto-generated constructor stub
	this.deptId = i;
	this.deptName = string;
	this.location = string2;
}
public int getDeptId() {
	return deptId;
}
public void setDeptId(int deptId) {
	this.deptId = deptId;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}

@Override
public String toString() {
	return "Department [deptId=" + deptId + ", deptName=" + deptName + ", location=" + location + "]";
}
 
}
