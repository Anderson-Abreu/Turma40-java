package Vetores;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		float [] media = new float[4];
		float calc=0;
		int x;
		Scanner ler = new Scanner(System.in);
		for (x=0;x<4;x++)
		{
			System.out.print("Digite uma nota: ");
			media[x]=ler.nextFloat();
			calc+=media[x];
		}
		calc=calc/4;
		System.out.println("A média é: "+ calc);
	}

}
