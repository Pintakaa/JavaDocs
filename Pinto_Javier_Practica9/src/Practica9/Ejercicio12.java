/*
 * Javier Pinto Aldana     
 * BUCLES Practica9 Ejercicio12
 */

package Practica9;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int elevado = 1;
		
		System.out.print("Introduzca el primer valor: ");
		a = teclado.nextInt();
		System.out.print("Inroduzca el segundo valor que elevara al primero: ");
		b = teclado.nextInt();
		
		for(int i = 1; i <= b ; i++ ) {
			elevado = a * elevado ;
		}
		
		
		
		System.out.println("El primer numero elevado a el segundo: " + elevado);
	}

}
