package BuclesApuntes;

import java.util.Scanner;


public class Bucles_apuntes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//	&& = and
	//	|| = or
		
		
		// MULTIPLOS
		int numero =3;
		if (numero % 3 == 0) {
		    System.out.println(numero + " es múltiplo de 3");   // Ejemplo practica 9 ejercicio 11
		  //   0 % 5   // 0  → 10 es múltiplo de 5
		  //  10 % 3   // 1  → 10 no es múltiplo de 3
		  //  15 % 3   // 0  → 15 es múltiplo de 3
		}
		
		
		//MATH....();
		
		double raiz = Math.sqrt(25); // Devuelve 5.0 Raiz cuadrada
		
		double potencia = Math.pow(2, 3); // Devuelve 8.0 (2^3) eleva un numero a el segundo numero
		
		int absoluto = Math.abs(-10); // Devuelve 10 numero absoluto
		
		double redondeado = Math.round(3.6); // Devuelve 4 redondea entero mas cercano
		double techo = Math.ceil(3.2); // Devuelve 4.0 Redondea al entero más cercano hacia arriba.
		double piso = Math.floor(3.8); // Devuelve 3.0  Redondea al entero más cercano hacia abajo.
		
		int maximo = Math.max(10, 20); // Devuelve 20
		int minimo = Math.min(10, 20); // Devuelve 10
		
		
		
		
		//equals
		// es un comparador para los objetos"para los String" EJEMPLO EN LA PRATICA9 EJERCICIO13
		String palabra= "hola";
		String palabra2= "hola";
		String palabra3="adios" ;
		System.out.println(palabra.equals(palabra2)); // Returns true because they are equal
		System.out.println(palabra.equals(palabra3)); // false
		
		
		// SWITCH, sirve para cuando son listas o conjuntos   // PRACTICA 7 EJERCICIO 3 !!!!
		
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Introduce un día de la semana: ");
	        String dia = sc.nextLine().trim().toLowerCase();

	        switch (dia) {
	            case "lunes"                -> System.out.println("Primera hora: Matemáticas");
	            case "martes"               -> System.out.println("Primera hora: Lengua");
	            case "miércoles", "miercoles" -> System.out.println("Primera hora: Inglés");
	            case "jueves"               -> System.out.println("Primera hora: Historia");
	            case "viernes"              -> System.out.println("Primera hora: Informática");
	            case "sábado", "sabado", "domingo" -> System.out.println("No hay clase ese día.");
	            default                     -> System.out.println("Día no válido.");
	        }
	        System.out.print("Introduce un número del 1 al 7: ");
	        int numero1 = sc.nextInt();

	        switch (numero1) {
	            case 1 -> System.out.println("Lunes");
	            case 2 -> System.out.println("Martes");
	            case 3 -> System.out.println("Miércoles");
	            case 4 -> System.out.println("Jueves");
	            case 5 -> System.out.println("Viernes");
	            case 6 -> System.out.println("Sábado");
	            case 7 -> System.out.println("Domingo");
	            default -> System.out.println("Número no válido. Debe estar entre 1 y 7.");
	        }
		

	    	 /* PARA CREAR UN TIPO ENUMERADO
	    	  *  public enum tallas {pequeña, mediana, grande,extragrande}; //CONSULTAR PRATICA 3 EJERCICIO 4!!!!!
	    		
	    		
	    		tallas  diez = tallas.pequeña;
	    		tallas veinte = tallas.mediana;
	    		tallas  treinta =  tallas.grande;
	    		tallas cuarenta = tallas.extragrande;
	    		
	    		System.out.println( "La talla pequña equivale a:" + diez );
	    		System.out.println( "La talla mediana equivale a:" + veinte );
	    		System.out.println( "La talla grande equivale a:" + treinta );
	    		System.out.println( "La talla extra grande equivale a:" + cuarenta );
	    		
	    		*/
	        
	       
	        
	        
	        
	        
	        
	        
		
	}

}
