/*
 * Javier Pinto        
 * Ejerciciosvectores Ejercicio19
 */



package Pinto_Javier_Ejercicios_Vectores;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		final int CAPACIDAD =8;
		int vector[];
		int vector2[];
		vector = new int [CAPACIDAD];
		vector2= new int [CAPACIDAD];
		int puntuacion=0;
		
		for(int i =0;i<vector.length;i++) {
			System.out.print("Introduzca la puntuación: ");
			puntuacion = teclado.nextInt();
			
			vector[i]= puntuacion;
		}
		
		Arrays.sort(vector);
		
		
		
		for(int i=0; i<vector2.length; i++) { 
			vector2[i]= vector[vector.length - 1 - i]; // para copiar de manera inversa !!
			
		}
		
		
		System.out.println(Arrays.toString(vector2));
		
		
		
		
	}

}
