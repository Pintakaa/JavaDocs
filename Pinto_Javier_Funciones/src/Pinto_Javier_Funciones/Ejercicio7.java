
/*
 * Javier Pinto
 * Ejercicio de Funciones Ejercicio7
 * 
 */


package Pinto_Javier_Funciones;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner (System.in);
		
		double ancho;
		double alto;
		
		
		System.out.print("Introduzca el ancho: ");
		ancho = teclado.nextDouble();
		System.out.print("Introduzca el alto: ");
		alto = teclado.nextDouble();
		
		System.out.println("Perimetro: "+ perimetroRectangulo(ancho,alto) );
		System.out.println("Area: " + areaRectangulo(ancho, alto));
		
	}
	// Devuelve el perímetro
	public static double perimetroRectangulo(double ancho, double alto) {
		
		double resultado;
		resultado = 2 * (ancho + alto);
		return resultado;
	}
	// Devuelve el área
	public static double areaRectangulo(double ancho, double alto) {
		
		double resultado;
		resultado = ancho * alto;
		return resultado;
	}
}
