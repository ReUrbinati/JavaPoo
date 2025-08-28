package Repeticao;

import java.util.Scanner;

public class ExercicioWhile01 {
//Faça um programa onde o usuario entre com dois nemeros e possa escolher qual das operações
	//matematicas ira ser realizada.Apos a realização do calculo o prg devera perguntar
	//se o usuario deseja realizar outro calculo, ate quando o usuario quiser
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, n2, x,op;
		System.out.println("Digite -1 para fazer o calculo");
		x=ler.nextInt();
		while(x==-1) {
			System.out.println("Digite o primeiro numero");
			n1=ler.nextInt();
			System.out.println("Digite o segundo numero");
			n2=ler.nextInt();
			System.out.println("Escolha qual operação \n1-soma,\n2-subtração,\n3-divisao,\n4-multiplicação);");
			op=ler.nextInt();
			switch (op)
			{ case 1:
				System.out.println("A soma dos dois numeros é ="+(n1+n2)  );
				break;
			case 2:
				System.out.println("A subtração dos dois numeros é = "+( n1-n2));
				break;
			case 3:
				if (n2==0)
					System.out.println("Divisao invalida!!!");
				else
				System.out.println("A divisão entre os dois numeros é = "+n1/n2);
				break;
			case 4:
				System.out.println("A multiplicação dos dois numeros é = "+n1*n2);
				break;
			default:
				System.out.println("Opção invalida");
												
			}
			System.out.println("Digite -1 para fazer outro calculo");
			x=ler.nextInt();
					
		}
		System.out.println("FIM DO PROGRAMA");

	}

}
