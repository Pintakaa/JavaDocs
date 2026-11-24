package cadenas;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validartelefono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		String patron= "[6|7|9][0-9]{8}";
		String telefono;
	
		
		/*
		do {
			System.out.print("Dime tu telefono: ");
			telefono = teclado.nextLine();
			
		}while(!telefono.matches(patron));
		
		System.out.print("Tu telefono es " + telefono);
		
		*/
		
		// Opcion 2: calse Patterns y matcher
		
		Pattern patron2 = Pattern.compile(patron);
		Matcher comparaTelefono ;
		do {
			System.out.print("Dime tu telefono: ");
			telefono = teclado.nextLine();
			comparaTelefono = patron2.matcher(telefono);
		}while(!comparaTelefono.matches());
		
		System.out.print("Tu telefono es " + telefono);
	}

		
}
