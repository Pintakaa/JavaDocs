/*Javier Pinto 
 * Cadena de caracteres Ejercicio1
 * 
 */


package Pinto_Javier_cadena_caracteres;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		String cadena;
		
		System.out.print("Introduzca la cadena de caracteres: ");
		cadena = teclado.nextLine();
		
		String[] palabras = cadena.split(" ");
		for (int i = 0; i < palabras.length; i++) {
		    String palabra = palabras[i];
		    System.out.println(palabra);
		
		}
		
		
	}

}
