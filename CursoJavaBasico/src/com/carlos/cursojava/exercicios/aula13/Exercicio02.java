package com.carlos.cursojava.exercicios.aula13;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/* 2. Faça um Programa que peça um número e então mostre a
		mensagem O número informado foi [número]. */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um Numero.");
		double numero = scan.nextDouble();
		System.out.println("O numero digitado foi: " + numero);
	}

}
