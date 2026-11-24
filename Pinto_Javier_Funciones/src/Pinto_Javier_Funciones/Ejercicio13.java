/*
 * Javier Pinto 
 * Ejercicio de Funciones Ejercicio13
 * 
 */

package Pinto_Javier_Funciones;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Introduzca la cantidad sin descuento: ");
		double cantidadsin = teclado.nextDouble();
		System.out.print("Introduzca la cantidad con descuento: ");
		double cantidadcon = teclado.nextDouble();
		
		System.out.print("El descuento aplicado es de : " + Descuentoporcentaje(cantidadsin,cantidadcon) + " % ");
		
	}
	// calcula cuanto porcentaje de descuento se nos ha aplicado a la compra
	public static double Descuentoporcentaje(double cantidadsin, double cantidadcon) {
		double resultado;
		
		resultado = cantidadcon * 100 / cantidadsin;
		
		
		return resultado;
	}
	
	
	
}
