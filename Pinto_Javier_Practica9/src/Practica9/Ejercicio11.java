/*
 * Javier Pinto Aldana    
 * BUCLES Practica9 Ejercicio11
 
 */

package Practica9;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int pares = 0;
	int impares = 0;
	int cantidad = 200;
	
	for(int i = 100 ; i <= cantidad; i++)	{
	
		// para numero par %2 == 0
		if (i %2 == 0 ) {
			pares = pares + i;
		}else {
			impares = impares + i;
		}
		
		
		
	}
	
	
	System.out.println("Suma números pares: "  + pares);
	System.out.println("Suma números impares: "  + impares);
	}

}
