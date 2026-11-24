package Metodos;

public class Sumanumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3, resultado;
		
		num1= 4;
		num2=6;
		num3=8;
		resultado = suma(num1,num2);
		
		System.out.println(resultado);
		resultado=suma(num1,num2,num3);
		System.out.println(resultado);
		
	}

	
	
	
	// calcula la suma de dos numeros enteros:
	public static int suma(int numero1, int numero2) { // las variables numero1 y numero2 nunca se le debe cambiar el valor
		
		int resultado ;
		 resultado = numero1 + numero2;
		 return resultado;
	}
	
	// calcula la suma de 3 numeros enteros:
			public static int suma(int numero1, int numero2,int numero3) {
				
				int resultado1,resultado2 ;
				 resultado1 = suma(numero1,numero2);
				 resultado2 = suma(resultado1,numero3);
				 return resultado2;
			}
}


