package ejerciciost1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		//Declaramos esta constante como double porque el valor es decimal.
		final double costeEntradasInf = 15.50;
		
		//Declaramos la constante como int porque el valor es un número entero.
		final int costeEntradasAdt = 20;
		 
		//Declaramos la variable como int porque el valor es un número entero.
		int numEntradasInf;
		
		//Declaramos la variable como int porque el valor es un número entero.
		int numEntradasAdt;
		
		//Declaramos la variable como double porque el valor es un número decimal.
		double importeTotal;
		
		//Declaramos la variable como double porque el valor es un número decimal.
		double importeDescuento;
		 
		//Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario el número de entradas infantiles.
		System.out.println("¿Cuantas entradas infantiles?: ");
		
		//Leemos el número del teclado.
		numEntradasInf = sc.nextInt();
		
		//Le pedimos al usuario el número de estradas adultas.
		System.out.println("¿Cuantas entradas de adultos?: ");
		
		//Leemos el número del teclado.
		numEntradasAdt = sc.nextInt();
		
		//Calculamos la suma total de entradas.
		importeTotal = (double) (costeEntradasInf * numEntradasInf) + (costeEntradasAdt * numEntradasAdt);
		
		//Calculamos el descuento.
		importeDescuento = importeTotal - (importeTotal*5)/100;
		
		//Utilizamos el ternario para identificar cuando hacer el descuento.
		importeTotal = importeTotal>=100 ? importeDescuento : importeTotal;
		
		//Mostramos la solución.
		System.out.println("" + importeTotal);
		
		//Cierre.
		sc.close();
	}

}
