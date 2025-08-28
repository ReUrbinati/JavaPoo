package Decisao;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.println("Digite sua idade: ");
		idade= ler.nextInt();
		if(idade<18)
			System.out.println("Proibida a Entrada");
		else
			System.out.println("Bem vindo");

	}

}
