/*
 * Javier Pinto     
 * Ejerciciosvectores Ejercicio12
 */


package Pinto_Javier_Ejercicios_Vectores;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		final int CANTIDAD = 10 ;
		int numero[];
		numero= new int [CANTIDAD];
		
		
		String seleccion ;
		String a = "a";
		String b = "b";
		String c = "c";
		boolean interuptor = false;
		
		for(int i=0;i<numero.length;i++) {
			
		}
		
		while(interuptor == false) {
			
			System.out.println("a. Mostrar valores.");
			System.out.println("b. Introducir valor.");
			System.out.println("c. Salir.");
			seleccion = teclado.nextLine();
			
			if (seleccion.equals(a) ) {
				for(int i=0;i<numero.length;i++) {
					System.out.println("Posicion " + i + " " + numero[i]);
				}
			}
			if (seleccion.equals(b) ) {
				System.out.println("introduzca el valor V");
				int v = teclado.nextInt();
				System.out.println("introduzca el valor P");
				int p = teclado.nextInt();
				
				numero[p] = v;
				
				
			}
			if (seleccion.equals(c) ) {
				interuptor = true;
			}
			
			
		}
		
		
	}

}
