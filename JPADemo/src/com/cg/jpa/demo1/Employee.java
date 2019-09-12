package com.cg.jpa.demo1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;

@Entity
/* @Table(name="emp_details") */
@NamedQueries({//This is used to contain all the named queries
@NamedQuery(name="getAllEmployees", query="from Employee"),//This annotation can be used only once
@NamedQuery(name="getEmployeeByGender", query="from Employee where gender=:gen")
})
public class Employee {
	@Id
	@SequenceGenerator(name = "myseq", sequenceName = "emp_seq1", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "myseq")
	/* @Column(name="eno") */
	private int id;
	/* @Column(name="ename") */
	private String name;
	private String gender;
	private int age;
	/* @Transient */
	private double salary;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String gender, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", salary=" + salary
				+ "]";
	}

}
