package com.sathya.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Durga {
	
	@Id
	private Integer id;
	
	private String course;
	
	private double salary;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Durga [id=" + id + ", course=" + course + ", salary=" + salary + "]";
	}
	
	

}
