/*
 * Javier Pinto Aldana  
 * Condicionales Ejercicio3
 */



package Practica7;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner (System.in);	
	int nota;	
	
	System.out.print("Introducta su nota: ");
	nota = teclado.nextInt();
	
	switch (nota) {
		case 1 :
			{System.out.println("Insuficiente");
			break;
			}
		case 2 :
			{System.out.println("Insuficiente");
			break;
			}
		case 3 :
			{System.out.println("Insuficiente");
			break;
			}
		case 4 :
			{System.out.println("Insuficiente");
			break;
			}
		case 5 :
			{System.out.println("Suficiente");
			break;
			}
		case 6 :
			{System.out.println("Bien");
			break;
			}
		case 7 :
			{System.out.println("Bien");
			break;
			}
		case 8 :
			{System.out.println("Notable");
			break;
			}
		case 9 :
			{System.out.println("Notable");
			break;
			}
		case 10 :
			{System.out.println("Sobresaliente");
			break;
			}

			default:
			{System.out.println("La nota indicada es incorrecta.");
			break;
			}
	}
	
	}

}
