package com.mindtree.OnetoMany.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private int depId;
	private String depName;
	private int empNumbers;
	
	private Department() {}
	public Department(String depName, int empNumbers) {
		super();
		this.depName = depName;
		this.empNumbers = empNumbers;
	}

	public int getDepid() {
		return depId;
	}

	public void setDepid(int depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public int getEmpNumbers() {
		return empNumbers;
	}

	public void setEmpNumbers(int empNumbers) {
		this.empNumbers = empNumbers;
	}

	@Override
	public String toString() {
		return "Department [depId=" + depId + ", depName=" + depName + ", empNumbers=" + empNumbers + "]";
	}
   	
}