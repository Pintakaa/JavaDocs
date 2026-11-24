/*Javier Pinto  
 * Cadena de caracteres Ejercicio5
 * 
 */
package Pinto_Javier_cadena_caracteres;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		String frase;
		
		// replace  selecciona el valor vacio " " y lo cambia por nada "" 
		System.out.print("Introduzca la cadena de caracteres: ");
		frase = teclado.nextLine().toLowerCase().replace(" ", "");
		
		String frasealreves ;
		
		// stringbuilder convierte el String en uno modificable, con to String lo volvemos a cambiar a una variable String
		String alReves = new StringBuilder(frase).reverse().toString();

		if (frase.equals(alReves)) {
		    System.out.println("Es palíndromo");
		} else {
		    System.out.println("No es palíndromo");
		}
				
	}

	
	
	
	
	
}
