/*
*Javier Pinto 
*Practica4 Ejercicio4
*
*/

package Practica4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner teclado = new Scanner(System.in);
		
	double valor;

	System.out.print("Introduca un valor decimal: ");
	valor = teclado.nextDouble();
	
	double arriba = Math.ceil(valor) ;
	double abajo = Math.floor(valor);
	long redondeo = Math.round(valor);
	
	System.out.println("El comando Math.ceil devuelve el valor redondeando hacia abajo:  " + abajo);
	
	System.out.println("El comando Math.floor devuelve el valor redondeando hacia arriba: " + arriba);
	
	System.out.println("El comando Math.round devuelve el valor redondeando hacia el número entero más cercano: " + redondeo);
	
	}

}
