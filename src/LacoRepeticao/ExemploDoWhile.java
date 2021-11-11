package LacoRepeticao;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		int a, b, x ;
		
		do{
			Scanner num = new Scanner(System.in);
			System.out.println("digite dois valores: ");
			a=num.nextInt();
			b=num.nextInt();
			System.out.printf("A soma dos valores é: %d",a+b);
			System.out.print("\nPressione 0 para parar: ");			
			x=num.nextInt();
			System.out.println(x);
		}while(x != 0);
		System.out.println("Programa finalizado");
	}

}
