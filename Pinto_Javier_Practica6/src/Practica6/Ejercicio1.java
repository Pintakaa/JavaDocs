/*
 * Javier Pinto Aldana
 * Practica6 Ejercicio1 Condicionales
 */

package Practica6;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		double num1;
		double num2;

		System.out.print("Introduzca el primer valor: ");
		num1 = teclado.nextDouble();

		System.out.print("Introduzca el segundo valor: ");
		num2 = teclado.nextDouble();

		if (num1 > num2) {
			System.out.print(num1 + " Es mayor que " + num2);
		} else if (num1 < num2) {
			System.out.print(num1 + " Es menor que " + num2);
		} else {
			System.out.print(num1 + " Es igual que " + num2);
		}

	}
}
