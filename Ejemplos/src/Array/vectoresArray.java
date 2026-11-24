/*
 * objetivo almacenar edades y calcular la media
 */

package Array;

import java.util.Scanner;

public class vectoresArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//en el array de 40 posiciones se empieza a contar desde el 0 hasta el 39
		final int CAPACIDAD = 40;
		int edad [];// declaración
		edad = new int [CAPACIDAD]; // Instanciación
		int suma = 0;
		double media;
		
		// la "i" es una variable declarada dentro del parentesis por lo que solo aplica a su for,
		// se pueden usar en direntes for sin problema
		
		for (int i=0; i<edad.length; i++){
			edad[i] = (int)(Math.random()*50);
			
		}
		for(int i=0; i<edad.length; i++) {
			System.out.println("Posición: " + i + " está el valor " + edad[i]);
		}
		
		//recorre el vector y acumula las edades
		int sumaedades = 0;
		for(int i=0; i< edad.length; i++) {
			sumaedades = sumaedades + edad[i];
		}
		double mediaedad;
		mediaedad = (double)sumaedades/edad.length;
		System.out.println("La media es: "  + mediaedad);
		
		//ejercicio: mostrar las edades y su posicion que estan por encima de la media
		
		for(int i=0; i<edad.length; i++ ) {
			if (edad[i]>mediaedad) {
				System.out.println("La edad " + edad[i]+ " está en la posición" + i);
			}
		}
		
		
		//mostrar la primera aparición de una edad pedida al usuario y la posición que ocupa
		Scanner teclado = new Scanner (System.in);
		
		int posicion = 0;
		boolean edadencontrada = false; // interruptor
		
		System.out.print("Introduzca el valos a busar: ");
		int edadbuscada= teclado.nextInt();
		
		do {
			if (edad[posicion] == edadbuscada) {
				 edadencontrada = true;
			}
		
		posicion++;
	}while (posicion < edad.length && edadencontrada == false);
	
	if (edadencontrada = true) {
		System.out.println("La edad buscada esta en la posicion: " + (posicion-1));
		
		}else {
			
		}System.out.println("La edad buscada no esta");
	
	
	
	
	}
}
