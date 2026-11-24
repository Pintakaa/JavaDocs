package cadenas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expresiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena;
		
		cadena ="070";
		
		// Oprion 1: usando metodo de la clase String
		if( cadena.matches("[0-9]{3}")) {
			System.out.println("igual");
		}else {
			System.out.print("no");
		}
		// Opcion 2:usando clases pattern y matcher
		Pattern patron = Pattern.compile("[0-9]{3}");
		Matcher matcher = patron.matcher(cadena);
		if (matcher.matches()) {
			System.out.println("Si");
		}else {
			System.out.print("No");
		}

	}
}
