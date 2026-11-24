/*
 * Javier Pinto   
 * Ejerciciosvectores Ejercicio9
 */

package Pinto_Javier_Ejercicios_Vectores;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner teclado = new Scanner (System.in);
		
		final int CAPACIDAD = 100;
		int numero [];
		numero = new int [CAPACIDAD]; 
		double n=0;
		int posicionN = 0;
		
		for(int i =0;i < numero.length;i++) {
			
			 numero[i]=  (int) (1+ Math.random()*10);
		}
		System.out.print("Introdizca el valor n: ");
		n= teclado.nextDouble();
		
		for(int i =0;i < numero.length;i++) {
			
			if(numero[i] == n) {
				posicionN = i;
			}
			
			
		}
		if (posicionN == 0) {
			System.out.println("No existe ninguna posicion con el valor n");
		}else {
			
			System.out.println("La posición del valor n es :" + posicionN);
		}
		
	}

}
