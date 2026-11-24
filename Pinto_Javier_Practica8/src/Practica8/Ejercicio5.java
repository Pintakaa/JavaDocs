/*
 * Javier Pinto Aldana   
 * Bucles Ejercicio5
 */



package Practica8;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner teclado = new Scanner (System.in);
	
	int numero;	
	int ceros = 0;	
	int cantidadpositivo = 0;
	int sumapositivo= 0;
	int cantidadnegativo = 0;
	int sumanegativo= 0;
	int contador = 0;
	
	while( contador <10  )	{
	System.out.print("Introduzca un valor: ");
	numero = teclado.nextInt();
	
	if (numero > 0){
		sumapositivo += numero;
		cantidadpositivo++;
				
	}else if (numero < 0){
		sumanegativo += numero;
		cantidadnegativo++;
	}else {
		ceros++;
	}
	contador++;
	
	}
	
	double mediapositivo = sumapositivo / cantidadpositivo;
	System.out.println("Media de los números positivos:" + mediapositivo);
	
	double medianegativo = sumanegativo / cantidadnegativo;
	System.out.println("Media de los números negativo:" + medianegativo);
	
	System.out.println("Cantiad de ceros: " + ceros);
	
		
	}

}
