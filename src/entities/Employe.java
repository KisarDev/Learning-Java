package entities;

public class Employe {
	public String name;
	public double grossSalary, tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void incleaseSalary(double percentage) {
		
		grossSalary += grossSalary * percentage / 100.0; 
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
		}
}
