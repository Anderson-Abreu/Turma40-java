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
				System.out.print("O n�mero � par e sua raiz quadrada �: ");
				System.out.println(r);
			}
			else
			{
				q=Math.pow(n,2);
				System.out.println("O n�mero � impar e seu quadrado �: ");
				System.out.println(q);
			}
			
			System.out.print("digite um numero maior que 0: ");
			n=ler.nextInt();
			
		}
			System.out.println("Valor menou ou igual a 0. Program foi encerrado");
	}

}
