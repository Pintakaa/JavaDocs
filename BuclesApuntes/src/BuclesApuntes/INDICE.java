package BuclesApuntes;

public class INDICE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Practica3 Uso de variables y E/S estándar
		 * Practica4 Cálculos simples
		 * Practica6 Condicionales
		 * Practica7 Condicionales2
		 * Practica8 Bucles 
		 * Practica9 Bucles2
		 * 
		 */
		
		
		
		/*PRACTICA9	
		 * 
		 * 
		 * 1. 20 primeros numeros naturales
		 * 
		 * 2. números pares comprendidos entre el 1 y el 200. Para
				ello utiliza un contador y suma de 2 en 2.
				
		 * 3. números pares comprendidos entre el 1 y el 200. Esta
vez utiliza un contador sumando de 1 en 1.

		 * 4.  muestre los números desde el 1 hasta un número N que se
introducirá por teclado

		 * 5.Escribe un programa Java que lea un número positivo N y calcule y visualice su factorial N!
Siendo el factorial:
0! = 1
1! = 1
2! = 2 * 1
3! = 3 * 2* 1
N! = N * (N-1) * (N-2) * … * 1
		 * 6. Escribe un programa Java que lea 100 números no nulos y luego muestre un mensaje de si ha
			leído algún número negativo o no
			
		 * 7. Escribe un programa Java que lea 100 números no nulos y luego muestre un mensaje indicando
				cuántos son positivos y cuantos negativos
				
		 * 8. Escribe un programa Java que lea una secuencia de números no nulos hasta que se introduzca
				un 0, y luego muestre si ha leído algún número negativo, cuantos positivos y cuantos negativos
				
		 * 9. Escribe un programa Java que calcula y escribe la suma y el producto de los 10 primeros
				números naturales.
				
		 * 10. Escribe un programa Java que lee una secuencia de notas (con valores que van de 0 a 10) que
				termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10
				
		 * 11. Escribe un programa Java que suma independientemente los pares y los impares de los números
				comprendidos entre 100 y 200, y luego muestra por pantalla ambas sumas.
				
		 * 12. Escribe un programa Java que calcule el valor A elevado a B (A^B) sin hacer uso del operador de
				potencia (^), siendo A y B valores introducidos por teclado, y luego muestre el resultado por
				pantalla.
				
		 * 13. Escribe un programa Java donde el usuario "piensa" un número del 1 al 100 y el ordenador
				intenta adivinarlo. Es decir, el ordenador irá proponiendo números una y otra vez hasta
				adivinarlo (el usuario deberá indicarle al ordenador si es mayor, menor o igual al número que ha
				pensado)
				
		 * 14. Escribe un programa Java que dada una cantidad de euros que el usuario introduce por teclado
				(múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para alcanzar dicha
				cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que indicar el mínimo de
			billetes posible. Por ejemplo, si el usuario introduce 145 el programa indicará que será necesario
			1 billete de 100 €, 2 billetes de 20 € y 1 billete de 5 € (no será válido por ejemplo 29 billetes de
			5, que aunque sume 145 € no es el mínimo número de billetes posible).
		 */
		
		
		/*PRACTICA 8
		 * 
		 * 
		 * 1 Ejemplo de uso de while: Programa Java que muestre los números del 1 al 100 utilizando
la sentencia while.
		 * 2 Ejemplo de uso de do-while. Programa Java que muestre los números del 1 al 100
utilizando la sentencia do..while.
		 * 3 Ejemplo de uso de do-while. Programa Java que muestre los números del 100 al 1
utilizando la sentencia do..while.
		 * 4 Utilizando un bucle while solicita al usuario que introduzca valores positivos, almacena
la suma de todos estos valores, así como la cantidad de números introducidos. El bucle
parará cuando introduzca un 0. En ese momento el programa mostrará por pantalla la
cantidad de números mayores de 0 introducidos así como la media de los mismos
		 * 5 Pedir 10 números. Mostrar la media de los números positivos, la media de los números
negativos y la cantidad de ceros.
		 * 6 Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un
número negativo.
		 * 7 Realizar un juego para adivinar un número entero. Para ello el programa calculará un
número aleatorio N entre 0 y 50. Luego el programa irá pidiendo números indicando
“mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina
cuando el usuario acierta.
		 * 
		 * 8 Aplicación de senderismo:
En primer lugar, se solicitarán al usuario una serie de datos:
 Nombre
 Apellidos
 Edad (se controlará que la edad introducida sea superior a 17 y menor a 45,
mientras no introduzca un valor correcto mostraremos el mensaje “Esa edad no es
correcta” y volveremos a preguntar.
 Número rutas realizadas
 Distancia última ruta
A partir de estos datos el sistema solicitará que introduzca los datos de una serie de 5
caminatas. Se pedirá de cada caminata:
 Distancia
 Número de participantes
 Ciudad
Tras los 5 registros tendremos que ser capaces de mostrar por pantalla los siguientes
resultados en la siguiente ficha:
		 * 
		 * 
		 *  
		 *  
		 */
		
		
		
		/*
		 * PRACTICA7
		 * 
		 * Ejercicio 1(2 puntos)
Realizar un programa en Java que ayudará a un equipo de Recursos Humanos a realizar una
serie de entrevistas al usuario:
 En primer lugar se solicitarán al usuario los siguientes datos:
o Nombre, apellidos, edad y salario deseado
 Si el salario deseado supera los 30.000 euros o la edad es superior a 45 años el
candidat@ queda descartado. Mostramos un mensaje indicándolo y termina el
programa. " Lo sentimos pero no cumple nuestro perfil"
 En caso contrario continuamos con la entrevista, preguntando los siguientes
datos:
o Años de experiencia
o Proyectos trabajados anteriormente
 Si los años de experiencia superan los 2 y ha trabajado en más de 3 proyectos
será contratado. Mostraremos un mensaje "Enhorabuena. Ha sido
contratado"
 En caso contrario mostrar un mensaje: . " Lo sentimos pero no cumple
nuestro perfil"
		 * 
		 * 
		 * Ejercicio 2(2 puntos)
El siguiente programa será una mejora del anterior. Aprovecharemos el código realizado
anteriormente, pero añadiremos una nueva comprobación.
Veamos el punto al que nos referimos:
 Si los años de experiencia superan los 2 y ha trabajado en más de 3 proyectos
será contratado. Mostraremos un mensaje "Enhorabuena. Ha sido
contratado"
 Si el trabajador tiene más de 5 años de experiencia o ha trabajado en más de 5
proyectos se le asignará como salario anual: 30.000 euros. En caso opuesto
25.000. Se le mostrará por pantalla un mensaje indicádonle el salario a percibir.
		 * 
		 * 
		 * 
		 * 
		 * Ejercicio 3(2 puntos)
Haciendo uso de un switch case solicitar al usuario una nota en valor entero. Indicar la
calificación correspondiente a cada caso. Desde 0 hasta 10, en caso opuesto, en el default
indicar que la nota introducida ha sido incorrecta
		 * 
		 * 
		 * Ejercicio 4(2 puntos)
Solicitar al usuario la nota media obtenida en 4 asignaturas, la nota será de tipo double.
 Calcular la nota media y mostrarla al usuario
 Mostrar la nota media pero redondeada hacia arriba
 Mostrar la nota media redondeada hacia abajo
Una vez obtenida la nota media comprobar si supera el 8, en ese caso mostrar un mensaje por
pantalla indicando que puede acceder a estudios superiores.
En caso opuesto mostrarle un mensaje indicando que la nota media obtenida no es suficiente
para acceder a los estudios que deseaba.
		 * 
		 */
		
		/*PRACTICA 6 
		 * 
		 * 
		 * Ejercicio 1
Realizar un programa en Java que solicite al usuario dos números, num1 y num2.
 Comprobar si num1 es mayor que num2, si es al revés o si son iguales.
 Mostrar por pantalla al usuario un mensaje informando del resultado.
		 * 
		 * 
		 * Ejercicio 2
Realizar un programa en Java que solicite al usuario los siguientes datos:
 Nombre
 Edad
 Nota académica
El usuario quiere acceder a unos estudios para los que se requieren dos condiciones, por un
lado ser mayor de 18 años y además haber obtenido una nota académica mayor de 7.
Comprobar si los datos introducidos cumplen ambas condiciones. De ser así mostrar un
mensaje por pantalla: "<Nombre>, usted ha sido admitido en el curso, cumple las
condiciones requeridas". En caso contrario mostrar el siguiente mensaje "<Nombre>, lo
sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimos"
		 * 
		 * 
		 * Ejercicio 3
Realizar un programa en Java que solicite al usuario los siguientes datos:
 Edad
El usuario quiere acceder a unos estudios para los que se requiere ser mayor de edad.
Comprobaremos la edad y en caso de ser menor de 18 años mostraremos el siguiente
mensaje: No tiene la edad requerida para realizar estos estudios.
En caso de cumplir el requisito de edad se le solicitarán los siguientes datos:
 Nombre
 Apellidos
Una vez recopilados se le mostrará el siguiente mensaje:
Nombre: Juan
Apellidos: López Pérez
Edad: 25
Usted ha sido admitido
		 * 
		 * 
		 * 
		 * 
		 * Ejercicio 4
Un supermercado quiere premiar a los clientes que mayor desembolso hacen en sus tiendas.
Para ello lleva un control de las compras que realiza cada cliente. Si éstas superan en total la
cantidad de 300 euros en un mes se les entrega un vale descuento de 50 euros.
Solicita al usuario los siguientes valores:
 Nombre
 Apellidos
 ImporteGastado1
 ImporteGastado2
 ImporteGastado3
 ImporteGastado4
Realizar las siguientes acciones:
 Sumar los importes gastados por el usuario
 Calcular la media del importe gastado (ImporteGastado1+ImpGast.2.../4)
 Comprobar si el importe en suma es mayor o igual que 300 euros, si es indicar al
usuario que tiene un vale descuento de 50 euros, en caso contrario indicad que no es
así.
 Mostrar toda la información en una ficha.
		 * 
		 * 
		 */
		
		
		
		
		
	}

}
