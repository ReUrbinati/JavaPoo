package Repeticao;

public class ExercicioFORaninhado02 {
//faca um prg q mostre a tabuada do 2 ate a do 9 invertida
	public static void main(String[] args) {
		int i, j;
		for(j=2;j<=9;j++)
		{ 
			System.out.println("Tabuada do "+j);
			for(i=10;i>=1;i--)
				System.out.println(j+ " X " +i+ " = "+j*i);
		}


	}

}
