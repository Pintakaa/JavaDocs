/*Javier Pinto 
 * Cadena de caracteres Ejercicio3
 * 
 */

package Pinto_Javier_cadena_caracteres;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner (System.in);
		
		String nombre;
		String apellido1;
		String apellido2;
		
		System.out.print("Introduzca la cadena de caracteres: ");
		nombre = teclado.nextLine();
		
		System.out.print("Introduzca la cadena de caracteres: ");
		apellido1 = teclado.nextLine();
		
		System.out.print("Introduzca la cadena de caracteres: ");
		apellido2 = teclado.nextLine();
		// metodo cad.substring() selecciona varios caracteres de la cadena
		nombre = nombre.substring(0,3);
		apellido1 = apellido1.substring(0,3);
		apellido2 = apellido2.substring(0,3);
		
		// metodo para cambiar los caracteres a mayusculas
		nombre.toUpperCase();
		apellido1.toUpperCase();
		apellido2.toUpperCase();
		
		System.out.print(nombre.toUpperCase()+ apellido1.toUpperCase()+apellido2.toUpperCase());
		
	}

}
