/*
 * Javier Pinto
 * Ejercicio de Funciones Ejercicio3
 * 
 */


package Pinto_Javier_Funciones;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int numero1=0;
		int numero2=0;
		
		System.out.print("Introduzca el primer valor: ");
		numero1 = teclado.nextInt();
		System.out.print("Introduzca el segundo valor: ");
		numero2 = teclado.nextInt();
		
		System.out.print("El numero menor es :  " + minimo(numero1,numero2));
		
	}

	
	// calcula que numero es inferior al otro
	public static int minimo(int a, int b) {
		int resultado;
		
		if(a < b) {
			resultado = a;
		}else {
			resultado = b;
		}
		
		
		return resultado;
	}
	
}
