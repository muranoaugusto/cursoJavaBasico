package projects.e100.application100;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import projects.e100.entities100.Employee100;


public class Execution100 {

	public  void employeeRegister() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee100> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			
			System.out.println();
			System.out.println("Emplyoee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee100 emp = new Employee100(id, name, salary);
			
			list.add(emp);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		int idsalary = sc.nextInt();

		// Integer pos = position(list, idsalary);
		
		Employee100 emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		
		// if (pos == null) {
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			//list.get(pos).increaseSalary(percent);
			emp.increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee100 e : list) {
			System.out.println(e);
		}		
		
		sc.close();
	}

	public static Integer position(List<Employee100> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<Employee100> list, int id) {
		Employee100 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}



}