
/*
 * Javier Pinto
 * Ejercicio de Funciones Ejercicio4
 * 
 */

package Pinto_Javier_Funciones;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int numero=0;
		
		
		System.out.print("Introduzca el primer valor: ");
		numero = teclado.nextInt();
		
		
		System.out.print("Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo: " +  dimeSigno(numero));
		
	}
	// Responde si el valor es positivo negativo o 0
	public static int dimeSigno(int a) {
		
		int resultado;
		
		if (a > 0) {
			resultado = 1;
		}else if (a == 0) {
			resultado = 0;
		}else {
			resultado = -1;
		}
		
		return resultado;
		
	}
	
}
