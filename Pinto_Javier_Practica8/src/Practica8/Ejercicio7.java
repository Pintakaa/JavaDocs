/*
 * Javier Pinto Aldana    
 * Bucles Ejercicio7
 */
 

package Practica8;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	Scanner teclado = new Scanner (System.in);
	
	int aleatorio = (int) (Math.random() * 50) ;
	int numero = 0;
	
	
	
	while (numero != aleatorio) {
		
	System.out.print("Introduzca un valor: ");
	numero = teclado.nextInt();
				
		
	if( numero < aleatorio  ) {
		System.out.println("El número es mayor");
				
	} else {
		System.out.println("El número es menor");
	}
		
	}
	System.out.println("Acertaste el número era: "  +  aleatorio);	
	
	}

}
