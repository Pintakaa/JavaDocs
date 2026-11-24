/*
 * calcular las notas medias de alumnos
 * autor profe
 * fecha 26/10/26
 */



package Matrices;

public class CalculoNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int NUM_ALUMNOS = 10;
		final int NUM_MATERIAS = 6;
		int [][] notas;
		notas = new int [10][6]; // 10 alumnos con 6 módulos matriculados
		//Asignamos notas aleatorias 
		for (int alumnos = 0; alumnos < notas.length; alumnos++) {
			for(int materias = 0;materias< notas[alumnos].length; materias++) {
				notas[alumnos][materias] = (int) (Math.random() * 11);
			}
			
		}
		
		//mostramos los notas
		for (int alumnos = 0; alumnos < notas.length; alumnos++) {
			System.out.println("Alumno" + alumnos);
			for(int materias = 0;materias < notas[alumnos].length; materias++) {
				System.out.print("  "  + notas[alumnos][materias]);
			}
			System.out.println();
		}
		//calculamos la nota de cada alumno
		int suma;
		double media;
		for (int alumnos = 0; alumnos < NUM_ALUMNOS; alumnos++) {
			suma = 0;
			for(int materias = 0;materias< NUM_MATERIAS; materias++) {
				suma = suma+ notas[alumnos][materias];
			}
			media =(double) suma/NUM_ALUMNOS;
			System.out.println("Alumno" + alumnos +":" + media );
		}
		
		//Calculamos la nota media de cada materia 
		
			int sumaMateria;
			double mediaMateria;
			for(int materias = 0;materias< notas[materias].length; materias++) {
				sumaMateria = 0;
				for (int alumnos = 0; alumnos < notas.length; alumnos++) {
					sumaMateria = sumaMateria + notas[alumnos][materias];
				}
				mediaMateria = (double)sumaMateria/NUM_ALUMNOS;
				System.out.println("Materias" + materias +":" + mediaMateria );
					
		}
		
			//por cada alumno, mostrar la primera materia suspensa
			int materia;
			for(int alumno=0;alumno<notas.length;alumno++) {
				materia = 0;
				boolean encontrado = false;
				do {
					if (notas[alumno][materia]<5) {
						encontrado= true;
					}
					materia++;
				}while(encontrado == false && materia < NUM_MATERIAS);
				if(encontrado == true) {
					System.out.println("La primera materia suspendida es " + (materia-1) );
				}else {
					System.out.println("No hay materia suspensas");
				}
			}
			// por cada alumno mostrar la tercera materia suspensa
		
			
	}

}
