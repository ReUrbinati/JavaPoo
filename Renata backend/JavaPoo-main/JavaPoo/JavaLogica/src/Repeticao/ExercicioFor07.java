package Repeticao;

import java.util.Scanner;

public class ExercicioFor07 {
//um prg em q o usuario entre com o numero de elementos que deseja que o prg mostre a sequencia Fibonacci.
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
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
	

	}

}
