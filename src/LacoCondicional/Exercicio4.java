package LacoCondicional;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio4 {

	public static void main(String[] args) {
		int n;
		double r, q;
		Scanner ler = new Scanner(System.in);
		System.out.print("digite um numero: ");
		n=ler.nextInt();
		if(n%2==0)
		{
			r=Math.sqrt(n);
			System.out.println("O número é par e sua raiz quadrada é: ");
			System.out.print(r);
		}
		else
		{
			q=Math.pow(n, 2);
			System.out.println("O número é impar e seu quadrado é: ");
			System.out.println(q);
		}
			
	}

}
