package Repeticao;

import java.util.Scanner;

public class ExercicioFor05 {
//faca um prog usuario entre com um numero, com a razao e com a finalizacao e o prg mostre a progressao aritmetica
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("Digite o valor de inicio: ");
		n1=ler.nextInt();
		System.out.println("Digite a razão: ");
		n2=ler.nextInt();
		System.out.println("Digite o valor de finalização: ");
		n3=ler.nextInt();
		for (int x=n1;x<=n3;x+=n2)
			
				
			System.out.println(x);
		
		
	}

}
