package Repeticao;

public class ExemploForAninhado {

	public static void main(String[] args) {
		int i, j;
		for(j=2; j<=9;j++)
		{
			System.out.println("Tabuada do "+j);
			for(i=1;i<=10;i++)
				System.out.println(j+" X "+i+ " = "+j*i);
		}
	}

}
