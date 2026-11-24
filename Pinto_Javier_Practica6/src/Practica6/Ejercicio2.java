/*
 * Javier Pinto Aldana
 * Practica6 Ejercicio2 Condicionales
 */

package Practica6;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		String nombre;
		int edad;
		double nota;

		System.out.print("Itroduzca su nombre: ");
		nombre = teclado.nextLine();

		System.out.print("Introduca su edad: ");
		edad = teclado.nextInt();

		System.out.print("Introduzca la nota: ");
		nota = teclado.nextDouble();

		if (edad > 18 && nota > 7) {
			System.out.println(nombre + ", usted ha diso admitido en el curso, cumple las condiciones requeridas");

		} else {
			System.out.println(
					nombre + " lo sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimos");
		}
	}
}
