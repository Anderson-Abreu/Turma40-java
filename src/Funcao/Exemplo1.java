package Funcao;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		int n1, n2;
		Scanner calc = new Scanner(System.in);
		System.out.println("Digite 2 números");
		n1=calc.nextInt();
		n2=calc.nextInt();
		System.out.println("A soma dos números é: "+ soma(n1, n2));
	}
	public static int soma(int a, int b) {
		int x = a+b;
		return x;
	}
}
