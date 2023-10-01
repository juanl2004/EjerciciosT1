package ejerciciost1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	
		//Declaramos la variable como int.
		int a;
		
		//Declaramos la variable como int.
		int b;
		
		//Declaramos la variable como int.
		int c;
		
		//Declaramos la variable como int.
		int x;
		
		//Declaramos la variable como int.
		int y;
		
		//Creamos el Scanner.
		Scanner sc = new Scanner(System.in);

		//Le pedimos al usuario que introduzca el valor de "a".
		System.out.println("Introduce cuanto quieres que valga (a): ");
		
		//Leemos el valor del teclado.
		a = sc.nextInt();
		
		//Le pedimos al usuario que introduzca el valor de "b".
		System.out.println("Introduce cuanto quieres que valga (b): ");
		
		//Leemos el valor del teclado.
		b = sc.nextInt();
		
		//Le pedimos al usuario que introduzca el valor de "c".
		System.out.println("Introduce cuanto quieres que valga (c): ");
		
		//Leemos el valor del teclado.
		c = sc.nextInt();
		
		//Le pedimos al usuario que introduzca el valor de "x".
		System.out.println("Introduce cuanto quieres que valga (x): ");
		
		//Leemos el valor del teclado.
		x = sc.nextInt();
		
		//Instrucciones para resolver el polinomio.
		y = a*x^2+b*x+c;
		
		//Mostramos la solución del polinomio.
		System.out.println("El resultado de nuestro polinomio es: " + y);
		
		//Cierre
		sc.close();
	}

}
