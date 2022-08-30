package Consola1;

import java.util.Scanner;

public class calculadora {

	public static void suma (int a, int b) {
		int var1 = (a + b); 
		System.out.println("La suma es: " + var1);
	}
	public static void resta (int a, int b) {
		int var2 = (a - b); 
		System.out.println("La resta es: " + var2);
	}
	public static void multiplica (int a, int b) {
		int var3 = (a * b); 
		System.out.println("La multiplicacion es: " + var3);
	}
	public static void divi (int a, int b) {
		if (b ==0) {
			System.out.println("no se puede dividir por cero");
		} else {
			int var4 = (a / b); 
			System.out.println("La division es: " + var4);
		}
		
	}
	public static void diviDec (float a, float b) {
		if (b==0) {
			System.out.println("no se puede dividir por cero");
		} else {
			float var5 = (a / b); 
			System.out.println("La division con decimales es: " + var5);
		}
		
	}
	public static void modulo (int a, int b) {
		int var6 = (a % b); 
		System.out.println("El resto de la division es: " + var6);
	}
	public static void operador () {
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese un numero entero");
		int num1 = entrada.nextInt();
		System.out.println("ingrese otro numero entero");
		int num2 = entrada.nextInt();
		
		suma(num1, num2);
		resta(num1, num2);
		multiplica(num1, num2);
		divi(num1, num2);
		modulo(num1, num2);
		diviDec(num1, num2);
	}
	public static void cuantasTortas() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese numero de invitados");
		double invi = entrada.nextInt();
		invi = (invi/8); 
		double inviRb = Math.floor(invi);
		double inviRt = Math.ceil(invi);
	
		System.out.println("Necesita "+ inviRb + " tortas para que falten porciones");
		System.out.println("Necesita "+ inviRt + " tortas para que sobren porciones");
		
	}
	
	
	public static void main(String[] args) {
		
		
		cuantasTortas();
		operador();
		
		
		
	}

}
