package ejerciciost1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Declaramos la variable "num1" como "int" porque escribiremos un número entero.
		int num1;
		
		//Declaramos la variable "num2" como "int" porque escribiremos un número entero.
		int num2;
		
		//Declaramos la variable "dif" como "int" porque el resultado final es un número entero.
		int dif;
		
		//Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario que escriba un número.
		System.out.println("Escribe un número: ");
		
		//Leemos el número del teclado.
		num1 = sc.nextInt();
		
		//Le pedimos al usuario que escriba otro número.
		System.out.println("Escribe un número: ");
		
		//Leemos el número del teclado.
		num2 = sc.nextInt();
		
		//Instrucciones para resolver el problema utilizando el modulo.
		dif = num2 - (num1%num2);
		 
		//Mostramos la solución.
		System.out.println("La cantidad a sumarle es : " + dif);
		
		//Cierre
		sc.close();
		

	}

}
