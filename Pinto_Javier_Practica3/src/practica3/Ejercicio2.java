package practica3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado =new Scanner(System.in);
		
		
		String nombre = "Torremolinos futbol club";
		int fundado = 1999; 
		String estadio = "Torremolinos";
		String capitan = "Jose M";
		
		
		System.out.print("Introducir nombre:");
		nombre = teclado.nextLine();
		
		System.out.print("Introducir año de la fundación:");
		fundado = teclado.nextInt();
		teclado.nextLine();
		
		System.out.print("Introducir estadio:");
		estadio = teclado.nextLine();
		
		System.out.print("Introducir capitan:");
		capitan = teclado.nextLine();
	       
	    System.out.println ("Nombre:" + nombre) ;
	        
	    System.out.println ("Fundado:" + fundado);
	        
	    System.out.println ("Estadio:" + estadio );

	    System.out.println ("Capitan: " + capitan);

		
		
		
		
		
	}

}
