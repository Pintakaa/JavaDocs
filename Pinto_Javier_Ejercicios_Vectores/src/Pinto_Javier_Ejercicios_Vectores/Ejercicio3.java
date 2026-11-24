/*
 * Javier Pinto  
 * Ejerciciosvectores Ejercicio3
 */


package Pinto_Javier_Ejercicios_Vectores;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		final int CAPACIDAD = 10;
		int numero [];// declaración
		numero = new int [CAPACIDAD]; // Instanciación
		int mayor =0;
		 // PREGUNTAR!!!
		
		Scanner teclado = new Scanner(System.in);
		
		
		for(int i = 0; i < numero.length ; i++) {
			System.out.println("Introduzca un valor:");
			numero[i] = teclado.nextInt();
		}
		int menor = numero[0]; // PARA COMPARAR DESDE UN NUMERO DEL ARRAY!!
		for(int i = 0; i < numero.length ; i++) {
			
			if (menor >  numero[i]) {
				menor = numero[i];
				
			}else if(mayor <  numero[i] )
				mayor = numero[i];
			}
			
		
		
			
		
		System.out.println("Mayor : "+ mayor);
		System.out.println("menor : "+ menor);
	}

}
