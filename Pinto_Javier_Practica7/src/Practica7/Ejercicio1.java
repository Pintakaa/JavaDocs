/*
 * Javier Pinto Aldana  
 * Condicionales Ejercio1
 */

package Practica7;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner teclado = new Scanner(System.in);		
	
	String nombre;
	String apellidos;
	int edad;
	double salario;
	int experiencia;
	int proyectos;
	
	System.out.print("Introduzca su nombre: ");
	nombre = teclado.nextLine();
				
	System.out.print("Introduzca su apellidos: ");
	apellidos = teclado.nextLine();	
	
	System.out.print("Introduzca su edad: ");
	edad = teclado.nextInt();	
		
	System.out.print("Introduzca su salario: ");
	salario = teclado.nextDouble();	
	
	
	if(salario >30000 && edad > 45 ) {
		System.out.println("Los sentimos pero no cumple nuestro perfi");	
		
	}else {
		
		System.out.print("Introduzca años de experiencia: ");
		experiencia = teclado.nextInt();
		System.out.print("Introduzca número de proyectos: ");
		proyectos = teclado.nextInt();
		
		if(experiencia >2 && proyectos > 3) {
			System.out.println("Enhorabuena. Ha sido contratado");
			
		}else {
			System.out.println("Lo sentimos pero no cumple nuestro perfil");
				
			}		
			
		}
	
	}

}
