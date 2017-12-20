package com.iesvirgendelcarmen.colecciones.teoria;

public class Array1 {

	public static void main(String[] args) {
		//crear una coleccion de tipos enteros de tamaño 10
		int[] coleccionEnteros;
		coleccionEnteros = new int[10];
			
		//rellenar
		for (int i = 0; i < coleccionEnteros.length; i++) {
			coleccionEnteros[i] = 3;
		}
		//crear una coleccion de tipo doubles de tamaño 5
		double coleccionDoubles [] = new double [5];
		//rellenar
		for (double d : coleccionDoubles) {
			d = 5.2;
		}
		//crear una coleccion de tipo cadenas inicializada
		String coleccionCadenas[] = {"juan", "pepi" , "luisa" , "felicidad" , "pedro" , "antonio"};
		
		//mostramos datos de la primera coleccion
		for (int i : coleccionEnteros) { //este bucle no sirve para dar valores a una coleccion
			System.out.println(i);
		}
		//mostramos datos de la segunda coleccion
		for (int i = 0; i < coleccionDoubles.length; i++) {
			System.out.println(coleccionDoubles[i]);
			
		}
		for (String nombres : coleccionCadenas) {
			System.out.println(nombres);
		}
		System.out.printf("Tamaño de la coleccion de cadenas %d%n", coleccionCadenas.length);
		//esto de abajo no puede ser, el tamaño es 6 y fijo
		//empezamos a contar desde 0 y en este caso el ultimo es 5
		//coleccioncadenas[6] = "hola";
	
	
	}

}
