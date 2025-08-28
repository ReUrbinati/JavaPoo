package Decisao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio05 {
//faça um programa onde o usuario entre com seu peso, e altura e o programa mostre o imc e uma das seguintes frases:
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double peso, altura, imc;
		System.out.println("Digite seu peso");
		peso=ler.nextDouble();
		System.out.println("Digite sua altura");
		altura=ler.nextDouble();
		imc=peso/(altura*altura);
		
		DecimalFormat formato = new DecimalFormat("#.##");
		String imcformatado = formato.format(imc);
		
		if (imc<17)
			System.out.println("Seu IMC é:"+imcformatado+ " muito abaixo do peso");
		else if (imc>17 && imc<18.5)
			System.out.println("Seu IMC é:"+imcformatado+ " Abaixo do peso");
		else if (imc>18.5 && imc<25)
			System.out.println("Seu IMC é:"+imcformatado+ " Parabens! Peso ideal!");
		else if (imc>25 && imc<30)
			System.out.println("Seu IMC é:"+imcformatado+ " Acima do peso");
		else if (imc>30 && imc<35)
			System.out.println("Seu IMC é:"+imcformatado+ " Obesidade 1");
		else if (imc>35 && imc<40)
			System.out.println("Seu IMC é:"+imcformatado+ " Obesidade 2 (severa)");
		else
			System.out.println("Seu IMC é:"+imcformatado+ " Obesidade 3 (mórbida)");
		
	}

}
