/*
 * Javier Pinto Aldana  
 * BUCLES Practica9 Ejercicio5
 */



package Practica9;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		int numero;
		int factorial = 1;

		System.out.print("Introduzca un número: ");
		numero = teclado.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			factorial = factorial * i;
			System.out.println(factorial);
		}
		
		
		
		
	}

}
