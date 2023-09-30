package ejerciciost1;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
		int numEntero;
		int cantSumar;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un número entero: ");
		numEntero = sc.nextInt();
		
		cantSumar = 7 - (numEntero%7) ;
		 
		cantSumar = (cantSumar!= 7) ? cantSumar : 0;
		
		
		System.out.println("La cantidad a sumarle es : " + cantSumar );
		
		
		sc.close();
		

	}

}
