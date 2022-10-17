package bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Teacher {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teacherId;
	private String teacherName;
	private int noYearOfExperince;
	private int email;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Course> courses = new ArrayList<>();
	
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public int getNoYearOfExperince() {
		return noYearOfExperince;
	}
	public void setNoYearOfExperince(int noYearOfExperince) {
		this.noYearOfExperince = noYearOfExperince;
	}
	public int getEmail() {
		return email;
	}
	public void setEmail(int email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", noYearOfExperince="
				+ noYearOfExperince + ", email=" + email + "]";
	}
	
	
}
