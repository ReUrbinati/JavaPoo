package Decisao;

import java.util.Scanner;

public class Exercicio04 {

	//elabore um programa onde o usuario informe a algura de duas pessoas e o pragrama retorne quem é mais alto ou se sao da mesma altura
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double n1,n2;
		System.out.println("Digite sua altura: ");
		n1=ler.nextDouble();
		System.out.println("Digite a altura da segunda pessoa: ");
		n2=ler.nextDouble();
		if(n1>n2)
			System.out.println("Voce é mais alto que a segunda pessoa");
		else if( n1<n2)
			System.out.println("Voce é mais baixo que a segunda pessoa");
		else
			System.out.println("Voces tem a mesma altura");
	}

}
