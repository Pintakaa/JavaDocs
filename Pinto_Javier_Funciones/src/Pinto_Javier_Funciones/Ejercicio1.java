/*
 * Javier Pinto
 * Ejercicio de Funciones Ejercicio1
 * 
 */


package Pinto_Javier_Funciones;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		double numero1 =0;
		double numero2=0;
		
		
		System.out.print("Introduzca el primer valor: ");
		numero1 = teclado.nextDouble();
		System.out.print("Introduzca el segundo valor: ");
		numero2 = teclado.nextDouble();
	
		double resultado = multiplica(numero1,numero2);
		
		System.out.print("resultado : " + resultado);
		
	}

	
	// multiplica los dos valores
	public static double multiplica(double a, double b) {
		
		double resultado = a*b;
		
		return resultado;
	}
	
	
	
	
}
