package com.carlos.cursojava.exercicios.aula13;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		//6. Faça um Programa que peça o raio de um círculo, calcule e mostre
		//sua área
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Vamos Calcular a area do Circulo a partir do raio");
		
		System.out.println("Digite a unidade de medida Ex: cm mm m");
		String unidadeMedida = scan.next();
		
		System.out.println("Digite o raio");
		double raio = scan.nextDouble();
		double quadradoRaio = (raio * raio);
		double area = (quadradoRaio * 3.14);
		
		System.out.println("A area do circulo é " + area + " " + unidadeMedida + " quadrados");

	}

}
