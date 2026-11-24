/*
 * Javier Pinto  
 * Ejercicio de Funciones Ejercicio15
 * 
 */

package Pinto_Javier_Funciones;

import java.util.Arrays;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		final int CANTIDAD=50;
		int vector[];
		vector = new int [CANTIDAD];
		int contador = 50;
		for(int i=0;i<vector.length;i++) {
			
			
			
			vector[i]= contador;
			contador = contador + 1;
		}
		System.out.println(Arrays.toString(vector));
		System.out.println("La suma del el array: " + SumaArray(vector));
		System.out.println("La media del el array: " + MediaArray(vector));
		
	}
// suma el contenido de un array
	public static int SumaArray(int vector[]) {
		int resultado =0;
		int sumador =0;
		for(int i=0;i<vector.length;i++) {
			
			
			sumador = sumador + vector[i];
			resultado = sumador;
		}
		
		return resultado;
	}
	// calcula la media del contenido de un array
	public static double MediaArray(int vector[]) {
		double resultado =0;
		double media=0;
		double sumador =0;
		for(int i=0;i<vector.length;i++) {
			
			sumador = sumador + vector[i];
			
		}
		media = sumador / vector.length;
		resultado = media;
		return resultado;
		
	}
	
}
