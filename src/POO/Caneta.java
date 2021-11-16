package POO;

import java.util.Scanner;

public class Caneta {

	public static void main(String[] args) {
		//CRIAÇÃO DO OBJETO CANETA
		MoldeCaneta c1 = new MoldeCaneta();
		MoldeCaneta c2 = new MoldeCaneta();
		
		c1.setCarga(40);
		c1.setCor("verde");
		
		c2.setCarga(60);
		c2.setCor("azul");
		
		
		System.out.println(c1.getCor());
		System.out.println(c1.getCarga());
		
		System.out.println(c2.getCarga());
		System.out.println(c2.getCor());	}

}
