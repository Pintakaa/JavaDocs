package operaciones;

import java.util.Scanner;

public class compararcadenassinfinito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		final String FIN = "Fin";
		final String ADIVINA = "Pepe";
		
		Scanner teclado = new Scanner (System.in);
	
		String nombre;
	
		boolean nombreAdivinado = false;
		
		do {
			System.out.print("Dime un nombre: ");
			nombre = teclado.nextLine();
			if(nombre.equals(ADIVINA)) {
				nombreAdivinado = true;
			}
		}while (nombreAdivinado == false && !nombre.equals(FIN));
	
		if (nombre.equals(ADIVINA)) {
			System.out.println("Enhorabuena! Lo has adivinado");
		
		}
	
	}

}
