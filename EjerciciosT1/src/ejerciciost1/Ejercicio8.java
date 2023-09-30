package ejerciciost1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		 final double costeEntradasInf = 15.50;
		 final int costeEntradasAdt = 20;
		 
		 int numEntradasInf;
		 int numEntradasAdt;
		 
		 double importeTotal;
		 double importeDescuento;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("¿Cuantas entradas infantiles?: ");
		 numEntradasInf = sc.nextInt();
		 
		 System.out.println("¿Cuantas entradas de adultos?: ");
		 numEntradasAdt = sc.nextInt();
		 
		 importeTotal = (double) (costeEntradasInf * numEntradasInf) + (costeEntradasAdt * numEntradasAdt);
		 importeDescuento = importeTotal - (importeTotal*5)/100;
		 importeTotal = importeTotal>=100 ? importeDescuento : importeTotal;
		
		 System.out.println("" + importeTotal);
		 
		 sc.close();
	}

}
