package com.bikkadIt.Bank.model;

import jakarta.persistence.Entity;
@Entity
public class Student1 {
	@jakarta.persistence.Id
	private int Id;
	private String Name;
	private String Dept;
	private String Email;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + ", Dept=" + Dept + ", Email=" + Email + "]";
	}
	
	

}
