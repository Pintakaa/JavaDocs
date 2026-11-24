/*
 * Javier Pinto   
 * Ejerciciosvectores Ejercicio8
 */
package Pinto_Javier_Ejercicios_Vectores;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		final int CAPACIDAD = 100;
		double numero [];
		numero = new double [CAPACIDAD]; 
		double r=0;
		
		for(int i =0;i < numero.length;i++) {
			
			 numero[i]=  Math.random();
		}
		
		System.out.print("Introdizca el valor r: ");
		r= teclado.nextDouble();
		
		for(int i =0;i < numero.length;i++) {
			
			 if(numero[i] >= r) {
				 System.out.println("Valores del array por encima o igual que r: " + numero[i]);
			 }
		}
	}

}
