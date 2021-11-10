package LacoCondicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		byte idade;
		Scanner ler = new Scanner(System.in);
		idade=ler.nextByte();
		if(idade>=10 && idade<15)
		{
			System.out.println("infantil");
		}
		else if(idade>14 && idade<18)
		{
			System.out.println("juvenil");
		}
		else
		{
			System.out.println("adulto");
		}
	}

}
