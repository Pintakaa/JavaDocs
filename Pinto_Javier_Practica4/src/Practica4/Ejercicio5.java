/*
*Javier Pinto 
*Practica4 Ejercicio5
*
*/

package Practica4;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner(System.in);
		
	double num1;
	double num2;
	double menor;
	double elevado;
	double cuadrada;
	double aleatorio;
	
	System.out.print("Introduzca el primer valor: ");
	num1 = teclado.nextDouble();
	
	System.out.print("Introduzca el segundo valor: ");
	num2 = teclado.nextDouble();
		
	menor = Math.min(num1,num2);
	
	elevado = Math.pow(num1,num2);
	
	cuadrada = Math.sqrt(num1);
	
	aleatorio = Math.random() * num2;
	
	System.out.println("El número menor es: " + menor);
	
	System.out.println("El valor del primer número elevado al segundo: " + elevado );
	
	System.out.println("Raiz cuadrada del primer número: " + cuadrada);
	
	System.out.println("Valor random del segundo número: " + aleatorio);
	
	}

}
