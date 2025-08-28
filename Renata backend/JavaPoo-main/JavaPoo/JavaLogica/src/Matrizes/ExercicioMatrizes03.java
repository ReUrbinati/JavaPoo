package Matrizes;

import java.util.Arrays;
import java.util.Scanner;

/*Faça um prg com uma matriz de 3x10 elementos, onde a primeira linha será alimentada
 * com os 10 primeiros elementos da sequencia fibonacci. Para a segunda linha o usuario
 * irá informar o valor de inicio e a razao para gera uma PA q irá alimenta-la. A terceira
 * linha será alimentada com a PG, onde o usuario ria informar novamente o valor de inicio 
 * e a razao. No final imprima a matriz.
 */
public class ExercicioMatrizes03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int mat[][]= new int [3][10];
		int proximo=0,anterior=0,atual=1,init, raz;
		
		/*System.out.println(atual);*/
		for(int i=1;i<10;i++){
			mat[0][i]=proximo=atual+anterior;
			anterior=atual;
			atual=proximo;}
		
			
		System.out.println("Digite o valor de inicio da PA: ");
		init=ler.nextInt();
		System.out.println("Digite o valor para a razão: ");
		raz=ler.nextInt();
		mat[1][0]=init;
		for (int x=1;x<10;x++) {
			mat[1][x]=mat[1][x-1]+raz;
		}
		
		System.out.println("Digite o valor de inicio da PG: ");
		init=ler.nextInt();
		System.out.println("Digite o valor para a razão: ");
		raz=ler.nextInt();
		mat[2][0]=init;
		for (int x=1;x<10;x++) {		
			mat[2][x]=mat[2][x-1]*raz;
		}
					
		System.out.println("Matriz : "+ Arrays.deepToString(mat));
		}

	}


