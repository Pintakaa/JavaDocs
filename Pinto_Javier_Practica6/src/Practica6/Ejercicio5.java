/*
 * Javier Pinto Aldana 
 * Practica6 Ejercicio5 Condicionales
 */

package Practica6;

import java.util.Scanner;

public class Ejercicio5 {

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
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Ciclo Formativo: " + ciclo);

		if (nota == 10) {
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
