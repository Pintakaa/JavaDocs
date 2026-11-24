/*
 * Javier Pinto
 * Ejercicio de Funciones Ejercicio2
 * 
 */


package Pinto_Javier_Funciones;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int edad=0;
		
		System.out.print("Introduzca su edad: ");
		edad = teclado.nextInt();
		
		
		if(esMayorEdad(edad) == true ) {
			System.out.print("Es mayor de edad ");
		}else {
			System.out.print("Es menor edad ");
		}
		
		
	}

	// calcula si es mayor de edad 
	public static boolean esMayorEdad(int a) {
		
		boolean resultado = false ;
		
		if(a >= 18 ) {
			resultado = true;
		}else {
			resultado = false;
		}
				
		return resultado;		
	}
	
}
