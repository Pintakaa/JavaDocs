/*
 * Javier Pinto        
 * Ejerciciosvectores Ejercicio20
 */


package Pinto_Javier_Ejercicios_Vectores;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		
		
		final int CAPACIDAD = 1000;
		int vector[];
		vector = new int [CAPACIDAD];
		int numero=0;
		int sumatorio=0;
		
		for(int i=0;i<vector.length;i++) {
			
			vector[i]= (int) (Math.random()*100);
		}
		
		
		System.out.print("Introduzca el valor a comprobar: ");
		numero = teclado.nextInt();
				
		for(int i=0;i<vector.length;i++) {
			
			if(numero == vector[i]) {
				sumatorio=sumatorio +1;	
			}
		}	
		if(sumatorio != 0) {
			
			System.out.println("el numero introducido esta en el array y aparece "+ sumatorio );
		}else {
			System.out.println("No existe el número en el array ");
		}
		
		
	}

}
