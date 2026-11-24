/*
 * Javier Pinto Aldana
 * Practica4 Ejercicio3
 */


package Practica4;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		int num1;
		int num2;
		int cambio;
		
		System.out.print("Introducir el primer número: ");
		num1 = teclado.nextInt();
		
		System.out.print("Introducir el segundo número: ");
		num2 = teclado.nextInt();
		
		cambio = num1;
		num1 = num2;
		num2 = cambio;
		
		
		
		System.out.println("El primer número ahora es: " + num1);
		
		System.out.println("El segundo número ahora es: "+ num2);
		
	}

}
