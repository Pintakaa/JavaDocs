/*
 * Javier Pinto Aldana 
 * BUCLES Practica9 Ejercicio4
 */



package Practica9;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		
		int cantidad;
		
		System.out.print("Introduzca un valor maximo: ");
		cantidad = teclado.nextInt();
		
		for( int i = 1; i <= cantidad; i++ ) {
			System.out.println(i);
		}
		
	}

}
