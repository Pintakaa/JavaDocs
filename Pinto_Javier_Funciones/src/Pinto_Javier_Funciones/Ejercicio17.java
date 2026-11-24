/*
 * Javier Pinto  
 * Ejercicio de Funciones Ejercicio16
 * 
 */

package Pinto_Javier_Funciones;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner (System.in);
		
		int numero;
		
		do {
			System.out.print("Introduzca el numero: ");
			numero = teclado.nextInt();
			
			if(Primosiono(numero) == true && numero != 1 ) {
				System.out.print("El número es primo");
			}else {
				System.out.print("El número NO es primo");
			}
			
		}while(numero == 0);
		
		
	}
	// comprueba si el numero introducido es primo o no
	public static boolean Primosiono(int numero) {
		
		boolean resultado = false;
		int i=2;
		
		
		while( i < numero) {
			// con el % sirve para que me de el resto de la division
			if(numero%i == 0 ) {
				resultado = true;
			}else {
				resultado = false;
			}
			
			i= i +1;
			
		}
		
		return resultado;
	}
	
	
	
	
}
