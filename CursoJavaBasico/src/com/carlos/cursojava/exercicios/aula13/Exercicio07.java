package com.carlos.cursojava.exercicios.aula13;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		/* 7. Faça um Programa que calcule a área de um quadrado, em seguida
		mostre o dobro desta área para o usuário. */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Vamos Calcular a area do quadrado.");
		
		System.out.println("Digite a unidade de medida Ex: cm mm m");
		String unidadeMedida = scan.next();
		
		System.out.println("Digite a medida de um dos lados do quadrado");
		double lado = scan.nextDouble();
		double area = (lado * lado);
		
		System.out.println("A area do quadrado é " + area + " " + unidadeMedida + " quadrados");

	}

}
