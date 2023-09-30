package ejerciciost1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int dif;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un número: ");
		num1 = sc.nextInt();
		
		System.out.println("Escribe un número: ");
		num2 = sc.nextInt();
		
		dif = num2 - (num1%num2);
		 
		
		System.out.println("La cantidad a sumarle es : " + dif);
		
		
		sc.close();
		

	}

}
