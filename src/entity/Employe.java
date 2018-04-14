package entity;

public class Employe {
	private long id;
	private String name;
	private double salary;
	private int age;
	public Employe(long id, String name, double salary, int age) {  
		
	}
	public Employe() {
		 
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
