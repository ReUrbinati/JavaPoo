package Matrizes;
/*Desenvolve um prg que leia matriz 3x4 de numero inteiros */ 
public class ExercicioMatrizes01 {

	public static void main(String[] args) {
		int x=3;
		int mat [][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		for(int linha=0;linha<3;linha++)
		{
			for(int col=0;col<4;col++)
				mat[linha][col]*=x;
		}

		for (int linha=0;linha<3;linha++)
		{
			for(int col=0;col<4;col++)
				System.out.print(mat[linha][col]+"\t");
			System.out.println();/*quebra a linha*/
		}
	}

}
