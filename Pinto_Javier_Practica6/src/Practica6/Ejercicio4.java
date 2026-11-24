/*
 * Javier Pinto Aldana
 * Practica6 Ejercicio4 Condicionales
 */

package Practica6;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		String nombre;
		String apellidos;
		double gasto1;
		double gasto2;
		double gasto3;
		double gasto4;
		double suma;
		double media;

		System.out.print("Introduzca su nombre: ");
		nombre = teclado.nextLine();

		System.out.print("Introduzca su apellidos: ");
		apellidos = teclado.nextLine();

		System.out.print("Introduzca su ImporteGastado1: ");
		gasto1 = teclado.nextDouble();

		System.out.print("Introduzca su ImporteGastado2: ");
		gasto2 = teclado.nextDouble();

		System.out.print("Introduzca su ImporteGastado3: ");
		gasto3 = teclado.nextDouble();

		System.out.print("Introduzca su ImporteGastado4: ");
		gasto4 = teclado.nextDouble();

		suma = gasto1 + gasto2 + gasto3 + gasto4;

		media = suma / 4;

		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Gastado1: " + gasto1);
		System.out.println("Gastado2: " + gasto2);
		System.out.println("Gastado3: " + gasto3);
		System.out.println("Gastado4: " + gasto4);
		System.out.println("");
		System.out.println("Importe Medio: " + media);
		System.out.println("");

		if (suma >= 300) {

			System.out.print(nombre + ", ha conseguido un vale descuento de 50€.");

		} else {

			System.out.print(nombre + ", no ha conseguido el vale descuento de 50€.");

		}
	}
}
