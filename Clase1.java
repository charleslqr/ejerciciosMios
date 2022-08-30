package Consola1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Clase1 {
	
	
	public static void cuentaChar() {
		System.out.println("********CUENTA CHAR********");
		
		 String entradaUser = "";
		  
			Scanner entrada = new Scanner(System.in);		
			System.out.println("Ingrese un Texto");
			
			entradaUser = entrada.nextLine();
					
			while (!entradaUser.equalsIgnoreCase("fin")) {
			
				System.out.println("La cantidad de caracteres (incluye espacios) ingresados es: " + entradaUser.length());
				cuentaPalabra(entradaUser);				
				System.out.println("Ingrese un Texto");
				entradaUser = entrada.nextLine();
				
			}
	}
	
	public static void cuentaPalabra(String entrada) {
		System.out.println("********CUENTA PALABRAS********");
		
		String palabra = entrada.trim();
		if (palabra.contains(" ")) {
			System.out.println("Usted ha ingresado una oracion o mas de una palabra");
			cuantasPalabras(palabra);
		} else {
			System.out.println("Usted ha ingresado una sola palabra");
		}
		
	}
	
	public static void cuantasPalabras(String textoEntrada) {
		System.out.println("********CUANTAS PALABRAS********");
		
		String texto = textoEntrada.trim();
		
		String[] listaPalabras= texto.split(" ");
		
		System.out.println("La cantidad de palabras ingresadas es: "+ listaPalabras.length ); 
		
		cualesPalabras(listaPalabras);
	}
			
	public static void cualesPalabras(String[] listaPalabras) {
		System.out.println("********* CUALES PALABRAS *********");
		
		
		System.out.println("las palabras son : ");
		for (int i = 0; i < listaPalabras.length; i++) {
				System.out.println( listaPalabras[i] + "\n");
	    }
	}
		
	public static void main(String[] args) {		

		cuentaChar();
		System.out.println("Salir");
	
	
	}
	
	
} 
