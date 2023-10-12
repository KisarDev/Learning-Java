package programs;
import java.util.Scanner;
import entities.Employe;
public class ProgramEmploye {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employe ep = new Employe();
		System.out.println("Insira o nome, taxa de desconto, e a porcentagem de aumento");
		
		ep.name = sc.nextLine();
		ep.grossSalary = sc.nextDouble();
		ep.tax = sc.nextDouble();
		double percentage = sc.nextDouble();
		
		System.out.printf("Name: %n" + ep);
		ep.incleaseSalary(percentage);
		
		
		System.out.println();
		System.out.println("Updated data: " + ep);
		
		sc.close();
	}
	
}
