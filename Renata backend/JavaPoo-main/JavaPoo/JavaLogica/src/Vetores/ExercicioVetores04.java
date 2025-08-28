package Vetores;

import java.util.Arrays;
import java.util.Scanner;

//Faça um prg com 3 vetores de 10 elementos cada onde o usuario alimente os 2 primeiros
//vetores com numeros inteiros e o 3ª vetor seja alimentado com a soma dos elesmentos
//dos vetores anteriores. No final final imprima os elementos dos 3 vetores.
public class ExercicioVetores04 {

	public static void main(String[] args) {		
		Scanner ler = new Scanner(System.in);
		int vetor1[]= new int [10];
		int vetor2[]= new int  [10];
		int vetor3[]= new int [10];
		System.out.println("Digite uma sequencia de 10 numeros inteiros: ");
			for 
			(int i=0;i<10;i++) {
			System.out.println("Vetor 1 Posição: "+ i + "=");
			vetor1[i]=ler.nextInt();
				}
			
			System.out.println("Digite outra sequencia de 10 numeros inteiros: ");
			for
			(int x=0;x<10;x++) {
				System.out.println("Vetor 2 Posição" +x+ "=");
				vetor2[x]=ler.nextInt();
			}
			
			for
			(int y=0;y<10;y++) {
				vetor3[y]=vetor1[y]+vetor2[y];
			}
			
			System.out.println("Sequencia 1 ="+ Arrays.toString(vetor1));
			System.out.println("Sequencia 2 ="+ Arrays.toString(vetor2));
			System.out.println("Soma das sequencias = "+ Arrays.toString(vetor3));
	}
				
			
	}
	
