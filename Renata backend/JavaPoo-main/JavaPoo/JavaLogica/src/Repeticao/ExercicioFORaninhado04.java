package Repeticao;

import java.util.Scanner;

public class ExercicioFORaninhado04 {
//faca um prg onde o usuario escolha a tabuada de inicio e faca ate a tabuada do 9
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int usuario,i, j;
		System.out.println("Qual tabuada deseja começar?");
		usuario=ler.nextInt();
		for(i=usuario;i<=9;i++)
		{
			System.out.println("Tabuada do "+usuario);
			for(j=1;j<=10;j++)
				System.out.println(i+" X "+ j +" = "+i*j);
		}
		

	}

}
