package Repeticao;

import java.util.Scanner;

public class ExercicioDoWhile04 {
//Faça um prg onde o usuario escolha a tabua de inicio e faça ate a tabuada do 9, em seguida
	//o prg devera perguntar se o usuario deseja repetir o processo.
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int usuario,i, j,rep ;
		
		do
		{
		System.out.println("Qual tabuada deseja começar?");
		usuario=ler.nextInt();
		for(i=usuario;i<=9;i++)
			{
			System.out.println("Tabuada do "+usuario);
			for(j=1;j<=10;j++)
				System.out.println(i+" X "+ j +" = "+i*j);
			}
		
		System.out.println("Para repetir digite um numero, para encerrar digite 1");
		rep=ler.nextInt();
		
		}while(rep!=1);
		System.out.println("FIM DO PROGRAMA");
		
	}
}
	