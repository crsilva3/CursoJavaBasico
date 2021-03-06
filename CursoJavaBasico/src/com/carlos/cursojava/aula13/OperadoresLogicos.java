package com.carlos.cursojava.aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int valor1 = 1;
		int valor2 = 2;
		
		boolean resultado1 = (valor1 == 1) && (valor2 == 2);
		System.out.println("valor1 é 1 AND valor2 é 2 - resultado: " + resultado1);
		
		boolean resultado2 = (valor1 == 1) || (valor2 == 2);
		System.out.println("valor1 é 1 OR valor2 é 2 - resultado: " + resultado2);
		
		boolean verdadeiro = true;
		boolean falso = false;
		
		System.out.println(verdadeiro && falso); // E (VERDADEIRO QUANDO AMBOS FOREM VERDADEIRO)
		System.out.println(verdadeiro || falso); // OU ( VERDADEIRO QUANDO UMA FOR VERDADEIRA)
		System.out.println(verdadeiro ^ falso);  // XOR (VERDADEIRO QUANDO AMBOS FOREM DIFERENTES)
		System.out.println(!verdadeiro && falso); // ! NEGAÇÃO ( ! NEGA O RESULTADO ) 
		

	}

}
