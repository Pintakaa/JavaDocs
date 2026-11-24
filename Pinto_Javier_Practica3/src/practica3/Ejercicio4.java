package practica3;

public class Ejercicio4 {

	public enum tallas {pequeña, mediana, grande,extragrande};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		tallas  diez = tallas.pequeña;
		tallas veinte = tallas.mediana;
		tallas  treinta =  tallas.grande;
		tallas cuarenta = tallas.extragrande;
		
		System.out.println( "La talla pequña equivale a:" + diez );
		System.out.println( "La talla mediana equivale a:" + veinte );
		System.out.println( "La talla grande equivale a:" + treinta );
		System.out.println( "La talla extra grande equivale a:" + cuarenta );
		
	}

}
