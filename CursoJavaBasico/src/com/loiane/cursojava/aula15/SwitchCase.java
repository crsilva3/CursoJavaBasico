package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Entre com um numero de 1-7");
		int DiaSemana = scan.nextInt();
       /* if (DiaSemana == 1){System.out.println("Domingo");}
		else if (DiaSemana == 2) {System.out.println("Segunda");}
		else if (DiaSemana == 3) {System.out.println("Terça");}
		else if (DiaSemana ==4) {System.out.println("Quarta");}
		else if (DiaSemana ==5) {System.out.println("Quinta");}
		else if (DiaSemana ==6) {System.out.println("Sexta");}
		else if (DiaSemana ==7) {System.out.println("Sabado");}
		else {System.out.println("Não é um dia valido");} */
        
        switch (DiaSemana) {
        case 1 : System.out.println("Domingo"); break;
        case 2 : System.out.println("Segunda"); break;
        case 3 : System.out.println("Terça"); break;
        case 4 : System.out.println("Quarta"); break;
        case 5 : System.out.println("Quinta"); break;
        case 6 : System.out.println("Sexta"); break;
        case 7 : System.out.println("Sabado"); break;
        default : System.out.println("Não é um dia valido");
        
        }
		
		
		}
		
		
		
		
	}

