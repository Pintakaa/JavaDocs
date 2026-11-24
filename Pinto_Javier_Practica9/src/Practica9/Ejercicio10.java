/*
 * Javier Pinto Aldana    
 * BUCLES Practica9 Ejercicio10
 
 */


package Practica9;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
				
		int numero;
		int nota;
		boolean interruptor = false;
		boolean sobresaliente = false;
		
		while(interruptor != true) {
			System.out.print("Introduzca la nota: ");
			nota = teclado.nextInt();
			
			if(nota == -1) {
				interruptor = true;
			}else if(nota == 10) {
				sobresaliente = true;
			}
		}
		
		if(sobresaliente == true) {
		System.out.print("Ha habido alguna nota con valor de 10.");
		}// COMPROBAAAR ESTE SCRIPT
	}

}
