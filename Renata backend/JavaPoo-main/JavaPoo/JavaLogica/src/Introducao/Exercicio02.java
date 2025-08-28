package Introducao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		int ano, meses, dias;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite sua idade em anos: ");
		ano=ler.nextInt();
		System.out.println("Digite a quantidade de meses da sua idade: ");
		meses=ler.nextInt();
		System.out.println("Digite quantos dias em meses incompletos: ");
		dias=ler.nextInt();
		
		int idadeDias= (ano*365)+ (meses*30) +dias;
				System.out.println("Sua idade em dias é: "+idadeDias);

	}

}
