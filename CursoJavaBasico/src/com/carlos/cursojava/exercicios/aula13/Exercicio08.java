package com.carlos.cursojava.exercicios.aula13;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		/* 8. Faça um Programa que pergunte quanto você ganha por hora e o
		número de horas trabalhadas no mês. Calcule e mostre o total do seu
		salário no referido mês. */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Vamos calcular seu salario deste mês ");
		System.out.println("Qual o valor em reais de suas horas trabalhadas?");
		double valorHora = scan.nextDouble();
		
		System.out.println("Quantas horas voce vai trabalhar neste mês?");
		double horas = scan.nextDouble();
		
		System.out.println("Este mês seu salario sera de " + (valorHora * horas) + " reais.");
		

	}

}
