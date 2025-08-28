package Repeticao;

public class ExercicioFORaninhado01 {
//Faça um prg que mostre a tabuada do 9 ate a tabuada do 2
	public static void main(String[] args) {
		int i, j;
		for(j=9;j>=2;j--)
		{ 
			System.out.println("Tabuada do "+j);
			for(i=1;i<=10;i++)
				System.out.println(j+ " X " +i+ " = "+j*i);
		}

	}

}
