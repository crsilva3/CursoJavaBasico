package com.carlos.cursojava.exercicios.aula13;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		/* 13. Faça um Programa que pergunte quanto você ganha por hora e o
		número de horas trabalhadas no mês. Calcule e mostre o total do seu
		salário no referido mês, sabendo-se que são descontados 11% para o
		Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
		programa que nos dê:
		. salário bruto.
		a. quanto pagou ao INSS.
		b. quanto pagou ao sindicato.
		c. o salário líquido.
		d. calcule os descontos e o salário líquido, conforme a tabela
		abaixo:
		+ Salário Bruto : R$ - IR (11%) : R$ - INSS
		(8%) : R$ - Sindicato ( 5%) : R$ = Salário
		Liquido : R$	
		Obs.: Salário Bruto - Descontos = Salário Líquido. */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o valor de sua hora trabalhada.");
		double valorHora = scan.nextDouble();
		System.out.println("Digite a quantidade de horas trabalhadas no mês.");
		double quantidadeHoras = scan.nextDouble();
		double salarioBruto = (valorHora * quantidadeHoras);
		System.out.println("Salario Bruto: R$" + salarioBruto);
		System.out.println("IR(11%): R$" + (salarioBruto * 11 / 100));
		System.out.println("INSS(8%): R$" + (salarioBruto * 8 / 100));
		System.out.println("SINDICATO(5%): R$" + (salarioBruto * 5 / 100));
		System.out.println("Salario liquido: R$" + (salarioBruto - (salarioBruto * 11 / 100) - (salarioBruto * 8 / 100) - (salarioBruto * 5 / 100)));
		

	}

}
