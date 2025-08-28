package Repeticao;

import java.util.Scanner;

public class ExemploDoWhile01 {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int nr;
		do {
			
		System.out.println("Digite um numero (0 para sair)");
		nr=ler.nextInt();
		if (nr%2==0)
			System.out.println("Este numero é par");
		else
			System.out.println("Este numero é impar");
		}while (nr!=0);

	}

}
