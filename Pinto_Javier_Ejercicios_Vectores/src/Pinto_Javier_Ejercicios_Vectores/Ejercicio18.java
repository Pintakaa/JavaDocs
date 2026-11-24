/*
 * Javier Pinto       
 * Ejerciciosvectores Ejercicio18
 */


package Pinto_Javier_Ejercicios_Vectores;

import java.util.Arrays;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int CAPACIDAD = 30;
		int vector[];
		vector = new int [CAPACIDAD];
		
		for(int i=0;i<vector.length;i++) {
			vector[i]=  (int)( Math.random()*10);
		}
		
		//Arrays.fill(vector,(int) (Math.random()*10)); esto esta mal
		// Arrays.setAll(vector, i -> (int) (Math.random() * 10));
		
		Arrays.sort(vector);
		
		System.out.println(Arrays.toString(vector));
		
	}

}
