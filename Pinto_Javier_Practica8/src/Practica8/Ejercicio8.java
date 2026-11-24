/*
 * Javier Pinto Aldana    
 * Bucles Ejercicio8
 */
 


package Practica8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner (System.in);	
		
	String nombre;
	String apellido;
	int edad = 0;
	int rutas;
	double distanciaruta;
	boolean interruptor = false;
	
	String ciudad;
	String ciudadmaxima = "primera ruta";
	int participantes;
	double distanciaruta2 = 0;
	double distanciatotal = 0;
	double rutamaxima = 0;
	
	
	System.out.print("Introduzca Nombre: ");
	nombre = teclado.nextLine();
	System.out.print("Introduzca Apellido: ");
	apellido = teclado.nextLine();
	
	
	while(interruptor != true) {
		
	System.out.print("Introduzca edad: ");
	edad = teclado.nextInt();
	
	if (edad < 45 && edad > 17 )	{
		interruptor = true;
	}else {
		System.out.println("Esa edad no es correcta");
	}
	}	

	System.out.print("Introduzca número de rutas: ");
	rutas = teclado.nextInt();
	
	System.out.print("Introduzca distancia de última ruta: ");
	distanciaruta = teclado.nextDouble();
	
	for (int i = 1; i<= 5 ; i++) {
		
		System.out.print("Introduza distancia: ");
		distanciaruta2 = teclado.nextInt();
		distanciatotal= distanciatotal + distanciaruta2;
		System.out.print("Introduza Número de participantes: ");
		participantes = teclado.nextInt();
		teclado.nextLine();
		System.out.print("Introduza la ciudad: ");
		ciudad = teclado.nextLine();
		
		if(distanciaruta2 > rutamaxima ) {
			rutamaxima =  distanciaruta2;
			ciudadmaxima = ciudad  ;
		}
		
		
	}
		double mediadistancia = distanciatotal / 5;
		
		System.out.println("-------------------------------------------" );
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Número de rutas realizadas: " + rutas);
		System.out.println("");
		System.out.println("Distancia media (5 últimas rutas): " +  mediadistancia);
		System.out.println("Distancia más larga de las últimas 5 rutas: " + rutamaxima);
		System.out.println("Ciudad de la ruta más larga: " + ciudadmaxima);
		System.out.println("-------------------------------------------" );
	}

}
