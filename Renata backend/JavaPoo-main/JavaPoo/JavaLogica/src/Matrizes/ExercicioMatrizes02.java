package Matrizes;
/*Faça um prg com tres matrizes de 3x4 elementos cada, onde o usuario alimente as duas 
 * primeiras matrizes com numeros inteiros e a terceira matriz seja alimentada com a soma
 * dos elementos das matrizes anteriores. No final imprima os elementos das tres matrizes*/

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioMatrizes02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int mat1 [][]= new int [3][4];
		int mat2 [][]= new int [3][4];
		int mat3 [][]= new int [3][4];
		int l,c;
		for (l=0;l<3;l++){
			for (c=0;c<4;c++){
				
				System.out.print("Digite um numero para linha "+l+" e coluna "+c);
				mat1[l][c]=ler.nextInt();}
			}
		for (l=0;l<3;l++){
			for(c=0;c<4;c++) {
				
				System.out.print("Digite um numero para linha "+l+" e coluna "+c);
			mat2[l][c]=ler.nextInt();}
		}
		
		for(l=0;l<3;l++){
			for(c=0;c<4;c++) {
			mat3 [l][c]= mat1[l][c]+mat2[l][c];				
			}
		}
		
		System.out.println("Matriz 1: "+ Arrays.deepToString(mat1));
		System.out.println("Matriz 2: "+ Arrays.deepToString(mat2));
		System.out.println("Matriz 3: "+ Arrays.deepToString(mat3));
		
		

	}

}
