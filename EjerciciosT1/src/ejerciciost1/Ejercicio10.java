package ejerciciost1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
	
	//Declaramos la variable como double porque el valor es un número decimal.
	double longitudM;
	
	//Declaramos la variable como double porque el valor es un número decimal.
	double longitudCent;
	
	//Declaramos la variable como int porque el valor es un número entero.
	int sol;
	
	//Creamos el Scanner.
	Scanner sc = new Scanner(System.in);
	
	//Le pedimos al usuario la longitud en metros .
	System.out.println("Escribe la longitud en metros: ");
	
	//Leemos el numero del teclado.
	longitudM = sc.nextDouble();
	
	//Instrucciones para calcular la longitud en centimetros.
	longitudCent = longitudM*100;
	
	//Utilizamos las conversiones de tipos para coger la parte entera.
	sol= (int) longitudCent;
	
	//Mostramos la solución.
	System.out.println("La parte entera correspondiente en cent: " + sol + " cm");
	
	//Cierre
	sc.close();
	
	
	}

}
