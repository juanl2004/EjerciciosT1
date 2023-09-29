package ejerciciost1;

import java.util.Scanner;

class Ejercicio6 {

	public static void main(String[] args) {
		
		int seg;
		int horas;
		int minutos;
		int segundosFinales;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una cantidad de segundos: ");
		seg = sc.nextInt();
		
		horas = seg/3600;
		minutos = (seg%3600) / 60;
		segundosFinales = (seg%3600)%60 ;
		
		System.out.println("Son :" + horas);
		System.out.println("Son :" + minutos);
		System.out.println("Son :" + segundosFinales);
		
		sc.close();
	}

}
