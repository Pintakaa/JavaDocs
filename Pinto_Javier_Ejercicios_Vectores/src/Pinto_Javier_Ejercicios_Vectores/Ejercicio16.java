/*
 * Javier Pinto      
 * Ejerciciosvectores Ejercicio16
 */


package Pinto_Javier_Ejercicios_Vectores;

import java.util.Arrays;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		final int CAPACIDAD =55;
		int numero[];
		numero = new int [CAPACIDAD];
		int posicion =0;
		
		
		for (int i = 1;i <= 10; i++) { 
			// Arrays.fill(array, desde, hasta, valor a introducir)
			Arrays.fill(numero,posicion,posicion+i,i); // REPASAR 
			posicion = posicion +i;
		}		
		
		System.out.println(Arrays.toString(numero));
		/*
		for(int i=0;i< numero.length;i++) {
			System.out.println (numero[i]+ " ");
		}
		*/
	}

}
