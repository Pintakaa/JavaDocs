
/*
 * Javier Pinto 
 * Ejercicio de Funciones Ejercicio12
 * 
 */
package Pinto_Javier_Funciones;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner teclado = new Scanner (System.in);
		double kilometros = 0;
		
		
		System.out.print("Introduzca los kilometros: ");
		kilometros = teclado.nextDouble();
		
		System.out.print("Equivale a millas  : " + KillometrosAmillas(kilometros));
		
	}
	//calcula millas a kilometros 
	public static double KillometrosAmillas(double kilometros) {
		
		double resultado;
		
		resultado = kilometros * 0.6214;
		
		
		
		return resultado;
	}
	
	
}
