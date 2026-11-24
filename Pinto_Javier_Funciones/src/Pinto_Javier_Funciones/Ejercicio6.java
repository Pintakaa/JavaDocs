
/*
 * Javier Pinto
 * Ejercicio de Funciones Ejercicio6
 * 
 */


package Pinto_Javier_Funciones;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		double precio1=0;
		double precio2=0;
		double precio3=0;
		double precio4=0;
		double precio5=0;
		
		
		System.out.print("Introduzca el primer precio: ");
		precio1 = teclado.nextDouble();
		System.out.print("Introduzca el segundo precio: ");
		precio2 = teclado.nextDouble();
		System.out.print("Introduzca el tercer precio: ");
		precio3 = teclado.nextDouble();
		System.out.print("Introduzca el cuarto precio: ");
		precio4 = teclado.nextDouble();
		System.out.print("Introduzca el quinto precio: ");
		precio5 = teclado.nextDouble();
		
		
		System.out.println("El precio con el IVA añadido : " +  precioConIVA(precio1));
		System.out.println("El precio con el IVA añadido : " + precioConIVA(precio2));
		System.out.println("El precio con el IVA añadido : " +  precioConIVA(precio3));
		System.out.println("El precio con el IVA añadido : " + precioConIVA(precio4));
		System.out.println("El precio con el IVA añadido : " +  precioConIVA(precio5));
		
	}
	// calcula los precios añadiendole el IVA
	public static double precioConIVA(double precio) {
		
		double resultado;
		double iva = 0.21;
		resultado = precio +(precio * iva);
		
		
		return resultado;
	}
	
	
}
