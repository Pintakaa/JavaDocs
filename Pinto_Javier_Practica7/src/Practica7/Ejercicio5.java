/*
 * Javier Pinto Aldana 
 * Condicionales Ejercicio5
 */


package Practica7;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner (System.in);
	
	double num1;
	double num2;
	double suma;
	double resta;
	double multi;
	double division;
	int	resultado;	
	
	System.out.print("Introducta el primer número: ");
	num1 = teclado.nextDouble();	
		
	System.out.print("Introducta el segundo número: ");
	num2 = teclado.nextDouble();	
		
	System.out.println("Indique la operacion que quiere realizar(Inserte un número): ");	
	
	System.out.println("(1) Suma");
	System.out.println("(2) resta");
	System.out.println("(3) Multiplicación");
	System.out.println("(4) División");
	resultado = teclado.nextInt();
	
	suma = num1 + num2 ;
	resta = num1 - num2 ;
	multi = num1 * num2 ;
	division = num1 / num2 ;
	
	
	switch (resultado) {
	case 1 :
		{System.out.println("Resultado: " + suma);
		break;
		}
	case 2 :
		{System.out.println("Resultado: " + resta);
		break;
		}
	case 3 :
		{System.out.println("Resultado: " + multi);
		break;
		}
	case 4 :
		{System.out.println("Resultado: " + division);
		break;
		}

		default:
		{System.out.println("Número introducido incorrecto");
		break;
		}
	
	
	
	}
	}

}
