/*
 * Javier Pinto      
 * Ejerciciosvectores Ejercicio14
 */


package Pinto_Javier_Ejercicios_Vectores;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		final int CAPACIDAD = 55;
		int numero[];
		numero = new int [CAPACIDAD];
		int posicion=0;
		
		for (int i = 1;i <= 10; i++) { // A TENER EN CUENTA, REPASAR!
			for (int j = 0; j < i; j++) {
				numero[posicion]= i;
				posicion++;
				;
			}
			
			
		}
		
		for (int i=0;i<numero.length;i++) {
		
			System.out.print(numero[i] +" ");
		}
		
	}

}
