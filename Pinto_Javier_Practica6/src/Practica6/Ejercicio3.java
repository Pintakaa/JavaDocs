/*
 * Javier Pinto Aldana
 * Practica6 Ejercicio3 Condicionales
 */

package Practica6;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int edad;
		String nombre;
		String apellidos;

		System.out.print("Introduca su edad: ");
		edad = teclado.nextInt();
		teclado.nextLine();

		if (edad >= 18) {
			System.out.println("Introduzca el nombre:");
			nombre = teclado.nextLine();

			System.out.println("Introduzca los apellidos:");
			apellidos = teclado.nextLine();

			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellidos);
			System.out.println("Edad: " + edad);
			System.out.println(" ");
			System.out.println("Usted ha sido admitido");
		} else {
			System.out.println("No tiene la edad requerida para estos estudios.");

		}
	}
}
