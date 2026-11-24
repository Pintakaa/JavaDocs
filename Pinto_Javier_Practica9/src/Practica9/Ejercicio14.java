/*
 * Javier Pinto Aldana       
 * BUCLES Practica9 Ejercicio14
 */

package Practica9;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		

        int dinero;
        int cantidad;
        int quinientos = 500;
        int doscientos= 200;
        int cien=100;
        int cincuenta= 50;
        int veinte= 20;
        int diez = 10;
        int cinco = 5;
        
        
        
        do {
            System.out.print("Introduzca el dinero (múltiplo de 5): ");
            dinero = teclado.nextInt();
        } while (dinero <= 0 || dinero % 5 != 0);

        cantidad = 0;
        while (dinero >= quinientos) {
            dinero = dinero - quinientos;
            cantidad = cantidad + 1;
        }
        if (cantidad > 0) {
            System.out.println(cantidad + " billetes de 500");
        }

        cantidad = 0;
        while (dinero >= doscientos) {
            dinero = dinero - doscientos;
            cantidad = cantidad + 1;
        }
        if (cantidad > 0) {
            System.out.println(cantidad + " billetes de 200");
        }

        cantidad = 0;
        while (dinero >= cien) {
            dinero = dinero - cien;
            cantidad = cantidad + 1;
        }
        if (cantidad > 0) {
            System.out.println(cantidad + " billetes de 100");
        }

        cantidad = 0;
        while (dinero >= cincuenta) {
            dinero = dinero - cincuenta;
            cantidad = cantidad + 1;
        }
        if (cantidad > 0) {
            System.out.println(cantidad + " billetes de 50");
        }

        cantidad = 0;
        while (dinero >= veinte) {
            dinero = dinero - veinte;
            cantidad = cantidad + 1;
        }
        if (cantidad > 0) {
            System.out.println(cantidad + " billetes de 20");
        }

        cantidad = 0;
        while (dinero >= diez) {
            dinero = dinero - diez;
            cantidad = cantidad + 1;
        }
        if (cantidad > 0) {
            System.out.println(cantidad + " billetes de 10");
        }

        cantidad = 0;
        while (dinero >= cinco) {
            dinero = dinero - cinco;
            cantidad = cantidad + 1;
        }
        if (cantidad > 0) {
            System.out.println(cantidad + " billetes de 5");
        }

    }

}
