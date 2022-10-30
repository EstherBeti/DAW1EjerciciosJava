package com;

import java.util.Scanner;

public class MayoresMenores {

	public static void main(String[] args) {
		// Inicializar Scanner

		Scanner teclado;
		teclado = new Scanner(System.in);

		// Declaración e inicialización de variables

		int referencia;
		referencia = 0;

		int valor1;
		valor1 = 0;

		int valor2;
		valor2 = 0;

		int valor3;
		valor3 = 0;

		int valor4;
		valor4 = 0;

		int valor5;
		valor5 = 0;

		int valor6;
		valor6 = 0;

		int valor7;
		valor7 = 0;

		int valor8;
		valor8 = 0;

		int valor9;
		valor9 = 0;

		int valor10;
		valor10 = 0;

		// Intrucción por teclado del valor de las variables referencia y el resto de
		// valores del 1 al 10.
		System.out.println("Hola!Introduce un numero para darle un valor a referencia");
		referencia = teclado.nextInt();

		System.out.println("Introduce también un numero para el valor 1");
		valor1 = teclado.nextInt();

		System.out.println("Introduce un numero para el valor 2");
		valor2 = teclado.nextInt();

		System.out.println("Introduce un numero para el valor 3");
		valor3 = teclado.nextInt();

		System.out.println("Introduce un numero para el valor 4");
		valor4 = teclado.nextInt();

		System.out.println("Elige un numero para el valor 5");
		valor5 = teclado.nextInt();

		System.out.println("Asigna un numero para el valor 6");
		valor6 = teclado.nextInt();

		System.out.println("Introduce por teclado un numnero para el valor 7");
		valor7 = teclado.nextInt();

		System.out.println("Introduce un numero para el valor 8");
		valor8 = teclado.nextInt();

		System.out.println("Asigna un numero para el valor 9");
		valor9 = teclado.nextInt();

		System.out.println("Elige un numero para el valor 10");
		valor10 = teclado.nextInt();

		// Declaracion e inicializacion boolean
		// Mayor
		boolean mayor1;
		mayor1 = false;
		boolean mayor2;
		mayor2 = false;
		boolean mayor3;
		mayor3 = false;
		boolean mayor4;
		mayor4 = false;
		boolean mayor5;
		mayor5 = false;
		boolean mayor6;
		mayor6 = false;
		boolean mayor7;
		mayor7 = false;
		boolean mayor8;
		mayor8 = false;
		boolean mayor9;
		mayor9 = false;
		boolean mayor10;
		mayor10 = false;

		// Menor
		boolean menor1;
		menor1 = false;
		boolean menor2;
		menor2 = false;
		boolean menor3;
		menor3 = false;
		boolean menor4;
		menor4 = false;
		boolean menor5;
		menor5 = false;
		boolean menor6;
		menor6 = false;
		boolean menor7;
		menor7 = false;
		boolean menor8;
		menor8 = false;
		boolean menor9;
		menor9 = false;
		boolean menor10;
		menor10 = false;

		// Igual
		boolean igual1;
		igual1 = false;
		boolean igual2;
		igual2 = false;
		boolean igual3;
		igual3 = false;
		boolean igual4;
		igual4 = false;
		boolean igual5;
		igual5 = false;
		boolean igual6;
		igual6 = false;
		boolean igual7;
		igual7 = false;
		boolean igual8;
		igual8 = false;
		boolean igual9;
		igual9 = false;
		boolean igual10;
		igual10 = false;

		// Operaciones lógicas:
		// Mayor
		mayor1 = (referencia > valor1);
		mayor2 = (referencia > valor2);
		mayor3 = (referencia > valor3);
		mayor4 = (referencia > valor4);
		mayor5 = (referencia > valor5);
		mayor6 = (referencia > valor6);
		mayor7 = (referencia > valor7);
		mayor8 = (referencia > valor8);
		mayor9 = (referencia > valor9);
		mayor10 = (referencia > valor10);

		// Menor
		menor1 = (referencia < valor1);
		menor2 = (referencia < valor2);
		menor3 = (referencia < valor3);
		menor4 = (referencia < valor4);
		menor5 = (referencia < valor5);
		menor6 = (referencia < valor6);
		menor7 = (referencia < valor7);
		menor8 = (referencia < valor8);
		menor9 = (referencia < valor9);
		menor10 = (referencia < valor10);

		// Igual
		igual1 = (referencia == valor1);
		igual2 = (referencia == valor2);
		igual3 = (referencia == valor3);
		igual4 = (referencia == valor4);
		igual5 = (referencia == valor5);
		igual6 = (referencia == valor6);
		igual7 = (referencia == valor7);
		igual8 = (referencia == valor8);
		igual9 = (referencia == valor9);
		igual10 = (referencia == valor10);

		// Impresiones de resultados por pantalla
		// Mayores
		System.out.println("La comporobacion del numero de referencia(" + referencia + ") mayor que valor1(" + valor1
				+ ") es: " + mayor1);
		System.out.println("La comporobacion del numero de referencia(" + referencia + ") mayor que valor2(" + valor2
				+ ") es: " + mayor2);
		System.out.println("La comporobacion del numero de referencia(" + referencia + ") mayor que valor3(" + valor3
				+ ") es: " + mayor3);
		System.out.println("La comporobacion del numero de referencia(" + referencia + ") mayor que valor4(" + valor4
				+ ") es: " + mayor4);
		System.out.println("La comporobacion del numero de referencia(" + referencia + ") mayor que valor5(" + valor5
				+ ") es: " + mayor5);
		System.out.println("La comporobacion del numero de referencia(" + referencia + ") mayor que valor6(" + valor6
				+ ") es: " + mayor6);
		System.out.println("La comporobacion del numero de referencia(" + referencia + ") mayor que valor7(" + valor7
				+ ") es: " + mayor7);
		System.out.println("La comporobacion del numero de referencia(" + referencia + ") mayor que valor8(" + valor8
				+ ") es: " + mayor8);
		System.out.println("La comporobacion del numero de referencia(" + referencia + ") mayor que valor9(" + valor9
				+ ") es: " + mayor9);
		System.out.println("La comporobacion del numero de referencia(" + referencia + ") mayor que valor10(" + valor10
				+ ") es: " + mayor10);

		// Menores
		System.out.println("La comporobacion del numero de referencia(" + referencia + ") menor que valor1(" + valor1
				+ ") es: " + menor1);
		System.out.println("La comporobacion del numero de referencia(" + referencia + ") menor que valor2(" + valor2
				+ ") es: " + menor2);
		System.out.println("La comporobacion del numero de referencia(" + referencia + ") menor que valor3(" + valor3
				+ ") es: " + menor3);
		System.out.println("La comporobacion del numero de referencia(" + referencia + ") menor que valor4(" + valor4
				+ ") es: " + menor4);
		System.out.println("La comporobacion del numero de referencia(" + referencia + ") menor que valor5(" + valor5
				+ ") es: " + menor5);
		System.out.println("La comporobacion del numero de referencia(" + referencia + ") menor que valor6(" + valor6
				+ ") es: " + menor6);
		System.out.println("La comporobacion del numero de referencia(" + referencia + ") menor que valor7(" + valor7
				+ ") es: " + menor7);
		System.out.println("La comporobacion del numero de referencia(" + referencia + ") menor que valor8(" + valor8
				+ ") es: " + menor8);
		System.out.println("La comporobacion del numero de referencia(" + referencia + ") menor que valor9(" + valor9
				+ ") es: " + menor9);
		System.out.println("La comporobacion del numero de referencia(" + referencia + ") menor que valor10(" + valor10
				+ ") es: " + menor10);

		// Iguales
		System.out.println("La comporobacion del numero de referencia(" + referencia + ") igual que valor1(" + valor1
				+ ") es: " + igual1);
		System.out.println("La comporobacion del numero de referencia(" + referencia + ") igual que valor2(" + valor2
				+ ") es: " + igual2);
		System.out.println("La comporobacion del numero de referencia(" + referencia + ") igual que valor3(" + valor3
				+ ") es: " + igual3);
		System.out.println("La comporobacion del numero de referencia(" + referencia + ") igual que valor4(" + valor4
				+ ") es: " + igual4);
		System.out.println("La comporobacion del numero de referencia(" + referencia + ") igual que valor5(" + valor5
				+ ") es: " + igual5);
		System.out.println("La comporobacion del numero de referencia(" + referencia + ") igual que valor6(" + valor6
				+ ") es: " + igual6);
		System.out.println("La comporobacion del numero de referencia(" + referencia + ") igual que valor7(" + valor7
				+ ") es: " + igual7);
		System.out.println("La comporobacion del numero de referencia(" + referencia + ") igual que valor8(" + valor8
				+ ") es: " + igual8);
		System.out.println("La comporobacion del numero de referencia(" + referencia + ") igual que valor9(" + valor9
				+ ") es: " + igual9);
		System.out.println("La comporobacion del numero de referencia(" + referencia + ") igual que valor10(" + valor10
				+ ") es: " + igual10);

		teclado.close();
	}

}
