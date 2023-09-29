package ejerciciost1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	
		int a;
		int b;
		int c;
		int x;
		int y;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce cuanto quieres que valga (a): ");
		a = sc.nextInt();
		
		System.out.println("Introduce cuanto quieres que valga (b): ");
		b = sc.nextInt();
		
		System.out.println("Introduce cuanto quieres que valga (c): ");
		c = sc.nextInt();
		
		System.out.println("Introduce cuanto quieres que valga (x): ");
		x = sc.nextInt();
		
		y = a*x^2+b*x+c;
		
		System.out.println("El resultado de nuestro polinomio es: " + y);
		
		sc.close();
	}

}
