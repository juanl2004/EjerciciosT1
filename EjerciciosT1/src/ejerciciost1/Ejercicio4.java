package ejerciciost1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		int base;
		int altura;
		int area;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe la base de tu triandulo: ");
		base = sc.nextInt();
		
		System.out.println("Escribe la altura de un triangulo: ");
		altura = sc.nextInt();
		
		area = (base*altura)/2;
		
		System.out.println("El area de nuestro triangulo es: " + area);
		
		sc.close();
				
		
		

	}

}
