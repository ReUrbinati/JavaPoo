package Repeticao;

import java.util.Scanner;

public class ExercicioWhile03 {
// Faça um prg em q o usuario entre com um numero de elementos q deseja que o prog mostre
	//a sequencia Fibonacci ...em seguida perguntar se quer repetir o processo
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int rep;
		System.out.println("Digite 1 para iniciar");
		rep=ler.nextInt();
		while(rep==1) 
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
		System.out.println("Deseja fazer outra sequencia? Digite 1");
		rep=ler.nextInt();
	
		}
	}

}
