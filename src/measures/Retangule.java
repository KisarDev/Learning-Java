package measures;

import java.util.Scanner;

public class Retangule {
	
	Scanner sc = new Scanner(System.in);
	double width;
	
	double height;
	
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}
	
	public double diagonal() {
		return Math.sqrt(height * height + width * width);
	}
	
	
	
}
