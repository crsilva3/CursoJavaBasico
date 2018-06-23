package com.carlos.cursojava.exercicios.aula13;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		/* 14. Faça um programa que peça o tamanho de um arquivo para download
		(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
		informe o tempo aproximado de download do arquivo usando este link
		(em minutos). */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Calculo de tempo de download.");
		System.out.println("Digite o tamanho do arquivo em Mb: ");
		double tamanho = scan.nextDouble();
		System.out.println("Digite a velocidade da conexão em Mbps: ");
		double velocidade = (scan.nextDouble() * 60);
		System.out.println("O tempo de download sera de " + (tamanho / velocidade) + " Min");
		
		

	}

}
