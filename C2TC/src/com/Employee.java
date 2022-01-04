package com;

public class Employee {
	int id;
	String name;
	String email;
	float salary;
	public Employee()
	{

	}

	public Employee(int id, String name, String email, float salary) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	public Employee(int id) {
		this.id = id;
	}

	public String toString() {
		String str="("+id+","+name+","+email+","+salary+")";
		return str;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.id = 102;
		e1.name = "Younus";
		e1.email = "mkyounus";
		e1.salary = 30.24f;
		System.out.println(e1.toString());
		Employee e2 = new Employee(112, "Saqlain", "saq123", 25.45f);
		System.out.println(e2.toString());
		Employee e3 = new Employee(115);

	}

}
