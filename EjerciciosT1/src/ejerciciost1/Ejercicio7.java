package ejerciciost1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		//Declaramos la variable double porque hay decimales.
		double medMm;
		
		//Declaramos la variable double porque hay decimales.
		double medCm;
		
		//Declaramos la variable double porque hay decimales.
		double medM;
		
		//Declaramos la variable double porque hay decimales.
		double medMmACm;
		
		//Declaramos la variable double porque hay decimales.
		double medMACm;
		
		//Declaramos la variable double porque hay decimales.
		double restFinal;
		
		//Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usurio la medida en milimetros
		System.out.println("Introduce la primera medida en milímetros: ");
		
		//Leemos la medida del teclado.
		medMm = sc.nextDouble();
		
		//Le pedimos al usuario la segunda medidia en centimetros.
		System.out.println("Introduce la segunda medida en centimetros: ");
		
		//Leemos la medida del teclado.
		medCm = sc.nextDouble();
		
		//Le pedimos al usuario la tercera medida en metros.
		System.out.println("Introduce la tercera medida en metros: ");
		
		//Leemos la medida del teclado.
		medM = sc.nextDouble();
		
		//Instrucciones para pasar de milimetros a metros.
		medMmACm = medMm/10;
		
		//Instrucciones para pasar de metros a centímetros.
		medMACm = medM*100;
		
		//Calculando la suma total en centímetros.
		restFinal = medMmACm + medMACm + medCm;
		
		//Mostramos la solución.
		System.out.println("La suma de estas medidas es: " + restFinal);
		
		//Cierre
		sc.close();
	}

}
