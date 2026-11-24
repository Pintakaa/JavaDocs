/*
 * Javier Pinto  
 * Ejercicio de Funciones Ejercicio16
 * 
 */
package Pinto_Javier_Funciones;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		
		int cantidad;
		
		System.out.print("Introduzca tamño de array: ");
		cantidad = teclado.nextInt();
		
		double vector[];
		vector = new double [cantidad];
		
	
		
		RellenarArray(vector);
		System.out.println(Arrays.toString(vector));
		
	}
	// rellena el interior de un vector
	public static double[] RellenarArray(double vector[]) {
		
		
		
		
		for(int i=0;i<vector.length;i++) {
			
			vector[i]= (Math.random());
			
		}
		
		
		
		
		return vector;
	}
	
	
	
	
}
