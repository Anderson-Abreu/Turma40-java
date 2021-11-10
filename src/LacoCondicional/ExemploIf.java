package LacoCondicional;

import java.util.Scanner;

public class ExemploIf {

	public static void main(String[] args) {
		float n1, n2, media;
		Scanner calc = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		n1=calc.nextFloat();
		System.out.print("Digite a segunda nota: ");
		n2=calc.nextFloat();
		media=(n1+n2)/2;
		System.out.println(media);
		if (media<5)
		{
			System.out.println("reprovado");
		
		}
		else if(media>7)
		{
			System.out.println("aprovado");
		}
		else
		{
			System.out.println("exame");
		}
			
	}

}
