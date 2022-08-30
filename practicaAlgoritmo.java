package Consola1;


import java.util.Scanner;

public class practicaAlgoritmo {
	
	

	public static void uno() {
		int num1 = 34;
		int num2 = 10;
		int resultado = num1 + num2;
		System.out.println("La suma es: " + resultado);
	}
	
	public static void dos() {
		
		int num1 = 0;
		int num2 = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese un numero entero");
		num1 = scan.nextInt();
		System.out.println("ingrese otro numero entero");
		num2 = scan.nextInt();
		int resultado = num1 + num2;
		
		System.out.println("la suma es: " + resultado);
	}
	
	public static void tres() {
		
		int num1 = 0;
		int num2 = 0;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese un numero entero");
		num1 = scan.nextInt();
		System.out.println("ingrese otro numero entero");
		num2 = scan.nextInt();
		
		int suma = num1 + num2;
		int resta = num1 - num2;
		int prod = num1 * num2;
		
		System.out.println("la suma es: " +suma);
		System.out.println("la resta es: " + resta);
		System.out.println("el producto es: " + prod);
	
	}
	
	public static void cuatro() {
		
		float num1 = 0;
		float num2 = 0;
	
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese un numero");
		num1 = entrada.nextFloat();
		System.out.println("ingrese otro numero");
		num2 = entrada.nextFloat();
		
		float promedio = (num1 + num2)/2;
		
		System.out.println("el promedio es " + promedio);
		
	
	}
		
	public static void cinco() {
		
		int num1 = 0;
	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese un numero entero");
		num1 = scan.nextInt();
		
		float quintaP = num1 / 5;
		float resto = num1 % 5;
		float tercioDeQuin = (num1/5)/3;
		
		System.out.println("la quinta parte es: " + quintaP);
		System.out.println("el resto del la division por 5 es: " + resto);
		System.out.println("un tercio de la quinta parte es: " + tercioDeQuin);
	
	}
	
	public static void seis() {
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		String cero = "0";
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese un numero para el dia");
		num1 = scan.nextInt();
		System.out.println("ingrese un numero para el mes");
		num2 = scan.nextInt();
		System.out.println("ingrese un numero para el año entre 1900 y la actualidad");
		num3 = scan.nextInt();
		
		String natural1 = Integer.toString(num3) + cero + Integer.toString(num2) + cero + Integer.toString(num1);
		String natural2 = Integer.toString(num3) + Integer.toString(num2) + cero + Integer.toString(num1);
		String natural3 = Integer.toString(num3) + cero + Integer.toString(num2) + Integer.toString(num1);
		
		if (num1 <= 9 && num2 <= 9) {
			System.out.println("el numero natural seria: " + natural1);
		} else if(num1 <= 9 && num2 >= 9) {
			System.out.println("el numero natural seria: " + natural2);
		} else if(num1 >= 9 && num2 <= 9) {
			System.out.println("el numero natural seria: " + natural3);
		}
	
	}
		
	public static void siete() {
		
		int num1 = 0;
		int anio = 0;
		int mes = 0;
		int dia = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese un numero para la fecha en formato AAAAMMDD entre el 1900 y la actualidad");
		num1 = entrada.nextInt();
		anio = num1 / 10000;
		mes = (num1 - (anio * 10000))/100 ;
		dia = (num1 - (anio * 10000 + mes * 100));
		System.out.println("el año es: " + anio + " el mes es: " + mes + " el dia es: " + dia  );
	
	}
	
	public static void ocho() {
		
		int radio = 0;
				
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese un numero para el radio de la circunferencia");
		radio = entrada.nextInt();
		
		double diametro = radio*2;
		double circunferencia = Math.round( (Math.PI*(radio*2)));
		double area = Math.round(Math.PI*(Math.pow(radio, 2)));
		
		System.out.println("el diametro es: " + diametro);
		System.out.println("el circunferencia es: " + circunferencia);
		System.out.println("el area es: " + area);
	
		
	}
		
	public static void nueve() {
		
		int num1 = 0;
		int num2 = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese un numero entero");
		num1 = entrada.nextInt();
		System.out.println("ingrese otro numero entero");
		num2 = entrada.nextInt();
		if (num1 > num2) {
			System.out.println("el numero " + num1 + " es mayor");
		} else if (num2 >= num1) {
			System.out.println("el numero " + num2 + " es mayor o igual");
		 }
	}

	public static void diez() {
		
		int num1 = 0;
		int num2 = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese un numero entero");
		num1 = entrada.nextInt();
		System.out.println("ingrese otro numero entero");
		num2 = entrada.nextInt();
		if (num1 == num2) {
			System.out.println("el numero " + num1 + " es igual a " + num2);
		} else if (num1 > num2) {
			System.out.println("el numero " + num1 + " es mayor a " + num2);
		} else if (num2 > num1) {
			System.out.println("el numero " + num2 + " es mayor a " + num1);
		}
				
	}
	
	public static void once() {
		int dia1 = 0;
		int dia2 = 0;
		int mes1 = 0;
		int mes2 = 0;
		int anio1 = 0;
		int anio2 = 0;
		
				
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese un numero de cuatro digitos para el año");
		anio1 = entrada.nextInt();
		System.out.println("ingrese un numero de dos digitos para el mes");
		mes1 = entrada.nextInt();
		System.out.println("ingrese un numero de dos digitos para el dia");
		dia1 = entrada.nextInt();
		
		String fecha1 = Integer.toString(anio1) +" / " + Integer.toString(mes1) + " / "+ Integer.toString(dia1);
		
		System.out.println("ingreso la siguiente fecha " + fecha1);
		System.out.println("ingrese un numero de cuatro digitos para el año");
		anio2 = entrada.nextInt();
		System.out.println("ingrese un numero de dos digitos para el mes");
		mes2 = entrada.nextInt();
		System.out.println("ingrese un numero de dos digitos para el dia");
		dia2 = entrada.nextInt();
		
		String fecha2 = Integer.toString(anio2) + " / " + Integer.toString(mes2) + " / " + Integer.toString(dia2);
		
		System.out.println("ingreso la siguiente fecha " + fecha2);
		
		if (anio1 > anio2) {
			System.out.println("Esta fecha " + fecha1 + " es mas reciente que " + fecha2);
		} else if (anio1 < anio2){
			System.out.println("Esta fecha " + fecha2 + " es mas reciente que " + fecha1);
		} else if (anio1 == anio2 && mes1 > mes2) {
			System.out.println("Esta fecha " + fecha1 + " es mas reciente que " + fecha2);
		} else if (anio1 == anio2 && mes1 < mes2) {
			System.out.println("Esta fecha " + fecha2 + " es mas reciente que " + fecha1);
		} else if (anio1 == anio2 && mes1 == mes2 && dia1 > dia2) {
			System.out.println("Esta fecha " + fecha1 + " es mas reciente que " + fecha2);
		} else if (anio1 == anio2 && mes1 == mes2 && dia1 < dia2) {
			System.out.println("Esta fecha " + fecha2 + " es mas reciente que " + fecha1);
		}else if (anio1 == anio2 && mes1 == mes2 && dia1 == dia2) {
			System.out.println("Esta fecha " + fecha2 + " es igual a " + fecha1);
		}
				
	}
	
	public static void doce() {
		
		float num1 = 0;
		float num2 = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese el primer numero");
		num1 = entrada.nextFloat();
		System.out.println("ingrese el segundo numero");
		num2 = entrada.nextFloat();
		
		float producto = num1 * num2;
		float resta = num1 - num2; 
		float suma = num1 + num2;
		float division = num1 / num2;
	
		System.out.println("la suma es: " + suma);
		System.out.println("la resta es: " + resta);
		System.out.println("el producto es: " + producto);
		if (num2 == 0) {
			System.out.println("no se puede dividir por cero");
		} else {
			System.out.println("el cociente es: " + division);
		}
	}
	
	public static void trece() {
		float num1 = 0;
		float num2 = 0;
		String op = "";
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese un numero");
		num1 = entrada.nextInt();
		System.out.println("ingrese un operador matematico (+,-,*,/,%)");
		op = entrada.next();
		System.out.println("ingrese otro numero");
		num2 = entrada.nextInt();
		
		float producto = num1 * num2;
		float resta = num1 - num2; 
		float suma = num1 + num2;
		float division = num1 / num2;
		float resto = num1 % num2;
		
		switch (op) {
		case "+":
			System.out.println("la suma es: " + suma);
			break;
		case "-":
			System.out.println("la resta es: " + resta);
			break;
		case "*":
			System.out.println("el producto es: " + producto);
			break;
		case "/":
			System.out.println("la division es: " + division);
			break;
		case "%":
			System.out.println("el resto de la division es: " + resto);
			break;

		default:
			System.out.println("ingrese un operador valido");
			break;
		}
	}
	
	public static void catorce() {
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
		if (l1+l2>=l3 || l2+l3 >=l1||l1+l3>=l2) 
			System.out.println("los valores introducidos no forman un triangulo");
		else
			System.out.println("los valores introducidos forman un triangulo");
		
		
	}
		
	public static void quince() {
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
		
		if (l1+l2==l3 || l2+l3 ==l1||l1+l3==l2) {
			System.out.println("los valores introducidos no forman un triangulo");
		}	
		else if (l1 == l2 && l2 == l3) {
			System.out.println("los valores introducidos forman un triangulo equilatero");
			
		} else if ((l1 == l2 && l2 != l3) || (l1 == l3 && l3 != l2) || (l2 == l3 && l3 != l1)) {
			System.out.println("los valores introducidos forman un triangulo isosceles");
		} else if (l1 != l2 && l1 != l3 && l3 != l2) {
			System.out.println("los valores introducidos forman un triangulo escaleno");
		} 
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		int numEjercicio = 0;
		int cantEjercicios = 18;
		
		
	do {
		Scanner entrada = new Scanner (System.in);
		System.out.println("ingrese el numero de ejercicio que desea ");

		numEjercicio = entrada.nextInt();
		//entrada.reset();
		
		switch (numEjercicio) {
		case 1:
			uno();
			break;
		case 2:
			dos();
			break;
		case 3:
			tres();
			break;
		case 4:
			cuatro();
			break;
		case 5:
			cinco();
			break;
		case 6:
			seis();
			break;
		case 7:
			siete();
			break;
		case 8:
			ocho();
			break;
		case 9:
			nueve();
			break;
		case 10:
			diez();
			break;
		case 11:
			once();
			break;
		case 12:
			doce();
			break;
		case 13:
			trece();
			break;
		case 14:
			catorce();
			break;
		case 15:
			quince();
			break;
		case 16:
			calculadora.cuantasTortas();
			break;
		case 17:
			ejercicios2.calcu();
			break;
		case 18:
			ejercicios2.triangulo();
			break;
		default:
			System.out.println("ingrese un numero valido");
			break;
		}
		
		//entrada.close();
	} while (numEjercicio <= cantEjercicios);
		
			
			
		
	
		
		

	}

}
