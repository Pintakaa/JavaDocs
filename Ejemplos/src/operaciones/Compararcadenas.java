/*
 * Objetivo: adivina un nombre
 */

package operaciones;

import java.util.Scanner;

public class Compararcadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String ADIVINA = "Pepe";
		
		Scanner teclado = new Scanner (System.in);
	
		String nombre;
	
		System.out.print("Dime un nombre: ");
		nombre = teclado.nextLine();
		
		if (nombre.equals(ADIVINA)) {
			System.out.println("Enhorabuena! Lo has adivinado");
		}else {
			System.out.println("Lo siento. No era ese nombre");
		}
	
	}

}
