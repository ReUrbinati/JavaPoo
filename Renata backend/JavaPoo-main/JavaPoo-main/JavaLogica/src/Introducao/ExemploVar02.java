package Introducao;

import java.util.Scanner;

public class ExemploVar02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome="Renata";
		int idade;
		double altura;
		System.out.print("Digite sua idade: ");
		idade=ler.nextInt();
		System.out.println("Digite sua altura: ");
		altura=ler.nextDouble();
		System.out.println("Seu nome é: "+nome+ " voce tem " +altura+" de altura e "+idade+ "anos de idade");
		

	}

}
