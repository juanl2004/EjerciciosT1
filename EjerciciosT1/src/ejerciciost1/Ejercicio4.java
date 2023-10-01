package ejerciciost1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		//Declaramos la variable "base" como "double" porque podemos escribir un número en decimal.
		double base;
		
		//Declaramos la variable "altura" como "double" porque podemos escribir un número en decimal.
		double altura;
		
		//Declaramos la variable "area" como "double" porque la solución puede salir con decimales.
		double area;
		
		//Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario que escriba el area del triangulo.
		System.out.println("Escribe la base de tu triandulo: ");
		
		//Leemos el número del teclado.
		base = sc.nextDouble();
		
		//Le pedimos al usuario que escriba la altura de un triangulo.
		System.out.println("Escribe la altura de un triangulo: ");
		
		//Leemos el número del teclado.
		altura = sc.nextDouble();
		
		//Instrucciones para calcular el area.
		area = (base*altura)/2;
		
		//Mostramos la solución.
		System.out.println("El area de nuestro triangulo es: " + area);
		
		//Cierre.
		sc.close();
				
		
		

	}

}
