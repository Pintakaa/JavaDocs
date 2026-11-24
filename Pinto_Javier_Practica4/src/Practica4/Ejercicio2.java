/*
 * Javier Pinto Aldana
 * Practica4 Ejercicio2 
 */



package Practica4;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
	
	double euros;
	double pesetasresultado;
	double pesetas;
	double eurosresultado;
	double cambio = 166.386;
	
	System.out.print("Introducir cantidad de Euros : ");
	euros = teclado.nextDouble();
	
	pesetasresultado = euros * cambio;

	System.out.println("Los euros introducidos equivalen a: " + pesetasresultado +" pesetas");	
		
	System.out.print("Introducir cantidad de Pesetas: ");
	pesetas = teclado.nextDouble();
	
	eurosresultado = pesetas / cambio;

	System.out.println("Los pesetas introducidos equivalen a: " + eurosresultado + " euros");
	
	
	}

}
