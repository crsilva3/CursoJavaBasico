package com.carlos.cursojava.exercicios.aula13;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		//5. Faça um Programa que converta metros para centímetros.
	
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Vamos converter metros para centimentros.");
		System.out.println("Digite a quantidade de metros.");
		double metros = scan.nextDouble();
		System.out.println(metros + " metros equivale a " + (metros * 100) + " centimetros");
		

	}

}
