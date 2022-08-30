package PracticaJava3;

import java.util.Scanner;

public class MetodosYFunciones {
	
	public static void calcularAreas() {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese el numero correspondiente a la figura de la que quiere calcular el area ");
		System.out.println("(1- circulo  2- triangulo  3- cuadrado)");
		int entradaUser = entrada.nextInt();
		
		
		switch (entradaUser) {
		case 1:
			circulo();
			break;
		case 2:
			triangulo();
			break;
		case 3:
			cuadrado();
			break;
		default: System.out.println("No corresponde a ninguna figura -- saliendo --");
			break;
		}	
		
	}
	
	public static void triangulo() {
		int base=0;
		int altura=0;
				
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese el valor de la base");
		base = entrada.nextInt();
		System.out.println("ingrese el valor de la altura");
		altura = entrada.nextInt();
		int area= (base*altura)/2;
		System.out.println("el area del triangulo es: " + area);
	}
	
	public static void circulo() {
		int radio =0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese el valor del radio");
		radio = entrada.nextInt();
		double area = Math.round(Math.PI*(Math.pow(radio, 2)));
		
		System.out.println("el area del circulo es: " + area );
	}
	
	public static void cuadrado() {
		int lado=0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese el valor dl lado");
		lado= entrada.nextInt();
		int area = lado * lado;
		System.out.println("el area del cuadrado es: " + area);
		
	}
	
	///////////////////////
	
	public static void numRandom() {
		int cantidad = 0;
		int base = 0;
		int tope = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese cuantos numero quiere generar");
		cantidad = entrada.nextInt();
		System.out.println("ingrese desde que numero");
		base = entrada.nextInt();
		System.out.println("ingrese hasta que numero");
		tope = entrada.nextInt();
		for (int i = 0; i <tope; i++) {
			System.out.println(random(base, tope));
		}
		
	}
	
	public static int random(int num1, int num2 ) {
		return ((int)Math.floor(Math.random()*(num2-num1)+num1));
	}
	
	///////////////////////
	
	public static void primo() {
		int num1 = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese un numero para saber si es primo");
		num1 = entrada.nextInt();
		System.out.println(prim(num1));
	}
	
	public static boolean prim(int num1) {
		
		if (num1/num1== 1 || num1/1 == num1) {
			return(true);
		}
		
		return(false);
	}
	
	//////////////////////
	
	

	
	
	
	

	public static void main(String[] args) {
		
		calcularAreas();
		numRandom();
		
		
		
		
		
		
	}

}
