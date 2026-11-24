/*
 * Javier Pinto      
 * Ejerciciosvectores Ejercicio15
 */


package Pinto_Javier_Ejercicios_Vectores;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		int n;
		int m;
		
		System.out.print("Introduzca el valor n: ");
		n= teclado.nextInt();
		System.out.print("Introduzca el valor n: ");
		m= teclado.nextInt();
		
		final int CAPACIDAD = n;
		int numero[];
		numero = new int [CAPACIDAD];
		
		Arrays.fill(numero, m);
		
		
		 System.out.println(Arrays.toString(numero));
		
		/*for(int i=0;i< numero.length;i++) {
			System.out.println (numero[i]+ " ");
			
		}
		*/
	}

}
