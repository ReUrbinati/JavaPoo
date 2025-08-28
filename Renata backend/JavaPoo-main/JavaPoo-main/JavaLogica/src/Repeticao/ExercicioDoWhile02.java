package Repeticao;

import java.util.Scanner;

public class ExercicioDoWhile02 {
// faça um prg onde o usuario entre com um numero e o prg mostre se é um numero par ou impar
	//em seguida o prg devera perguntar se o usuario deseja repetir
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, n2;
		do {
		System.out.println("Digite um número: ");
		n1=ler.nextInt();
		
		if (n1%2==0)
			System.out.println("O numero é par");
		else
			System.out.println("O numero é impar");
		System.out.println("Para continuar, digite outro numero (para encerrar 0)");
		n2=ler.nextInt();
		
		}while(n2!=0);
		System.out.println("FIM DO PROGRAMA");

	}

}
