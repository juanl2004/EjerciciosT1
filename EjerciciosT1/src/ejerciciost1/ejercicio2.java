package ejerciciost1;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
		//Declaro la variable "numEntero" como "int" porque escribiremos un numero entero.
		int numEntero;
		
		//Declaro la variable "n" como "int" porque el resultado va a ser un numero sin decimales.
		int cantSumar;
		
		//Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario que escriba un numero entero.
		System.out.println("Escribe un número entero: ");
		
		//Le pedimos que lo lea del teclado.
		numEntero = sc.nextInt();
		
		//Instrucciones usando el modulo para calcular esa cantidad cantidad final.
		cantSumar = 7 - (numEntero%7) ;
		
		//Instrucciones para que la cantidad que haya que sumarle cuando indroduzcamos 7 sea 0.
		cantSumar = (cantSumar!= 7) ? cantSumar : 0;
		
		//Mostramos el resultado final.
		System.out.println("La cantidad a sumarle es : " + cantSumar );
		
		//Cierre.
		sc.close();
		

	}

}
