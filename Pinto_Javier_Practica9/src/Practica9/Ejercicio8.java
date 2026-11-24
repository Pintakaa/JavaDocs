/*
 * Javier Pinto Aldana   
 * BUCLES Practica9 Ejercicio8
 */


package Practica9;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner teclado = new Scanner (System.in);
		
		
		int numero = 1;
		int negativo = 0;
		int positivo = 0;
		boolean interruptor = false;
		
		while(interruptor != true) {
			System.out.print("Introduza un valor: ");
			numero = teclado.nextInt();
	
			
			if (numero > 0) {
				positivo = positivo +1;
			}else if (numero < 0) {
				negativo = negativo +1;
			}else {
				interruptor = true;
			}

		}
	

		System.out.println("Cantidad de números positivos: " + positivo);	
		System.out.println("Cantidad de números negativos: " + negativo);	
	}
}
