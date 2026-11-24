/*Javier Pinto  
 * Cadena de caracteres Ejercicio4
 * 
 */

package Pinto_Javier_cadena_caracteres;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner (System.in);
		
		String palabras;
		
		System.out.print("Introduzca la cadena de caracteres: ");
		palabras = teclado.nextLine().toLowerCase();
		int contadorA =0;
		int contadorE =0;
		int contadorI=0;
		int contadorO=0;
		int contadorU=0;
		
		
		for(int i=0;i < palabras.length();i++) {
			
			char letra = palabras.charAt(i);
			
			// IMPORTANTE LAS COMILLAS PARA UNA VARIABLE char DEBE SER ' '
			if(letra == 'a') {
				contadorA = contadorA +1;
			}
			if(letra == 'e') {
				contadorE = contadorE +1;
			}
			if(letra == 'i') {
				contadorI = contadorI +1;
			}
			if(letra == 'o') {
				contadorO = contadorO +1;
			}
			if(letra == 'u') {
				contadorU = contadorU +1;
			}
			
		}
		
		System.out.println("Cantidad de A " + contadorA);
		System.out.println("Cantidad de E " + contadorE);
		System.out.println("Cantidad de I " + contadorI);
		System.out.println("Cantidad de O " + contadorO);
		System.out.println("Cantidad de U " + contadorU);
		
	}

	
	
	
	
}
