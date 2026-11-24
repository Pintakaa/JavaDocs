/*
*Javier Pinto
*Practica4 Ejercicio1 Calcular salario neto
*
*/


package Practica4;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		String nombre ;
		String apellidos;
		String fechanacimiento;
		double salariobruto;
		int añostrabajados  ;
		double salarioneto ;
		double aumento;
		double salariototal;
		
		System.out.print("Introducir nombre:");
		nombre = teclado.nextLine();
		
		System.out.print("Introducir apellidos:");
		apellidos = teclado.nextLine();
		
		System.out.print("Introducir fecha de nacimiento:");
		fechanacimiento = teclado.nextLine();
		
		System.out.print("Introducir salario bruto:");
		salariobruto = teclado.nextDouble();
		
		System.out.print("Introducir años trabajados en la empresa:");
		añostrabajados = teclado.nextInt();
		
		
		salarioneto =  salariobruto - (salariobruto * 0.15)   ; 
		
		aumento =   salariobruto *  (añostrabajados *  0.02);
		
		salariototal = aumento + salarioneto;
		
		System.out.println("Estimado " + nombre + ", su salario bruto es " + salariobruto + ", teniendo en cuenta un IRPF del 15% su salario neto es " 
		+ salarioneto); 
		
		System.out.println("Debido a sus " + añostrabajados + " años trabajados en la empresa su salario se incrementará en un 2% por cada año. El aumento es de "
		+ aumento + " y el salario total es " + salariototal);
	}

}
