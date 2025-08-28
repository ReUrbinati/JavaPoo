package Introducao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		double nota1, nota2, nota3, nota4;
		Scanner ler = new Scanner(System.in);
		System.out.println ("Digite a primeira nota: ");
		nota1=ler.nextDouble();
		System.out.println ("Digite a segunda nota: ");
		nota2=ler.nextDouble();
		System.out.println ("Digite a terceira nota: ");
		nota3=ler.nextDouble();
		System.out.println ("Digite a quarta nota: ");
		nota4=ler.nextDouble();
		
	
		double media= (nota1+nota2+nota3+nota4)/4;
		System.out.println("Sua média é: " +media);

	}

}
