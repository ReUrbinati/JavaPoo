package Repeticao;

public class ExercicioFORaninhado03 {
// faca um prg que mostre a tabuada do 9 ate a tabuada do 2 invertida
	public static void main(String[] args) {
		int i, j;
		for(j=9;j>=2;j--)
		{ 
			System.out.println("Tabuada do "+j);
			for(i=10;i>=1;i--)
				System.out.println(j+ " X " +i+ " = "+j*i);
		}

	}

}
