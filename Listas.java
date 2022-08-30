package PracticaJava2;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Listas {

	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		//creacion de la lista

		ArrayList<String> miArrayList = new ArrayList<String>();
		
		
		//agrego elementos a la lista
		
		miArrayList.add("Pablo");
		miArrayList.add("Juan");
		miArrayList.add("Maria");
		miArrayList.add("Pablo");
		miArrayList.add("Laura");
		
		//devuelve el numero de elementos
		miArrayList.size();
		
		
		int cantidadElementos = 0;
		cantidadElementos = miArrayList.size();
		System.out.println(cantidadElementos);
		
		
		//devuelve el elemento en determinada posicion		
		miArrayList.get(2);
		
		System.out.println(miArrayList.get(2));
		
		
		//busca un elemento que se pasa como parametro		
		miArrayList.contains("Maria");
		
		
		//devuelve la primer ocurrencia "Pablo" en la lista 
		miArrayList.indexOf("Pablo");
		
		//duvuelve la ultima ocurrencia "Pablo" en la lista
		miArrayList.lastIndexOf("Pablo");
		
		//ELIMINA un elemento
		miArrayList.remove("Maria");
		
		//ELIMINA elemento en la posicion indicada
		miArrayList.remove(3);
		
		//ELIMINA TODOS los elemntos de la lisata
		miArrayList.clear();
		
		
		//devuelve TRUE si la lista esta vacia
		miArrayList.isEmpty();
		
		//COPIAR un ArrayList		
		ArrayList<String> MiArrayCopia = (ArrayList) miArrayList.clone();
		
		//Pasar el ARRAYLIST a ARRAY
		Object[] array = miArrayList.toArray();
		
		
		
		//ITERATOR----------------------------------------------------------------------------------------
		
		//declaramos el ArrayList
		
		ArrayList<String> nuevoArray1 = new ArrayList<String>();
		
		//Agregamos 10 elementos al array
		
		for (int i = 0; i < 10; i++) {
			nuevoArray1.add("elemento " + i);
		}
		
		//Agregamos un nuevo elemento al Array en la posicion 2
		nuevoArray1.add(2, "elemento 3");
		
		//Declaramos el ITERATOR e imprimimos los elementos del ArrayList
		
		java.util.Iterator<String> miIterator = nuevoArray1.iterator();
		while (miIterator.hasNext()) {
			String elemento = miIterator.next();
			System.out.print(elemento + " / ");
		}
		
		//Obtenemos el numero de elemenmtos del ArrayList
		
		int numElementos = nuevoArray1.size();
		System.out.println("el ArrayList tiene " + numElementos + " elementos");
		
		
		//Eliminamos el primer elementos del ArrayList es decir el que ocupa la posicion 0
		
		nuevoArray1.get(0);
		System.out.println("el elemento a eliminar es " + nuevoArray1.get(0) );
		nuevoArray1.remove(0);
		
		java.util.Iterator<String> miIterator1 = nuevoArray1.iterator();
		while (miIterator1.hasNext()) {
			String elemento = miIterator1.next();
			System.out.print(elemento + " / ");
		}
		
		
		//Eliminamos todos los elementos que son iguales a "elemenmto 3"
		
		while (miIterator1.hasNext()) {
			String elemento = miIterator1.next();
			if (elemento.equals("elemento 1")) 
				miIterator1.remove();
			
		}
		System.out.println("el ArrayList tiene " + numElementos + " elementos");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
