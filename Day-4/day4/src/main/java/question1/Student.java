package question1;

public class Student {
 private int rollno;
 private String name;
 private int marks;


public Student(int i, String string, int j) {
	// TODO Auto-generated constructor stub
	this.rollno = i;
	this.name = string;
	this.marks = j;
}

public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
}
 
}
