package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employees;

public class ProgramEmployees {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Employees> list = new ArrayList<>();
		System.out.println("How many employees will be registered?");
		Integer n = sc.nextInt();

		for (Integer i = 0; i < n; i++) {
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			list.add(new Employees(id, name, salary));
		}

		// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}

		// PART 3 - LISTING EMPLOYEES:

		System.out.println();
		System.out.println("List of employees:");
		for (Employees obj : list) {
			System.out.println(obj);
		}
		sc.close();

	}

}
