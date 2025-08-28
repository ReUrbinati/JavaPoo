package Repeticao;

import java.util.Scanner;

public class ExercicioWhile02 {
//faça um prg onde o usuario entre com um nuemro e o prg mostre se é um numero par ou impar
	//em seguida o prg devera perguntar se o usario deseja repetir o processo.
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1,rep;
		System.out.println("Digite -1 para iniciar");
		rep=ler.nextInt();
		while(rep==-1)
		{
			System.out.println("Digite um numero: ");
			n1=ler.nextInt();
			if (n1%2 ==0)
				System.out.println("O numero digitado é par!");
			else
				System.out.println("O numero digitado é ímpar!");
			System.out.println("Se desejar repetir o processo, digite -1");
			rep=ler.nextInt();
		}
		System.out.println("FIM DO PROGRAMA");
		

	}

}
