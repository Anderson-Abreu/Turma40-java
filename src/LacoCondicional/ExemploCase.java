package LacoCondicional;

import java.util.Scanner;

public class ExemploCase {

	public static void main(String[] args) {
	
		String x;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite uma letra: ");
		x=ler.nextLine();
		switch (x) {
		case "a":
			System.out.println("Voc� digitou uma vogal");
			break;
		case "e":
			System.out.println("Voc� digitou uma vogal");
			break;
		case "i":
			System.out.println("Voc� digitou uma vogal");
			break;
		case "o":
			System.out.println("Voc� digitou uma vogal");
			break;
		case "u":
			System.out.println("Voc� digitou uma vogal");
			break;
		default:
			System.out.println("Voc� digitou uma consoante");
			break;
		}
	}

}
