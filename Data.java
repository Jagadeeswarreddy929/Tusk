package com.jaggu;

public class Data {

	String Student;
	int Roll;
	
	public Data(String student, int roll) {
		this.Student = student;
		this.Roll = roll;
	}

	public String getStudent() {
		return Student;
	}

	public void setStudent(String student) {
		this.Student = student;
	}

	public int getRoll() {
		return Roll;
	}

	public void setRoll(int roll) {
		this.Roll = roll;
	}

	@Override
	public String toString() {
		return "Data [Student=" + Student + ", Roll=" + Roll + "]";
	}
	

}
