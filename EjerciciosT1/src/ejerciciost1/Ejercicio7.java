package ejerciciost1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		double medMm;
		double medCm;
		double medM;
		double medMmACm;
		double medMACm;
		double restFinal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la primera medida en milímetros: ");
		medMm = sc.nextDouble();
		
		System.out.println("Introduce la segunda medida en centimetros: ");
		medCm = sc.nextDouble();
		
		System.out.println("Introduce la tercera medida en metros: ");
		medM = sc.nextDouble();
		
		medMmACm = medMm/10;
		medMACm = medM*100;
		restFinal = medMmACm + medMACm + medCm;
		
		System.out.println("La suma de estas medidas es: " + restFinal);
		
	}

}
