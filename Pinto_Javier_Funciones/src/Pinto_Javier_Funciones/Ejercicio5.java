
/*
 * Javier Pinto
 * Ejercicio de Funciones Ejercicio5
 * 
 */


package Pinto_Javier_Funciones;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int millas=0;
		
		
		System.out.print("Introduzca las millas: ");
		millas = teclado.nextInt();
		
		System.out.print("Equivale a los kilometros : " + millas_a_kilometros(millas));
		
	}
	//calcula millas a kilometros 
	public static double millas_a_kilometros(int millas) {
		
		double resultado;
		
		resultado = millas *1.60934;
		
		
		
		return resultado;
	}
	
	
}
