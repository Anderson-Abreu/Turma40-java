package Introducao;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		int n1, n2, soma;
		Scanner calc = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		n1=calc.nextInt();
		System.out.print("Digite o segundo numero: ");
		n2=calc.nextInt();
		soma=n1+n2;
		
		System.out.printf("O valor da soma é: %d", soma);
	}

}
