
package com.iesvirgendelcarmen.ejercicios;

import java.util.Arrays;

public class Colecciones {

	public static void main(String[] args) {
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		
		for (int i = 0; i < array1.length; i++) {
			array1[i] = 3;
		}
	Arrays.fill(array2, 5);
	mostrarDatos(array1,array2);
	}
	public static void mostrarDatos (int[] array1, int[] array2) {
		if (array1.length == array2.length) {
			for (int i = 0; i < array2.length; i++) {
			System.out.println("Elemento numero " + i + " : " + array1[i] + " " + array2[i]);
			
			}
		}else System.out.println("Los arrays no tienen el mismo tamaño");
	}
}
