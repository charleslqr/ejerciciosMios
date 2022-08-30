package PracticaJava2;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Consola1.practicaAlgoritmo;

import javax.swing.JOptionPane;
import javax.swing.JOptionPane;




public class practica1 {
	

	public static void nombreUser() {
		
		String nombreUser = "";
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca Nombre de Usuario");
		nombreUser = entrada.nextLine();
		System.out.println("Bienvenido " + nombreUser );
	}
	
	public static void divisiblePor2() {
		
		int num1 = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		num1 = entrada.nextInt();
		
		if(num1 % 2 == 0) {
			System.out.println("el numero " + num1 + "es divisble por dos con resto cero");
		}System.out.println("el numero se puede dividir en dos pero no tiene resto cero ");
		
	}
	
	public static void tablaASCIInumToChar() {
		
		String texto=JOptionPane.showInputDialog("Introduce un numero de la tabla ASCII (hasta 128)");
		int codigo = Integer.parseInt(texto);
		char caracter= (char) codigo;
		System.out.println(caracter);
		
	}
	
	public static void tablaASCIIcharTonum() {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce un caracter ASCII");
		char caract = entrada.next().charAt(0);
		int cod = (int) caract;
		System.out.println(cod);
		
	}
	
	public static void iva () {
		
		double precio = 0;
		double iva = 0.21;
		double precioConIva = 0;
		

		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese el precio del producto");
		precio = entrada.nextDouble();
		precioConIva = Math.round((precio * iva) + precio) ;
		System.out.println("el precio del producto con iva es: $" + precioConIva);
		
		
	}
	
	public static void num1a100() {
		
		int num = 1;
		
		while (num <= 100) {
			System.out.println(num);
			num++;
		}
				
	}
	
	public static void num100For() {
		
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		
	}
	
	public static void numDiv2y3 () {
		
		int num1 = 1;
		
		while (num1 <= 100) {
			if (num1 % 2 == 0 || num1 % 3 == 0) {
				System.out.println(num1);
			
			}
			num1++;
		}
	
			
	}
		
	public static void ventas () {
		
		int ventas = 0;
		float precio = 0;
		float totalVentas = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese un numero de ventas");
		
		ventas = entrada.nextInt();
		
		for (int i = 1; i <= ventas; i++) {
			System.out.println(" ingrese precio de venta (utilice ',' para los decimales)" + i);
			precio = entrada.nextFloat();
			totalVentas = precio + totalVentas;
			
		}
		System.out.println("total de ventas= $" + totalVentas);
		
		
		
	}
	
	public static void ecuacion2gr() {
		
		System.out.println(" ingrese valores para la ecucion (a*b2-b*c=a-1)");
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese el valor de 'a'");
	    int a = entrada.nextInt();
	    System.out.println("ingrese el valor de 'b'");
		int b = entrada.nextInt();
		System.out.println("ingrese el valor de 'c'");
		int c = entrada.nextInt();
		
		int resultado = (int) ((a * Math.pow(b, 2) - b * c) * a -1 );
		
		System.out.println("el resultado es " + resultado);
		
		
	}
	
	public static void numeroMayor0(){
		
		int num1 = 0;
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("ingrese un numero o 'cero' para salir");
			num1 = entrada.nextInt();
		} while (num1 <0);

		System.out.println("ingreso el numero: " + num1);
		
		
		
		
	}
	
	public static void password() {
		
		String pass = "hola";
		int intento = 3;
		boolean flag = true;
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("ingrese contraseña (tiene " + intento + " intento/s)");
			pass = entrada.next();
			intento--;
			if (pass.equals("hola")) {
				System.out.println("en hora buena");
				flag = false;
			}
			
		} while (pass != "hola" && flag && intento !=0 );
		
	
		
	}
	
	public static void diaLaboral() {
		
		String dia = "";
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese un dia de la semana");
		dia = entrada.next();
		
		
		switch (dia.toLowerCase()) {
		case "lunes":
			System.out.println("es un dia laboral");
			break;
		case "martes":
			System.out.println("es un dia laboral");
			break;
		case "miercoles":
			System.out.println("es un dia laboral");
			break;
		case "jueves":
			System.out.println("es un dia laboral");
			break;
		case "viernes":
			System.out.println("es un dia laboral");
			break;
		case "sabado":
			System.out.println("no es un dia laboral");
			break;
		case "domingo":
			System.out.println("no es un dia laboral");
			break;

		default:
			System.out.println("no es un dia de la semana");
			break;
		}
		
		
	}
	
	public static void numRandom() {
		
		int num1 = 0 , num2 = 0;
		double resultados = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese un numero");
		num1 = entrada.nextInt();
		
		System.out.println("ingrese otro numero");
		num2 = entrada.nextInt();
		
		for (int i=0;i<10;i++){
           
            int numAleatorio=(int)Math.floor(Math.random()*(num1-num2)+num2);
            System.out.println(numAleatorio);
		}
		
	}
	
	public static void cuantasCifras() {
		
		int num1 = 0;
		int contador = 0;
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("ingrese un numero entero positivo para contar sus cifras");
		num1 = entrada.nextInt();
		if (num1 > 0) {
		contador = Integer.toString(num1).length();
	    System.out.println("el numero " + num1 + " tiene " + contador + " cifras");
		} else System.out.println("Ha ingresado un numero negativo");
		
	}
	
	public static void numeroPrimo() {
		
			Scanner sc = new Scanner(System.in);
	        System.out.println("Introduce un numero");
	        int numero = sc.nextInt();
	 
	        
	        if (numero <= 1) {
	            System.out.println("El numero " + numero + " no es primo");
	        } else {
	            int raiz = (int) Math.sqrt(numero);
	            int contador = 0;
	 
	          for (int i = raiz; i > 1; i--) {
	                if (numero % i == 0) {
	                    contador++;
	                }
	            }
	        
	        if (contador < 1) {
	             System.out.println("El numero " + numero + " es primo");
	        } else {
	             System.out.println("El numero " + numero + " no es primo");
	        }
	 
	        }
	    }
	
	public static void calculadora () {
		
		float num1 = 0;
		float num2 = 0;
		String operador ="";
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese un numero");
		num1 = entrada.nextFloat();
		System.out.println("ingrese otro numero");
		num2 = entrada.nextFloat();
		System.out.println("ingrese un operador aritmetico (+,-,/,*,%)");
		operador = entrada.next();
		
		float suma = Math.round(num1 + num2);
		float resta = Math.round(num1 - num2);
		float multi = Math.round(num1 * num2);
		float div = Math.round(num1 / num2);
		float resto = Math.round(num1 % num2);
		
		
		
		
		switch (operador) {
		case "+":
			JOptionPane.showMessageDialog(null, "la suma es " + suma ); 
			break;
		case "-":
			JOptionPane.showMessageDialog(null, "la suma es " + resta ); 
			break;
		case "*":
			JOptionPane.showMessageDialog(null, "la suma es " + multi ); 
			break;
		case "/":
			JOptionPane.showMessageDialog(null, "la suma es " + div ); 
			break;
		case "%":
			JOptionPane.showMessageDialog(null, "la suma es " + resto ); 
			break;

		default:
			JOptionPane.showMessageDialog(null, "No es un operador matematico. Saliendo" ); 
			System.out.println();
			break;
		}
		
		
		
		
		
		
	}
	
	public static void sumaHastaNumUser() {
		
		int num = 0;
		int suma = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese un numero, se sumara uno a uno hasta el numero elegido");
		num = entrada.nextInt();
		
		  for(int contador=1;contador<=num;contador++){
	            suma+=contador;
	        } 
	             
	        System.out.println("La suma es: "+suma);
		
		
	}
	
	public static void pideNUm() {
		
		
		int num1 = 0;
		int resultado = 0;
		
		Scanner entrada = new Scanner(System.in);
		int contador = 0;
		do {
			System.out.println("inserte un numero o -1 para salir");
			num1 = entrada.nextInt();
			contador++;
		} while (num1 != -1);
		System.out.println("se introdujeron " + (contador -1) + " numeros");
	}
	
	public static void borraEspacios() {
		
		String textoUser = "";
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese un texto");
		textoUser = entrada.nextLine();
		textoUser.trim();
		;
		System.out.println(textoUser.replace(" ", ""));
		
	}
	
	public static void pideFrasesInfinitas() {
		
		String textoUser = "";
		String textoTotal = "";
		Boolean flag = true;
		do {
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("ingrese un texto (ingrese texto vacio para salir)");
			textoUser = entrada.nextLine();
			textoTotal +=  textoUser + " " ;
			if (textoUser.isEmpty()) {
				System.out.println(textoTotal);
				flag = false;
			}
			
		} while (flag);
		
	}
	
	public static void toUpperToLower() {
		
		String textoUser = "";
		String selector = "";
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese un texto");
		textoUser = entrada.nextLine();
		System.out.println("ingrese '+' para pasar a mayusculas o '-' para pasar a minusculas");
		selector = entrada.nextLine();
		
		
		switch (selector) {
		case "+":
			System.out.println(textoUser.toUpperCase());
			
			break;
		case "-":
			System.out.println(textoUser.toLowerCase());
			
			break;
			
			
		default:
			System.out.println("no se aplicaron cambios " + textoUser);
			break;
		}
		
	}
	
	public static void arrayLenght() {
		
		int numeros[]= { 1,2,3,4,5,5,7,515,151,5151,1,5,4,7,87,878};
		System.out.println("el array tiene " + numeros.length + "elementos");
	}
	
	public static void comparaPalabra() {
		
		String palabra = "";
		String palabra2 = "";
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese una palabra");
		palabra = entrada.nextLine();
		System.out.println("ingrese otra palabra");
		palabra2 = entrada.nextLine();
		
		if (palabra.equalsIgnoreCase(palabra2) ) {
			
			System.out.println("las palabras son iguales");
			
		} else {
			System.out.println("las palabras son distintas");

		}
		
	}
	
	public static void subString () {
		
		String textoUser = "";
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese un texto con mas de 10 caracteres");
		textoUser = entrada.nextLine();
		textoUser.substring(3, 4);
		System.out.println("se extrajeron las 4ta y la 5ta letra o caracter(incluido el espacio)" + textoUser);
		
	}
	
	public static void cuantasPalabras() {
		
		Scanner textoEntrada = new Scanner(System.in);
		System.out.println("ingrese un texto");
		
		String texto = textoEntrada.nextLine();
		texto.trim();
		String[] listaPalabras= texto.split(" ");
		
		System.out.println("La cantidad de palabras ingresadas es: "+ listaPalabras.length ); 
		
		
	}
	
	public static void separaPalabras() {
		
		Scanner textoEntrada = new Scanner(System.in);
		System.out.println("ingrese un texto");
		
		String texto = textoEntrada.nextLine();
		texto.trim();
		String[] listaPalabras= texto.split(" ");
		System.out.println("las palabras son: ");
		for (int i = 0; i < listaPalabras.length; i++) {
			System.out.println( listaPalabras[i] + ",");
		}
		
	}
	
	public enum diasSemana{
		lunes,
		martes,
		miercoles,
		jueves,
		viernes,
		sabado,
		domingo
	}
	
	public enum mes{
		enero(1, 31),
		febrero(2, 28),
		marzo(3, 31),
		abril(4, 30),
		mayo(5, 31),
		junio(6, 30),
		julio(7, 31),
		agosto(8, 31),
		septiembre(9, 30),
		octubre(10, 31),
		noviembre(11, 30),
		diciembre(12, 31);
		
		
		private int orden;
		private int numDias;
		
		private mes(int orden , int numDias) {
			this.orden=orden;
			this.numDias=numDias;
		}
		
		public int getOrden() {
			return orden;
		}
		public int getNumDias() {
			return numDias;
		}
		@Override
		public String toString() {
			return "el mes "+ this.name().toLowerCase() + " es el " + orden + "° mes y tiene " + numDias + " dias"; 
		}
	}
	
	public static void diasSemanaLista() {
		String dia ="";
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese un dia de la semana");
		dia = entrada.next();
		
		diasSemana dias = diasSemana.valueOf(dia);
		
		
			switch (dia.toLowerCase()) {
			case "lunes":				
			case "martes":				
			case "miercoles":				
			case "jueves":				
			case "viernes":
				System.out.println("el dia " + dias.name() + " es un dia laboral");
				break;
			case "sabado":				
			case "domingo":
				System.out.println("el dia " + dias.name() + " no es un dia laboral");
				break;
			default:
				System.out.println("no es un dia de la semana");
				break;
			}			
		
	}
	
	public static void mesLista() {
		
		int dias = 0;
		mes[] meses = mes.values();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingresa un numero de dias para saber el mes");
		dias = entrada.nextInt();
		
		for (int i = 0; i < meses.length; i++) {
			if (meses[i].getNumDias()== dias) {
				System.out.println(meses[i].toString());
			}
		}
	
	
	
	}

	public static void ingreseNumeros() {
		
		int num1 = 0;
		int numMayor = 0;
		int numMenor = 0;
		int sumaNum = 0;
		int sumaP = 0;
		int sumaN = 0;
		int contador = -1;
		double media = sumaNum / contador;
		
		do {
			
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("ingrese un numero o -1 para salir");
			num1 = entrada.nextInt();
			
			if (numMenor > num1) {
				numMenor = num1;
			}
			if (numMayor < num1) {
				numMayor = num1;
			}
			
			sumaNum += num1;
			contador++;
			
			
		} while (num1 != -1);
		
		System.out.println("el numero mayor es " + numMayor);
		System.out.println("el numero menor es " + numMenor);
		System.out.println("la suma es " + sumaNum);
		System.out.println("la suma de los positivos es " + sumaP);
		System.out.println("la suma de los negativos es " + sumaN);
		System.out.println("la media es " + media);
		
				
	}
	
	public static void reloj() throws InterruptedException {
		
		int horas = 0;
		int minutos = 0;
		int segundos = 0;
		
		while (true) {
			 
          
            if (horas < 10) {
                System.out.print("0");
            }
 
            System.out.print(horas + ":");
 
            if (minutos < 10) {
                System.out.print("0");
            }
 
            System.out.print(minutos + ":");
 
            if (segundos < 10) {
                System.out.print("0");
            }
 
            System.out.println(segundos); 
            segundos++;
 
            if (segundos == 60) {
               
                segundos = 0;               
                minutos++;
                
                if (minutos == 60) {
                  
                    minutos = 0;                   
                    horas++;
                    if (horas == 24) {
                        
                        horas = 0;
                    }
                }
            }
 
            Thread.sleep(900);
 
        }
 
    
		
		
	}
	
	
	public enum ejercicios{
				
		nombreUser(),
		divisiblePor2(),
		tablaASCIInumToChar(),
		tablaASCIIcharTonum(),
		iva (),
		num1a100(),
		num100For(),
		numDiv2y3 (),
			
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	public static void main(String[] args) throws InterruptedException {
		
		int numEje = 0;
		int cantEje = 29;
		
			do {
				Scanner entrada = new Scanner(System.in);
				System.out.println("ingrese el numero del ejercicio o 'cero' para el indice");
				numEje = entrada.nextInt();
				
				switch (numEje) {
				case 0: 
					System.out.println("1- Nombre de Usuario. \n " +
							"2- Radio Circunferencia. \n " +
							"3- Numero de Tabla ASCII. \n " +
							"4- Caracter de Tabla ASCII. \n " +
							"5- Calcular IVA. \n " +
							"6- Nun de 1 a 100. \n " +
							"7- Nun de 1 a 100 con FOR. \n " +
							"8- Num Divisible por 2 y 3. \n " +
							"9- Claculo total de ventas. \n " +
							"10- Ecuacion de 2do grado. \n " +
							"11- Num mayor a cero. \n " +
							"12- Password. \n " +
							"13- Identificar Dia Laboral. \n " +
							"14- Genera 10 numeros Random entre dos numeros. \n " +
							"15- Contador de cifras. \n " +
							"16- Identifica Numero Primo. \n " +
							"17- Calculadora con mensaje emergente. \n "+
							"18- Pide numeros y suma hasta el num ingresado. \n "+
							"19- Borra espacios. \n " + 
							"20- Pide frases infinitas. \n "+
							"21- To Upper To Lower. \n "+
							"22- Array Length. \n "+
							"23- Compara Palabra. \n "+
							"24- Cuenta Palabras. \n "+
							"25- Dias de la semana usando lista. \n "+
							"26- Meses usando lista. \n "+
							"27- Ingrese Numeros, identifica mayor, menor, suma postitivos, suma negativos, media.\n "+
							"28- reloj \n "+
							"29- Ejercicios Anteriores "
		
						
							);
					break;
				
				case 1:
					nombreUser();
					break;
				case 2:
					Consola1.practicaAlgoritmo.ocho();
					break;
				case 3:
					tablaASCIInumToChar();
					break;
				case 4:
					tablaASCIIcharTonum();
					break;
				case 5:
					iva();
					break;
				case 6:
					num1a100();
					break;
				case 7:
					 num100For();
					break;
				case 8:
					  numDiv2y3();
					break;
				case 9:
					 ventas();
					break;
				case 10:
					ecuacion2gr();
					break;
				case 11:
					numeroMayor0();
					break;
				case 12:
					  password();	 
					break;
				case 13:
					 diaLaboral();
					break;
				case 14:
					numRandom();
					break;
				case 15:
					 cuantasCifras(); 
					break;
				case 16:
					 numeroPrimo();
					break;
				case 17:
					calculadora();
					break;
				case 18:
					sumaHastaNumUser();
					break;
				case 19:
					pideNUm();
					break;
				case 20:
					pideFrasesInfinitas();
					break;
				case 21:
					toUpperToLower();
					break;
				case 22:
					arrayLenght();
					break;
				case 23:
					comparaPalabra();
					break;
				case 24:
					cuantasPalabras();
					break;
				case 25:
					diasSemanaLista();
					break;
				case 26:
					mesLista();
					break;
				case 27:
					pideNUm();
					break;
				case 28:
					reloj();
					break;
				case 29:
					practicaAlgoritmo.main(args);
					break;
				default:
					System.out.println("ingreso un numero fuera del indice");
					break;
				}
				
			} while (numEje <= cantEje);
		
	
		
		}
		
}
		

   
		
		
		
		
		
		
		
		
		
	


