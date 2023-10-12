package programs;
import java.util.Scanner;
import entities.Student;
public class ProgramStudent {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			Student std = new Student();
			
			std.name = sc.nextLine();
			std.nota1 = sc.nextDouble();
			std.nota2 = sc.nextDouble();
			std.nota3 = sc.nextDouble();
			System.out.println(std);
		}
	}

}
