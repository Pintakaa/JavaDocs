/*
 * Javier Pinto  
 * Ejercicios de Matrices 
 * Ejercicio4
 * 
 */

package Pinto_Javier_Matrices;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Cuantos trabajafores: ");
		int n = teclado.nextInt();
		
		final int FILA =n;
		final int COLUMNA=2;
		int matriz[][];
		matriz = new int [FILA][COLUMNA];
		double mediahombre =0;
		double sumahombre=0;
		double mediamujer =0;
		double sumamujer=0;
		
		int contadorhombre=0;
		int contadormujer=0;
	
		// se recorre la matriz de forma diferente, primero la columna [i][0] y despues [i][1]
		for(int i=0;i<matriz.length;i++) {
			System.out.print("introduzca el genero hombre(0) o mujer(1): ");
			int genero = teclado.nextInt();
			matriz[i][0]= genero; 
			System.out.print("introduzca el sueldo del el empleado en la posicion " + i+" : ");
			int sueldo = teclado.nextInt();
			matriz[i][1]= sueldo; 
		}
		for(int i=0;i<matriz.length;i++) {
			
			if(matriz[i][0] == 0) {
				sumahombre = sumahombre + matriz[i][1];
				contadorhombre++;
				
			}else {
				sumamujer = sumamujer + matriz[i][1];
				contadormujer++;
			}
		}
		mediahombre = sumahombre / contadorhombre;
		mediamujer = sumamujer / contadormujer;
		
		// mirar dibujo del profesor para comprender 
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.print(" " + matriz[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Media de los hombres: " + mediahombre);
		System.out.println("Media de las mujeres: " + mediamujer);
	}

}
