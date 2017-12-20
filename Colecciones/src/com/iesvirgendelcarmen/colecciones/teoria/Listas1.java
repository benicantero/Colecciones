package com.iesvirgendelcarmen.colecciones.teoria;

import java.util.ArrayList;


public class Listas1 {

	public static void main(String[] args) {
		ArrayList<String> listaCadenas = new ArrayList();
		listaCadenas.add("juan");
		listaCadenas.add("pedro");
		listaCadenas.add("juani");
		listaCadenas.add("juanita");
		System.out.println("Tamaño de la lista: " + listaCadenas.size());
		System.out.println("Elemento 0 de la lista: " + listaCadenas.get(0));
		System.out.println("------------------");
		for (int i = 0; i < listaCadenas.size(); i++) {
			System.out.printf("Elemento %d de la lista %S%n" , i, listaCadenas.get(i));
		}		
		listaCadenas.remove(0);
		System.out.println("------------------");
		System.out.println(listaCadenas);
		listaCadenas.add(0, "joselito");
		System.out.println("------------------");
		System.out.println(listaCadenas);
		listaCadenas.add(2, "joselita");
		System.out.println("------------------");
		System.out.println(listaCadenas);
		System.out.println("El tamaño ahora ha cambiado siendo: " + listaCadenas.size());
		listaCadenas.set(2, "pepita");
		System.out.println("------------------");
		System.out.println(listaCadenas);
		
	}
	
	

}
