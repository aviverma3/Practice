package Java8StreamNew;

public class Employee {
	
	private int   id;
	private String  name;
	private int Age;
	private String dep;
	private int Salary;
	
	
	
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
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
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		Age = age;
	}
	
	
	public Employee(int id, String name, int age, String dep, int salary) {
		super();
		this.id = id;
		this.name = name;
		Age = age;
		this.dep = dep;
		Salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Age=" + Age + "]";
	}
	
	

}
