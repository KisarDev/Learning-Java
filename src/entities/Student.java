package entities;

public class Student {
	public double nota1, nota2, nota3;
	public String name;
	
	
	public double media() {
		return (nota1 + nota2 + nota3);
	}
	
	public String toString() {
		if (media() > 60) {
			return name + ", Sua nota foi " + String.format("%.2f", media()) + " Pass";
		}
		else {
			return name + ", Sua nota foi " + String.format("%.2f", media()) + " Failed" + " Missing " + (60 - media());
		}					
	}
}
