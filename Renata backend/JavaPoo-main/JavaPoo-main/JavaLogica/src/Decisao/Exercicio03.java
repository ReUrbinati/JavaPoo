package Decisao;

import java.util.Scanner;

public class Exercicio03 {

	//escreva um programa que mostre se o numero digitado é par ou impar
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x;
		System.out.println("Digite um número: ");
		x=ler.nextInt();
		if (x%2==0)
			System.out.println("Você digitou um numero par!");
		else
			System.out.println("Voce digitou um numero impar!");
		

	}

}
