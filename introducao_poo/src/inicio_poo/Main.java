package inicio_poo;
import inicio_poo.triangulo;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		triangulo x, y;
		x = new triangulo();
		y = new triangulo();
		
		System.out.println("Digite os lados do triângulo:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		double area = (x.a + x.b + x.c)/2;
		
		System.out.println("Área:" + area);
		
		

	}

}
