package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
/*System.out.println("Digite seu nome completo: ");
String nomeCompleto = scan.nextLine();
System.out.println("Seu nome completo é: " + nomeCompleto);

System.out.println("Digite seu primeiro nome: ");
String primeiroNome = scan.next();
System.out.println("Seu primeiro nome é: " + primeiroNome); */

/*System.out.println("Digite a sua idade: ");
int idade = scan.nextInt();
System.out.println("Sua idade é: " + idade);
System.out.println("Digite a sua altura: ");
double altura = scan.nextDouble();
System.out.println("Sua Altura é: " + altura);*/

System.out.println("Digite seu primeiro nome, idade, Quantidade de filhos, altura e se tem bichinho de estimação: ");
String primeiroNome = scan.next();
int idade = scan.nextInt();
byte qtdfilhos = scan.nextByte();
float altura = scan.nextFloat();
boolean tempet = scan.nextBoolean();
System.out.println("Voce digitou os seguintes valores: ");
System.out.println("Seu primeiro nome é: " + primeiroNome);
System.out.println("Sua idade é: " + idade);
System.out.println("Voce tem " + qtdfilhos + " filhos");
System.out.println("Sua altura é: " + altura);
System.out.println("Tem bichinho de estimação?: " + tempet);


	}

}
