package com.carlos.cursojava.exercicios.aula13;

import java.util.Scanner;

public class Excercicio03 {

	public static void main(String[] args) {
		//3. Faça um Programa que peça dois números e imprima a soma.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um numero.");
		double primeiroNumero = scan.nextDouble();
		
		System.out.println("Digite outro numero.");
		double segundoNumero = scan.nextDouble();
		
		System.out.println("A soma dos dois numeros é: " + (primeiroNumero + segundoNumero));

	}

}
