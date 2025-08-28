package Repeticao;

import java.util.Scanner;

public class ExercicioDoWhile03 {
//faça um prg em q o usuario entre com um numero de elementos que deseja que o prg mostre
	//a sequencia Fibonacci. em seguida o prg devera perguntar se o usuario deseja repetir
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int resp;
		do
		{ 
			int proximo=0,anterior=0,atual=1,limite=0;		
		System.out.println("Digite o numero de elementos para sua sequencia Fibonacci ");
		limite=ler.nextInt();
		System.out.println(atual);
		for(int i=1;i<limite;i++)
			{
			proximo=atual+anterior;
			System.out.println(proximo);
			anterior=atual;
			atual=proximo;
			
			
			}
		System.out.println("Para repetir digite um numero, para encerrar digite 0");
		resp=ler.nextInt();
		}while(resp!=0);
		System.out.println("FIM DO PROGRAMA");

	}

}
