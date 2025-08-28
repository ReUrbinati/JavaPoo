package Vetores;

import java.util.Arrays;
import java.util.Scanner;

//Faça um prg com tres vetores de 10 elementos cada, onde o primeiro vetor será alimentado 
//com os 10 primeiros elementos da sequencia de fibonacci. Para o segundo vetor o usuario
//ira informar o valor de inicio e a razao para gerar uma PA que ira alimenta-lo. O terceiro
//vetor sera alimentado com a pg, onde o usuario ira informar novamente o valores de inicio
//e a razao. No final imprima os elementos do tres vetores.
public class ExercicioVetoreso5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n,y;
		int fibonacci[]= new int[10];
		int PA[]= new int[10];
		int PG[]= new int[10];
			int proximo=0,anterior=0,atual=1,limite=0;		
			System.out.println(atual);
			for(int i=1;i<10;i++)
			{
				proximo=atual+anterior;
				System.out.println(proximo);
				anterior=atual;
				atual=proximo;
			}
		System.out.println("A sequencia fibonacci "+Arrays.toString(fibonacci));

		System.out.println("Digite o valor de inicio da PA: ");
		PA[0]=ler.nextInt();
		System.out.println("Digite o valor para a razão: ");
		n=ler.nextInt();
		for (int x=PA[0];x<=10;x+=n);
		
		System.out.println("Digite o valor de inicio da PG: ");
		PG[0]=ler.nextInt();
		System.out.println("Digite o valor para a razão: ");
		y=ler.nextInt();
		for (int x=PG[0];x<=10;x*=y);
		
		System.out.println("A progressao aritmetica é: "+Arrays.toString(PA)  );
		System.out.println("A progressao geometrica é: "+Arrays.toString(PG) );
		
		}
	}



