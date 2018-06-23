package com.carlos.cursojava.exercicios.aula13;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		/* 9. Faça um Programa que peça a temperatura em graus Farenheit,
		transforme e mostre a temperatura em graus Celsius.
		o C = (5 * (F-32) / 9). */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Conversão de graus Celsius para Farenheit.");
		System.out.println("Digite Temperatura em Farenheit. ");
		double Farenheit = scan.nextDouble();
		
		System.out.println("A Temperatura em graus Celsius é " + 
		(5 * (Farenheit - 32) / 9) + " graus."		);
		

	}

}
