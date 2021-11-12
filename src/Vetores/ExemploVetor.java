package Vetores;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		int[] vet = new int[5];
		int maior=0,x;
		Scanner ler = new Scanner(System.in);
		for(x=0;x<5;x++)
		{
			System.out.print("Digite um valor: ");
			vet[x]=ler.nextInt();
			if(vet[x]>maior)
				maior=vet[x];
		}
		System.out.println("O maior valor digitado foi "+maior);

	}

}
