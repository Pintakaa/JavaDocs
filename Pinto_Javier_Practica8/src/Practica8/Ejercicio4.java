/*
 * Javier Pinto Aldana   
 * Bucles Ejercicio4
 */

package Practica8;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner (System.in);	
	
	int numero = -1 ;
	int suma = 0;
	int cantidad = 0;
	double media;
	
	
	
	while(numero != 0  ) {
		System.out.print("Introduzca un valor positivo: ");
		numero = teclado.nextInt();
		if(numero > 0) {
			suma += numero;
			cantidad++;
		}else {
			System.out.println("Introduzla valores poristivos");
		}
	}
	if (cantidad > 0) {
		media = suma / cantidad;
		System.out.println("Suma: " + suma);
		System.out.println("Media: " + media);	
		System.out.println("Cantidad de números introducidos: " + cantidad);	
	}else {
		System.out.print("Debe intruduzir valors positivos");	
	}
	
	
	
	
		
	}

}
