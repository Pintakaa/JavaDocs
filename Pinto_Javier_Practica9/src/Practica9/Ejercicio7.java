/*
 * Javier Pinto Aldana   
 * BUCLES Practica9 Ejercicio7
 */


package Practica9;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		int cantidad = 0;
		int numero = 1;
		int max = 100;
		int negativo = 0;
		int positivo = 0;
		
		
		while(cantidad < max) {
			System.out.print("Introduza un valor: ");
			numero = teclado.nextInt();
			cantidad = cantidad +1;
			
			if (numero > 0) {
				positivo = positivo +1;
			}else if (numero < 0) {
				negativo = negativo +1;
			}else {
				cantidad = cantidad -1;
			}

		}
	

		System.out.println("Cantidad de números positivos: " + positivo);	
		System.out.println("Cantidad de números negativos: " + negativo);	
	}
}
