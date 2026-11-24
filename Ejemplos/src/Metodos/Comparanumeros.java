


package Metodos;

import java.util.Scanner;

public class Comparanumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner (System.in);
		
	/*	
		int numero=0;
		
		System.out.print("Introduzca un numero: ");
		numero= teclado.nextInt();
		int resultado=numero;
		
		for(int i=0;i<3;i++) {
			System.out.print("Introduzca un numero: ");
			numero= teclado.nextInt();
			
			if(resultado < numero) {
				resultado = numero;
			}
		}
		System.out.print("El número mayor es: " + resultado);
		
		*/
		
	}
		
	
	
	
	static int maximo (int x, int y) {
		int max=0;
		if (x>=y) {
			max=x; 
		}else {
			max=y;
		}
		return max;
		
		
	}
}
