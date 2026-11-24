/*
 *objetivo: pedir una cantidad de números al usuario 
 *Autor:
 *fecha:
 */


package bucles;

import java.util.Scanner;

public class bucleflor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		int cantidadNum , numero ;
		
		System.out.print("cuantos números quieres tratar:");
		cantidadNum = teclado.nextInt();
		
		// si quieres que el contador vaya de dos en dos i=i+2
		for (int i = 1; i<= cantidadNum ; i++) {
			System.out.println("Dime el número" + i+ ":");
			numero = teclado.nextInt();
			
		}
		
	}

}
