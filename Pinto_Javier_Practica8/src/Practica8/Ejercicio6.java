/*
 * Javier Pinto Aldana    
 * Bucles Ejercicio6
 */
 


package Practica8;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner (System.in);
	
	int numero = 1;
	double cuadrado;
	
	while (numero > 0 ) {
		
	System.out.print("Introduzca un valor: ");
	numero = teclado.nextInt();
		
	cuadrado = numero * numero;
	
	
	System.out.println("Cuadrado del numero: " + cuadrado);
	
	}	
	}

}
