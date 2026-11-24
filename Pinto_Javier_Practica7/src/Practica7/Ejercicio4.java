/*
 * Javier Pinto Aldana 
 * Condicionales Ejercicio4
 */

package Practica7;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

	Scanner teclado = new Scanner (System.in);	
	double nota1;	
	double nota2;		
	double nota3;	
	double nota4;	
	double media;
	
	
	System.out.print("Introducta su nota: ");
	nota1 = teclado.nextDouble();
		
	System.out.print("Introducta su nota: ");
	nota2 = teclado.nextDouble();	
		
	System.out.print("Introducta su nota: ");
	nota3 = teclado.nextDouble();
	
	System.out.print("Introducta su nota: ");
	nota4 = teclado.nextDouble();
	
	
	media = (nota1 + nota2 + nota3 + nota4) / 4 ;
	
	System.out.println("Su nota media es: " + media );
	
	System.out.println("Su nota media redondeada hacia arriba: " + Math.ceil(media) );
	
	System.out.println("Su nota media redondeada hacia abajo: " + Math.floor(media) );
	
	if(media>=8) {
		System.out.println("Puedes acceder a los estudios superiores.");
	}else {
		System.out.println("La nota media obtenida no es suficiente para acceder a los estudios superiores.");
	}
	
	}

}
