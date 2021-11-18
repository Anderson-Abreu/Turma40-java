package POO;

public class Cachorro extends Mamifero{

	public void latir()
	{
		System.out.println("Au au au ");
	}
	
	@Override
	public void emitirSom()
	{
		System.out.println("Latir");
	}
	
	public void agir(boolean x)
	{
		if(x==true)
			System.out.println("Abanando o rabo");
		else
			System.out.println("Rosnar...");
	}
	
	public void agir(int x)
	{
		if(x<19 && x>6)
			System.out.println("Brincando...");
		else
			System.out.println("Dormindo...");
	}
	
}
