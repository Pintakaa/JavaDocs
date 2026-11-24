/*Javier Pinto 
 * Cadena de caracteres Ejercicio2
 * 
 */

package Pinto_Javier_cadena_caracteres;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		String cadena1;
		String cadena2;
		
		System.out.print("Introduzca la cadena de caracteres: ");
		cadena1 = teclado.nextLine();
		
		System.out.print("Introduzca la cadena de caracteres: ");
		cadena2 = teclado.nextLine();
		
		
		// metodo cad.equalIgonreCase() para comparar cadenas sin importar las mayusculas 
		if(cadena1.equalsIgnoreCase(cadena2) ) {
			System.out.print("Las candenas son iguales ");
		}else {
			System.out.print("No son iguales");
		}
		
	}

}
