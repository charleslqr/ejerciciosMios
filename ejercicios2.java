package Consola1;

import java.util.Scanner;

public class ejercicios2 {

	public static void triangulo () {
		int l1 = 0;
		int l2 = 0;
		int l3 = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese primer lado");
		l1 = entrada.nextInt();
		System.out.println("Ingrese segundo lado");
		l2 = entrada.nextInt();
		System.out.println("Ingrese tercer lado");
		l3 = entrada.nextInt();
		
		if (l1 == l2 && l2 == l3) {
			System.out.println("los valores introducidos forman un triangulo equilatero");
			
		} else if (l1 == l2 && l2 != l3 && l1+l2!=l3 || l1 == l3 && l3 != l2 && l1+l3 != l2 || l2 == l3 && l3 != l1 && l2+l3!=l1) {
			System.out.println("los valores introducidos forman un triangulo isosceles");
		} else if (l1 != l2 && l1 != l3 && l3 != l2) {
			System.out.println("los valores introducidos forman un triangulo escaleno");
		} else if (l1+l2==l3 || l2+l3 ==l1||l1+l3==l2) {
			System.out.println("los valores introducidos no forman un triangulo");
		}
		
		
		
	}
	
	
	
	//-------------------------------------------------------------------------------------------------------
	
	public static void calcu () {
	
	float num1 = 0;
	float num2 = 0;
	String op = "";
	String fin = "salir";
	boolean flag = true;
	Scanner sc = new Scanner(System.in);
	
	do {
		System.out.println("Ingrese un numero");
		num1 = sc.nextFloat();
		System.out.println("ingrese un operador matematico (+,-,*,/,%)");
		op = sc.next();
		System.out.println("Ingrese un segundo numero");
		num2 = sc.nextFloat();
		
		 	switch (op) {
			case "+":
				System.out.println("la suma es: " + (num1+num2));
				
				break;
			case "-":
				System.out.println("la resta es: " + (num1-num2));
				
				break;
			case "*":
				System.out.println("la multiplicacion es: " + (num1*num2));
				
				break;	
			case "/":
				if (num2 == 0) {
					System.out.println("no se puede dividir por cero");
					flag = false;
				} else {
					System.out.println("la division es: " + (num1/num2));
					
				}
				
				break;	
			case "%":
				System.out.println("el resto de la division es: " + (num1%num2));
				
				break;	
				
			default:
				System.out.println("no es un operador matematico");
				flag = false;
				break;
			}
	} while (flag);
	System.out.println("escriba 'salir' para terminar o presione cualquier tecla para continuar");
	fin = sc.next();
	if (fin.equalsIgnoreCase("salir")) {
		System.out.println("salio");
	} else flag = true;

	
	
	
	
	
	
	
	
	}
	
	public static void main(String[] args) {
		//triangulo();
		//calcu();
		
		
		
		
		
		
		
		
		
		
		
	}

}
