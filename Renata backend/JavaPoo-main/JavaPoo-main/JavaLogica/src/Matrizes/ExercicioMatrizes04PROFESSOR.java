package Matrizes;

import java.util.Scanner;

public class ExercicioMatrizes04PROFESSOR {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int proximo=0,anterior=0,atual=1, init, raz;
		int mat[][]=new int [3][10];
		
		System.out.println("Digite o valor de inicio: ");
		init=ler.nextInt();
		System.out.println("Digite o valor para razao: ");
		raz=ler.nextInt();
		mat[1][0]=init;
		mat[2][0]=init;
		
		for(int linha=0;linha<3;linha++)
		{
			for(int col=1;col<10;col++)
			{
				switch(linha)
				{
				case 0:
					
					
					
					break;
				case 1:
					mat[linha][col]=mat[linha]
				}
			}
		}

	}

}
