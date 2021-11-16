package Vetores;

import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {
		int[][] mat = new int[3][3];//matriz de 3 linhas por 3 colunas sem valores
		int soma=0,l,c;
		Scanner ler = new Scanner(System.in);
		for(l=0;l<3;l++)
		{
			for(c=0;c<3;c++)
			{
				System.out.println("Digite o valor para a lina "+l+" e coluna "+c);
				mat[l][c]=ler.nextInt();
				soma+=mat[l][c];
				soma= soma+mat[l][c];
			}
		}
		for(l=0;l<3;l++)
		{
			for(c=0;c<3;c++)
			{
				System.out.print(mat[l][c]+"\t");
			}
			System.out.println();
		}
		System.out.println("A soma dos valores da matriz é: "+soma);
	}

}
