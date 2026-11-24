/*
 * Javier Pinto 
 * Ejerciciosvectores Ejercicio2
 */


package Pinto_Javier_Ejercicios_Vectores;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		final int CAPACIDAD = 10;
		int numero [];// declaración
		numero = new int [CAPACIDAD]; // Instanciación
		int suma = 0;
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		for(int i = 0; i < numero.length ; i++) {
			System.out.println("Introduzca un valor:");
			numero[i] = teclado.nextInt();
		}
		
		for(int i = 0; i < numero.length ; i++) {
			suma = suma + numero[i];
			
			
		}
		System.out.println("Suma = "+ suma);
		
	}

}
