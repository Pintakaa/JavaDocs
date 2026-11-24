/*
 * Javier Pinto     
 * Ejerciciosvectores Ejercicio11
 */

package Pinto_Javier_Ejercicios_Vectores;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int CAPICIDAD = 100;
		int numero1[];
		numero1 = new int [CAPICIDAD];
		
		int numero2[];
		numero2 = new int [CAPICIDAD];
		int sumatorio =0;
		int resta = 1;
		
		for(int i =0;i<numero1.length;i++) {
			
			numero1[i]= i +1 ;
		
			System.out.println(numero1[i]);
		}
		for(int i=0; i<numero2.length; i++) { 
			numero2[i]= numero1[numero1.length - 1 - i]; // para copiar de manera inversa !!
			
			System.out.println(numero2[i]);
		}
		
	}

}


