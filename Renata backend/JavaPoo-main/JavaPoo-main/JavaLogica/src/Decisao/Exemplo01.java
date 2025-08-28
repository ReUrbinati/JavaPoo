package Decisao;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x;
		System.out.println("Digite um numero");
		x=ler.nextInt();
		if(x>5)
			System.out.println("Voce digitou um numero maior que 5");
		else if (x==5)
			System.out.println("Voce digitou 5");
		else
			System.out.println("Voce digitou um numero menor que 5");
		System.out.println("Fim do programa");
	}

}
