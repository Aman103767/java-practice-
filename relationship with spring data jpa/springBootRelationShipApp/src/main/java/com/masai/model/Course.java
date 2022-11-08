package com.masai.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer courseId;
	private String courseName;
	private Integer fee;
	



	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", fee=" + fee + "]";
	}


	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "courses")
	private Set<Student> students = new HashSet<>();


	@Override
	public int hashCode() {
		return Objects.hash(courseId, courseName, fee);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(courseId, other.courseId) && Objects.equals(courseName, other.courseName)
				&& Objects.equals(fee, other.fee);
	}


	public Integer getCourseId() {
		return courseId;
	}


	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public Integer getFee() {
		return fee;
	}


	public void setFee(Integer fee) {
		this.fee = fee;
	}


	public Set<Student> getStudents() {
		return students;
	}


	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
}
