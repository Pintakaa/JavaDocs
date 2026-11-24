/*
 * Javier Pinto 
 * Ejerciciosvectores Ejercicio1
 */


package Pinto_Javier_Ejercicios_Vectores;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int CAPACIDAD = 10;
		int numero [];// declaración
		numero = new int [CAPACIDAD]; // Instanciación
		
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		for(int i = 0; i < numero.length ; i++) {
			System.out.println("Introduzca un valor:");
			numero[i] = teclado.nextInt();
		}
		
		for(int i = 0; i < numero.length ; i++) {
			System.out.println("Posición " + i +" " +numero[i]);
			
		}
		
		
		
		
	}

}
