/*
 * Javier Pinto    
 * Ejerciciosvectores Ejercicio10
 */

package Pinto_Javier_Ejercicios_Vectores;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		
		System.out.print("Introduzca el valor n(capacidad del array): ");
		int n = teclado.nextInt();
		
		final int CAPACIDAD = n;
		double numero[];
		numero = new double [CAPACIDAD]; 
		double media =0;
		double maxima =0;
	
		double minima2 =0;
		double total=0;
		double metros = 0;
		
		
		
		
		for(int i = 0;i < numero.length;i++) {
			
			System.out.print("Introduzca altura: ");
			metros = teclado.nextDouble();
			numero[i] = metros;
			total = total + numero[i];
			double minima = numero[0];
			if(maxima < numero[i]) {
				maxima = numero[i];
			}if(minima > numero[i]) {
				minima = numero[i];
			}
			minima2 = minima;
		}
		
		media = total / numero.length;
		
		System.out.println("Maximo: " + maxima);
		System.out.println("Minimo: " + minima2);
		System.out.println("Media: " + media);
	}

}
