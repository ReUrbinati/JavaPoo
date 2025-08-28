package Excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploTry02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, n2, resp;
		try {
			System.out.println("Digite o primeiro numero");
			n1=ler.nextInt();
			System.out.println("Digite o segundo numero");
			n2=ler.nextInt();
			resp=n1/n2;
			System.out.println("A divisao é: "+resp);
		} catch (InputMismatchException erro) {
			System.out.println("Voce deve digitar um numero inteiro" + erro);
			}
		catch (ArithmeticException erro) {
			System.out.println("Erro: Divisao por zerro" +erro);
		}
		System.out.println("F I M D O P R O G R A M A !!!");

	}

}
