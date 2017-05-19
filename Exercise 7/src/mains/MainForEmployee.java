package mains;

import classes.Employee;

public class MainForEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("Jeff", 21, 35000,5);
	Employee e2 = new Employee("Ben", 25, 32000,10);
	Employee e3 = new Employee("Glen", 36, 39000,5);
	Employee e4 = new Employee("Ken", 66, 37000,6);
	Employee e5 = new Employee("Sven", 19, 35000,7);
	Employee e6 = new Employee("Len", 45, 40000,5);
	
	Employee [] arr = new Employee[]{e1,e2,e3,e4,e5,e6};
	printArr(arr);
	e1.increaseSalary(5000);
	System.out.println();
	printArr(arr);
	}
	public static void printArr(Employee [] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}
	
		
	}
}
	
	
	
