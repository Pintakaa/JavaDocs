/*
 * Javier Pinto Aldana      
 * BUCLES Practica9 Ejercicio13
 */


package Practica9;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		
		int maximo = 100;
		int minimo = 1;
		boolean interruptor = false;
		String mayoromenor ;

		
		while(interruptor == false) {
			
			
			int rango = (maximo + minimo) / 2;
	        int propuesta = (int) Math.random() + minimo;
			
			
			System.out.println("Es este el número a adivinar? : " + rango);
			mayoromenor = teclado.nextLine();
			
			if(mayoromenor.equals("igual") ) {
				interruptor = true;
				System.out.println("El número a sido adivinado");
			}else if(mayoromenor.equals("mayor") ) {
				minimo = rango +1;
				
				
			}else if(mayoromenor.equals("menor") ) {
				maximo = rango -1;
			}else {
				System.out.println("introduzca 'mayor' 'menor' o 'igual' ");
			}
		}

	}

}
