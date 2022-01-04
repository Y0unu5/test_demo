package com;

public class Student {
	int id;
	String name;
	String email;
	String branch;

	public Student() {

	}

	


	public Student(int id, String name, String email, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.branch = branch;
	}




	public Student(String name) {
		this.name = name;
	}

	public String toString() {
		String str = "(" + id + "," + name + "," + email + "," + branch + ")";
		return str;
	}

	public static void main(String[] args) {
		Student s1=new Student();
		s1.id=1713;
		s1.name="Younus";
		s1.email="mkyounus";
		s1.branch="Mech";
		System.out.println(s1.toString());
		Student s2=new Student(1234,"Saqlain","saq123","CSE");
		System.out.println(s2.toString());
		
		Student s3=new Student("Aisha");
		System.out.println(s3.toString());

	}

}
