/*
 * Javier Pinto  
 * Ejerciciosvectores Ejercicio6
 */

package Pinto_Javier_Ejercicios_Vectores;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int p = 0;
		int q = 0;
		
		
		Scanner teclado = new Scanner(System.in); 
		
		System.out.println("Introduzca el valor  p:");
		p = teclado.nextInt();
		System.out.println("Introduzca el valor  q:");
		q = teclado.nextInt();
		
		final int CAPACIDAD = q - p+1; // tamaño del vector 
		int numero [];
		numero = new int [CAPACIDAD]; 
		
		
		for(int i = 0;i <numero.length; i++) {
			
			numero[i]= i + p; // asi sacamos los numeros de p a q IMPORTANTE!!!
			
			
			
			
			
			System.out.println("Posicion " + i + " " + numero[i] );
			
			
			
		}
		
	}

}
