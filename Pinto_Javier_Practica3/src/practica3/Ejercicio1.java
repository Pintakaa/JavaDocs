package practica3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        
		Scanner teclado =new Scanner(System.in);
		
		String nombre ;
		String apellidos;
		int edad ; 
		String direccion ;
		double altura ;
		double peso  ;
		
		
		System.out.print("Introducir nombre:");
		nombre = teclado.nextLine();
		
		System.out.print("Introducir apellidos:");
		apellidos = teclado.nextLine();
		
		System.out.print("Introducir edad:");
		edad = teclado.nextInt();
		teclado.nextLine();
		
		System.out.print("Introducir dirección:");   
		direccion = teclado.nextLine();
		
		
		System.out.print("Introducir altura:");
		altura = teclado.nextDouble();
		
		System.out.print("Introducir peso:");
		peso = teclado.nextDouble();
		
		
		
	    System.out.println ("Nombre:" + nombre) ;
	        
	    System.out.println ("Apellidos:" + apellidos);
	        
	    System.out.println ("Edad:" + edad );
		
	    System.out.println  ("Dirección:" + direccion);

	    System.out.println  ("Altura: " + altura);

	    System.out.println  ("Peso: " + peso);

	}

}

