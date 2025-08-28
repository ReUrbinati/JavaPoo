package ArraysList;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioArrayList01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<String> compras = new ArrayList<>();
		String lCompras;
		int decisao=1;
		
						
		System.out.println("Lista de Compras");
		System.out.println("Digite o produto: ");
		lCompras=ler.next();
		compras.add(lCompras);
		System.out.println(compras);
		
		
		
		while (decisao==1) {
			
			System.out.println("Digite o produto: ");
			lCompras=ler.next();
			compras.add(lCompras);
			System.out.println("Digite 1 para adicionar outro produto ou 0 para sair");
			decisao=ler.nextInt();
			}
		System.out.println(compras);
		
		
		
		
		
		
		
		

	}

}
