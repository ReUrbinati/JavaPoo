package Matrizes;

import java.util.Scanner;

public class ExemploMatriz01 {

	public static void main(String[] args) {
		
	int mat[][]=new int[3][3];
	int soma=0,l=0,c=0;
	Scanner ler= new Scanner(System.in);
	for(l=0;l<3;l++)
	{
		for(c=0;c<3;c++)
		{ 
			System.out.print("Digite o valor para a linha "+l+" e coluna "+c);
			mat[l][c]=ler.nextInt();
			soma+=mat[l][c];
		}
	}
	for(l=0;l<3;l++)
	{
		for(c=0;c<3;c++)
		{
			System.out.print(mat[l][c]+"\t");
		}
		System.out.println();
	}
		System.out.print("A soma dos valores da matriz é:"+soma);

	}

}


	
