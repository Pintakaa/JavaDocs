/*
 * Javier Pinto  
 * Ejerciciosvectores Ejercicio4
 */


package Pinto_Javier_Ejercicios_Vectores;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int CAPACIDAD = 20;
		int numero [];// declaración
		numero = new int [CAPACIDAD]; // Instanciación
		int sumapositivos = 0;
		int sumanegativos = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		
		for(int i = 0; i < numero.length ; i++) {
			System.out.println("Introduzca un valor:");
			numero[i] = teclado.nextInt();
		}
		

		for(int i = 0; i < numero.length ; i++) {
			
			if(numero[i] <= 0) {
				sumapositivos = sumapositivos + numero[i] ;
			}else if (numero[i] > 0) {
				sumanegativos = sumanegativos + numero[i] ;
			}
		}
		System.out.println("Suma de los números positivos: " + sumapositivos );
		System.out.println("Suma de los números negativos: " + sumanegativos );
	}

}
