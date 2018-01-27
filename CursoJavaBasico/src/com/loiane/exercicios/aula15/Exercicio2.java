package com.loiane.exercicios.aula15;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Faça um Programa que peça um valor e mostre na tela se o valor é
		//positivo ou negativo.
		
		Scanner scan = new Scanner ( System.in);
		System.out.println("Entre com um numero, sera mostrado se é positivo ou negativo.");
		int numero = scan.nextInt();
		if (numero > 0) {System.out.println("O numero digitado é positivo");
		
		}
		else {System.out.println("O numero digitado é negativo");}

	}

}
