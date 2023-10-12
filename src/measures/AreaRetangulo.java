package measures;
import java.util.Scanner;
public class AreaRetangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		Retangule rect = new Retangule();
		System.out.println("Digite a altura e a largura do retangulo");
		
		rect.height = sc.nextDouble();
		rect.width = sc.nextDouble();
		
		System.out.printf("A area do retangulo é = %.2f%n", rect.area());
		System.out.printf("O perimetro do retangulo é = %.2f%n", rect.perimeter());
		System.out.printf("A diagonal do retangulo é = %.2f%n", rect.diagonal());
		
		
		
		sc.close();
	}
	

	

}
