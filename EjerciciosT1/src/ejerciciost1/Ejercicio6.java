package ejerciciost1;

import java.util.Scanner;

class Ejercicio6 {

	public static void main(String[] args) {
		
		//Declaramos la variable "seg" como "int" porque seran números decimales.
		int seg;
		
		//Declaramos la variable "horas" como "int" porque seran números decimales.
		int horas;
		
		//Declaramos la variable "minutos" como "int" porque seran números decimales.
		int minutos;
		
		//Declaramos la variable "segundosFinales" como "int" porque seran números decimales.
		int segundosFinales;
		
		//Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario la cantidad total de segundos.
		System.out.println("Introduce una cantidad de segundos: ");
		
		//Leemos los segundos del teclado.
		seg = sc.nextInt();
		
		//Instrucciones para calcular las horas.
		horas = seg/3600;
		
		//Instrucciones para calcular los minutos.
		minutos = (seg%3600) / 60;
		
		//Instrucciones para calcular los segundos finales.
		segundosFinales = (seg%3600)%60 ;
		
		//Mostramos las horas.
		System.out.println("Son :" + horas);
		
		//Mostramos los minutos.
		System.out.println("Son :" + minutos);
		
		//Mostramos los segundos.
		System.out.println("Son :" + segundosFinales);
		
		//Cierre
		sc.close();
	}

}
