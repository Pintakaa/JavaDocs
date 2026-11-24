/*
 * Javier Pinto  
 * Ejercicios de Matrices 
 * Ejercicio4
 * 
 */

package Pinto_Javier_Matrices;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner (System.in);
		
		final int ALUMNOS =5;
		final int NOTAS=6;
		int matriz[][];
		matriz = new int [ALUMNOS][NOTAS];
		int nota=0;
		

		// escribimos las notas
		for (int i =1;i<matriz.length;i++){
			for(int j=1;j<matriz[i].length;j++) {
				System.out.print("introduzca el la nota del Alumno "+i+" :");
				nota = teclado.nextInt();
				
				matriz[i][j]=nota;
			}
		}
		
		
		int maxima=matriz[1][1];
		int minima=matriz[1][1];
		double media=0;
		double suma =0;
		
		
		for (int i =1;i<matriz.length;i++){
			//para reiniciar tanto la suma como la maxima y la minima para cada alumno
			suma =0;
			maxima = matriz[i][1];
			minima = matriz[i][1];
			System.out.print("Alumno " + i +"|");
			for(int j=1;j<matriz[i].length;j++) {
				suma =suma  + matriz[i][j];
				if(matriz[i][j] > maxima) {
					maxima = matriz[i][j] ;
				}else if(matriz[i][j]<minima) {
					minima = matriz[i][j];
				}
			
				
				System.out.print(" " + matriz[i][j]+"| " );
			}
			media= suma / NOTAS;
			System.out.println( "Nota maxima: " + maxima + " Nota minima: " + minima + " Nota media: "+ media);
		}
		
		
	}

}
