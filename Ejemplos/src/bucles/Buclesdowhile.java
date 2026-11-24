package bucles;

import java.util.Scanner;

public class Buclesdowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int numero, suma = 0;
		
		do {
			System.out.println("dime un numero");
			numero = teclado.nextInt();
			suma = suma + numero;
	
		} while (numero != 0);
		System.out.println("la suma es:" + suma);
		
		
		}
	

}


