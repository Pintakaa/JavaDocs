
/*
 * Javier Pinto
 * Ejercicio de Funciones Ejercicio9
 * 
 */

package Pinto_Javier_Funciones;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		int numero1;
		int numero2;
		int numero3;
		
		System.out.print("Introduzca el número: ");
		numero1 = teclado.nextInt();
		System.out.print("Introduzca el número: ");
		numero2 = teclado.nextInt();
		System.out.print("Introduzca el número: ");
		numero3 = teclado.nextInt();
		
		int resultado= CalculaMinimos(numero1,numero2);
		System.out.print("El número inferior de los tres es:  " + CalculaMinimos(resultado,numero3));
		
	}

	public static int CalculaMinimos(int n1, int n2) {
		int resultado;
		
		if (n1 < n2) {
			resultado= n1;
		}else {
			resultado = n2;
		}
		
		return resultado;
	}
	
}
