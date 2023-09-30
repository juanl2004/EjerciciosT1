package ejerciciost1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		double num1;
		double num2;
		boolean sol;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		num1 = sc.nextDouble();
		
		System.out.println("Introduce otro numero: ");
		num2 = sc.nextDouble();
		
		sol = num1==num2;
				 
		System.out.println("La solución es: " + sol);
		
		

	}

}
