package com.carlos.cursojava.exercicios.aula13;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		/* 11. Faça um Programa que peça 2 números inteiros e um número real.
		Calcule e mostre:
		a. o produto do dobro do primeiro com metade do segundo .
		b. a soma do triplo do primeiro com o terceiro.
		c. o terceiro elevado ao cubo. */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um numero inteiro. ");
		int primeiroNumero = scan.nextInt();
		System.out.println("Digite outro numero inteiro. ");
		int segundoNumero = scan.nextInt();
		System.out.println("Digite um numero real. ");
		double numeroReal = scan.nextDouble();
		
		System.out.println("O produto do dobro do primeiro com metade do segundo é: " +
		((primeiroNumero * 2) * (segundoNumero / 2)));
		
		System.out.println("A soma do triplo do primeiro com o terceiro é: " + 
		((primeiroNumero * 3) + numeroReal));
		
		System.out.println("O terceiro elevado ao cubo é: " + (numeroReal * numeroReal * numeroReal));
		
		
		

	}

}
