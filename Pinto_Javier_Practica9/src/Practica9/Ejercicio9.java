/*
 * Javier Pinto Aldana   
 * BUCLES Practica9 Ejercicio9
 */


package Practica9;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int suma= 0 ;
		double producto = 1;
		
		for(int i = 1; i <= 10; i++) {
			suma = i + suma ;
			producto = i * producto;
			
		}
		System.out.println("Resultado de la suma: " + suma);
		System.out.println("Resultado de la producto: " + producto);
		
		
	}

}
