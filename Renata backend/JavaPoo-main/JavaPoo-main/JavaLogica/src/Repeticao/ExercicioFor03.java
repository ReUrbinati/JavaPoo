package Repeticao;

import java.util.Scanner;

public class ExercicioFor03 {
//um programa onde o usuario entre com um numero e o programa mostre a tabuada invertida
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x,n;
		System.out.println("Digite um numero: ");
		x=ler.nextInt();
		for (n=10;n>=1;n--)
			System.out.println(+x+" X" +n+ "="+ x*n);
		


	}

}
