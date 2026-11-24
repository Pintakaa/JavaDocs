
/*
 * Javier Pinto
 * Ejercicio de Funciones Ejercicio8
 * 
 */

package Pinto_Javier_Funciones;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner (System.in);
		
		int numero;
		
		
		System.out.print("Introduzca el número: ");
		numero = teclado.nextInt();
		
		
		System.out.println("Devuelve la suma de enteros de 1 a n: " + suma1aN(numero));
		System.out.println("Devuelve el producto de enteros de 1 a n:  " + producto1aN(numero));
		System.out.println("Devuelve el valor intermedio entre 1 y n: " + intermedio1aN(numero));
	}

	// Devuelve la suma de enteros de 1 a n
	public static int suma1aN(int n) {
		int resultado=0;
		
		
		for(int i=0;i<=n;i++) {
			resultado = resultado + i;
		}
		
		return resultado;
	}
	// Devuelve el producto de enteros de 1 a n
	public static int producto1aN(int n) {
		int resultado=1;
		for(int i=1;i<=n;i++) {
			
			resultado = resultado * i;
		}
		
		return resultado;
	}
	
	// Devuelve el valor intermedio entre 1 y n
	public static double intermedio1aN(int n) {
	
		double resultado = n /2;
		
		return resultado;
	}
	
}
