/*
 * Javier Pinto Aldana  
 * BUCLES Practica9 Ejercicio6
 */


package Practica9;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		int cantidad = 0;
		int numero = 1;
		int max = 100;
		boolean negativo = false;
		
		
		
		while(cantidad < max) {
			System.out.print("Introduza un valor: ");
			numero = teclado.nextInt();
			cantidad = cantidad +1;
			
			if(numero == 0){
				cantidad = cantidad -1;
			}else if (numero < 0) {
				negativo = true;
			}
			
		}
	
		if (negativo == true) {
			System.out.print("Se ha detectado un valor negativo.");
		}
	
	}
}
