package Repeticao;

import java.util.Scanner;

public class ExercicioFor04 {
// faca um prog. em q o usuario entre com um numero e o prog mostre o fatorial do mesmo. 
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num, fat=1;
		
		System.out.println("Digite um numero para o fatorial:");
		num=ler.nextInt();
		for(int x=num;x>1;x--)
			fat*=x;
		
		System.out.println("O fatorial de " +num+ " é " +fat);
		
		
			
		
		

	}

}
