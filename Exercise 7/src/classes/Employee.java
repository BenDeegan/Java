package classes;

public class Employee {
	private String name;
	private int age;
	private double salary;
	private int numSickDays;
	private int employeeNum;
	public static int numOfEmploy;
	
	public Employee(){
		numOfEmploy++;
		employeeNum += numOfEmploy;
	}
	
	public Employee(String name){
		setName(name);
	}
	
	public Employee(String name, int age, double salary, int numSickDays) throws InvalidAgeException{
		this();
		setAge(age);
		setName(name);
		setNumSickDays(numSickDays);
		setSalary(salary);
	}
	
	public  double increaseSalary(double increase){
		salary += increase;
		return salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws InvalidAgeException{
		
		if(age >= 16 && age <=70){
			this.age = age;
		} else {
			throw new InvalidAgeException(age + "not valid");
		}
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getNumSickDays() {
		return numSickDays;
	}
	public void setNumSickDays(int numSickDays) {
		this.numSickDays = numSickDays;
	}
	public int getEmployeeNum() {
		return employeeNum;
	}
	public void setEmployeeNum(int employeeNum) {
		this.employeeNum = employeeNum;
	}

	
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", numSickDays=" + numSickDays
				+ ", employeeNum=" + employeeNum + "]";
	}
	
	

}
