/*
 * 
   * Objetivo: aplicar metodos de las caslse String
 */

package cadenas;

import java.util.Scanner;

public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("dame una cadena: " );
		String cadena;
		cadena = teclado.nextLine();
		
		int posfinal ;
		int posinicial; 
		
		// Mostrar las posiciones pares de la cadena
		
		for(int i = 0; i< cadena.length();i=i+2) {
			System.out.print(cadena.charAt(i) +" " );
		}
		//pedir desde que posicion hasta que posicion quiere extraer
		System.out.print("Posición inicial: " );
		posinicial = teclado.nextInt();
		System.out.print("Posición final: " );
		posfinal = teclado.nextInt();
		String subcadena = cadena.substring(posinicial,posfinal);
		System.out.print("La subcadena es: " + subcadena );
		// Pedir nombre hasta fin
		
/*		do {
			System.out.print("dame una cadena: " );
			cadena = teclado.nextLine();
		}while(cadena.equalsIgnoreCase("fin"));
		
*/
		//saca el nombre del ipasen
		String nombre ="jose" ;
		String apellido= "García";
		String apellido2 = "Montero";
		String dni = "12345678L";
		
		char primeraLetra = nombre.charAt(0);
		String subApellido1 = apellido.substring(0,3);
		String subApellido2 = apellido2.substring(0,3);
		String subDni = dni.substring(5,8);
		System.out.print(primeraLetra+subApellido1+subApellido2+subDni);
		
		
	}

}

/*
 * 
 * 
 * [0-9]{4}[B-DF-Z]{3}
 *
 * 
 * 
 * 
 */
