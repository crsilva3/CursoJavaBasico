package com.carlos.cursojava.exercicios.aula13;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		//4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Por favor entre com suas notas bimestrais uma apos a"
				+ " outra seguido de espaço ");
		int primeiroBimestre = scan.nextInt();
		int segundoBimestre = scan.nextInt();
		int terceiroBimestre = scan.nextInt();
		int quartoBimestre = scan.nextInt();
		
		System.out.println("Sua media é: " + ((primeiroBimestre+ segundoBimestre+ terceiroBimestre + quartoBimestre)/4));
	}

}
