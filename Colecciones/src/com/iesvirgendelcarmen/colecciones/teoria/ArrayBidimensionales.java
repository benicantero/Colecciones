package com.iesvirgendelcarmen.colecciones.teoria;

import java.util.Scanner;


public class ArrayBidimensionales {

	public static void main(String[] args) {
		final int COLUMNAS = 3;
		final int FILAS = 3;
		Scanner sc = new Scanner(System.in);
		int[][] arrayBidimensional = new int [FILAS][COLUMNAS];
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				System.out.printf("Valor fila %d columna %d%n",i,j);
				arrayBidimensional[i][j] = sc.nextInt();
			}
		}
		sc.close();
		//mostrar array bidimensional
		for (int i = 0; i < FILAS; i++) {
			System.out.println();
			for (int j = 0; j < COLUMNAS; j++) {
				System.out.printf("%3d",arrayBidimensional[i][j]);
			}
		}
		mostrarDatosArrayBidimensional(arrayBidimensional);
		int[][] nuevoArray = {{1,2},{11,12,13},{1}};
		
		mostrarDatosArrayBidimensional(nuevoArray);
	}
	public static void mostrarDatosArrayBidimensional (int [][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%3d",array[i][j]);
			}
		}
	}
}

