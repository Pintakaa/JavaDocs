/*
 * Javier Pinto Aldana 
 * Practica6 Ejercicio6 Condicionales
 */

package Practica6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		String nombre;
		String apellidos;
		String ciclo;
		int nota;
		String calificacion;

		System.out.print("Introduzca su nombre: ");
		nombre = teclado.nextLine();

		System.out.print("Introduzca su apellidos: ");
		apellidos = teclado.nextLine();

		System.out.print("Introduzca su ciclo formativo: ");
		ciclo = teclado.nextLine();

		System.out.print("Introduzca nota: ");
		nota = teclado.nextInt();

		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos; " + apellidos);
		System.out.println("Ciclo Formativo: " + ciclo);

		if (nota < 0 || nota > 10) {
			System.out.println("La nota académica indicada es incorrecta");
		} else {

			if (nota == 10) {
				calificacion = "Matricula de Honor";

			} else if (nota == 9) {
				calificacion = "Sobresaliente";

			} else if (nota >= 8) {
				calificacion = "Notable";

			} else if (nota >= 6) {
				calificacion = "Bien";

			} else if (nota == 5) {
				calificacion = "Aprobado";

			} else {
				calificacion = "Insuficiente";

			}

			System.out.println("Nota académica: " + nota + " " + calificacion);

		}

	}

}
