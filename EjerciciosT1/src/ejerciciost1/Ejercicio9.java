package ejerciciost1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		//Declaramos la variable como double porque el valor puede ser un número decimal.
		double num1;
		
		//Declaramos la variable como double porque el valor puede ser un número decimal.
		double num2;
		
		//Declaramos la variable boolean porque la solución sera "true" o "false".
		boolean sol;
		
		//Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario que introduzca un número.
		System.out.println("Introduce un numero: ");
		
		//Leemos le número del teclado.
		num1 = sc.nextDouble();
		
		//Le pedimos al usuario que introduzca un número.
		System.out.println("Introduce otro numero: ");
		
		//Leemos le número del teclado.
		num2 = sc.nextDouble();
		
		//Instrucciones para calcular la solución.
		sol = num1==num2;
		
		//Mostramos la solución
		System.out.println("La solución es: " + sol);
		
		//Cierre.
		sc.close();
		

	}

}
