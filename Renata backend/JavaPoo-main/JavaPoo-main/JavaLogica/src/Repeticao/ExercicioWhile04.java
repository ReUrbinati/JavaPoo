package Repeticao;

import java.util.Scanner;

public class ExercicioWhile04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int usuario,i, j,rep ;
		System.out.println("Digite -1 para iniciar");
		rep=ler.nextInt();
		while (rep==-1)
		{
		System.out.println("Qual tabuada deseja começar?");
		usuario=ler.nextInt();
		for(i=usuario;i<=9;i++)
			{
			System.out.println("Tabuada do "+usuario);
			for(j=1;j<=10;j++)
				System.out.println(i+" X "+ j +" = "+i*j);
						}
		System.out.println("Deseja repetir o precesso? digite -1");
		rep=ler.nextInt();
		
		}

	}

}
