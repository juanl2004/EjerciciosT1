package ejerciciost1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
		//Declaro la varible "numdc" como "double" porque vamos a introducir valores decimales.
		double numdc;
	
		//Declaro la varible "numrd" como "int" porque el resultado va a ser un numero sin decimales.
		int numrd;
		
		//Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario que escriba un numero decimal.
		System.out.println("Intruduce un numero con decimales: ");
		
		// Leemos el numero decimal del teclado.
		numdc = sc.nextDouble();
	
		// Instrucciones para redondear ese numero decimal a uno entero.
		numrd = (int) (numdc+0.5);
		
		// Mostramos el resultado de la operación anterior.
		System.out.println("Redondeo del numero: " + numrd);
		
		//Cierre
		sc.close();
		
	}

}
