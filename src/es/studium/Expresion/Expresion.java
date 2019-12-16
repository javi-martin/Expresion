package es.studium.Expresion;

import java.util.Scanner;

public class Expresion {

	public static void main(String[] args) 
	{
		int a, b, c;
		
		// creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
				
		System.out.println("Dame un n�mero entero:");
		a = teclado.nextInt();
				
		System.out.println("Dame otro n�mero entero:");
		b = teclado.nextInt();
		
		System.out.println("Dame otro n�mero entero:");
		c = teclado.nextInt();
		
		System.out.println("El resultado es: " + funExpresion(a,b,c));
		
		teclado.close();

	}
	
	public static double funExpresion(int a, int b, int c) 
	{
		return ((double)((b*b)-(4*a*c))/(double)(2*a)); 
	}

}
