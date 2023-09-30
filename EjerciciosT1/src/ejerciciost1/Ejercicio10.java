package ejerciciost1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
	double longitudM;
	double longitudCent;
	int sol;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Escribe la longitud en metros: ");
	longitudM = sc.nextDouble();
	
	longitudCent = longitudM*100;
	sol= (int) longitudCent;
	
	System.out.println("La parte entera correspondiente en cent: " + sol + " cm");
	
	sc.close();
	
	
	
	}

}
