/*
 * Javier Pinto  
 * Ejerciciosvectores Ejercicio6
 */

package Pinto_Javier_Ejercicios_Vectores;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		int m =0;
		int n=0;
		
		
		Scanner teclado = new Scanner(System.in); 
		
		System.out.println("Introduzca el valor  N:");
		n = teclado.nextInt();
		System.out.println("Introduzca el valor  M:");
		m = teclado.nextInt();
		
		final int CAPACIDAD = n;
		int numero [];
		numero = new int [CAPACIDAD]; 
		
		
		for(int i = 0; i < numero.length ; i++) {
			numero[i] = m;
			
			System.out.println("Posicion " +i + " " + numero[i] );
			
			
		}
		
	}

}
