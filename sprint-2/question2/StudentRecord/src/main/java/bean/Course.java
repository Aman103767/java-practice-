package bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CourseId;
	private String CourseName;
	private String duration;
	private int fee;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Student> students = new ArrayList<>();
	
	
	
	public int getCourseId() {
		return CourseId;
	}
	@Override
	public String toString() {
		return "Course [CourseId=" + CourseId + ", CourseName=" + CourseName + ", duration=" + duration + ", fee=" + fee
				+ "]";
	}
	
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	
	
}
