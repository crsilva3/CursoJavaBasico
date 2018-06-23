package com.carlos.cursojava.exercicios.aula13;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		/* 10. Faça um Programa que peça a temperatura em graus Celsius,
		transforme e mostre em graus Farenheit. */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Vamos tranformar temperatura em Celsius para Fahrenheit. ");
		System.out.println("Digite a temperatura em Celsius");
		
		double celsius = scan.nextDouble();
		
		System.out.println("A temperatura em Fahrenheit sera " + ((celsius * 1.8) + 32 )+ " graus.");
		
		
		
		

	}

}
