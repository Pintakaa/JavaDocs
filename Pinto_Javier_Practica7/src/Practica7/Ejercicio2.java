/*
 * Javier Pinto Aldana 
 * Condicionales Ejercicio2
 */



package Practica7;

import java.util.Scanner;

public class Ejercicio2 {

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
		System.out.println("Los sentimos pero no cumple nuestro perfil");	
		
	}else {
		
		System.out.print("Introduzca años de experiencia: ");
		experiencia = teclado.nextInt();
		System.out.print("Introduzca número de proyectos: ");
		proyectos = teclado.nextInt();
		
		if(experiencia <=2 && proyectos <= 3) {
			System.out.println("Lo sentimos pero no cumple nuestro perfil");
		
		}else {
			System.out.println("Enhorabuena. Ha sido contratado");	
			if (edad >5 && proyectos >5) { 
				
				System.out.println("Salario anual que le corresponde es 30.000€");
			}else {
			
				System.out.println("Salario anual que le corresponde es 25.000");
				}	
			}		
		
		}

	}
}	