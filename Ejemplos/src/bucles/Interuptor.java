/*
 * javier Pinto interuptor
 */



package bucles;

import java.util.Scanner;

public class Interuptor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner (System.in);	
	int numero;	
	boolean par = false; // interuptor
	
	do {
		System.out.println("Dime un número (0 para terminar): ");
		numero = teclado.nextInt();
		if (numero %2 == 0 && numero!=0) {
			par = true;
		}
		
		} while (numero != 0);
	//analizamos el valor del interuptor
		if(par == true) {
	
			System.out.println("Algún número era par");
	
		}else {
			System.out.println("Ningun número ha sido par");
		}

	}
}
