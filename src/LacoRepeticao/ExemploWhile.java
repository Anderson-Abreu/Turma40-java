package LacoRepeticao;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		int n;
		double r, q;
		Scanner ler = new Scanner(System.in);
		System.out.print("digite um numero maior que 0: ");
		n=ler.nextInt();
		while(n>0)
		{
			if(n%2==0)
			{
				r=Math.sqrt(n);
				System.out.print("O número é par e sua raiz quadrada é: ");
				System.out.println(r);
			}
			else
			{
				q=Math.pow(n,2);
				System.out.println("O número é impar e seu quadrado é: ");
				System.out.println(q);
			}
			
			System.out.print("digite um numero maior que 0: ");
			n=ler.nextInt();
			
		}
			System.out.println("Valor menou ou igual a 0. Program foi encerrado");
	}

}
