
/*
 * Javier Pinto 
 * Ejercicio de Funciones Ejercicio10
 * 
 */


package Pinto_Javier_Funciones;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Introduzca el dia: ");
		int dia = teclado.nextInt();
		System.out.print("Introduzca el mes: ");
		int mes = teclado.nextInt();
		System.out.print("Introduzca el año: ");
		int año = teclado.nextInt();
		
		if(FechaCorrecta(dia, mes, año)) {
			System.out.print("La fecha SI es correcta ");
		}else {
			System.out.print("La fecha no es correcta ");
		}
		
		
		
		
	}

	// comprueba que la fecha sea correcta
	public static boolean FechaCorrecta(int dia, int mes, int año) {
		
		boolean resultado= false;
		
		
		int diasdelmes[]= {31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31};
		
		int posicionvector = mes - 1;
		
		if(mes <=12 && mes >0) {
			
			
			if (año > 0 && año <= 3000) {
				
				if(dia <= diasdelmes[posicionvector] && dia > 0) {
					
					resultado=true;
					
					// año % 4 == 0 comprobamos si el año es multiplo de 4 
				}else if (mes == 2 && año % 4 == 0 ) {
					
					diasdelmes[1]= 29;
					
					if(dia <= diasdelmes[1] && dia > 0) {
						resultado = true;
					}
				}
			}
			
		}
			
		return resultado;
	}
	
	
}

