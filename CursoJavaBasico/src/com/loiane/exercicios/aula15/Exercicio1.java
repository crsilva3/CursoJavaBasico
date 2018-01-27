package com.loiane.exercicios.aula15;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Faça um Programa que peça dois números e imprima o maior deles.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Escreva dois numeros e o maior deles sera mostrado.");
		float primeiroNum = scan.nextFloat();
		float segundoNum = scan.nextFloat();
		if (primeiroNum > segundoNum) { System.out.println("O numero " + primeiroNum + "é o maior");}
		else { System.out.println("O numero " + segundoNum + "é o maior");
		
		
		}
		

	}

}
