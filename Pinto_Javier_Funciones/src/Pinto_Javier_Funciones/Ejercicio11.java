
/*
 * Javier Pinto 
 * Ejercicio de Funciones Ejercicio11
 * 
 */


package Pinto_Javier_Funciones;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Introduzca el Número: ");
		int numero = teclado.nextInt();
		
		
		
		for(int i =0;i<TablaMultiplicar(numero).length;i++) {
			System.out.println(numero+ " * " + i + " = " + TablaMultiplicar(numero)[i] );
		}
		
	}

	// Calcula la tabla de multiplicar 
	public static int[] TablaMultiplicar(int numero) {
	
		final int CANTIDAD = 11;
		int resultado[] ;
		resultado = new int [CANTIDAD];
		
		for(int i=1;i <= 10;i++) {
		
			resultado[i] = numero * i;
		
		}
	
		return resultado;
	}
}
