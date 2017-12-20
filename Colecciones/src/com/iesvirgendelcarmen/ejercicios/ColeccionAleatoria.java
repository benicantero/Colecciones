package com.iesvirgendelcarmen.ejercicios;

import java.util.Arrays;

public class ColeccionAleatoria {

	public static void main(String[] args) {
		final int TAMANIO = 100;
		int[] array = new int[TAMANIO]; // declaracion del array
		
		//llenamos array con valores aleatorios
		for (int i = 0; i < array.length; i++) {
			array[i]= (int) (Math.random() * 101);
		}
		//mostrar datos
		System.out.println("Array generado ........................");
		System.out.println(Arrays.toString(array));
		//int[] array2 = array.clone();  SE PODRIA CLONAR EL ARRAY INICAL PARA GUARDAR LOS DATOS INICIALES
	System.out.printf("La media de los valores es %.2f%n",calcularValorMedio (array));
	System.out.printf("La desviacion tipica es : %.2f%n",calcularDesviacionTipica(array));
	System.out.println("El array aleatorio generado lo ordenamos.......................");
	ordenarArray(array);
	System.out.println("Array de pares " + Arrays.toString(mostrarArrayDePares(array)));
	int[] minimoMaximo = devolverMinimoYMaximo(array);
	System.out.printf("Valor mas pequeño %d, valor mas grande %d%n",minimoMaximo[0],minimoMaximo[1]);
	}
	
	
	public static double calcularValorMedio (int[] array) {
		int acum = 0;
		for (int i = 0; i < array.length; i++) {
			acum += array[i];
		}
		return 1.0 * acum/array.length;
	}
	
	
	public static double calcularDesviacionTipica (int[] array) {
		double varianza = 0;
		for (int i = 0; i < array.length; i++) {
			varianza += (array[i]*array[i]);
		}
		varianza = varianza / array.length;
		return Math.sqrt(varianza);
	}
	
	public static void ordenarArray (int[] array) {
		Arrays.sort(array);//metodo para ordenar arrays
		System.out.println(Arrays.toString(array));
	}
	
	public static int[] devolverMinimoYMaximo (int[] array) {
		int[] arrayADevolver = new int[2];
		arrayADevolver[0] = array[0];
		arrayADevolver[1] = array[array.length - 1];
		return arrayADevolver;
	}
	
	public static int[] mostrarArrayDePares (int[] array) {
		//calculo cuantos pares existen
		int numeroPares = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]% 2 == 0) {
				numeroPares++;
			}
		}
		//System.out.println("Creando array de Pares de dimension: " + numeroPares + "...................................");
		int[] arrayDePares = new int [numeroPares];
		int contador= 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]% 2 == 0) {
				arrayDePares[contador] = array[i];
				contador++;
			}
			
		}
	return arrayDePares;
	}
}
