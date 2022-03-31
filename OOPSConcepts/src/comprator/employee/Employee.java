package comprator.employee;

class Employee implements Comparable<Employee> {
	int id;
	String name;
	int age;
	Employee()
	{
		System.out.println("hello");
	}

	Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Employee emp) {
		if (age == emp.age)
			return 0;
		else if (age > emp.age)
			return 1;
		else
			return -1;
	}
}