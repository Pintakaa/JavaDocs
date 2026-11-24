/*
 * Javier Pinto      
 * Ejerciciosvectores Ejercicio13
 */


package Pinto_Javier_Ejercicios_Vectores;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		final int CAPACIDAD =10;
		int numero[];
		numero = new int [CAPACIDAD];
		int v = 0;
		int l =0;
		
		System.out.print("Introduzca el valor v:");
		v=teclado.nextInt();
		System.out.print("Introduzca el valor l:");
		l= teclado.nextInt();
		int sumatorio = v;
		
		for (int i=0;i<numero.length;i++) {
			
			numero[i]= sumatorio;
			sumatorio = sumatorio +l;		
					
			System.out.println("Secuencia aritmética: " + numero[i] );
		}
		
	}

}
