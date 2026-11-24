/*
 * Javier Pinto       
 * Ejerciciosvectores Ejercicio17
 */


package Pinto_Javier_Ejercicios_Vectores;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		final int CAPACIDAD = 10;
		int vector1[];
		int vector2[];
		vector1 = new int [CAPACIDAD];
		vector2 = new int [CAPACIDAD];
		int valor1=0;
		int valor2 =0;
		
		int contador=0;
		for(int i=0;i<10;i++) {
			System.out.print("Introduzca los valores para el primer vector:");
			valor1= teclado.nextInt();
			Arrays.fill(vector1,valor1);
			contador++;
		}
		for(int i=0;i<vector2.length;i++){
			System.out.print("Introduzca los valores para el segundo vector:");
			valor2= teclado.nextInt();
			Arrays.fill(vector2,valor2);
			contador++;
		}
		
		if (Arrays.equals(vector1, vector2)) {
			System.out.print("Los vectores son iguales");
		}else {
			System.out.print("Los vectores NO son iguales");
		}
		
		
		
	}

}
