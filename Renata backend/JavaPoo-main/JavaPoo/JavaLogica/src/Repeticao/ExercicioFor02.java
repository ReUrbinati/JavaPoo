package Repeticao;

import java.util.Scanner;

public class ExercicioFor02 {
//Faca um programa o usuario entre com um numero e o programa mostre a tabuada desse numero
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x,n;
		System.out.println("Digite um numero: ");
		x=ler.nextInt();
		for (n=1;n<=10;n++)
			System.out.println(+x+" X" +n+ "="+ x*n);
		

	}

}
